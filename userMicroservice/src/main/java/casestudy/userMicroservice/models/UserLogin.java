package casestudy.userMicroservice.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserLogin {
	
	private String name;
	private String email;
	private String phoneNo;
	@Id
	private String username;
	private String password;
	private String confirmPassword;
	public UserLogin(String name, String email, String phoneNo, String username, String password,
			String confirmPassword) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "UserLogin [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", username=" + username
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
}
