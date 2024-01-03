import '../Assets/Css/nav.css';
import { Link } from 'react-router-dom';
const Navbar = () => {
  return (
    <>
    <nav className="navbar">
      <ul className="nav-menu">
        <li className="nav-item">
          <Link to="/" className="nav-link">HOME</Link>
        </li>
        <li className="nav-item">
          <Link to="/Log" className="nav-link">LOGIN</Link>
        </li>
        <li className="nav-item">
          <Link to="/Register" className="nav-link">REGISTER</Link>
        </li>
        <li className="nav-item">
          <Link to="/Footer" className="nav-link">ABOUT</Link>
        </li>
       
      </ul>
    </nav>



  <div class="area"></div>
  <nav class="main-menu">
    <ul>
      <li>
        <a href="https://jbfarrow.com">
          <i class="fa fa-home fa-2x"></i>
          <span class="nav-text">
            Community Dashboard
          </span>
        </a>

      </li>
      <li class="has-subnav">
        <a href="#">
          <i class="fa fa-globe fa-2x"></i>
          <span class="nav-text">
           <Link to="/Services" className="nav-link">Bus Services</Link>
          </span>
        </a>

      </li>
      <li class="has-subnav">
        <a href="#">
          <i class="fa fa-comments fa-2x"></i>
          <span class="nav-text">
           <Link to="/Services1" className="nav-link">Car Services</Link>
          </span>
        </a>

      </li>
      <li class="has-subnav">
        <a href="#">
          <i class="fa fa-camera-retro fa-2x"></i>
          <span class="nav-text">
          <Link to="/poem" className="nav-link">Brief</Link>
          </span>
        </a>

      </li>
      <li>
        <a href="#">
          <i class="fa fa-film fa-2x"></i>
          <span class="nav-text">
            Surveying Tutorials
          </span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-book fa-2x"></i>
          <span class="nav-text">
            Surveying Jobs
          </span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-cogs fa-2x"></i>
          <span class="nav-text">
             Resources
          </span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-map-marker fa-2x"></i>
          <span class="nav-text">
            Member Map
          </span>
        </a>
      </li>
      <li>
        <a href="#">
          <i class="fa fa-info fa-2x"></i>
          <span class="nav-text">
            Documentation
          </span>
        </a>
      </li>
    </ul>

    <ul class="logout">
      <li>
        <a href="#">
          <i class="fa fa-power-off fa-2x"></i>
          <span class="nav-text">
          <Link to="/" className="nav-link">Logout</Link>
          </span>
        </a>
      </li>
    </ul>
  </nav>


  



</>

  );
}

export default Navbar;