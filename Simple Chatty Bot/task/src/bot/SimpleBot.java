package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        greet("Jarvis", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) throws InterruptedException {
        System.out.println("Greetings! My name is " + assistantName + ".");
        Thread.sleep(1000);
        System.out.println("I was created in " + birthYear + ".");
        Thread.sleep(1000);
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Let me guess your age.");
        Thread.sleep(1000);
        System.out.println("Tell me the remainders of dividing your age by 3, 5, and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        Thread.sleep(1000);
    }

    static void count() throws InterruptedException {
        System.out.println("Let me show you that I can count to any number. Just enter a number!");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
            Thread.sleep(500);
        }
    }

    static void test() throws InterruptedException {
        System.out.println("Now, let's test your programming knowledge.");
        Thread.sleep(1000);
        System.out.println("Which keyword is used to indicate that a class is inherited from another class?");
        Thread.sleep(1000);
        System.out.println("1. implements");
        System.out.println("2. throws");
        System.out.println("3. extends");
        System.out.println("4. inherits");
        if (scanner.nextInt() != 3) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Correct! Have a nice day!");
    }
}
