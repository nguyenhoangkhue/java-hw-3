package Hw3;
import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        System.out.println(repeated());

    }
    public static String repeated(){
        Scanner sc=new Scanner(System.in);

        System.out.println("nhap vao chuoi ki tu bat ki:");
        String para= sc.nextLine();
        String para1=para+"-";
        String para2=para1.repeat(10);
        String para3=para2.substring(0,para2.length()-1);
        return para3;
    }

}
