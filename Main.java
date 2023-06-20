import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Data Types
        byte age = 30;
        int height = 165;
        long phone = 12345678901L;
        double pi = 3.147F;

        // non-primitive
        String name = "Omkar";
        System.out.println(name.charAt(2));
        System.out.println(name.replace('a', 'A'));

        // Arrays
        int[] marks = new int[3];
        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 92;
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks);

        int[][] marks2 = {{90, 91, 92}, {90, 91, 92}};
        System.out.println(marks2[1][1]);

        // Casting - Implicit (int to double) & Explicit
        int add = 100 + (int)pi;

        // Constant
        final String color = "black";

        // Operators - Arithmatic, increment, decrement

        // Math class methods - max, min, random

        // Taking input
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input your age ");
        // int age1 = sc.nextInt();
        // System.out.println(age1);
        //String str = sc.nextLine();
        //System.out.println(str);

        Cat mimi = new Cat();
        mimi.eyes = 2;
        mimi.walk();


        // String Methods
        // System.out.println(String.valueOf(['a', 'x', 'n']));
        // int rows = 20;
        // int columns = 10;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         if (i <= j) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // int m = 4;
        // for (int i = 0, k = 0; i <n; i++, k++) {
        //     for (int j = 0; j < m - k; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (j < n - i - 1) {
        //             System.out.print(" ");
        //         } else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 20;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < 2 * (n - i - 1); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < 2 * (n - i - 1); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 10;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 20;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < (n - i - 1); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(i + 1 + " ");
        //     }
        //     System.out.println();
        // }
        ArrayList<Integer> outArr = new ArrayList<Integer>();
        outArr.add(12);
    }
}