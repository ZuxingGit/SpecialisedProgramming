package classContent.wk4;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;

public class NumberOfStudentsUnable2EatLunch {
    public static void main(String[] args) {
        int[] students1 = {1, 1, 0, 0}, sandwiches1 = {0, 1, 0, 1};
        int[] students2 = {1,1,1,0,0,1}, sandwiches2 = {1,0,0,0,1,1};
        System.out.println(countStudents(students1, sandwiches1));
        System.out.println(countStudents(students2, sandwiches2));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        List<Integer> studentList = Arrays.stream(students).boxed().collect(Collectors.toList());
//        Queue<Object> studentQueue = new LinkedList<>(Arrays.asList(students));
        List<Integer> foodList = Arrays.stream(sandwiches).boxed().collect(Collectors.toList());
        int count = 0;
        while (!studentList.isEmpty() && count <= studentList.size()) {
            if (studentList.get(0) == foodList.get(0)) {
                studentList.remove(0);
                foodList.remove(0);
                count=0;
            } else {
                Integer tmp = studentList.remove(0);
                studentList.add(tmp);
                count++;
            }
        }

        return studentList.size();
    }
}
