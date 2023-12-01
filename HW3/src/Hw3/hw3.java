package Hw3;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao chuoi ki tu bat ki:");
        String para= sc.nextLine();
        String para1=para+"-";
        System.out.println("nhap vao so lan lap lai");
        int times= sc.nextInt();
        String repeated=para1.repeat(times);
        System.out.println(repeated.substring(0,repeated.length()-1));

    }
}
