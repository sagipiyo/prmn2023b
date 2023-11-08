package lecture02;
import java.util.Scanner;
public class Studentcheak {
    void cheakStudent(Student[] students,String num){

        Scanner input = new Scanner(System.in);
        for(Student student:students){
            if(num.equals(student.number)){
                System.out.print("パスワードを入力してください:");
                String pass = input.next();
                if(pass.equals(student.password)){
                    System.out.print("ログイン完了!");
                    System.exit(0);
                }else{
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }

            }
        }
        System.out.println("error!!");
        System.exit(0);
    }
}
