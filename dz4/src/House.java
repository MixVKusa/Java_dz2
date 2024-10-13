public class House {
    public final int stages;

    public House(int stages) {
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
