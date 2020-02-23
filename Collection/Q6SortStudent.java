package Collection;

/*
* Write a program to sort the Student objects based on Score , if the score are
* same then sort on First Name . Class Student{ String Name; Double Score; Double Age*/

import java.util.*;
import java.util.concurrent.ConcurrentMap;

class Student{
    String studentFirstName;
    String StudentLastName;
    Double studentAge;
    Double studentScore;


    public Student(String studentFirstName, String studentLastName, Double studentAge, Double studentScore) {
        this.studentFirstName = studentFirstName;
        this.StudentLastName = studentLastName;
        this.studentAge = studentAge;
        this.studentScore = studentScore;
    }
}

class ScoreAndFirstNameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        if(s1.studentScore > s2.studentScore)
        {
            return 1;
        }
        else if (s1.studentScore < s2.studentScore)
            return -1;
        else
            return s1.studentFirstName.compareTo(s2.studentFirstName);
    }
}
public class Q6SortStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Divya", "Arora", 23d, 85d));
        studentList.add(new Student("Himani", "Sharma", 20d, 90d ));
        studentList.add(new Student("Shivani", "Gulati", 21d, 90d));
        studentList.add(new Student("Reemanaa", "Rana", 20d, 45d ));

        Collections.sort(studentList, new ScoreAndFirstNameComparator());

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext())
        {
            Student s = (Student)iterator.next();
            System.out.println("Name-"+s.studentFirstName+" "+s.StudentLastName+" ; Age-"+s.studentAge+" ; Score-"+s.studentScore);
        }

    }
}