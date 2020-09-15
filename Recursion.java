//sum of number
public class Recursion {
    static int mysum(int n){
        if (n > 0){
            return n + mysum(n-1);
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args){
        System.out.println(mysum(10));
    }
    
}