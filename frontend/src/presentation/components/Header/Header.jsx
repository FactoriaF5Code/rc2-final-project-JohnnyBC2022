import "./Header.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faMagnifyingGlass,
  faBars,
  faTimes,
} from "@fortawesome/free-solid-svg-icons";

export const Header = () => {
  return (
    <header>
      <input type="checkbox" id="check" />
      <nav>
        <div className="icon">
          <img
            src="../../../../LogoDevDojo.png"
            alt="DevDojo logo image"
            className="logo"
          />
        </div>
        <div className="search_box">
          <span>
            <FontAwesomeIcon icon={faMagnifyingGlass} />
          </span>
          <input type="search" placeholder="Buscar..." />
        </div>
        <ol>
          <li>
            <a href="#">Iniciar Sesión</a>
          </li>
          <li>
            <a href="#">Regístrate</a>
          </li>
        </ol>
        <label htmlFor="check" className="bar">
          <span>
            <FontAwesomeIcon icon={faBars} id="bars" />
          </span>
          <span>
            <FontAwesomeIcon icon={faTimes} id="times" />
          </span>
        </label>
      </nav>
      <section className="section__header"></section>
    </header>
  );
};
