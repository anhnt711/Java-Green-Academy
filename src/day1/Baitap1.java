package day1;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày:");
        int day = scanner.nextInt();
        System.out.println("Nhập tháng:");
        int month = scanner.nextInt();
        System.out.println("Nhập năm:");
        int year = scanner.nextInt();
        System.out.println("Day : " + day + "/"+month+"/"+year);

        scanner.close();
    }
}
