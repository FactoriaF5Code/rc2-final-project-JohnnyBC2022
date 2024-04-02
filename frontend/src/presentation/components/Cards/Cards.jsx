import { Card } from "../Card/Card";
import "./Cards.css";
import jsonData from "../../../services/json-server/db.json"

export const Cards = () => {
  return (
    <main className="homepage_main">
      <section className="cards_container">
      {jsonData.courses.results.map((course, index) => (
          <Card key={index} title={course.title} description={course.description} price={course.price} imageUrl={course.imageUrl}/>
        ))}
      </section>
    </main>
  );
};
