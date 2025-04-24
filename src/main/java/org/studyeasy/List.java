package org.studyeasy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println(list.get(2));
        }
    }
}
