import React from 'react';
import { Link } from "react-router-dom";
import "../Styles/Cancelbooking.css"



const Cancelbooking = ( ) => {

    const handleCancelbook = () => {

    }
  return (
    <div className='container5'>
      <header className='h5'>
        <h1>Cancel Your Ticket</h1>
      </header>
      <form className='modal-content_1' method='post'>
        <div className='input-field_1'>
          <br></br>
          <label for="name"><b>Passanger Name: </b></label>
          <input className='name1' placeholder='Passanger name'/>
          
          <br></br>

          <label for="train_id"><b>Train Id: </b></label>
          <input className="train_id1" placeholder="Enter Booked Train Id" name="Ftrain_id" required/>

          <br></br>

          <label for="Journey_Date"><b>Date of Journey: </b></label>
          <input className="journeyDate1" placeholder="Journey date" type="date" name="journeyDate"  />


        </div>
        <div className='Regbutton5'>
          <Link to={"/cancelconfirm"}>
            <button type='submit' onClick={handleCancelbook} className="Cancel1">Cancel Ticket</button>
          </Link>
        </div>
      </form>
    </div>
  );
};

export default Cancelbooking;