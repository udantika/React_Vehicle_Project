import '../Assets/Css/reg.css';

const Register=()=>
{
   
      const Hello = ()=>{
      alert("Successfully Registered");
      }

    return(
    
<div>
    <body className="regbo">
      <form className='formreg'>
            
          <h2 className='h2reg'>Register</h2>
          
          
              <label for="username">Username:</label>
              <input type="text" id="username" name="username" required/>
          
              <label for="password">Password:</label>
              <input type="password" id="password" name="password" required/>
              
              <label for="Email">Email:</label>
              <input type="email" id="password" name="email" required/>
              
              <label for="number">Mobile Number:</label>
              <input type="number" id="number" name="number" required/>
          
    <form class="containr" onClick={Hello} required>
              <input type="submit" value="Register" required/>

             
        </form>

      </form>
</body>
 </div>

    )
}
export default Register;