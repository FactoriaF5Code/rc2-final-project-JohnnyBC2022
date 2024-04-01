import "./Footer.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faGithub, faLinkedin } from "@fortawesome/free-brands-svg-icons";

export const Footer = () => {
  return (
    <footer>
      <p>Jonathan Baragaño</p>
      <p>&copy; 2024</p>
      <ul className="footer_icons">
        <li>
          <a href="https://www.linkedin.com/in/jonathan-baraga%C3%B1o-car%C3%BAs/" target="_blank">
            <FontAwesomeIcon icon={faLinkedin} />
          </a>
        </li>
        <li>
          <a href="https://github.com/JohnnyBC2022" target="_blank">
            <FontAwesomeIcon icon={faGithub} />
          </a>
        </li>
      </ul>
    </footer>
  );
};
