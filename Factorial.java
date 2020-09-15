import java.util.Scanner;
public class Factorial {
    static int myFact(int n){
        int emVar = 1;
        while(n > 0){    
            emVar = emVar*n;
            n--;
        }
        return emVar;

    }
    public static void main(String [] args){
        Scanner myVal = new Scanner(System.in);
        System.out.print("Enter the value of factorial : ");
        int val = myVal.nextInt();
        System.out.println("The factorial is " + myFact(val));
    }
    
}