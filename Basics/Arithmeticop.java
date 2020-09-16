import java.util.Scanner;
class Arithmeticop{
    public static void main(String[] args){
        Scanner suma = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int a = suma.nextInt();
        

        Scanner sumb = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int b = sumb.nextInt();
        

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a++; //can't increment in java
        int h = b--; //can't decrement in java


        System.out.println("The sum is "+c);
        System.out.println("The subtraction is "+d);
        System.out.println("The multiplication is "+e);
        System.out.println("The division is "+f);
        System.out.println("The increment of a  is "+g);
        System.out.println("The decrement of b is "+h);
    }
    
}