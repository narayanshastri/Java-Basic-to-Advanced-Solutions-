import java.util.Scanner;

import javax.swing.text.FlowView.FlowStrategy;

public class AreaOfTheCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the value for Radius :___\b\b\b");
        float Radius = sc.nextFloat();
        float pi = 3.14f;
        float Area, Circumference;

        Area = pi * Radius * Radius;
        Circumference = 2 * pi * Radius;

        System.out.println("The area of the circle with radius " + Radius + "is " + Area);
        System.out.println("The Circumference of the circle with radius " + Radius + "is " + Circumference);
    }
}
