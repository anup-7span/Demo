package ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Courses {
    public static void main(String[] args) {

       CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

        courses.add("JAVA");
        courses.add("Python");
        courses.add("C++");
        courses.add("C#");


        Iterator<String> iterator=courses.iterator();

        while (iterator.hasNext()){
           String Course= iterator.next();
            if(Course.equals("C++")) {
                courses.remove(Course);

                System.out.println(courses);
            }
        }

    }
}
