public abstract class Dog {
    private int weight;
    private int lenght;
    private String woof;

    public int getWeight(){
        return weight;
    }
    public int getLenght(){
        return lenght;
    }
    Dog(int weight, int lenght, String woof){
        this.weight = weight;
        this.lenght = lenght;
        this.woof = woof;
    }
    public String getWoof(){
        return woof;
    }

    public abstract String info();

}
