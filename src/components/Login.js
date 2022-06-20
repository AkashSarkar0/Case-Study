import React from 'react'
import '../Styles/Login.css';
import { Link } from "react-router-dom";

const Login = () => {
  const handleLogIn = () => {
    console.log("You are logged in succesfully");
  }

  return (
    <div className='container'>
    <br></br>
    <br></br>
    <h1 className="H1">Login</h1>
    <div className='loginBox'>
    <input className='username' placeholder='Username'/>
      <input className='passInput' placeholder='Password'/>
      <Link to={"/book"}>
        <button type='button' onClick={handleLogIn} className="loginPageBtn">Log In</button>
			</Link>
      <div className='forgPass'>
        <a href="./ForgotPassword">Forgot password?</a>
      </div>
      <div>
        <Link to={"/signin"}>
          <button onClick={handleLogIn} className="RegisterB"> Create New Account </button>
				</Link>
      </div>
    </div>
  </div>
  )
}

export default Login;