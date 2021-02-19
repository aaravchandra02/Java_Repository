package com.aarav_chandra.demo01.model;

import java.util.*;

public class Person {
    private final UUID id;
    private final String name;

    // Constructor
    public Person(UUID id_ini, String name_ini) {
        this.id = id_ini;
        this.name = name_ini;
    }
    // getter method
    public UUID getUuid() {
        return this.id;
    }
    // getter method
    public String name() {
        return this.name;
        
    }
    }

}
