package com.cab.dao;

import com.cab.constants.OnlineStatus;
import com.cab.entity.Driver;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Database Access Object for driver table.
 * <p/>
 */
public interface DriverRepository extends CrudRepository<Driver, Long>
{
    Driver findByUsername(final String username);


    List<Driver> findByOnlineStatus(OnlineStatus onlineStatus);
}
