import React from "react";

const Trainlist = (props) => {
  console.log(props);

  const renderTrainlist = props.trains.map((train) => {
    return (
      <div className="item">
          <div className="content">
              <div className="header">Train Id: {train.Train_id}</div>
              <div>Train Name: {train.Train_name}</div>
              <div>Train Origin: {train.Train_origin}</div>
              <div>Train Destination: {train.Train_destination}</div>
              <div>Train Arrival: {train.Train_arrival}</div>
              <div>Train Departure: {train.Train_departure}</div>
              <div>Train Duration: {train.Train_duration}</div>
              <div>Number of Seats: {train.NoOfSeats}</div>
              <div>One Tier price: {train.OneTierPrice}</div>
              <div>Two Tier price: {train.TwoTierPrice}</div>
              <div>Three Tier price: {train.ThreeTierPrice}</div>
              <div>Sleeper price: {train.SleeperPrice}</div>
          </div>
      </div>
    );
  });
  return <div className="ui celled list">{renderTrainlist}</div>;
};

export default Trainlist;