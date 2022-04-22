package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping("/save")
	public String saveDetails(@RequestBody CarEntity ce) {
		return cs.saveDetails(ce);

	}

	@PutMapping(value = "/update")
	public String uptadeInfo(@RequestBody CarEntity ce) {
		return cs.updateInfo(ce);

	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteInfo(@PathVariable int id) {
		return cs.deleteInfo(id);
	}

	@GetMapping(value = "/getInfo")
	public List<CarEntity> getAllInfo() {
		return cs.getAllInfo();
	}

	@GetMapping(value = "/getName/{car_name}")
	public List<CarEntity> getName(@PathVariable String car_name) {
		return cs.getByName(car_name);
	}

	@GetMapping(value = "/info")
	public List<Object> getInformation() {
		return cs.getInformation();
	}

	@GetMapping(value = "/getfield")
	public List<String> getBrand() {
		return cs.getBrand();
	}
	@GetMapping(value="/info/{from}/{to}")
	public List<CarEntity>getRange(@PathVariable("from") int fromPrice,@PathVariable("to") int toPrice){
		return cs.getByRange(fromPrice,toPrice);
		
	}
}
