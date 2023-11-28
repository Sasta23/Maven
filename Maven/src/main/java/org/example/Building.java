package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{

    ArrayList <Sensor> sensors = new ArrayList<Sensor>();
    ArrayList <Actuator> actuators = new ArrayList<Actuator>();
    public Building(String name, UUID id) {
        super(name, id);
    }
    public ArrayList<Sensor> getSensors(){

        return sensors;
     }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }

}
