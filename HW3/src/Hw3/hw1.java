package Hw3;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao 1 chuoi bat ki");
        String para=sc.nextLine();
        System.out.println("chuoi sau khi sao chep 10 lan: " +para.repeat(10));

    }
}
