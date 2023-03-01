import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value for 'a' :___\b");
        int a = sc.nextInt();
        System.out.print("Please enter the value for 'b' :___\b");
        int b = sc.nextInt();
        int Product;
        Product = a * b;
        System.out.println("The Product of 'a' & 'b' is " + Product);
    }
}
