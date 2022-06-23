import React from "react";
import { Link } from "react-router-dom";

const Bookconfirm = () => {
  const handleBookconfirm = () => {
  }
  return (
    <div className="ui fixed menu">
         <h2 color="red">Your Ticket has been booked successfully !</h2>
         <Link to={"/"}>
           <button type='button' onClick={handleBookconfirm} className="loginPageBtn">Return to Home page</button>
          </Link>
    </div>
    
  );
};

export default Bookconfirm;
