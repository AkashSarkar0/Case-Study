package casestudy.userMicroservice.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import casestudy.userMicroservice.models.Train;
import casestudy.userMicroservice.repository.TrainRepository;

@Service
public class UserService {
	

	@Autowired
	private TrainRepository trainRepository;
	
	
	public List<Train>getTrainByOrgDest(String train_origin,String train_destination){
		List<Train>list=trainRepository.findAll();
		List<Train>arrlist=new ArrayList<Train>();
		for(Train train:list) {
			String org=train.getTrain_origin();
			String dest=train.getTrain_destination();
			if(org.equals(train_origin) && dest.equals(train_destination)) {
				arrlist.add(train);
			
			}
		}
		return arrlist;
	}
}
