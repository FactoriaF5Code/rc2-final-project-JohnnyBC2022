import './Card.css'

export const Card = () => {
  return (
    <div className='card_container'>
        <img src="https://images.unsplash.com/photo-1542831371-29b0f74f9713?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="code example image" />
        <h3>Iniciación a HTML</h3>
        <p>¡Descubre los secretos detrás de la web! Únete a nuestro curso de introducción a HTML y da tus primeros pasos en la creación de sitios web impresionantes.</p>
        <button>Apúntate</button>
    </div>
  )
}