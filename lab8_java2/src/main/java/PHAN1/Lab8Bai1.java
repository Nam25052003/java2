package PHAN1;

import java.util.ArrayList;

public class Lab8Bai1 {
    public static void main(String[] args) {
        ArrayList<Object> ls = new ArrayList<>();
        ls.add(8);
        ls.add(8.8);
        ls.add(true);
        ls.add("hello");
        
        for (Object listObject : ls) {
            System.out.println(listObject);
        }
    }
}
