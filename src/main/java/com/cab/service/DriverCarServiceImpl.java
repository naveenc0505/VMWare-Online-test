package com.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.dao.DriverCarRepository;
import com.cab.entity.DriverCar;

@Service
public class DriverCarServiceImpl implements DriverCarService
{

    @Autowired
    private DriverCarRepository driverCarRepository;


    @Override
    public void delete(DriverCar driverCar)
    {
        driverCarRepository.delete(driverCar);
    }


    @Override
    public DriverCar save(DriverCar driverCar)
    {
        return driverCarRepository.save(driverCar);
    }


    @Override
    public DriverCar findByDriverIdAndCarId(Long driverId, Long carId)
    {
        return driverCarRepository.findByDriverIdAndCarId(driverId, carId);
    }

}
