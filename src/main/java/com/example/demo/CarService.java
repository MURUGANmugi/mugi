package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarService {
@Autowired
CarDao cd;
	public String saveDetails(CarEntity ce) {
		
		return cd.SaveDetails(ce);
	}
	public String updateInfo(CarEntity ce) {
		return cd.updateInfo(ce);
	}
	public String deleteInfo(int id) {
		return cd.deleteInfo(id);
		
	}
	public List<CarEntity>getAllInfo(){
		return cd.getAllInfo();
		
	}
	public List<CarEntity>getByName(String car_name){
		return cd.getByName(car_name);
	}
	public List<Object>getInformation(){
		return cd.getInformation();
	}
	public List<String>getBrand(){
		return cd.getBrand();
	}
	public List<CarEntity>getByRange(int fromPrice,int toPrice){
		return cd.getByRange(fromPrice,toPrice);
	}
	
	}


