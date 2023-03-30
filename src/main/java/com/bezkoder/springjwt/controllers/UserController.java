package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.dto.PageDTO;
import com.bezkoder.springjwt.dto.UserDTO;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;
import com.bezkoder.springjwt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    IUserService iUserService;
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow(()->
                new RuntimeException("Not found user have id!!"));
    }
    @GetMapping("/getAllUser")
    public PageDTO<UserDTO> getAllUser(
            @RequestParam("page") int page,
            @RequestParam("size") int size
    ){
        return iUserService.findAllWithPageable(page,size);
    }
    @PutMapping("/update/{id}")
    public  UserDTO updateUser(@RequestBody UserDTO dto,@PathVariable("id") Long id){
        dto.setId(id);
        return iUserService.update(dto);
    }

}
