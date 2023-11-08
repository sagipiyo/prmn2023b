package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int x=0;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.print("number"+i+"=");
            num[i] = input.nextInt();
        }
        Keisan ke = new Keisan();
        x = ke.sum(num);
        ke.Hanbetu(x);
    }
}
