package casestudy.userMicroservice.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class PaymentDetails {

	@Id
	private String userId;
	private String train_id;
	private String bankName;
	private String cardNo;
	private String nameOnCard;
	private String cvv;
	public PaymentDetails(String userId, String train_id, String bankName, String cardNo, String nameOnCard,
			String cvv) {
		super();
		this.userId = userId;
		this.train_id = train_id;
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.nameOnCard = nameOnCard;
		this.cvv = cvv;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrain_id() {
		return train_id;
	}
	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "PaymentDetails [userId=" + userId + ", train_id=" + train_id + ", bankName=" + bankName + ", cardNo="
				+ cardNo + ", nameOnCard=" + nameOnCard + ", cvv=" + cvv + "]";
	}
	
}
