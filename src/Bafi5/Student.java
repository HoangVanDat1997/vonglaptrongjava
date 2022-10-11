package Bafi5;

public class Student {
 int Year;
 String Name;
 public Student(int year , String name) {
     Year = year;
     Name = name;
 }

    public static void main(String[] args) {
        Student student = new Student(2000,"Dat");
        System.out.println(student.Name + " " + student.Year);
    }
}


