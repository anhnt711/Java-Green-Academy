package day1;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số: ");
        int x = scanner.nextInt();

        System.out.println("Bình phương của số đó là: "+x*x);

        scanner.close();
    }
}
