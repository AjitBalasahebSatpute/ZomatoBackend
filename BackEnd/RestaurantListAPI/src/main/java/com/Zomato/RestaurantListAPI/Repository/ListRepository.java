package com.Zomato.RestaurantListAPI.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Zomato.RestaurantListAPI.Model.RestaurentModel;

@Repository
public interface ListRepository extends JpaRepository<RestaurentModel, Integer> {
	
	
	public RestaurentModel findByOwnerEmail(String email);
	
	@Query(value = "select * from master_restaurent where pin_code=?1", nativeQuery = true)
	public List<RestaurentModel> findAllByRestaurentID(int postCode);
	
}
