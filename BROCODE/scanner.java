package BROCODE;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey lets get some info");
        System.out.println("what's your name");
        String name = scanner.nextLine();
        System.out.println("what's your age");
        int age = scanner.nextInt();
        System.out.println("Do you dislike apples");
        boolean dislike_apples = scanner.nextBoolean();
        System.out.println("Your name is" + name);
        System.out.println("you are" + age + "years old");
        if (dislike_apples == true) {
            System.out.println("You hate apples!");
        } else {
            System.out.println("You love apples");
        }
    }
}