package casestudy.adminMicroservice.controller;
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
import casestudy.adminMicroservice.model.Train;
import casestudy.adminMicroservice.repository.TrainRepository;

@RequestMapping("/train")
@RestController
public class AdminController {
	
	    @Autowired
	    TrainRepository trainRepository;

	    @GetMapping("/admin/getall")
	    public ResponseEntity<?> gettrains(){
	    return ResponseEntity.ok(this.trainRepository.findAll());
	    }

	    @GetMapping("/admin/{id}")
	        public ResponseEntity<?> getDetails(@PathVariable Integer id) {
	       	 return ResponseEntity.ok(this.trainRepository.findById(id));
	    }

	    @PostMapping("/admin/add")
	    public ResponseEntity<?> addTrain(@RequestBody Train train) {
	        	Train e=this.trainRepository.save(train);
	        	return ResponseEntity.ok(e);
	    }
		
		@PutMapping("/admin/update")
		public ResponseEntity<?> updateTrain(@RequestBody Train train) {
			Train e=this.trainRepository.save(train);
			return ResponseEntity.ok(e);
		}
		
		
		@DeleteMapping("/admin/{id}") 
		public void deleteTrain(@PathVariable Integer id){
			this.trainRepository.deleteById(id);
		}

	}

