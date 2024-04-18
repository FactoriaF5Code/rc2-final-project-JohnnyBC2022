CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO Courses (course_id, image_url, course_name, description, price)
VALUES
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a HTML', 'Aprende los fundamentos de HTML y cómo crear estructuras básicas para páginas web.', 9.99),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a CSS', 'Aprende los conceptos básicos de CSS y cómo dar estilo a tus páginas web.', 12.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a Javascript', 'Aprende los conceptos básicos de JavaScript y cómo agregar interactividad a tus sitios web.', 12.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a JAVA', 'Aprende los conceptos básicos de Java y cómo crear aplicaciones web y móviles.', 9.99),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a React', 'Aprende los conceptos básicos de React y cómo crear aplicaciones web interactivas y dinámicas.', 15.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciación a PostgreSQL', 'Aprende los conceptos básicos de PostgreSQL y cómo crear y gestionar bases de datos.', 7.95);
