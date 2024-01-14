package com.Zomato.RestaurantListAPI.Model;

import java.util.List;

import org.hibernate.annotations.ValueGenerationType;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "master_restaurent")
public class RestaurentModel {
//	• Image path: string
//	• Restaurant name: String
//	• Rating: int
//	• Special dish/speciality tag: list of string's
//	• Item price: Double
//	• Distance/time( This will be calculated based on user location): int
//	• City name 
//	• District
//	pincode
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int restaurentID;
	public RestaurentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRestaurentID() {
		return restaurentID;
	}
	public void setRestaurentID(int restaurentID) {
		this.restaurentID = restaurentID;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRestaurentName() {
		return restaurentName;
	}
	public void setRestaurentName(String restaurentName) {
		restaurentName = restaurentName;
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
	String ownerEmail;
	String restaurentName;
	double rating;
	public RestaurentModel(int restaurentID, String imagePath, String ownerEmail, String restaurentName, double rating,
			List<String> speciality, double price, int distance, String cityName, int pinCode) {
		super();
		this.restaurentID = restaurentID;
		this.imagePath = imagePath;
		this.ownerEmail = ownerEmail;
		restaurentName = restaurentName;
		this.rating = rating;
		Speciality = speciality;
		this.price = price;
		this.distance = distance;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	List<String> Speciality;
	double price;
	int distance;

	String cityName;
	int pinCode;
}
