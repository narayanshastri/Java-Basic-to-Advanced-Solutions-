import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Value for 'a' : _____\b\b\b");
        int a = sc.nextInt();
        System.out.print("Please Enter the Value for 'a' : _____\b\b\b");
        int b = sc.nextInt();
        int Sum;
        Sum = a + b;
        System.out.println(Sum);
    }
}
