package com.SquareSort;

import java.util.List;

public class SquareOfNumber {
    static List Square(List<Integer> list){
        // For travelling from index  0 to n
        for (int i =0 ;i< list.size();i++){
            int number=list.get(i);
            // replace integer with its square
            list.set(i,number*number);
        }
        SortingList.sortList(list);
        return list;
    }
}
