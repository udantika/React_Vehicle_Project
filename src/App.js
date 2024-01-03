import React from 'react';
import Navbar from './Components/Navbar.js';
import Home from './Components/Home.js';
import Log from './Components/Log.js';
import Register from './Components/Register.js';
import Footer from './Components/Footer.js';
import  { BrowserRouter as Router,Routes,Route } from "react-router-dom";
import Services from './Components/Services.js';
import Services1 from './Components/Services1.js';
import Book from './Components/Book.js';

function App(){
  return(
    <>
    <Router>
      <Navbar/>
      <Routes>
        <Route path="/" element={<Home/>}></Route>
        <Route path="/Log" element={<Log/>}></Route>
        <Route path="/Register" element={<Register/>}></Route>
        <Route path="/Footer" element={<Footer/>}></Route>
        <Route path="/Services" element={<Services/>}></Route> 
        <Route path="/Services1" element={<Services1/>}></Route> 
        <Route path="/Book" element={<Book/>}></Route> 
      </Routes>
    </Router>
    
    
    </>
    )
}
export default App;