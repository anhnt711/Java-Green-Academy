package day1;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị x:");
        int x = scanner.nextInt();

        System.out.println("Căn bậc 2 của x là: "+ (Math.sqrt(x)));

        scanner.close();
    }
}
