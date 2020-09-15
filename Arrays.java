
public class Arrays {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        
        //System.out.println(arr.length);
        //Accessing all elements in array
        for(int i = 0;i <= 4;i++){
            System.out.println(arr[i]);
        }
        //For each
        
        for(int a : arr){
            System.out.println(arr[a]); 
        }
    }
    
}