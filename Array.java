import javax.swing.plaf.BorderUIResource.MatteBorderUIResource;
import java.util.*;

//  
// passs by value ....// pass by reference ex..array 
/* 
public class Array{
     
    public static void update( int marks []){
        for(int i=0; i<marks.length ; i++){

            marks[i] =marks[i] +1;
        }
                 
}
    public static void main (String []args ){
        int marks[] ={ 99 ,98 ,100};
        update(marks);
        for(int i=0; i<marks.length ; i++){
            System.out.print(marks[i]+ " " );
    
        }
        
    }
}*/


// linear serach technique
/* 
public class Array{
    public static  int  LinearSearch (int numbers[], int key ){
        for (int i=0; i<numbers.length; i++) {
            if( numbers[i] ==key ){
               return i;
            }
            
            
        }
        return -1;
    }
     
    public static void main(String aegs[]){
        int numbers[]  = {1,2,3,4,5,6,7,8,9,80};
        int key =5;
        int index =LinearSearch(numbers, key);
        if(index ==-1){
            System.out.println("not found ");
        }
        else{
            System.out.println(" key at index ="  +  index);
        }

        
        
    }
} */


// Find largest number in array .....//

 
// public class Array{
//     public static  int  Largestnumber  (int numbers[] ){
//         int largest =Integer.MIN_VALUE; // lowest min value in java  i.e. -infinity

//         for (int i=0; i<numbers.length; i++) {
//             if( largest < numbers[i] ){
//                largest =numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main (String [] args ){
//         int numbers [] ={ 1 ,3 ,5, 7 ,9};
//         System.out.println(" largest number is " + Largestnumber(numbers));
//     }

 
//     // BinarySearch  in array code 
// }  
// //import java.util.*;

// public class Array{
//     public static int BinarySerach(int numbers[], int key ){
//         int start =0;
//         int end =numbers.length-1;
        
//         while(start <= end ){
//             int mid =(start + end ) /2;

//             if( numbers[mid]==key){
//                 return mid ;
//             }
//             if(numbers[mid]< key ){
//                 return mid +1;
            
//             }
//             else{
//                 return mid-1;
//             }

//         }
//         return -1;
        
//     }
//     public static void main (String args []){
        
    
    
    
//         int  number[] ={2,3,4,5,6,7,8,9,10};
//         int key =5;

//         System.out.println("the index of key is : " +BinarySerach(number, key));
//     } 
// } */

// Reverse an array ...........

/* 

public class Array {
    public static void  Reverse (int numbers[]) {
        int first= 0;
        int last =numbers.length-1;
        
        while(first <last){

            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]= temp;
            first++;
            last--;
        }
        
        
    }
    public static void main (String args []){
        int numbers [] ={6,5,4,3,2};
        Reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}*/

 //Pairs in array ..................
/* 
public class Array {
    public static void pairs (int numbers[]){

        for(int i=0; i<=numbers.length ; i++){
            int current =numbers[i];
            for(int j=i+1; j<numbers.length ; j++ ){
                System.out.print("(" +current + "," +numbers[j] +")");

            }
            System.out.println();
        }
        
           
    }
    public static void main (String args[]) {
        int numbers[] ={2,4,6,8,10,12};
        pairs(numbers);
        
    }
    
} */

// print given numbers subarrays///
/* 
public class Array {
    public static void SubArray(int numbers []){
        for(int i=0; i<numbers.length; i++){
            int start =i; //start

            for (int j=i; j<=numbers.length; j++){
                int end =j; //end 

                for(int k=start; k<end; k++ ){ //print
                    System.out.print(numbers[k]+" " );
                    
                }
                System.out.println( );
            }
            System.out.println();
            
            
            
        }

    }
    
    /*  public static void main (String args []){
        int number[] ={ 2,4,6,8};
        SubArray(number);
        
    }
}*/


