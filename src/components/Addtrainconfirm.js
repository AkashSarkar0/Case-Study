import React from "react";
import { Link } from "react-router-dom";

const Addtrainconfirm = () => {
  const handleAddtrainconfirm = () => {
  }
  return (
    <div className="ui fixed menu">
         <h2 color="red">Train has been added successfully</h2>
         <Link to={"/"}>
           <button type='button' onClick={handleAddtrainconfirm} className="loginPageBtn">Return to Home page</button>
          </Link>
    </div>
  );
};

export default Addtrainconfirm;
