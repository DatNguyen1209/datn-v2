package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
        (name = "images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Images extends BaseEntities {
    @Column(name = "image_name")
    private String imageName;
    @Column(name = "url")
    private String url;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "hotelImg",referencedColumnName = "id")
    private Hotel hotel;


}
