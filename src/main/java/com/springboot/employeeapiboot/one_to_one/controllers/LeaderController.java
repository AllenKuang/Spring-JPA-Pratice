package com.springboot.employeeapiboot.one_to_one.controllers;

import com.springboot.employeeapiboot.one_to_one.entities.Leader;
import com.springboot.employeeapiboot.one_to_one.respositories.LeaderRespository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/leaders")
public class LeaderController {
    private LeaderRespository leaderRespository;

    public LeaderController(LeaderRespository leaderRespository){
        this.leaderRespository=leaderRespository;
    }

    @GetMapping(path="")
    public List<Leader> getAllLeaders(){
        return leaderRespository.findAll();
    }
    @PostMapping(path="")
    public Leader addOneLeader(@RequestBody Leader leader){
        if( leader.getKlass()!=null) {
            leader.getKlass().setLeader(leader);
        }
        return leaderRespository.save(leader);
    }
}
