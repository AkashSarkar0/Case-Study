import React from 'react'
import { Link } from "react-router-dom";
import "../Styles/Adminlogin.css"

const Adminlogin = () => {
  const handleAdminlogin = () => {
    console.log("You are logged in successfully");
  }

  return (
    <div className='container7'>
    <h1 className="H1">Admin Login</h1>
    <div className='loginBox1'>
     <label for="usernameInput"><b>Username: </b></label>
     <input className='usernameInput' placeholder='Enter your Username'/>
     <br></br>
     <label for="passInput1"><b>Password: </b></label>
      <input className='passInput1' type="password" placeholder='Enter Password'/>
      <label for="otp"><b>OTP: </b></label>
      <input className='otp' placeholder='Enter one time password'/>
      <Link to={"/addtrain"}>
        <button type='adminloginbutton' onClick={handleAdminlogin} className="adminloginbutton">Log In</button>
      </Link>
      <div className='forgPass'>
        <a href="./ForgotPassword">Forgotten password?</a>
      </div>
    </div>
  </div>
  )
}

export default Adminlogin;