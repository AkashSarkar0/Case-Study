package casestudy.userMicroservice.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class PaymentDetails {

	@Id
	private int userId;
	private int train_id;
	private String bankName;
	private Long cardNo;
	private String nameOnCard;
	private int cvv;
	public PaymentDetails(int userId, int train_id, String bankName, Long cardNo, String nameOnCard, int cvv) {
		super();
		this.userId = userId;
		this.train_id = train_id;
		this.bankName = bankName;
		this.cardNo = cardNo;
		this.nameOnCard = nameOnCard;
		this.cvv = cvv;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTrain_id() {
		return train_id;
	}
	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "PaymentDetails [userId=" + userId + ", train_id=" + train_id + ", bankName=" + bankName + ", cardNo="
				+ cardNo + ", nameOnCard=" + nameOnCard + ", cvv=" + cvv + "]";
	}
	
}
