import jdk.nashorn.internal.ir.IfNode;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap so có gia tri tu 1 den n");
        int n = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            if(n > 10 && n < 100) {
            break;
            }
            else {
                System.out.println("Khong hop le, thu lai");
            }
        }
        int tong = 0;
        for (int i = 1; i < n ; i++) {
            if (i % 2 != 0) {
                tong += i;
            }
        }
        System.out.println("Tong cac so le tu 1 den " + n + " la " + tong );
    }
}