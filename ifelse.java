import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){

        Scanner a_val = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = a_val.nextInt();

        Scanner b_val = new Scanner(System.in);
        System.out.print("Enter second value : ");
        int b = b_val.nextInt();

        myifmethod(a,b);
    }
    public static void myifmethod(int n1,int n2){
        if(n1 > n2){
            System.out.println(n1+" is bigger than "+n2);
        }
        else if(n1 == n2){
            System.out.println(n2+" is equal to "+n1);
        }
        else{
            System.out.println(n2+" is bigger than "+n1);
        }
    }
    
}