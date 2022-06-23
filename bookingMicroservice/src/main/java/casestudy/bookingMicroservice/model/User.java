package casestudy.bookingMicroservice.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "bookings")                           //------saving every document in "bookings" collection
public class User {
	 //--------------------------------------------------------------Passenger details given by logged in User 
	@Id
	@NonNull
	private String bookingId;
	@NonNull
	private String name;
	@NonNull
	private String gender;
	@NonNull
	private String contactNo;
	@NonNull
	private String journeyDate;
	@NonNull
	private String address;
	@NonNull
	private String train_id;               //--------------------------booking with train ID and passenger details
	@NonNull
	private String noOfAdults;
	@NonNull
	private String noOfMinors;
	@NonNull
	private String seatType;
	@NonNull
	private String paymentStatus;                                                                            //constructor using this fields 
	public User(String bookingId, String name, String gender, String contactNo, String journeyDate, String address,
			String train_id, String noOfAdults, String noOfMinors, String seatType, String paymentStatus) {
		super();
		this.bookingId = bookingId;
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
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
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
	public String getTrain_id() {
		return train_id;
	}
	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}
	public String getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(String noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public String getNoOfMinors() {
		return noOfMinors;
	}
	public void setNoOfMinors(String noOfMinors) {
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
		return "User [bookingId=" + bookingId + ", name=" + name + ", gender=" + gender + ", contactNo=" + contactNo
				+ ", journeyDate=" + journeyDate + ", address=" + address + ", train_id=" + train_id + ", noOfAdults="
				+ noOfAdults + ", noOfMinors=" + noOfMinors + ", seatType=" + seatType + ", paymentStatus="
				+ paymentStatus + "]";
	}
	
}
