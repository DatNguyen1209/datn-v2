package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hotel")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;


}
