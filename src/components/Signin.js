import React from 'react';
import { Link } from "react-router-dom";
import '../Styles/Signin.css';

const Signup = ( ) => {

    const handleSignIn = () => {

    }
  return (
    <div className='container2'>
      <header className='h001'>
        <br></br>
        <br></br>
        <br></br>
        <br></br>
        <h3>Create a new account</h3>
      </header>
      <form className='modal-content' method='post'>
        <div className='input-field'>
          <input className='firstName' placeholder='First name'/>
          <input className='Surname' placeholder='Surname'/>
          
          <br></br>

          <label  for="email"><b>Email</b></label>
          <input type="text" placeholder="Enter Email" name="email" required/>

          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" required/>

          <label for="psw-repeat"><b>Confirm Password</b></label>
          <input type="password" placeholder="Confirm Password" name="psw-repeat" required/>

          <label for="DoB"><b>Date of birth</b></label>
          <input className="birthDate" placeholder="Date of birth" type="date" name="journeyDate" required/>

          <br></br>
          <br></br>

          <label for="gender"><b>Gender</b></label>
          <span className='gender'>
            <span className='sex'>
              <label className='s001'>Male</label>
              <input className='g001' type="radio" name="sex" value="1" />
            </span>
            <span className='sex'>
              <label className='s001'>Female</label>
              <input className='g001' type="radio" name="sex" value="2"/>
            </span>
            <span className='sex'>
              <label className='s001'>Others</label>
              <input className='g001' type="radio" name="sex" value="3"/>
            </span>
          </span>
        </div>
        <div className='Regbutton'>
          <Link to={"/signinconfirm"}>
            <button type='submit' onClick={handleSignIn} className="Signup">Sign In</button>
          </Link>
        </div>
      </form>
      <div className='olduser'>
        <button type="submit" onClick = {() => { window.location.replace('/login')}} className='a001'>
          Already have an Account?
        </button>
      </div>
    </div>
  );
};

export default Signup;