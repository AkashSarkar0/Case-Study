import React, {Component} from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import "../Styles/Addtrain.css"


class AddTrain extends Component
{
    constructor(){
        super()

        this.state={
            train_id: '',
            train_name: '',
            train_origin: '',
            train_destination: '',
            train_departure: '',
            train_arrival: '',
            train_duration: '',
            noOfSeats: '',
            oneTierPrice: '',
            twoTierPrice: '',
            threeTierPrice: '',
            sleeperPrice: ''
        }
    }
    
    changehandler1= e =>{
        this.setState({[e.target.name]: e.target.value})
    }

    submithandler1= e =>{
        e.preventDefault()
        console.log("Your Train has been added to the List.")
        axios.post('http://localhost:9001/admin/train/add' , this.state)
              .then(response => {
                console.log(response)
              })
              .catch(error => {
              console.log(error)
              }) 
      }


    render() 
    {
        const {train_id,train_name,train_origin,train_destination,train_departure,train_arrival,train_duration,noOfSeats,oneTierPrice,twoTierPrice,threeTierPrice,sleeperPrice}=this.state
        return (
          <div className='ui_main_add'>
             <h1 className="book_title">Admin- Add Train</h1>
            
            <div className='ui_form_add'>
              <form onSubmit={this.submithandler1}>

                <div className="input-field-add">
                  <label for="train_id"><b>Train Id: </b></label>    
                  <input className="train_id" placeholder="Train Id" type="text" name="train_id" value={train_id} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="train_name"><b>Train Name: </b></label>    
                  <input className="train_name" placeholder="Enter Train name" type="text" name="train_name" value={train_name} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="train_origin"><b>Train Origin: </b></label>    
                  <input className="train_origin" placeholder="Mention train origin" type="text" name="train_origin" value={train_origin} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="train_destination"><b>Train Destination: </b></label>    
                  <input className="train_destination" placeholder="Mention train destination" type="text" name="train_destination" value={train_destination} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                    <label for="train_departure"><b>Train Departure: </b></label>    
                    <input className="train_departure" placeholder="Departure time" type="time" name="train_departure" value={train_departure} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="train_arrival"><b>Train Arrival: </b></label>    
                  <input className="train_arrival" placeholder="Arrival time" type="time" name="train_arrival" value={train_arrival} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="train_duration"><b>Train duration: </b></label>    
                  <input className="train_duration" placeholder="Enter Train duration in hours" type="number" name="train_duration" value={train_duration} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="noOfSeats"><b>Number of Seats: </b></label>    
                  <input className="noOfSeats" placeholder="Enter Number of Seats" type="number" name="noOfSeats" value={noOfSeats} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="oneTierPrice"><b>One tier Price: </b></label>    
                  <input className="oneTierPrice" placeholder="Enter price of one-tier" type="text" name="oneTierPrice" value={oneTierPrice} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="twoTierPrice"><b>Two tier Price: </b></label>    
                  <input className="twoTierPrice" placeholder="Enter price of two-tier" type="text" name="twoTierPrice" value={twoTierPrice} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="threeTierPrice"><b>Three tier Price: </b></label>    
                  <input className="threeTierPrice" placeholder="Enter price of three-tier" type="text" name="threeTierPrice" value={threeTierPrice} onChange={this.changehandler1} />
                </div>

                <div className="input-field-add">
                  <label for="sleeperPrice"><b>Sleeper Price: </b></label>    
                  <input className="sleeperPrice" placeholder="Enter price of Sleeper seat" type="text" name="sleeperPrice" value={sleeperPrice} onChange={this.changehandler1} />
                </div>

         
                <button className='ui_button_add' type="submit">Add !</button>
            

                <div>
                <Link to={"/addtrainconfirm"}>
                <button className='addtrainconfirmbtn' id="addtrainconfirmbtn">Confirm Train to be added</button>
                </Link>
                </div>

              </form>
            </div>
          </div>
      );
    };
}

export default AddTrain;