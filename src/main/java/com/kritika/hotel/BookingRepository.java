package com.kritika.hotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<HotelBooking,Long> {

    List<HotelBooking> findByPricePerNightLessThan(double price);

}