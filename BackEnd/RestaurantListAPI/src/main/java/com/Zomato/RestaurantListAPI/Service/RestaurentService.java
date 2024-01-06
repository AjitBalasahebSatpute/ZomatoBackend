package com.Zomato.RestaurantListAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zomato.RestaurantListAPI.DTO.RestaurentDTO;
import com.Zomato.RestaurantListAPI.Model.RestaurentModel;
import com.Zomato.RestaurantListAPI.Repository.ListRepository;


@Service
public class RestaurentService implements ListService{
	
	@Autowired
	ListRepository listRepo;
	
	RestaurentModel model = new RestaurentModel();

	@Override
	public List<RestaurentModel> getRestaurents(int postCode) {
		
		try {
			List<RestaurentModel> list =   listRepo.findAllByRestaurentID(postCode);
			System.out.println(list);
			return list;
		}
		catch(Exception e) {
			System.out.println("no Data fount");
			return null;
		}
	}

	@Override
	public RestaurentModel addRestaurent(RestaurentDTO resto) {
		try {
			model = listRepo.findByOwnerEmail(resto.getOwnerEmail());
//			System.out.println(model.getOwnerEmail());
			if (model==null) {
				
				RestaurentModel model = new RestaurentModel();
				model.setCityName(resto.getCityName());
				model.setDistance(resto.getDistance());
				model.setImagePath(resto.getImagePath());
				model.setOwnerEmail(resto.getOwnerEmail());
				model.setPinCode(resto.getPinCode());
				model.setPrice(resto.getPrice());
				model.setRating(resto.getRating());
				model.setRestaurentName(resto.getRestaurentName());
				model.setSpeciality(resto.getSpeciality());
				return listRepo.save(model);
			}
			else {
				return null;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		
		
		
		
		
		
		
		
//		try {
//			
//			
//			if (temp==null) {
//				model.setCityName(resto.getCityName());
//				model.setDistance(resto.getDistance());
//				model.setImagePath(resto.getImagePath());
//				model.setOwnerEmail(resto.getOwnerEmail());
//				model.setPinCode(resto.getPinCode());
//				model.setPrice(resto.getPrice());
//				model.setRating(resto.getRating());
////				model.setRestaurentID(0);
//				model.setRestaurentName(resto.getRestaurentName());
//				model.setSpeciality(resto.getSpeciality());
//				System.out.println(temp.getOwnerEmail() + "-------------------------in added---=");
//				return listRepo.save(model);
//				
//				
//			}
//			System.out.println(temp.getOwnerEmail());
//			return null;
//		}
//		catch(Exception e) {
//			System.out.println("in exception----------------");
//			return null;
//		}
	}

}
