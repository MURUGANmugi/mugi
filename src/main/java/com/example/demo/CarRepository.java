package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



public interface CarRepository extends JpaRepository<CarEntity, Integer> {

@Query(value="select * from Car where car_name like %:car_name%",nativeQuery=true)
public List<CarEntity>getByName(@Param("car_name")String car_name);

@Query(value="select car_name from Car",nativeQuery=true)
public List<Object>getInformation();

@Query(value="select car_name from Car",nativeQuery=true)
public List<String>getBrand();

@Query(value="select * from Car where car_price>=? and car_price<=?",nativeQuery=true)
List<CarEntity>getByRange(int fromPrice,int toPrice);
	}
