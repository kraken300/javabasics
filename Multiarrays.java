public class Multiarrays {
    public static void main(String[] args){
        int[][][] my_array = {{{1,2,3,4,5},{6,7,8,9,10}},
                                {{11,12,13,14,15},{16,17,18,19,20}}};
        //System.out.println(my_array.length);

        for(int i = 0;i < my_array.length ;i++){//my_array.length 2

            for(int j = 0; j < my_array[j].length ;j++){//my_array[i].length 2
                
                for(int k = 0;k < my_array[k].length ;k++){//my_array[j].length 5

                    System.out.println(my_array[i][j][k]);
                }

                
                
            }
        }
    }
    
}