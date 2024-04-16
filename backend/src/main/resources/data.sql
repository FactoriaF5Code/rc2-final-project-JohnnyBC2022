CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO Courses (course_id, image_url, course_name, description, price)
VALUES
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a HTML', 'Aprende los fundamentos de HTML y c�mo crear estructuras b�sicas para p�ginas web.', 9.99),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a CSS', 'Aprende los conceptos b�sicos de CSS y c�mo dar estilo a tus p�ginas web.', 12.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a Javascript', 'Aprende los conceptos b�sicos de JavaScript y c�mo agregar interactividad a tus sitios web.', 12.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a JAVA', 'Aprende los conceptos b�sicos de Java y c�mo crear aplicaciones web y m�viles.', 9.99),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a React', 'Aprende los conceptos b�sicos de React y c�mo crear aplicaciones web interactivas y din�micas.', 15.95),
    (uuid_generate_v4(), 'https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D', 'Iniciaci�n a PostgreSQL', 'Aprende los conceptos b�sicos de PostgreSQL y c�mo crear y gestionar bases de datos.', 7.95);
