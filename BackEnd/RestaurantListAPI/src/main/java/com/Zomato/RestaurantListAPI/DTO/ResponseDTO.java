package com.Zomato.RestaurantListAPI.DTO;

public class ResponseDTO {
	
	int statusCode;
	int restaurentID;
	String mgs;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public int getRestaurentID() {
		return restaurentID;
	}
	public void setRestaurentID(int restaurentID) {
		this.restaurentID = restaurentID;
	}
	public String getMgs() {
		return mgs;
	}
	public void setMgs(String mgs) {
		this.mgs = mgs;
	}

}
