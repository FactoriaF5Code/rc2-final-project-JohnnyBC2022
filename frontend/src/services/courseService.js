export const getCourses = async () => {
    try {
        const response = await fetch("http://localhost:8080/api/courses");
        if (!response.ok) {
            throw new Error("Error al obtener los cursos");
        }
        const data = await response.json();
        return data;
    } catch (error) {
        throw error;
    }
};
