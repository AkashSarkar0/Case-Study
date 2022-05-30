package casestudy.bookingMicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection="train")
public class Train {
	
	@Id
	@NonNull
    private int train_id;
	@NonNull
    private String train_name;
	@NonNull
	private String train_origin;
	@NonNull
	private String train_destination;
	@NonNull
	private String train_arrival;
	@NonNull
	private String train_departure;
	@NonNull
	private String train_duration;
	private int noOfSeats;
	private int oneTierPrice;
	private int twoTierPrice;
	private int threeTierPrice;
	private int sleeperPrice;
	public Train(int train_id, String train_name, String train_origin, String train_destination, String train_arrival,
			String train_departure, String train_duration, int noOfSeats, int oneTierPrice, int twoTierPrice,
			int threeTierPrice, int sleeperPrice) {
		super();
		this.train_id = train_id;
		this.train_name = train_name;
		this.train_origin = train_origin;
		this.train_destination = train_destination;
		this.train_arrival = train_arrival;
		this.train_departure = train_departure;
		this.train_duration = train_duration;
		this.noOfSeats = noOfSeats;
		this.oneTierPrice = oneTierPrice;
		this.twoTierPrice = twoTierPrice;
		this.threeTierPrice = threeTierPrice;
		this.sleeperPrice = sleeperPrice;
	}
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
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
	public String getTrain_arrival() {
		return train_arrival;
	}
	public void setTrain_arrival(String train_arrival) {
		this.train_arrival = train_arrival;
	}
	public String getTrain_departure() {
		return train_departure;
	}
	public void setTrain_departure(String train_departure) {
		this.train_departure = train_departure;
	}
	public String getTrain_duration() {
		return train_duration;
	}
	public void setTrain_duration(String train_duration) {
		this.train_duration = train_duration;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getOneTierPrice() {
		return oneTierPrice;
	}
	public void setOneTierPrice(int oneTierPrice) {
		this.oneTierPrice = oneTierPrice;
	}
	public int getTwoTierPrice() {
		return twoTierPrice;
	}
	public void setTwoTierPrice(int twoTierPrice) {
		this.twoTierPrice = twoTierPrice;
	}
	public int getThreeTierPrice() {
		return threeTierPrice;
	}
	public void setThreeTierPrice(int threeTierPrice) {
		this.threeTierPrice = threeTierPrice;
	}
	public int getSleeperPrice() {
		return sleeperPrice;
	}
	public void setSleeperPrice(int sleeperPrice) {
		this.sleeperPrice = sleeperPrice;
	}
	@Override
	public String toString() {
		return "Train [train_id=" + train_id + ", train_name=" + train_name + ", train_origin=" + train_origin
				+ ", train_destination=" + train_destination + ", train_arrival=" + train_arrival + ", train_departure="
				+ train_departure + ", train_duration=" + train_duration + ", noOfSeats=" + noOfSeats
				+ ", oneTierPrice=" + oneTierPrice + ", twoTierPrice=" + twoTierPrice + ", threeTierPrice="
				+ threeTierPrice + ", sleeperPrice=" + sleeperPrice + "]";
	}
	
}
