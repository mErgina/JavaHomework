package SecondHomework;

import java.util.Scanner;

public class JavaCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = scanner.nextLine();
        System.out.println("Enter second string");
        String secondString = scanner.nextLine();


        if (firstString.equals(secondString)){
            System.out.println("Strings are equal!");
        }else {
            System.out.println("Strings are not equal!");
        }
    }
}
