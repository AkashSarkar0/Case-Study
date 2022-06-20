import React from "react";
import { Link } from "react-router-dom";

class AddTrain extends React.Component {
  state = {
    Train_id: "",
    Train_name: "",
    Train_origin: "",
    Train_destination: "",
    Train_arrival: "",
    Train_departure: "",
    Train_duration: "",
    NoOfSeats:"",
    OneTierPrice:"",
    TwoTierPrice:"",
    ThreeTierPrice:"",
    SleeperPrice:""
  };

  add = (e) => {
    e.preventDefault();
    if (this.state.Train_id === "" || this.state.Train_name === "" || this.state.Train_origin === "" || this.state.Train_destination === "" || this.state.Train_arrival === "" || this.state.Train_departure === "" || this.state.Train_duration === ""|| this.state.NoOfSeats === ""|| this.state.OneTierPrice === ""|| this.state.TwoTierPrice === ""|| this.state.ThreeTierPrice === ""|| this.state.SleeperPrice === "") {
      alert("ALl the fields are mandatory!");
      return;
    }
    this.props.addTrainHandler(this.state);
    this.setState({ Train_id: "", Train_name: "", Train_origin: "", Train_destination: "", Train_arrival: "", Train_departure: "", Train_duration: "",NoOfSeats:"",OneTierPrice:"", TwoTierPrice:"",ThreeTierPrice:"",SleeperPrice:""});
  };
  render() {
    return (
      <div className="ui main">
        <h2>Add Train</h2>
        <form className="ui form" onSubmit={this.add}>
          <div className="field">
            <label>Train Id </label>
            <input
              type="text"
              name="Train_id"
              placeholder="Train Id"
              value={this.state.Train_id}
              onChange={(e) => this.setState({ Train_id: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train name </label>
            <input
              type="text"
              name="Train_name"
              placeholder="Name of Train"
              value={this.state.Train_name}
              onChange={(e) => this.setState({ Train_name: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train Origin </label>
            <input
              type="text"
              name="Train_origin"
              placeholder="Origin station of Train"
              value={this.state.Train_origin}
              onChange={(e) => this.setState({ Train_origin: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train Destination </label>
            <input
              type="text"
              name="Train_destination"
              placeholder="Destination station of Train"
              value={this.state.Train_destination}
              onChange={(e) => this.setState({ Train_destination: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train Arrival </label>
            <input
              type="text"
              name="Train_arrival"
              placeholder="Train arrival time"
              value={this.state.Train_arrival}
              onChange={(e) => this.setState({ Train_arrival: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train Departure </label>
            <input
              type="text"
              name="Train_departure"
              placeholder="Train departure time"
              value={this.state.Train_departure}
              onChange={(e) => this.setState({ Train_departure: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Train Duration </label>
            <input
              type="text"
              name="Train_duration"
              placeholder="Journey duration"
              value={this.state.Train_duration}
              onChange={(e) => this.setState({ Train_duration: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Number of Seats </label>
            <input
              type="text"
              name="NoOfSeats"
              placeholder="Number of Seats"
              value={this.state.NoOfSeats}
              onChange={(e) => this.setState({ NoOfSeats: e.target.value })}
            />
          </div>
          <div className="field">
            <label>One Tier price </label>
            <input
              type="text"
              name="OneTierPrice"
              placeholder="One-tier seat price"
              value={this.state.OneTierPrice}
              onChange={(e) => this.setState({ OneTierPrice: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Two Tier price </label>
            <input
              type="text"
              name="TwoTierPrice"
              placeholder="Two-tier seat price"
              value={this.state.TwoTierPrice}
              onChange={(e) => this.setState({ TwoTierPrice: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Three Tier price </label>
            <input
              type="text"
              name="ThreeTierPrice"
              placeholder="Three-tier seat price"
              value={this.state.ThreeTierPrice}
              onChange={(e) => this.setState({ ThreeTierPrice: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Sleeper price </label>
            <input
              type="text"
              name="SleeperPrice"
              placeholder="Sleeper seat price"
              value={this.state.SleeperPrice}
              onChange={(e) => this.setState({ SleeperPrice: e.target.value })}
            />
          </div>
          <Link to={"/addtrainconfirm"}>
          <button className="RegisterB">Add above Train</button>
          </Link>
          <br></br>
          <br></br>
        </form>
      </div>
    );
  }
}

export default AddTrain;