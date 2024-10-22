import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n=0;
        int count=0;
        while(n!=50){
            n=new Random().nextInt(100);
            count++;

        }
        System.out.println("To get 50 it took: "+count);



    }
}