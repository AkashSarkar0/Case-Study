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


import casestudy.bookingMicroservice.model.User;
import casestudy.bookingMicroservice.repository.BookRepository;
import casestudy.bookingMicroservice.service.BookingService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookingService bookingService;
	

	
	@GetMapping("/getall")
    public ResponseEntity<?> getBookings(){
    return ResponseEntity.ok(this.bookRepository.findAll());
    }

    @GetMapping("/find/{id}")
        public ResponseEntity<?> getBookingDetails(@PathVariable String id) {
       	 return ResponseEntity.ok(this.bookRepository.findById(id));
    }

    
    @PostMapping("/book")
	public String addUser(@RequestBody User user) {
		return bookingService.newBooking(user);
	}

	@DeleteMapping("/cancel/{id}") 
	public void deleteTrain(@PathVariable String id){
		this.bookRepository.deleteById(id);
	}
}
