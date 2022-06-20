import React, {Component} from "react";
import axios from "axios";
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
            <div>
                <h1 className="search_title">Search Trains</h1>
                <div>
                    <form onSubmit={this.submithandler}>
                        <div className="input-field-search">
                            <label for="train_origin"><b>Origin: </b></label>    
                            <input className="train_origin" placeholder="Origin" type="text" name="train_origin" value={train_origin} onChange={this.changehandler} />
                        </div>
                           
                        <div className="input-field-search">
                            <label for="train_destination"><b>Destination: </b></label>
                            <input className="train_destination" placeholder="Destination" type="text" name="train_destination" value={train_destination} onChange={this.changehandler} />
                        </div> 

                        <button type="submit">Search</button>
                    </form>
                </div>
                <div id="Result"></div>
                <div>
                    {this.state.train.map(train => <div id="searchCard" key={train.train_id}>
                        <div class="inline"><p>{train.train_id}</p></div>
                        <div class="inline"><p>{train.train_name}</p></div>
                        <div class="inline"><p>{train.train_origin}</p></div>
                        <div class="inline"><p>{train.train_destination}</p></div>
                        <div class="inline"><p>{train.train_departure}</p></div>
                        <div class="inline"><p>{train.train_arrival}</p></div>
                        <div class="inline"><p>{train.train_duration}</p></div>
                        <div class="inline"><p>{train.noOfSeats}</p></div>
                        <div class="inline"><p>{train.oneTierPrice}</p></div>
                        <div class="inline"><p>{train.twoTierPrice}</p></div>
                        <div class="inline"><p>{train.threeTierPrice}</p></div>
                        <div class="inline"><p>{train.sleeperPrice}</p></div>
                        <div>
                            <a href="/book">
                                <button id="bookingbtn">Book above Train</button>
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