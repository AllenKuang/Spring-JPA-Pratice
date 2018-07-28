package com.springboot.employeeapiboot.one_to_one.dto;

import com.springboot.employeeapiboot.one_to_one.entities.Klass;
import com.springboot.employeeapiboot.one_to_one.entities.Leader;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class KlassDTO {
    private final Long id;
    private final String name;
    private final Leader leader;
    public KlassDTO(Klass klass){
        this.id=klass.getId();
        this.name=klass.getName();
        this.leader=klass.getLeader();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Leader getLeader() {
        return leader;
    }
}
