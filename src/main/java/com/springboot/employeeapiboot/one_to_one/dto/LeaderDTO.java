package com.springboot.employeeapiboot.one_to_one.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.employeeapiboot.one_to_one.entities.Klass;
import com.springboot.employeeapiboot.one_to_one.entities.Leader;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class LeaderDTO {
    private final Long id;
    private final String name;
    private final Long klassId;
    public LeaderDTO(Leader leader){
        this.id=leader.getId();
        this.name=leader.getName();
        this.klassId=leader.getKlass().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Long getKlassId() {
        return klassId;
    }
}
