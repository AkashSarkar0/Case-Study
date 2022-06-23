package casestudy.adminMicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection="train")
public class Train {
	
	@Id
	@NonNull
    private String train_id;
	@NonNull
    private String train_name;
	@NonNull
	private String train_origin;
	@NonNull
	private String train_destination;
	@NonNull
	private String train_departure;
	@NonNull
	private String train_arrival;
	@NonNull
	private String train_duration;
	private String noOfSeats;
	private String oneTierPrice;
	private String twoTierPrice;
	private String threeTierPrice;
	private String sleeperPrice;
	public Train(String train_id, String train_name, String train_origin, String train_destination,
			String train_departure, String train_arrival, String train_duration, String noOfSeats, String oneTierPrice,
			String twoTierPrice, String threeTierPrice, String sleeperPrice) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		this.train_origin = train_origin;
		this.train_destination = train_destination;
		this.train_departure = train_departure;
		this.train_arrival = train_arrival;
		this.train_duration = train_duration;
		this.noOfSeats = noOfSeats;
		this.oneTierPrice = oneTierPrice;
		this.twoTierPrice = twoTierPrice;
		this.threeTierPrice = threeTierPrice;
		this.sleeperPrice = sleeperPrice;
	}
	public String getTrain_id() {
		return train_id;
	}
	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getTrain_origin() {
		return train_origin;
	}
	public void setTrain_origin(String train_origin) {
		this.train_origin = train_origin;
	}
	public String getTrain_destination() {
		return train_destination;
	}
	public void setTrain_destination(String train_destination) {
		this.train_destination = train_destination;
	}
	public String getTrain_departure() {
		return train_departure;
	}
	public void setTrain_departure(String train_departure) {
		this.train_departure = train_departure;
	}
	public String getTrain_arrival() {
		return train_arrival;
	}
	public void setTrain_arrival(String train_arrival) {
		this.train_arrival = train_arrival;
	}
	public String getTrain_duration() {
		return train_duration;
	}
	public void setTrain_duration(String train_duration) {
		this.train_duration = train_duration;
	}
	public String getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getOneTierPrice() {
		return oneTierPrice;
	}
	public void setOneTierPrice(String oneTierPrice) {
		this.oneTierPrice = oneTierPrice;
	}
	public String getTwoTierPrice() {
		return twoTierPrice;
	}
	public void setTwoTierPrice(String twoTierPrice) {
		this.twoTierPrice = twoTierPrice;
	}
	public String getThreeTierPrice() {
		return threeTierPrice;
	}
	public void setThreeTierPrice(String threeTierPrice) {
		this.threeTierPrice = threeTierPrice;
	}
	public String getSleeperPrice() {
		return sleeperPrice;
	}
	public void setSleeperPrice(String sleeperPrice) {
		this.sleeperPrice = sleeperPrice;
	}
	@Override
	public String toString() {
		return "Train [train_id=" + train_id + ", train_name=" + train_name + ", train_origin=" + train_origin
				+ ", train_destination=" + train_destination + ", train_departure=" + train_departure
				+ ", train_arrival=" + train_arrival + ", train_duration=" + train_duration + ", noOfSeats=" + noOfSeats
				+ ", oneTierPrice=" + oneTierPrice + ", twoTierPrice=" + twoTierPrice + ", threeTierPrice="
				+ threeTierPrice + ", sleeperPrice=" + sleeperPrice + "]";
	}
	
}
