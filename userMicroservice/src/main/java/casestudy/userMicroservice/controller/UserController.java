package casestudy.userMicroservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import casestudy.userMicroservice.models.UserLogin;
import casestudy.userMicroservice.repository.UserLoginRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@GetMapping("/getall")
    public ResponseEntity<?> getUsers(){
    return ResponseEntity.ok(this.userLoginRepository.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserLogin userLogin) {
        	UserLogin e=this.userLoginRepository.save(userLogin);
        	return ResponseEntity.ok(e);
    }

	@PutMapping("/update")
	public ResponseEntity<?> updateUserDetails(@RequestBody UserLogin userLogin) {
		UserLogin e=this.userLoginRepository.save(userLogin);
		return ResponseEntity.ok(e);
	}
	
	@DeleteMapping("/{id}") 
	public void deleteUser(@PathVariable String id){
		this.userLoginRepository.deleteById(id);
	}
	
}
