import React from 'react';
import '../Assets/Css/foot.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {
  faInstagram,
  faTwitter,
  faFacebookF,
} from '@fortawesome/free-brands-svg-icons';

const Foot = () => {
  return (
    <footer className="footer-container">
      <div className="footer-content">
        <p>Paradise found at this stunning Vehicle destination</p>
        <div className="keywords">
          <span>Bookings</span>
          <span>Site Feedback</span>
          <span>Contact Us</span>
          <span>Terms & Conditions</span>
        </div>
        <div className="social-icons">
          <a
            href="https://twitter.com"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FontAwesomeIcon icon={faTwitter} />
          </a>
          <a
            href="https://facebook.com"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FontAwesomeIcon icon={faFacebookF} />
          </a>
          <a
            href="https://instagram.com"
            target="_blank"
            rel="noopener noreferrer"
          >
            <FontAwesomeIcon icon={faInstagram} />
          </a>
        </div>
      </div>
    </footer>
  );
};

export default Foot;