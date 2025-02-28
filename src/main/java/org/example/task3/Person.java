package org.example.task3;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter

public class Person {
    private String name;
    private Sea sea;
    private Beach beach;
    private Table table;
    public Person(String name, Sea sea, Beach beach, Table table) {
        this.name = name;
        this.sea = sea;
        this.beach = beach;
        this.table = table;
    }

}
