package Java;

public class FizzBuzzRunner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] numbers = new int[20];
        int num = 0;
        for (int i = 0; i < 20; i++) {
            num += 1;
            numbers[i] = num;
        }
        for (int number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}