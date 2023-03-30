package com.bezkoder.springjwt.converter;

import com.bezkoder.springjwt.dto.UserDTO;
import com.bezkoder.springjwt.models.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserConverter {
    public User toEntity(UserDTO dto, String pass){
        User entity = new User();
        entity.setUsername(dto.getUsername());
        entity.setPassword(pass);
        entity.setFullName(dto.getFullName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setCreatedDate(new Date());
        return entity;
    }
    public UserDTO toDTO(User user){
        UserDTO dto = new UserDTO();
        if(user.getId() != null){
            dto.setId(user.getId());
        }
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setFullName(user.getFullName());
        dto.setCreatedDate(user.getCreatedDate());
        dto.setModifiedDate(user.getModifiedDate());
        dto.setPhone(user.getPhone());
        dto.setEmail(user.getEmail());
        dto.setAddress(user.getAddress());
        return dto;
    }
    public User toEntity(UserDTO dto,User user){
        user.setUsername(dto.getUsername());
        user.setFullName(dto.getFullName());
        user.setPhone(dto.getPhone());
        user.setModifiedDate(new Date());
        user.setEmail(dto.getEmail());
        return  user;
    }

}
