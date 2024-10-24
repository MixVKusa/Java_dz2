public class ClosedBroken extends Broken{
    public double len(){
        if (line.isEmpty()){
            return 0;
        }
        double control = Math.sqrt((Math.pow(line.getFirst().x - line.getLast().x, 2) + Math.pow(line.getFirst().y - line.getLast().y, 2)));
        return super.len() + control;
    }
}
