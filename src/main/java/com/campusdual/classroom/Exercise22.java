package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("GKFFD");
        arrayList.add("TNANA");
        arrayList.add("MPMSL");
        arrayList.add("PSWME");
        arrayList.add("LZMLF");
        arrayList.add("JYEBV");
        arrayList.add("YELNT");
        arrayList.add("JSNKR");
        arrayList.add("JFESF");
        arrayList.add("TMJLL");
        return arrayList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        System.out.println(customList.toString());
    }

    public static boolean addElementToList(List<String> customList, String element) {
        customList.add(element);
        return customList.contains(element);
    }

    public static void main(String[] args) {
        List<String> arrayList = createArrayList();
        printElementsAndIndex(arrayList);

        System.out.println("Añadir el elemento");
        addElementToList(arrayList, "AAAAA");
        printElementsAndIndex(arrayList);

        System.out.println(" ");
        System.out.println("Añadir nuevamente el elemento");
        addElementToList(arrayList, "AAAAA");
        printElementsAndIndex(arrayList);
    }

}
