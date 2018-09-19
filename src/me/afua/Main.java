package me.afua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      System.out.println("Enter a random number");
      Scanner userInput = new Scanner(System.in);
      int numberHolder = userInput.nextInt();
      userInput.nextLine();
        System.out.println("You typed "+numberHolder);



    }
}
