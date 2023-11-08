package lecture02;
import java.util.Scanner;
public class prac2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("名前を入力してください:");
        String name1 = input.next();
        System.out.print("学籍番号を入力してください:");
        int num1 = input.nextInt();

        System.out.printf("氏名:%s,学籍番号:b%d\n",name1,num1);
    }
}
