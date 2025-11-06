public class AngleBetweenClock {
    public static void main(String[] args) {
        double h = 3; 
        double m = 30;
         double hrAngle = 0.5 * (h * 60 + m);
        double minAngle = 6 * m;
        double angle = Math.abs(hrAngle - minAngle);
    
        angle = Math.min(360 - angle, angle);
        System.out.println(angle);
    }
}
