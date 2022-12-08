//package com.example.demo.vehicle;
//
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import lombok.Data;
//import lombok.experimental.SuperBuilder;
//
//@Data
//@SuperBuilder(toBuilder = true)
//@Document(value = "vehicle")
//public class Vehicle {
//	private String vehicleType;
//	private String vehicleBrand;
//	private String vehicleModel;
//	
//	@VehicleConstraint
//	public Vehicle(String vehicleType, String vehicleBrand, String vehicleModel) {
//		this.vehicleType = vehicleType;
//		this.vehicleBrand = vehicleBrand;
//		this.vehicleModel = vehicleModel;
//	}
//	
//}
