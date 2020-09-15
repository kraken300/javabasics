import java.util.Scanner;
public class Ifelse2 {
    public static void main(String[] args){
        Scanner input_age =new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input_age.nextInt();

        String result = (age > 18) ? "Your eligible to vote" : "Your not eligible to vote";
        System.out.println(result);

    }
    
}