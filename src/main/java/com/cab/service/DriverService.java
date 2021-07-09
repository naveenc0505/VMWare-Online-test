package com.cab.service;

import java.util.List;
import java.util.Map;

import com.cab.constants.OnlineStatus;
import com.cab.entity.Driver;
import com.cab.exception.CarAlreadyInUseException;
import com.cab.exception.ConstraintsViolationException;
import com.cab.exception.EntityNotFoundException;
import com.cab.model.DriverDTO;

public interface DriverService
{

    Driver find(Long driverId) throws EntityNotFoundException;


    Driver create(Driver driverDO) throws ConstraintsViolationException;


    void delete(Long driverId) throws EntityNotFoundException;


    void updateLocation(long driverId, double longitude, double latitude) throws EntityNotFoundException;


    List<Driver> find(OnlineStatus onlineStatus);


    DriverDTO selectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;


    void deSelectCarByDriver(Long driverId, Long carId) throws EntityNotFoundException, CarAlreadyInUseException;


    List<DriverDTO> findDriversByFilterCriteria(Map<String, String> params) throws EntityNotFoundException;

}
