package util;

import java.util.Scanner;

public class ScannerUtil {
    private static final String YELLOW = "\u001B[33m";
    public static int getAction() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(YELLOW+"Enter action: ");
            try {
                int n = scanner.nextInt();
                return n;
            } catch (RuntimeException e) {
                System.out.println("Hato kirildi. Son kiriting Mazgi.");
            }
        }

    }
}
