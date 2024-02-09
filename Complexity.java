public class Complexity {
//     public static void bubbleSort(int arr[]){
        
//         for(int i =0; i<arr.length-1; i++){
//             for (int j=0; j<arr.length-1-i; j++){
//                 if(arr[j] > arr[j+1]){
                     
//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] =temp;

//                 }
//             }

//             ////the time complexity of the bubble sort is o(n square);
//         }
//     }
//     public static void printarr(int arr[]){
//         for (int i =0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String[] args){
//         int arr[] ={ 5,3,4,2,7};
//         bubbleSort(arr);
//         printarr(arr);

//     }
// }




//     public static void optimizedbubblesort(int arr[]){

//         for(int i =0; i<arr.length-1; i++){
//             boolean swapped =false;
//             for (int j=0; j<arr.length-1-i; j++){
//                 if(arr[j] > arr[j+1]){
                     
//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] =temp;
//                     swapped =true;

//                 }
                
//             }
//             if(swapped == false){
//                 break;

//             }

//             ////the time complexity of the bubble sort is o(n square);
//         }
//     }
//     public static void printarr(int arr[]){
//         for (int i =0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String[] args){
//         int arr[] ={ 5,3,4,2,7};
//         optimizedbubblesort(arr);
//         printarr(arr);

//     }
// }
    

//     public static int  binarySearch(int arr[] ,int key ) {
//         int start =0; 
//         int end = arr.length-1;

//         while(start <= end ){
//             int mid = (end +start )/2;

//             if (arr[mid ] == key ){
//                 return mid ;

//             }
//             else if (arr[mid ]< key ){
//                 return mid +1;

//             }
//             else{
//                 return mid-1;
//             }
//         }
//         return -1;

//     }
//     public static void printarr(int arr[]){
        
//         while(start <= end){
//             if(arr[i] ==key )
//         }

//     }
//     public static void main(String[] args){
//         int arr[] ={ 5,3,4,2,7};
//         int key  =4;
//         binarySearch(arr, key);

//         printarr(arr);

//     }

// } 

    public static int  fib(int n){
        if( n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        System.out.println(fib(5));
    }
}