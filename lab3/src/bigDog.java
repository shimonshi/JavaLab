public class bigDog extends  Dog{
    private int fighter;
    public bigDog(int weight, int lenght, String woof){
        super(50,100,"ГАФГАФ");
        this.fighter = 1;
    }
    public String brawler(int fighter){
        if(fighter == 1)
            return "can fight";
        else return "can't fight";
    }
    public String info() {
        return ("Weight:"+ super.getWeight()+'\n'+"Lenght:"+ super.getLenght()+'\n'+"Woof:"+super.getWoof()+'\n'+"Skill:"+brawler(fighter));
    }
    public static void main(String args[]){
        bigDog bigDog = new bigDog(10,50,"ГАФГАФ");
        System.out.println(bigDog.info());
    }
}
