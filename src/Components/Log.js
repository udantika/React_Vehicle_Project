import '../Assets/Css/log.css';
import { Link } from 'react-router-dom';
const Log=()=>
{
  const Hello = ()=>{
  alert("click");
  }
  
  return(
 
    <>
    <body className="bodylo">

    <div class="login-container">
    
        <form class="container" onSubmit={Hello}>
     
         <h2>Login</h2>
 
            <label for="username">USERNAME</label>
            <input type="text" id="username" name="username" required placeholder="Enter your name"/>

            <label for="password">PASSWORD</label>
            <input type="password" id="password" name="password" required placeholder="Enter your password"/>
            <button type="submit">      
                <Link to="/Book" className="nav-link">Submit</Link>
            </button>


        </form>
    </div>
    
    
    </body>
    
    </>


  )
}
export default Log;