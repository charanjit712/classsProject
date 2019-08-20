package com.movies.movies.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public class TheatreRoom {
    private Long id;
    private Integer capacity;
    private Integer rows;
//seating
   @Entity
   @Table(name = "theater_room")
    public TheatreRoom(){};

    public TheatreRoom(Long id, int capacity, int rows) {
        this.id = id;
        this.capacity = capacity;
        this.rows = rows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
