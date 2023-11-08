package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Student[] students = new Student[]{
                new Student("B2001000","A"),
                new Student("B2002000","B"),
                new Student("B2003000","C"),
                new Student("B2004000","D"),
                new Student("B2005000","E"),
        };
        Studentcheak SC = new Studentcheak();
        System.out.print("学籍番号を入力してください:");
        String num = input.next();
        SC.cheakStudent(students,num);

    }
}
