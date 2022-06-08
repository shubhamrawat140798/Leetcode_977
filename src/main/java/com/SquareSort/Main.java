
package com.SquareSort;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();
        InputFromUser.GetInput(listOfNumber);
        System.out.println("\nInput List\n"+"-".repeat(25));
        System.out.print(listOfNumber);


        SquareOfNumber.Square(listOfNumber);
        System.out.println("\n\nAfter Square and Sorting\n"+"-".repeat(25));
        System.out.print(listOfNumber);

    }
}
