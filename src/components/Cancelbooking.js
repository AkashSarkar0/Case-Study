import React from 'react';
import { Link } from "react-router-dom";
// import "../Styles/CancelBooking.css"



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
          <label for="name"><b>Passanger Name: </b></label>
          <input className='name1' placeholder='Passanger name'/>
          
          <br></br>

          <label for="train_id"><b>Train Id: </b></label>
          <input className="train_id" placeholder="Enter Booked Train Id" name="Ftrain_id" required/>

          <br></br>

          <label for="Journey_Date"><b>Date of Journey: </b></label>
          <span>
            <select className='Journey' label='date' name='Journey'>
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
              <option value="31">31</option>
            </select>
            <select className='Journey' label='month' name='Journey'>
              <option value="1">Jan</option>
              <option value="2">Feb</option>
              <option value="3">Mar</option>
              <option value="4">Apr</option>
              <option value="5">May</option>
              <option value="6">Jun</option>
              <option value="7">Jul</option>
              <option value="8">Aug</option>
              <option value="9">Sep</option>
              <option value="10">Oct</option>
              <option value="11">Nov</option>
              <option value="12">Dec</option>
            </select>
            <select className='Journey' label='Year' name='Journey'>
              <option value="2022">2022</option>
              <option value="2023">2023</option>
            </select>
          </span>


        </div>
        <div className='Regbutton5'>
          <Link to={"/cancelconfirm"}>
            <button type='submit' onClick={handleCancelbook} className="Cancel">Cancel Ticket</button>
          </Link>
        </div>
      </form>
    </div>
  );
};

export default Cancelbooking;