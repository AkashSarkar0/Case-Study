package casestudy.bookingMicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import casestudy.bookingMicroservice.model.User;
import casestudy.bookingMicroservice.repository.BookRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookRepository bookRepository;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@GetMapping("/getall")
    public ResponseEntity<?> getBookings(){
    return ResponseEntity.ok(this.bookRepository.findAll());
    }

    @GetMapping("/{id}")
        public ResponseEntity<?> getBookingDetails(@PathVariable Integer id) {
       	 return ResponseEntity.ok(this.bookRepository.findById(id));
    }
    
    @PostMapping("/book")
    public ResponseEntity<?> addTrain(@RequestBody User user) {
        	User e=this.bookRepository.save(user);
        	return ResponseEntity.ok(e);
    }

	@DeleteMapping("/{id}") 
	public void deleteTrain(@PathVariable Integer id){
		this.bookRepository.deleteById(id);
	}
}
