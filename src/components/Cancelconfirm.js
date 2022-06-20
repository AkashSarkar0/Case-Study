import React from "react";
import { Link } from "react-router-dom";

const Cancelconfirm = () => {
  const handleCancelconfirm = () => {
  }
  return (
    <div className="ui fixed menu">
         <h2 color="red">Your preferred booking has been Cancelled !</h2>
         <Link to={"/"}>
           <button type='button' onClick={handleCancelconfirm} className="loginPageBtn">Return to Home page</button>
          </Link>
    </div>
    
  );
};

export default Cancelconfirm;
