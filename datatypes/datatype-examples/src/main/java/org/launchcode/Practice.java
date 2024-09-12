package org.launchcode;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hello, " + userName);

        String hello = "Hello, world!";
        int num = 3;

        System.out.println(num + hello);
        System.out.println(getFullName("River", "Kahrhoff"));
    }
    public static String getFullName(String firstName, String lastName) {
        return firstName + lastName;
    }
}
