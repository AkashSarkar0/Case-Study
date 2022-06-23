package casestudy.bookingMicroservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import casestudy.bookingMicroservice.model.User;
import casestudy.bookingMicroservice.repository.BookRepository;

@Service
public class BookingService {

	@Autowired
	private BookRepository bookRepository;
	
	public String newBooking(User user) {
		bookRepository.save(user);
		return ("Ticket of Train- " +user.getTrain_id()+ " is booked successfully. Booking ID is:"+user.getBookingId());
	}
}
