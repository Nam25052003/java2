
package poly.io;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("tuan", 5, "cntt"));
        ls.add(new Student("cuong", 7.5, "tktw"));
        ls.add(new Student("hanh", 8.5, "cntt"));
        
        XFile.writeObject("D:\\laptrinh\\java\\java2\\lab5_java2\\src\\main\\java\\poly\\io\\studen.dat", ls);
        List<Student> ls2 = (List<Student>) XFile.readObject("D:\\laptrinh\\java\\java2\\lab5_java2\\src\\main\\java\\poly\\io\\studen.dat");
        
        for (Student sv : ls2) {
            System.out.println("> ho va ten: " + sv.name);
            System.out.println("> diem: " + sv.marks);
            System.out.println("> nganh hoc: " + sv.major);
            System.out.println("> hoc luc: " + sv.getGrade());
        }
    }
}
