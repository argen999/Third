package shablon2;

public class Circle {
    private static double PI;

    public void setPi(double pi) {
        Circle.PI = pi;
    }

    public void area(int radius1, int radius2) {
        double number = PI * (radius1 * radius2);
        System.out.printf("%.2f * (%d * %d) = %.2f",PI,radius1,radius2,number);
    }
    public void circumference(int R) {
        double number = PI * 2 * R;
        System.out.printf("%.2f * %d * %d = %.2f",PI,2,R,number);
    }

}
