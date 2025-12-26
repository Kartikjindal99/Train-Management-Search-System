package com.trainProj.trainProj.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trainName;

    private String trainNumber;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JsonBackReference
    private List<trainSchedule>scheduleList;

    public Train(){

    }

}
