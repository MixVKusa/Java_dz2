package ru.tataev.calculating;

public class House {
    private final int stages;

    public House(int stages) {
        if (stages <= 0) {
            throw new IllegalArgumentException("Number of levels must be more than 0");
        }
        this.stages = stages;
    }

    public String toString() {
        String ending;
        if (stages % 10 == 1 && stages % 100 != 11){
            ending = "ом";
        }
        else {
            ending = "ами";
        }

        return String.format("дом с %d этаж%s", stages, ending);
    }
}
