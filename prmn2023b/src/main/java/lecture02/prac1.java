package lecture02;
import java.util.Scanner;
public class prac1{
    public static void main(String[] args) {

        String number = "B2001000";

        Scanner input = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。：");
        String gakuseki = input.next();

        Gakuseki ga = new Gakuseki();
        ga.HanbetuGakuseki(number,gakuseki);
    }
}
