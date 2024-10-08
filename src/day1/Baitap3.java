package day1;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị x:");
        int x = scanner.nextInt();

        System.out.println("Giá trị của biểu thức là: "+ (3*Math.pow(x,3)-5*Math.pow(x,2)+6));

        scanner.close();
    }
}
