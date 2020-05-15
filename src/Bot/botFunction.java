package Bot;

import java.util.Scanner;

public class botFunction {

    final static Scanner str = new Scanner(System.in);
    final static Scanner num = new Scanner(System.in);
    public static void main(String[] args) {
        greet_user("JARVIS","2020");
        user_name();
        user_age();
        counting();
        user_test();
        concl();
    }
    static void greet_user(String name, String birthYear ) {
        System.out.println("Hello! My name is"+name+ ".\nI was created in"+birthYear+" by Debanjan Paul");
    }
    static void user_name() {
        System.out.println("Please, remind me your name.");
        String name = str.nextLine();
        System.out.println("What a great name you have, "+name+"!");
    }
    static void user_age() {
        System.out.println("Let me guess your age.\nSay me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = num.nextInt();
        int rem5 = num.nextInt();
        int rem7 = num.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is"+age+"; that's a good time to start programming!");
    }
    static void counting() {
        System.out.println("Now I will show you that I can count to any number you want.");
        int count = num.nextInt();
        for(int i=0;i<=count;i++)
            System.out.printf("%d,!",i);
    }
    static void user_test() {
        System.out.println("Let's test your programming knowledge.\n Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of a program.\n4. To interrupt the execution of the program.\n");
        int ans = num.nextInt();
        while(ans!=2) {
            System.out.println("Please, try again.\n");
            ans = num.nextInt();
        }
    }
    static void concl() {
        System.out.println("Congratulations, have a nice day!");
    }
}
