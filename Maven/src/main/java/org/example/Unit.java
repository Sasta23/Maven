package org.example;

import java.util.UUID;

public class Unit {
    private  String name;
    private UUID id;
public Unit(String name, UUID id){
    this.name = name;
    this.id = id;
}
    public UUID getId(){
        return this.getId();
    }
    public String getName(){

        return this.getName();
    }
    @Override
    public String toString(){
        return this.name + " " + this.id;
    }
}

