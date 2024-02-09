import java.util.*;
//print numbers in decreasing  or in increasing order
public class Recursion {
    // public static void PrintDec(int n){
    //     if( n == 1){
    //         System.out.print(n);
    //         return ;
    //     }
    //     System.out.print(n +" ");
    //     PrintDec(n-1);
    // }
    // public static void Printinc(int n){
    //     if( n == 1){
    //         System.out.print(1+" ");
    //         return ;
    //     }
    //     Printinc(n-1);
    //     System.out.print(n+" ");
        
    // }
    //     Printinc(10);

    // }
    


//find the factorial of number using recursive function property 
//     public static int  fact(int n){
//         if( n == 0){
//            return 1 ;
//         }
//         int fnm1 =fact(n-1);
//         int fn = n* fact(n-1);
//         return fn;
//     }
//     public static int  calSum(int n){
//         if( n == 1){
//             return 1 ;
//         }
//         int fnm1 =calSum(n-1);
//         int fn = n + calSum(n-1);
//         return fn;
//     }
    
//     public static void main(String agrs []){
        
//         //System.out.print(fact(5));
//         System.out.print(calSum(5));
//     }  
// }

//print nth fibonacci number 
//     public static int fibonacci(int n){
//         if(n == 0 || n == 1){
//             return n;

//         }
//         int fibonacci1 = fibonacci(n-1) +fibonacci(n-2);
//         return fibonacci1;
//     }
//     public static void main(String args []){
//         //System.out.print(fibonacci(5));
//         System.out.print(fibonacci(5));
//     }
// }

// check given array is sorted or not 

//     public static  boolean isSorted (int arr[] , int i){
//         if( i == arr.length-1){
//             return true ;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
//     public static void main(String args[]){
//         int arr[] ={ 1, 2, 3, 5, 4};
//         System.out.println(isSorted(arr, 0));
//     }
// }

// find the first occurence of an element in an array 

//     public  static int firstOccurence(int arr[] ,int key, int i) {
//         if(arr[i] == key ){
//             return i;
//         }
//         return firstOccurence(arr, key, i+1);
        
//     }
//     public static void main (String []args){
//         int arr[] = { 8,3,4,2,6,1,5,9,7,5};
//         System.out.println(firstOccurence(arr, 5, 0));
//     }
// }  
// example ..................

    // public static int optimizedPower (int a, int n ) {
    //     if(n== 0){
    //         return 1;

    //     }
    //     int halfpower =optimizedPower(a, n/2);
    //     int halfpowersq =halfpower*halfpower;

    //     if(n%2 !=0){
    //         halfpowersq =a*halfpowersq;

    //     }
    //     return halfpowersq;
    // }

//     
// example 
/* given "2*N" board and tiles "2*1",count the number if ways 
to tile the given board suing the 2*1 tiles .(it can either vertical or horizontl)*/
//     public static int tilingproblem (int n){
//         if(n==0 || n==1){
//             return 1;

//         }
//         //vertical choice
//         int fnm1 =tilingproblem(n-1);

//         //horizonntal choice 
//         int fmn2 =tilingproblem(n-2);
//         int totalways = fnm1 +fmn2;
//         return totalways;

//     }
//     public static void main (String agrs[]){
//         System.out.print(tilingproblem (3));

//     }
// }


// remove duplicates from the string 
//     public static void removeduplicatesk(String str , int idx , StringBuilder newstr, boolean map[]){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(map[currChar-'a']== true){
//             removeduplicatesk(str, idx+1, newstr, map);
//         }
//         else{
//             map[currChar -'a'] =true ;
//             removeduplicatesk(str, idx+1, newstr.append(currChar),  map);
//         }
//     }
//     public static void main(String args[]){
//         String str = "appnnacollege";
//         removeduplicatesk(str ,0 ,new StringBuilder(""), new boolean[26]);
//     }
// }


//for an given integer array of size n .you have to find all the occcurences (indices) of a given element (key)
//and print them ..use a recursive function to solve this problem 

//     public static void  occurence(int nums[] ,int key ,int i){
        
//         if( i == nums.length){
//             return;

//         }
//         if(nums [i] == key){
//             System.out.print(i +" ");

        
//         }
//         occurence(nums, key , i+1);
//     }
        
//     public static void main(String args[]){
//         int nums []  ={3,2,4,5,6,2,7,2,2};
//         int key = 2;
//         occurence(nums, key ,0 );

//         System.out.println();
        
//     }
// }


//you are a given (eg .2019)covert  it into a string of english like "two zero one nine 
//use a recursive fuction ti solve this problem"
//     static String digits [] = {"zero","one", "two", "three","four","five","six","seven","eight","nine" };

//     public static void printdigits(int number ){
//         if(number == 0){
//             return ;
//         }
        
//         int lastdigit = number %10;
//         printdigits(number /10);
//         System.out.println(digits[lastdigit]+" ");


//     }
//     public static void main (String args []){
//         printdigits(1234);
//         System.out.println();
//     }
// }

// find the length of a string using recursion ;

    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1))+1;
    }
    public static void main(String args[]){
        String str ="abcde";
        System.out.println(length(str));
    }
}


