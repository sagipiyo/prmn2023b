package lecture02;

public class Keisan {

    int sum(int[] array){
        int sum=0;
        for(int n:array){
            sum = sum+n;
        }
        return sum;
    }

    void Hanbetu(int sum){
        if(sum>=100){
            System.out.println("great!");
        }else if(sum>=50){
            System.out.println("big!");
        }else{
            System.out.println("small!");
        }
    }
}
