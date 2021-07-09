package com.cab.dao;

import org.springframework.data.repository.CrudRepository;

import com.cab.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long>
{}
