import { Card } from "../Card/Card";
import "./Cards.css";
import { useState, useEffect } from "react";
import { getCourses } from "../../../services/courseService";

export const Cards = ({ searchTerm, onSearch }) => {
  const [courses, setCourses] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [filteredCourses, setFilteredCourses] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const data = await getCourses();
        setCourses(data);
        setLoading(false);
        setFilteredCourses(data);
      } catch (error) {
        setError(error);
        setLoading(false);
      }
    };

    fetchData();
  }, []);

  useEffect(() => {
    if (!searchTerm) {
      setFilteredCourses(courses);
      return;
    }

    const filtered = courses.filter((course) =>
      course.courseName.toLowerCase().includes(searchTerm.toLowerCase())
    );
    setFilteredCourses(filtered);
  }, [searchTerm, courses]);

  if (loading) {
    return <div>Cargando...</div>;
  }

  if (error) {
    return <div>Error: {error.message}</div>;
  }

  return (
    <main className="homepage_main">
      <section className="cards_container">
        {filteredCourses.map((course) => (
          <Card
            key={course.id}
            imageUrl={course.imageUrl}
            title={course.courseName}
            description={course.description}
            price={course.price + " €"}
          />
        ))}
      </section>
    </main>
  );
};
