package casestudy.adminMicroservice.controller;
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
import casestudy.adminMicroservice.model.Train;
import casestudy.adminMicroservice.repository.TrainRepository;

@CrossOrigin("http://localhost:3000")
@RequestMapping("/admin")
@RestController
public class AdminController {
	
	    @Autowired
	    TrainRepository trainRepository;

	    @GetMapping("/train/getall")
	    public ResponseEntity<?> gettrains(){
	    return ResponseEntity.ok(this.trainRepository.findAll());
	    }

	    @GetMapping("/train/{id}")
	        public ResponseEntity<?> getDetails(@PathVariable String id) {
	       	 return ResponseEntity.ok(this.trainRepository.findById(id));
	    }

	    @PostMapping("/train/add")
	    public ResponseEntity<?> addTrain(@RequestBody Train train) {
	        	Train e=this.trainRepository.save(train);
	        	return ResponseEntity.ok(e);
	    }
		
		@PutMapping("/train/update")
		public ResponseEntity<?> updateTrain(@RequestBody Train train) {
			Train e=this.trainRepository.save(train);
			return ResponseEntity.ok(e);
		}
		
		@DeleteMapping("/train/{id}") 
		public void deleteTrain(@PathVariable String id){
			this.trainRepository.deleteById(id);
		}

	}

