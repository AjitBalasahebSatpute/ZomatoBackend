package com.Zomato.RestaurantListAPI.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Zomato.RestaurantListAPI.DTO.ResponseDTO;
import com.Zomato.RestaurantListAPI.DTO.RestaurentDTO;
import com.Zomato.RestaurantListAPI.Model.RestaurentModel;
import com.Zomato.RestaurantListAPI.Service.ListService;
import com.Zomato.RestaurantListAPI.Service.RestaurentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/restaurent")
public class RestaurentController {
	
	@Autowired
	RestaurentService service;
	
	ResponseDTO res = new ResponseDTO();
	
	@GetMapping("/check")
	public ResponseEntity<RestaurentDTO> getMethodName() {
		List<String> list = new ArrayList<String>();
		list.add("pizza");
		list.add("Fast food special");	
	
		RestaurentDTO DTO= new RestaurentDTO("imagePath", "name", 4,list, 30.4, 10, "ajit@gmail.com", "Pandharpur", 413304);
		return new ResponseEntity<>(DTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{postcode}")
	public ResponseEntity<List<RestaurentModel>> getRestaurents(@PathVariable ("postcode")int postCode ){
		List<RestaurentModel> temp = service.getRestaurents(postCode);
		if(temp!=null) {
			return new ResponseEntity<List<RestaurentModel>>(temp,HttpStatus.OK); //200
		}
		else {
			//here throw exception
			return new ResponseEntity<List<RestaurentModel>>(temp, HttpStatus.NOT_FOUND); //404
		}
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO>addRestaurent(@RequestBody RestaurentDTO restaurent ) throws Exception{
			RestaurentModel temp =service.addRestaurent(restaurent);
			if(temp!=null) {
				res.setRestaurentID(temp.getRestaurentID());
				res.setStatusCode(HttpStatus.CREATED.value());
				res.setMgs("Restaurent successfully");
				
				return new ResponseEntity<ResponseDTO>(res,HttpStatus.OK);
			}
			else {
				res.setMgs("Error while adding restaurent");
				res.setRestaurentID(0);
				res.setStatusCode(HttpStatus.NOT_MODIFIED.value());
				return new ResponseEntity<ResponseDTO>(res,HttpStatus.METHOD_FAILURE);
			}
			
	}
	
}
