package Conditional;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;

        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*while(i < 5){
            System.out.println(i);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        boolean hasUnderstood = false;
        while (!hasUnderstood){
            System.out.println("Have you understood?(Y/N)");
            hasUnderstood = sc.nextBoolean();
        }

        do {
            i++;
            System.out.println(i);
        }while (i <= 6);*/
       // System.out.println("Out of the loop!");
    }
}
