package com.trainProj.trainProj.Controller;

import com.trainProj.trainProj.Entity.Station;
import com.trainProj.trainProj.Entity.Train;
import com.trainProj.trainProj.Entity.trainSchedule;
import com.trainProj.trainProj.Repo.stationRepo;
import com.trainProj.trainProj.Repo.trainRepo;
import com.trainProj.trainProj.Repo.trainScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Stack;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class Test {

    @Autowired
    private stationRepo stationRepo;

    @Autowired
    private trainRepo trainRepo;

    @Autowired
    private trainScheduleRepo trainScheduleRepo;

    @GetMapping
    public void test(){
        Station delhi=new Station(null,"New Delhi","NDLS");
        Station mumbai=new Station(null,"Mumbai Central","BCT");
        Station kolkata=new Station(null,"Kolkata","KOAA");
        Station chennai=new Station(null,"Channai Central","MAS");

        stationRepo.saveAll(List.of(delhi,mumbai,kolkata,chennai));

        Train rajdhani=new Train(null,"Rajdhani Express","12386",null);
        Train durunto=new Train(null,"Drurunto Express","12344",null);
        Train shatabdi=new Train(null,"Shatabdi Express","12556",null);

        trainRepo.saveAll(List.of(rajdhani,durunto,shatabdi));


        trainSchedule sc1 = new trainSchedule(null, rajdhani, delhi, mumbai, "06:00", "14:00");
        trainSchedule sc2 = new trainSchedule(null, rajdhani, mumbai, chennai, "15:00", "22:00");
        trainSchedule sc3 = new trainSchedule(null, rajdhani, chennai, kolkata, "06:30", "18:00");

        trainSchedule sc4 = new trainSchedule(null, durunto, delhi, kolkata, "05:15", "16:20");
        trainSchedule sc5 = new trainSchedule(null, durunto, kolkata, mumbai, "17:10", "09:00");
        trainSchedule sc6 = new trainSchedule(null, durunto, mumbai, chennai, "10:15", "21:40");

        trainSchedule sc7 = new trainSchedule(null, shatabdi, delhi, chennai, "07:00", "23:00");
        trainSchedule sc8 = new trainSchedule(null, shatabdi, chennai, mumbai, "06:45", "14:30");
        trainSchedule sc9 = new trainSchedule(null, shatabdi, mumbai, kolkata, "15:15", "06:00");

        trainScheduleRepo.saveAll(List.of(sc1, sc2, sc3, sc4, sc5, sc6, sc7, sc8, sc9));
        System.out.println("Data inserted in db");
    }
}
