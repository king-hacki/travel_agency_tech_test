package com.softserve.travel_agency.model;

import com.softserve.travel_agency.model.enums.RentStatus;
import com.softserve.travel_agency.model.enums.RoomLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.Period;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
public class Rent {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToOne
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @CreationTimestamp
    private LocalDate startRentDate;

    @UpdateTimestamp
    private LocalDate endRentDate;

    @Enumerated(STRING)
    private RentStatus status;

}
