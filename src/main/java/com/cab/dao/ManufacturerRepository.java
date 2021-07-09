package com.cab.dao;

import org.springframework.data.repository.CrudRepository;

import com.cab.entity.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long>
{

    Manufacturer findByName(final String name);
}
