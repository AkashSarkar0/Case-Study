package casestudy.userMicroservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import casestudy.userMicroservice.models.Train;
import casestudy.userMicroservice.models.UserLogin;
import casestudy.userMicroservice.repository.TrainRepository;
import casestudy.userMicroservice.repository.UserLoginRepository;
import casestudy.userMicroservice.service.UserService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserLoginRepository userLoginRepository;
	
	@Autowired
	private TrainRepository trainRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	//-----------------------------------------------------------------------------------user login mappings
	
	
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
	
	@GetMapping("/find/{id}") 
	public void findUser(@PathVariable String id){
		this.userLoginRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}") 
	public void deleteUser(@PathVariable String id){
		this.userLoginRepository.deleteById(id);
	}
	
	//--------------------------------------------------------------------------------------User-Train search mapping
	
	@GetMapping("/train/getall")
	    public ResponseEntity<?> gettrains(){
	    return ResponseEntity.ok(this.trainRepository.findAll());
	    }

	@GetMapping("/train/{id}")
	        public ResponseEntity<?> getDetails(@PathVariable Integer id) {
	       	 return ResponseEntity.ok(this.trainRepository.findById(id));
	    }
	
	@GetMapping("/train/{train_origin}/{train_destination}")
	public List<Train>getTrainBylocation(@PathVariable String train_origin,@PathVariable String train_destination ){
		return userService.getTrainByOrgDest(train_origin, train_destination);
	}
	
	
}
