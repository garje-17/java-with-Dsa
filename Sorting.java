
// Sorting algorithms ......................

public class Sorting {
    public static void bubblesort (int arr[] ){
        for( int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] >arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void  print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");

        }
        System.out.println();

    
        
    }
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos =i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[minpos]> arr[j]){

                    minpos =j;
                
                }
            }
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i] =temp;
        }
    }
    public static void  insertionSort(int arr[] ){
        for(int i=0; i<arr.length-1; i++){
            
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp =arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
    }
    //or mam
    public static void  InsertionSort(int arr[] ){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int  prev =i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev +1] =arr[prev];
                prev--;
            }
            //insertiom 
            arr[prev+1] =curr ;
        }
    }
    public static void Countingsort(int arr[] ){

        int  largest =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest =Math. max( largest , arr[i]);
        }
        int count [] =new int [largest+1];
        for(int i=0; i<arr.length ; i++){
            count [arr[i]]++;
        }
        
        int j=0; 
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
         
    }   
            
    public static void main (String args[] ){
        int arr[] ={4,6,5,3,2,1};
        //bubblesort(arr);
        //SelectionSort(arr);
        //insertionSort(arr);
        //InsertionSort(arr);
        Countingsort(arr);
        print(arr);
    }
    
}



//////// Assignment questions ...................................
/* 
use the following sorting algorithm to sort an an array in DESCENDING ORDER;
A) bubblesort
B) SelectionSort
C) insertionSort
D)Countingsort
*/
/* 
public class Sorting {
    public static void bubblesort (int arr[] ){
        for( int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] <arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void  print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");

        }
        System.out.println();

    
        
    }
    
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos =i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[minpos] < arr[j]){

                    minpos =j;
                
                }
            }
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i] =temp;
        }
    }
    public static void  insertionSort(int arr[] ){
        for(int i=0; i<arr.length-1; i++){
            
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    int temp =arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
    }
    //or mam
    public static void  InsertionSort(int arr[] ){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int  prev =i-1;

            while(prev >=0 && arr[prev] < curr){
                arr[prev +1] =arr[prev];
                prev--;
            }
            //insertiom 
            arr[prev+1] =curr ;
        }
    }
    public static void Countingsort(int arr[] ){

        int  largest =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest =Math. max( largest , arr[i]);
        }
        int count [] =new int [largest+1];
        for(int i=0; i<arr.length ; i++){
            count [arr[i]]++;
        }
        
        int j=0; 
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
         
    }   
            
    public static void main (String args[] ){
        int arr[] ={4,6,5,3,2,1};
        //bubblesort(arr);
        //SelectionSort(arr);
        //insertionSort(arr);
        //InsertionSort(arr);
        //Countingsort(arr);
        print(arr);
    }
    
} */






