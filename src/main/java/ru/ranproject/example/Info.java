package ru.ranproject.example;
import java.util.Date;
import java.util.Arrays;

public class Info {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        String name = "11";

        if (name == "00") {
            System.out.println("zero");
        } else if (name == "11") {
            System.out.println("one");
        } else {
            System.out.println("other");
        }

        System.out.println((name == "00") ? "zero" : "other");

        switch (name) {
            case "00":
                System.out.println("zero");
                break;
            case "11":
                System.out.println("one");
                break;
            default:
                System.out.println("other");
        }

        int[] a;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }

        for (int i : a) {
            System.out.println(i);
        }

        System.out.println(a.length);
        System.out.println(Arrays.asList(a).contains(0));
    }

}
