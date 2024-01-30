package first.demo;

import java.util.Scanner;

public class JavaFirstHomework {
    public static void main ( String[] args){

        System.out.println("Hello! Enter your name: ");

        Scanner scanner = new Scanner(System.in);

        String UserName = scanner.nextLine();

        System.out.println(" What is your favorite hobby?");

        String UserHobby = scanner.nextLine();

        System.out.println("Hello, " + UserName + "! Your favorite hobby is " + UserHobby +".");
    }
}
