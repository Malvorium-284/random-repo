
package StillJavaThngs;

import java.util.Scanner;

public class Main {

    protected int age = 15;
    protected String name = "James Bernard Udal";

    public static void main(String[] args) {
        Scanner takeinput = new Scanner(System.in);
        Subjects math = new Math();

        System.out.println(math.getClass().getSimpleName());
        math.Schedule();
        System.out.println("Your teacher is: " + math.teacher());
        System.out.println("Your lessons are about: " + math.lessons());

        Transformer a = new Transformer();

        Main2 callMain2 = new Main2();
        callMain2.PositiveTransform(a);
        System.out.println("So we good, now pls provide your name: ");
        System.out.print("Name: " );
        String userName = takeinput.nextLine();
        System.out.println("Okay, Mr. " + userName +", that your name?");
        String input = takeinput.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Oh okay, Mr. " + userName);
        } else {
            System.out.println("What the F***");
        }

        takeinput.close();
        for (int blabla = 0; blabla < 10; blabla++) {
            System.out.print("- ");

        }

        System.out.println("Printing out multiplication table");

        for(int outer = 1; outer <= 10; ++outer) {
            System.out.print(outer);
            for (int inner = 2; inner <= 10; ++inner) {
                System.out.print(" " + outer * inner);
            }
            System.out.println();

        }

    }
}
