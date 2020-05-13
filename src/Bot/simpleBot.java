package Bot;

import java.util.Scanner;

public class simpleBot {
    public static void main(String[] args) {
        System.out.println("Hello, my name is JARVIS.");
        System.out.println("I was created in 2020 by Debanjan Paul");
        System.out.println("Please, remind me your name. ");
        Scanner st = new Scanner(System.in);
        String name = st.nextLine();
        Scanner num = new Scanner(System.in);
        System.out.println("What a great name you have, " + name + "!");

        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3,5,7.");
        int rem3 = num.nextInt();
        int rem5 = num.nextInt();
        int rem7 = num.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; That's a good time to start programming!\n");

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int count = num.nextInt();
        int i;
        for(i=0;i<=count;i++)
        {
            System.out.println(i+"!");
        }
        System.out.print("Completed, have a nice day!\n");

        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?");
        System.out.println("1. To repeat statement multiple times.\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of a program.\n4. To interrupt the execution of the program.\n");
        int ans = num.nextInt();
        while(ans != 2)
        {
            System.out.println("Please, try again.\n");
            ans = num.nextInt();
        }
        System.out.println("Congratulations, have a great day");
    }
}
