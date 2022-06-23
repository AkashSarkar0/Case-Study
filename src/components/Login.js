import React from 'react'
import '../Styles/Login.css';
import { Link } from "react-router-dom";

const Login = () => {
  const handleLogIn = () => {
    console.log("You are logged in succesfully");
  }

  return (
    <div className='container0'>
    <h1 className="H1">Login</h1>
    <div className='loginBox'>
              <div className="input-field-login">
                  <label for="username1"><b>Username : </b></label>    
                  <input className='username1' placeholder='Enter Username'></input>
              </div>
              <div className="input-field-login">
                  <label for="passInput"><b>Password : </b></label>    
                  <input className='passInput' type="password" placeholder='Enter your Password'/>
              </div>
      
      <Link to={"/book"}>
        <button type='button5' onClick={handleLogIn} className="loginPageBtn">Log In</button>
			</Link>
      <div className='forgPass'>
        <a href="./ForgotPassword">Forgot password?</a>
      </div>
      <div>
        <Link to={"/signin"}>
          <button onClick={handleLogIn} className="RegisterA"> Create New Account </button>
				</Link>
      </div>
    </div>
  </div>
  )
}

export default Login;