/// print maximum subarray ...........
/* 
public class Array {
    public static void maxSubArraysum(int numbers []){
        int currsum =0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start =i; //start

            for (int j=i; j<=numbers.length; j++){
                int end =j; //end 
                currsum =0;
                for(int k=start; k<end; k++ ){ //print
                    currsum +=numbers[k];
                    
                }
                System.out.println(currsum);
                if(maxsum <currsum){
                    maxsum=currsum;
                }
                
            }
            
        }
        System.out.println("max sum =" +maxsum);
    }    
    public static void main (String args []){
        int number[] ={ 2,4,6,8,10};
        maxSubArraysum(number);
        
        
    }
}  
/* 
import java.util.*;
 //prefix sumsubarray
 public class Array{
    public static void  prefixarraysum(int numbers[]) {
        int currsum =0;
        int maxsum =Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];

        prefix[0]=numbers[0];
        // caluculate prefix array ............

        for(int i=1; i< prefix.length; i++){
            prefix[i] =prefix[i-1] +numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start =i; //start

            for (int j=i; j<=numbers.length; j++){
                int end =j; //end 

                currsum = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];
                if(maxsum <currsum ){
                    maxsum =currsum;
                }
            }
        }
        System.out.println("max sum =" +maxsum);

    }
    public static void main (String args []){
         int numbers [] ={1, -2, 6 , -1 , 3};
         prefixarraysum(numbers);
    }
       
}*/





// Trapped Rainwater 

 /* 
public class Array{
    public static int  TrappedRainwater(int height []){
        int n =height.length;

        int leftmax[] =new int [n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] =Math.max(height[i] , leftmax[i-1]);

        }
        int rightmax[] =new int [n];
        rightmax[n-1] =height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] =Math.max(height[i] ,rightmax[i+1]);

        }
        int Trappedwater =0;
        for (int i=0; i<n; i++){
            int waterlevel =Math.min(leftmax[i] ,rightmax[i]);
            Trappedwater +=waterlevel -height[i];
        }
        return Trappedwater;
    }
    public static void main (String args []){
       // int height [] ={4,2,0,6,3,2,5};
       int height1[] ={0,1,0,2,1,0,1,3,2,1,2,1};
      //  System.out.println(TrappedRainwater(height));
        System.out.println(TrappedRainwater(height1));
    }
    
} 


/* 
public class Array{
    public static int buyandSellStocks(int prices []){
        int buyprice =Integer.MAX_VALUE;
        int maxprofit =0;

        for (int i=0; i<prices.length ; i++){
            if(buyprice < prices[i]){
                int profit =prices [i] -buyprice;
                maxprofit =Math.max(profit , maxprofit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;

    }
    public static void  main (String args []) {
        int prices [] ={7,1,5,3,6,4};
        System.out.println(buyandSellStocks(prices));
        
    }
} */


//Assigment qustions on arrays .....

/*Q1] .given an integer array nums , returns true if any value appears at
least twice in the array  ,and array return false if every element is distinct
*/
/* 

public class Array{
    public static boolean samenums(int  nums []){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums [i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args []){
        int  nums [] ={1,2,3,1}; 
        int nums1 [] ={1,2,3,4}; 
        int nums2 [] ={1,1,1};
        System.out.println(samenums(nums));
        System.out.println(samenums(nums1));
        System.out.println(samenums(nums2));
        
        

    }
}  */

//Q2  
/* 
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivo
index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is
 [nums[k], nums[k+1],..., nums[n-1], nums[0],nums[1], ...,   nums[k-1]] (0-indexed).
For   example, [0,1,2,4,5,6,7] might be rotated  at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target,
 return the index oftarget if it is in nums, or -1   if it is not in nums.
you must write an algorithm with o(logn)runtime complexity; */

//code 

 ////////////////// N O T     C O M P L E T E D ......................./////
 
 

 /*Q3 ]  You are a given an array prices where prices[i] is the price 
  of a given stock o ith  day 
  Return the maximum profit you can acheive firm this
  transactiom .If you cannot acheive any profit  return 0;

  */
/* 
public class Array{
    public static int  maxprofitinStock(int prices[]){
        int buy  =prices[0];
        
        int maxprofit =0;

        for(int i =1; i<prices.length ; i++){
            if(buy < prices[i]){
                int profit =prices[i] - buy;
                maxprofit =Math.max (maxprofit ,profit);
            }
            else{
                buy =prices[i];
            }
        }
        return maxprofit;


    }
    public static void main(String args[] ){
        int prices[] = {7,1,5,3,6,4};
        int prices1[] ={7,6,4,3,1};
        
        System. out .println(maxprofitinStock(prices));
        System. out .println(maxprofitinStock(prices1));
        
    }
}*/


/*given  n non nonnegative representing an elevation map where the width 
 * of each bar is 1 , compute how much water it can trap after training .
 */




 //////////////////         2D ARRAYS .................//
