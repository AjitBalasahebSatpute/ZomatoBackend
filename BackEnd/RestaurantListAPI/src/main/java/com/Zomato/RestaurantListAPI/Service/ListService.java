package com.Zomato.RestaurantListAPI.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Zomato.RestaurantListAPI.DTO.RestaurentDTO;
import com.Zomato.RestaurantListAPI.Model.RestaurentModel;

@Service
public interface ListService {
	
	public List<RestaurentModel> getRestaurents(int postCode);
	public RestaurentModel addRestaurent(RestaurentDTO restaurent);
	
}
