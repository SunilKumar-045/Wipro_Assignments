package coursereg;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String totalCourse;

    public List<String> allCourses() {
        List<String> courseList = new ArrayList<>();
        courseList.add("Java-FullStack");
        courseList.add("Python-FullStack");
        courseList.add("Mern-FullStack");
        courseList.add("Data-Science");
        courseList.add("AIML");
        return courseList;
    }
}
