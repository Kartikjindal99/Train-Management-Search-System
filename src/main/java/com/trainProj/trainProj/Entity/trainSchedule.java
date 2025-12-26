package com.trainProj.trainProj.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class trainSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="train_id")
    @JsonManagedReference
    private Train train;

    @ManyToOne
    @JoinColumn(name="source_station_id")//foreign key in train schedule
    private Station source;


    @ManyToOne
    @JoinColumn(name="destination_station_id")//foreign key in train schedule
    @JsonManagedReference
    private Station destination;

    private String departureTime;
    private String arrivalTime;

    public trainSchedule(){

    }
}
