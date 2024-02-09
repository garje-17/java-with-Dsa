//rotate array in a java 
import java.util.*;
import javax.naming.spi.DirStateFactory.Result;

public class Leetcode {
    public static void rotate (int nums[], int k){
        if(k > nums.length ){
            k = k% nums.length;

            int result  =new int [nums.length()];
            for(int i =0; i<k; i++){
                result[i] =nums[nums.length()-k+i];

            }
            int j=0;
            for(int  i=k; i<nums.length; i++){
                result[i]= nums[j];
                j++;
            }

        }
        System.arraycopy(nums, 0, nums.length, 0 ,result);
    }
    public static void main(String agrs[]){
        int nums [] ={ 4 , 6 , 3 , 2 , 8};
        System.out.print(rotate(num[5], 5));
    }
    
}


// bubble rotate

    