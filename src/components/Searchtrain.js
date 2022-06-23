import React, {Component} from "react";
import axios from "axios";
import '../Styles/Searchtrain.css';


class Searchtrain extends Component
{
    constructor(){
        super()

        this.state={
            train_origin: '',
            train_destination: '',
            train : []
        }
    }
    
    changehandler=(event)=>{
        this.setState({[event.target.name]:event.target.value})
    }

    submithandler=event=>{
        event.preventDefault();
        axios.get('http://localhost:9003/user/train/'+this.state.train_origin+'/'+this.state.train_destination)
             .then(response => {
                this.setState({train: response.data})
                if(response===200){
                    console.log(response.data)

                    console.log(response.state)}
                    else{
                        console.log("Cannot get Data"+ response.data)
                    }
                })
               .catch(error => {
                   console.log(error)
               }) 
            }


    render() 
    {
        const {train_origin,train_destination}=this.state
        return(
            <div className='ui_main_search'>
                <h1 className="search_title">Search Trains</h1>
                <div className='ui_form_search'>
                    <form onSubmit={this.submithandler}>
                        <div className="input-field-search">
                            <label for="train_origin"><b>Origin: </b></label>    
                            <input className="train_origin" placeholder="Origin" type="text" name="train_origin" value={train_origin} onChange={this.changehandler} />
                        </div>
                           
                        <div className="input-field-search">
                            <label for="train_destination"><b>Destination: </b></label>
                            <input className="train_destination" placeholder="Destination" type="text" name="train_destination" value={train_destination} onChange={this.changehandler} />
                        </div> 

                        <button className='ui_button_search' type="submit">Search</button>
                    </form>
                </div>
                
                <div className='outputBox'>
                    
                    {this.state.train.map(train => <div id="searchCard" key={train.train_id}>
                        <div class="inline"><p>Train Id : {train.train_id}</p></div>
                        <div class="inline"><p>Train name : {train.train_name}</p></div>
                        <div class="inline"><p>Train Origin : {train.train_origin}</p></div>
                        <div class="inline"><p>Train Destination : {train.train_destination}</p></div>
                        <div class="inline"><p>Train Departure time : {train.train_departure}</p></div>
                        <div class="inline"><p>Train Arrival time : {train.train_arrival}</p></div>
                        <div class="inline"><p>Journey duration(in hours) : {train.train_duration}</p></div>
                        <div class="inline"><p>No. of seats : {train.noOfSeats}</p></div>
                        <div class="inline"><p>One tier price : {train.oneTierPrice}</p></div>
                        <div class="inline"><p>Two tier price : {train.twoTierPrice}</p></div>
                        <div class="inline"><p>Three tier price : {train.threeTierPrice}</p></div>
                        <div class="inline"><p>Sleeper price : {train.sleeperPrice}</p></div>
                        <div>
                            <a href="/book">
                                <button className='bookingbtn' id="bookingbtn">Book above Train</button>
                            </a>
                        </div>
                </div>)
                    }
            </div>

            </div>
        )

    }
}
export default Searchtrain;