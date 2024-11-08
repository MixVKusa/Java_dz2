public abstract class Bird {
    protected String text;
    protected int symbolCount = -1;

    public void sing(){
        if (symbolCount < 0){
            System.out.println(text);
        }
        else {
            System.out.println(text.substring(0, symbolCount));
        }
    };
}
