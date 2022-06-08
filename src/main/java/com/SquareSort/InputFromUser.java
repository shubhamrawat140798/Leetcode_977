package com.SquareSort;

import java.util.List;
import java.util.Scanner;
public class InputFromUser {
    static List GetInput(List<Integer> list){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the size of list: ");
        // for taking size of the List
        int listLength = scanner.nextInt();
        // for storing elements
        for (int i = 0; i < listLength; i++){
            System.out.print("\nEnter element "+(1+i)+": ");
            int userInput=scanner.nextInt();
            list.add(userInput);
        }
        scanner.close();
        return list;
    }
}
