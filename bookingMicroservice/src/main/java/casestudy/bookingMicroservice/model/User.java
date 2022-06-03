package casestudy.bookingMicroservice.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "bookings")
public class User {
	
	@Id
	@NonNull
	private int userId;
	@NonNull
	private String name;
	@NonNull
	private String gender;
	@NonNull
	private long contactNo;
	@NonNull
	private String journeyDate;
	@NonNull
	private String address;
	@NonNull
	private int train_id;
	@NonNull
	private int noOfAdults;
	@NonNull
	private int noOfMinors;
	@NonNull
	private String seatType;
	@NonNull
	private String paymentStatus;
	public User(int userId, String name, String gender, long contactNo, String journeyDate, String address,
			int train_id, int noOfAdults, int noOfMinors, String seatType, String paymentStatus) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.contactNo = contactNo;
		this.journeyDate = journeyDate;
		this.address = address;
		this.train_id = train_id;
		this.noOfAdults = noOfAdults;
		this.noOfMinors = noOfMinors;
		this.seatType = seatType;
		this.paymentStatus = paymentStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfMinors() {
		return noOfMinors;
	}
	public void setNoOfMinors(int noOfMinors) {
		this.noOfMinors = noOfMinors;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", gender=" + gender + ", contactNo=" + contactNo
				+ ", journeyDate=" + journeyDate + ", address=" + address + ", train_id=" + train_id + ", noOfAdults="
				+ noOfAdults + ", noOfMinors=" + noOfMinors + ", seatType=" + seatType + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
}