// creation of 2D arrays;
/* 
 import java.util.*;

public class Array{
    public static boolean Search(int matrix [] [] ,int key ) {
        for( int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix [i][j] == key){
                    System.out.println("found at cell (" +i +","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;
    }
    public static void main (String args []){
        int matrix [][] =new int [3][3];
        int n=matrix.length , m=matrix[0].length;

        Scanner sc = new Scanner( System.in);
        for( int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                matrix [i][j] =sc.nextInt();
            }

        }
        for( int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                System.out.print(matrix[i][j] + "  ");
                
            }
            System.out.println();

        }
        Search(matrix, 5);
    }
}*/


//                     Spiral matrix main question ask in microsoft, google ,amazon.................//
/* 
public class Array{
    public static void Spiral(int matrix [][] ){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol =matrix[0].length-1;

        while( startCol<= endCol && startRow <= endRow ){
             //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+ " ");

            }
            //right
            for( int i =startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol ==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main (String args[]) 
    {
        int matrix [][] ={{1 , 2 , 3 , 4},
                        {5 , 6 ,7 ,8 ,},
                        {9 ,10 ,11 ,12},
                        {13, 14, 15 ,16}};
        Spiral(matrix);
        
    }
}*/


// .....................diagonal matrix sum.........//
//public class Array{
//    public static int  diagonalSum( int matrix[][]) {
//        int sum =0;
        /* 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( i==j){
                    sum += matrix[i][j];
                }
                else if(i +j == matrix.length-1){
                    sum +=matrix[i][j];


                }
            }// time complexity of this code is O(n^2);
            
        }
        // second logic.................
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];

            if( i !=matrix.length-1-i){
                sum +=matrix[i][matrix.length-i-1];
            }    
        }
        return sum;
        // time complexity of this code is o(n);// best time complexity
    }
    public static void main (String args[]){
         int matrix [][]= {{1 , 2 , 3 , 4},
                        {5 , 6 ,7 ,8 ,},
                        {9 ,10 ,11 ,12},
                        {13, 14, 15 ,16}};
        System.out.print(diagonalSum(matrix));
    }
} */


// search a key element in sorted matric code ...
/* 
public class Array {
    public static boolean  StaircaseSearch(int matrix[][] ,int key){
        int row=0 ,col =matrix[0].length-1;

        while(row <matrix[0].length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("found key at (" +row + "," +col +")");
                return true;

            }
            else if (key <matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
           
        }
        System .out.println("key not found "); 
        return false;
    }   

    public static void main (String args[]){
        int matrix [][]= {{1 , 2 , 3 , 4},
                        {5 , 6 ,7 ,8 ,},
                        {9 ,10 ,11 ,12},
                        {13, 14, 15 ,16}};
        int key =14;
        StaircaseSearch(matrix, key);
    }
} */


// Assignement 2d array ......................

/*Q1] print the number of 7's thar are in the 2d array  */

// public class Array{
//     public static void numberprint(int matrix[][], int key){
//         int count =0;
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j] ==key ){
//                     count++;
                    
//                 }
                
//             }
//         }
//         System.out.println(" count of 7 is " + count );
         
//     }
//     public static void main (String args []){
//         int matrix [][] ={{4,7,8},{8,8,7}};
//         int key =7;
//         numberprint(matrix, key);
//     }
// }


/*Q2] print out the sum of the numbers in the second row of the "nums "array 
 * 
 */
/* 
public class Array{
    public static void printSums(int matrix [][]){
        int sum =0;
        for(int i=0; i<matrix[0].length; i++){
           sum +=  matrix[1][i];
        }
        System.out.println("the sum of seocnd row is "+sum);


    }
    

    public static void main (String args []){
        int matrix [][] ={{1,4,9},{11,4,3},{2,2,3}};
        printSums(matrix);
        
    }
}*/

// find the transpose of the matrix..

// public class Array{
//     public static void transpose(int matrix [][]){
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 matrix[j][i] =matrix[i][j];
//                 System.out.print(matrix[i][j]);
                
                
//             }
//             System.out.println();
//         }

//     }
//     public static void main (String args []){
//         int matrix [][] ={{1,4,9},
//                         {11,4,3},
//                         {2,2,3}};
//         transpose(matrix);
//     }
// }
    