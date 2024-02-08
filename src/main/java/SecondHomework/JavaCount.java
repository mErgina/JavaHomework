package SecondHomework;

import java.util.Scanner;

public class JavaCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some letters: " );
        String countWords = scanner.nextLine();
        int numCount = countWords.split("\\s").length;
        System.out.println("The number of letters is " + numCount);
    }
}
