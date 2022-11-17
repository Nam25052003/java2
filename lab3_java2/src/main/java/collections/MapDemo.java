package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {
    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<>();
        Student sv1 = new Student();
        sv1.name = "tuan";
        sv1.major = "cntt";
        sv1.marks = 7.0;
    
        map.put(sv1.name,sv1);
        
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println("ho va ten: "+sv.name);
            System.out.println("hoc luc: "+sv.getGrade());
        }
    }
}
