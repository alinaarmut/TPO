package org.example.task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beach {
    private  String name;
    private  boolean hasGoldStones;
    private  boolean isStormy;

    public Beach(String name) {
        this.name = name;
        this.hasGoldStones = false;
        this.isStormy = false;
    }
    public void changeWeather(Boolean weather) {
        if (!isStormy) {
            isStormy = true;
            System.out.println("На пляже начался шторм!");
        } else {
            System.out.println("Погода на пляже спокойная.");
        }
    }

    public void showStones(Boolean stones) {
        if (!hasGoldStones) {
            hasGoldStones = true;
            System.out.println("Пляж усыпан драгоценными камнями!");
        } else {
            System.out.println("На пляже нет драгоценных камней.");
        }
    }
}