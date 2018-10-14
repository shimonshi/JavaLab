public class Circle {
    public  int radius;
    Circle(){}

    public double setPerimetr(int radius) {
        return radius * (2 * Math.PI);
    }

    public double  setSquare(int radius){
        return Math.PI*(radius*radius);

    }
}
