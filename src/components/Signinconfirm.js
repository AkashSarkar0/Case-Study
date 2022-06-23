import React from "react";
import { Link } from "react-router-dom";

const Signinconfirm = () => {
  const handleSigninconfirm = () => {
  }
  return (
    <div className="ui fixed menu">
         <h2 color="red">Your account has been created successfully !</h2>
         <h3 color="black">Please return to the login page to book your ticket.</h3>
         <br></br>
           <Link to={"/login"}>
           <button type='button' onClick={handleSigninconfirm} className="loginPageBtn">Return to Log-in page</button>
          </Link>
    </div>
    
  );
};

export default Signinconfirm;
