import java.util.*;
public class Areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enetr the radious of the Circle : ");
        double radious = input.nextDouble();
        input.close();
        double area = Math.PI * radious * radious;
        System.out.print("Area of the Circle = "+area);
    }
}
