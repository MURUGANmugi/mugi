package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CarDao {
@Autowired
CarRepository cr;
	public String SaveDetails(CarEntity ce) {
		cr.save(ce);
		
		return "saved successfully";
	}
	
	public String updateInfo(CarEntity ce) {
		cr.save(ce).getId();
		
		return "data Updated";
	}

	public String deleteInfo(int id) {
        cr.deleteById(id);
		return "data deleted";
	}
	public List<CarEntity>getAllInfo(){
		return cr.findAll();
	}
	public List<CarEntity>getByName(String car_name){
		List<CarEntity>li=cr.getByName(car_name);
		return li;
	}
	public List<Object>getInformation(){
		List<Object>li=cr.getInformation();
		return li;
	}
	public List<String>getBrand(){
		return cr.getBrand();	
	}
	public List<CarEntity>getByRange(int fromPrice,int toPrice){
		List<CarEntity>li=cr.getByRange(fromPrice,toPrice);
		return li;
	}
	}
