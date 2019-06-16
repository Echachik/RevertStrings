package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//•	Find the second by length string in a list or array(Найти вторую по длинне строку в списке)

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("Hellowwwww");
        list.add("Heloooooooooooow");
        list.add("hel");
        list.add("aaa");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.length() - string2.length();
            }
        });

        int min = list.get(0).length();
        int i = 1;

        while (i < list.size()) {
            if (list.get(i).length() == min)
                i++;
            else {
                System.out.println("The second by length string is = " + list.get(i++));
                break;
            }
        }
    }
}
