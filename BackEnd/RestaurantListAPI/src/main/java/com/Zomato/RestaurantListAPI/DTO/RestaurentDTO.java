package com.Zomato.RestaurantListAPI.DTO;

import java.util.List;

public class RestaurentDTO {
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRestaurentName() {
		return RestaurentName;
	}
	public void setRestaurentName(String restaurentName) {
		RestaurentName = restaurentName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<String> getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(List<String> speciality) {
		Speciality = speciality;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	String imagePath;
	String RestaurentName;
	double rating;
	List<String> Speciality;
	double price;
	int distance;
	String ownerEmail;
	
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public RestaurentDTO(String imagePath, String restaurentName, double rating, List<String> speciality, double price,
			int distance, String ownerEmail, String cityName, int pinCode) {
		super();
		this.imagePath = imagePath;
		RestaurentName = restaurentName;
		this.rating = rating;
		Speciality = speciality;
		this.price = price;
		this.distance = distance;
		this.ownerEmail = ownerEmail;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	String cityName;
	int pinCode;

}
