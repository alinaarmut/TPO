package org.example.task3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Table {
    private String material;
    private String description;
    private boolean isOpen;

    public Table(String material, String description) {
        if(material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Материал должен быть указан");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Описание не может быть пустым");
        }
        this.material = material;
        this.description = description;
        this.isOpen = false;
    }

    public void openTable() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Столик открыт, наслаждайтесь видом.");
        } else {
            System.out.println("Столик уже открыт.");
        }
    }

    public void closeTable() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Столик закрыт.");
        } else {
            System.out.println("Столик уже закрыт.");
        }
    }
}

