package com.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainF1_3 {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Amy");
        names.add("Angel");
        names.add("Tamara");
        names.add("Cam");
        names.add("Ber");
        names.add("Pau");
        names.add("Ana");
        names.add("Carlos");
        names.add("Carol");
        names.add("Piero");
        names.add("Aaron");
        names.add("ana");
        names.add("Pepe");
        names.add("Coco");


        System.out.println(containsO(names));
    }

    public static List<String> containsO(List<String> strings){
        return strings.stream()
                .filter(s -> s.contains("o") || s.contains("O"))
                .collect(Collectors.toList());
    }
}
