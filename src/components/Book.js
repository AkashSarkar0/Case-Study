import React, {Component} from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import '../Styles/Book.css';

class Book extends Component
{
    constructor(){
        super()

        this.state={
            // bookingId: '',
            name: '',
            gender: '',
            contactNo: '',
            journeyDate: '',
            address: '',
            train_id: '',
            noOfAdults: '',
            noOfMinors: '',
            seatType: '',
            paymentStatus: ''
        }
    }
    
    changehandler1= e =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submithandler1= e =>{
        e.preventDefault()
        console.log("Your Ticket is booked successfully")
        axios.post('http://localhost:9002/booking/book' , this.state)
              .then(response => {
                console.log(response)
              })
              .catch(error => {
              console.log(error)
              }) 
      }


    render() 
    {
        const {name,gender,contactNo,journeyDate,address,train_id,noOfAdults,noOfMinors,seatType,paymentStatus}=this.state
        return (
          <div className='ui_main_book'>
             <h2 className="book_title">Book your Train</h2>
              <div>
                <a href="/cancelbooking">
                  <button className='cancelbookbtn' id="cancelbookingbtn">Cancel any existing Booking</button>
                </a>
              </div>
            <div className='ui_form_book'>
              <form onSubmit={this.submithandler1}>

                {/* <div className="input-field-book">
                  <label for="bookingId"><b>Booking Id: </b></label>    
                  <input className="bookingId" placeholder="Booking Id" type="text" name="bookingId" value={bookingId} onChange={this.changehandler1} />
                </div> */}

                <div className="input-field-book">
                  <label for="name"><b>Name: </b></label>    
                  <input className="name" placeholder="Enter passanger name" type="text" name="name" value={name} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="gender"><b>Gender: </b></label>    
                  <input className="gender" placeholder="Mention your gender" type="text" name="gender" value={gender} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="contactNo"><b>Contact No.: </b></label>    
                  <input className="contactNo" placeholder="Provide Contact number" type="text" name="contactNo" value={contactNo} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                    <label for="journeyDate"><b>Journey Date: </b></label>    
                    <input className="journeyDate" placeholder="Journey date" type="date" name="journeyDate" value={journeyDate} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="address"><b>Address: </b></label>    
                  <input className="address" placeholder="Enter State and District" type="text" name="address" value={address} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="train_id"><b>Train Id: </b></label>    
                  <input className="train_id" placeholder="Enter Train Id to be booked" type="text" name="train_id" value={train_id} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="noOfAdults"><b>Number of Adults: </b></label>    
                  <input className="noOfAdults" placeholder="Enter Number of Adults" type="text" name="noOfAdults" value={noOfAdults} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="noOfMinors"><b>Number of Minors: </b></label>    
                  <input className="noOfMinors" placeholder="Enter Number of Minors(Below 18)" type="text" name="noOfMinors" value={noOfMinors} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="seatType"><b>Seat Type: </b></label>    
                  <input className="seatType" placeholder="Mention preferred seat" type="text" name="seatType" value={seatType} onChange={this.changehandler1} />
                </div>

                <div className="input-field-book">
                  <label for="paymentStatus"><b>Payment status: </b></label>    
                  <input className="paymentStatus" placeholder="Completed/Not-completed" type="text" name="paymentStatus" value={paymentStatus} onChange={this.changehandler1} />
                </div>

                {/* <Link to={"/bookconfirm"}> */}
                <button className='ui_button_book' type="submit">Book</button>
                {/* </Link> */}

                <div>
                <Link to={"/bookconfirm"}>
                <button className='bookconfirmbtn' id="bookconfirmbtn">Confirm Booking</button>
                </Link>
                </div>

              </form>
            </div>
          </div>
      );
    };
}

export default Book;