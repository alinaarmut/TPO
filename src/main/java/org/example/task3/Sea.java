package org.example.task3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Sea {
    private String color;
    public Sea(String color) {
        if(color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Цвет должен быть указан");
        }
        this.color= color;
    }

}
