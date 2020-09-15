
public class Myclass{
    int a = 5;
    int b = 10;
    int c = 35;

    public static void main(String[] args){
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        obj1.c = 28;
        System.out.println(obj1.a);
        System.out.println(obj2.b);
        System.out.println(obj1.c);

    }

}
 