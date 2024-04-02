import "./Card.css";

export const Card = ({imageUrl,title, description, price}) => {
  
  return (
    <div className="card_container">
      <img
        src={imageUrl}
        alt="code example image"
      />
      <h3>{title}</h3>
      <p>
        {description}
      </p>
      <p className="price">{price}</p>
      <button>Apúntate</button>
    </div>
  );
};
