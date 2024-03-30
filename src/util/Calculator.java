package util;

import java.util.Scanner;

public class Calculator {
    public static double calculate() {
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double nFirst = oScanner.nextDouble();

        System.out.print("Enter the second number: ");
        double nSecond = oScanner.nextDouble();

        System.out.print("Enter the operation number (1 +, 2 -, 3 *, 4 /): ");
        int nOperation = oScanner.nextInt();

        double nResult = 0;

        switch (nOperation) {
            case 1:
                nResult = MathUtil.topla(nFirst, nSecond);
                break;
            case 2:
                nResult = MathUtil.cix(nFirst, nSecond);
                break;
            case 3:
                nResult = MathUtil.vur(nFirst, nSecond);
                break;
            case 4:
                nResult = MathUtil.bol(nFirst, nSecond);
                break;
            default:
                System.out.println("error, invalid operation number");
        }

        return nResult;
    }
}
