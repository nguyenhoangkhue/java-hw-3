package Hw3;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("nhập bán kính của hình cầu");
        double r= sc.nextDouble();
        double volume= (4*3.14*r*r*r)/3;
        System.out.println("bán kính của hình cầu là: "+volume);
    }
}
