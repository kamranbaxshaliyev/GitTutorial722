package main;

import util.Calculator;

public class Methods {
    public static void main(String[] args) {
        Calculator.calculate();
    }
    public static void foo(String s) {
        System.out.println(s);
    }
    public static String foo2(String s) {
        System.out.println("foo2=" + s);
        return "Zordu";
    }

    public static boolean foo3(String s) {
        System.out.println("foo3=" + s);
        return true;
    }
}
