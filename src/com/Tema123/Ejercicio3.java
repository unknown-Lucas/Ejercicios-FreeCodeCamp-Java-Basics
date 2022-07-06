package com.Tema123;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args){
        String[] names = {"Pepe", "Juan", "Anthony"};
        concat(names);
    }

    public static void concat(String[] namesArr){

        List<String> namesList = Arrays.asList(namesArr);       //Array to list
        StringBuffer namesConcat = new StringBuffer();      //To modify strings use StringBuffer;
        namesList.forEach((String name)->{      //We can use foreach instead fop variable is a list.
            namesConcat.append(name).append(" ");
        });
        namesConcat.deleteCharAt(namesConcat.length()-1);
        System.out.println(namesConcat);
    }

}
