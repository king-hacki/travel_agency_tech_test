package com.softserve.travel_agency.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.LinkedHashSet;
import java.util.Set;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message = "Country name can't be blank")
    private String name;

    @OneToMany(mappedBy = "country", cascade = REMOVE, fetch = LAZY)
    private Set<Hotel> hotels = new LinkedHashSet<>();

}
