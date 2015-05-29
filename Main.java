package com.company;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> arr = new ArrayList<ArrayList>();
        Vector<Vector<String>> list = new Vector<Vector<String>>();
        Vector<String> v = new Vector<String>();
        v.add("quick");
        v.add("lazy");
        list.add(v);
        Vector<String> v2 = new Vector<String>();
        v2.add("brown");
        v2.add("black");
        v2.add("grey");
        list.add(v2);
        Vector<String> v3 = new Vector<String>();
        v3.add("fox");
        v3.add("dog");
        list.add(v3);
        for (Vector<String> item : list) {
            System.out.print(item);
        }
        System.out.print("\n");

        printCombinations(list,0,"");


    }

    public static void printCombinations(Vector<Vector<String>> list, int s, String str){

            if (s == list.size()) {
                System.out.println(str);
                return;
            }
            for (int i = 0; i < list.get(s).size(); i++) {
                printCombinations(list,s + 1, str + list.get(s).get(i) + " ");
            }

        }

    }