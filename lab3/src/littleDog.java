public class littleDog extends Dog{
    private int canFindDrugs;
    public littleDog(int weight, int lenght, String woof){
        super(10,50,"тяф-тяф");
        this.canFindDrugs = 1;
    }

    public String pathfinder(int canFindDrugs){
        if(canFindDrugs == 1)
            return "canFindDrugs";
            else return "can't find drugs";
    }

    public String info() {
        return ("Weight:"+ super.getWeight()+'\n'+"Lenght:"+ super.getLenght()+'\n'+"Woof:"+super.getWoof()+'\n'+"Skill:"+pathfinder(canFindDrugs));
    }

    public static void main(String args[]){
        littleDog dog = new littleDog(10,50,"тяф-тяф");
        System.out.print(dog.info());
    }
}
