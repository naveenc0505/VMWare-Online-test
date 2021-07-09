package com.cab.service;

import java.util.List;

import com.cab.entity.Car;
import com.cab.exception.EntityNotFoundException;

public interface CarService
{

    Car find(final Long carId) throws EntityNotFoundException;


    List<Car> findAllCars();


    Car create(final Car car) throws EntityNotFoundException;


    void update(final Car car) throws EntityNotFoundException;


    void delete(final Long carId) throws EntityNotFoundException;

}
