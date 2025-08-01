package com.shreya.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        Collections.addAll(numberList, 54, 65, 1239, 98, 9872, 16407, 258, 2741, 87);

        System.out.println("Lowest number in list: " + Collections.min(numberList));
        System.out.println("Highest number in list: " + Collections.max(numberList));
        Collections.sort(numberList);
        System.out.println("Sorted list: " + numberList);
        Collections.reverse(numberList);
        System.out.println("Reverse list: " + numberList);
        Collections.swap(numberList, 0, 1);
        System.out.println("Swap operation: " + numberList);
        Collections.rotate(numberList, 3);
        System.out.println("Rotate operation: " + numberList);

        System.out.println("Current List: " + numberList);

        Collections.replaceAll(numberList, 87, 19);
        System.out.println("replaceAll operation: " + numberList);

        Collections.shuffle(numberList);
        System.out.println("Current List after shuffle: " + numberList);

        System.out.println("---------------------------------------------");
        for (int index = 0; index < numberList.size(); index++) {
            System.out.println("Next Element in the list: " + numberList.get(index));
            if (index == 3) {
                numberList.add(99999);
            }
        }
        System.out.println("Current list: " + numberList);

        System.out.println("-----------------------------");
        try {
            Iterator<Integer> numbersIterator = numberList.iterator();
            while (numbersIterator.hasNext()) {
                int currentNo = numbersIterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                numberList.add(currentNo + 1);
            }
        } catch (Exception exception) {
            CopyOnWriteArrayList copyOnWriteNumberList = new CopyOnWriteArrayList();
            copyOnWriteNumberList.addAll(numberList);
            Iterator<Integer> copyOnWriteNumberListIterator = copyOnWriteNumberList.iterator();
            while (copyOnWriteNumberListIterator.hasNext()) {
                int currentNo = copyOnWriteNumberListIterator.next();
                System.out.println("next element in newCitiesList: " + currentNo);
                copyOnWriteNumberList.add(currentNo + 1);
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("nCopies output: " + Collections.nCopies(2, numberList));
    }
}
