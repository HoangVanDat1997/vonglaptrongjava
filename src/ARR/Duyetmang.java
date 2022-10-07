package ARR;

import java.util.Scanner;

public class Duyetmang {
    public static void main(String[] args) {
        String[] students = {"Linh" , "Hung" , "Son" , "Vu"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Name Student: ");
        String input_name = scanner.nextLine();
        boolean eXit = false;
        for (int i = 0 ; i < students.length ; i ++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list" +  input_name + "is" + i);
                eXit = true;
                break;

            }
        }   if(!eXit){
            System.out.println("Not Found" + input_name + "in the list");
        }
    }

}
