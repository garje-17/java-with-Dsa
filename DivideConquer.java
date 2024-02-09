import java.util.concurrent.PriorityBlockingQueue;

// public class DivideConquer {
//     public static void printarr(int arr[] ){
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();
//     }
//     public static void mergesort(int arr[], int si, int ei){
//         if( si >=ei){
//             return;    //base case

//         }
//         int mid = si +(ei-si)/2;//formula or (si+ei)/2
//         mergesort(arr, si, mid);//left part
//         mergesort(arr, mid+1, ei);// right part
//         merge (arr ,si ,mid , ei);// merging
//     }
//     public static void merge(int arr[] ,int si ,int mid ,int ei){
//         int temp[] =new int [ei -si +1];
//         int i =si; //iteration of left part 
//         int j = mid+1; // iteratiom of right part 
//         int k =0; //temp arr[]

//         while( i<=mid && j<=ei){
//             if(arr[i] < arr[j]){
//                 temp[k] =arr[i];
//                 i++; 
//             }
//             else{
//                 temp[k] =arr[j];
//                 j++; 
//             }
//             k++;
//         }
//         while(i<= mid){
//             temp[k++] =arr[i++];

//         }
//         while(j <=ei){
//             temp[k++] =arr[j++];

//         }
//         for( k=0, i =si; k<temp.length ; k++ ,i++){
//             arr[i] =temp[k];
//         }

//     }
//     public static void main (String args[]){
//         int arr[] ={6,3,9,5,2,8};
//         mergesort(arr, 0, arr.length-1);
        
//         printarr(arr);
//     }

// }


//quick sort problem

//     public static void printarr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void quickSort(int arr[] ,int si ,int ei ){
//         if(si>=ei){
//             return ;

//         }
//         int pIdx =partition(arr ,si ,ei);
//         quickSort(arr, 0, pIdx-1);
//         quickSort(arr, pIdx+1, ei);

//     }
//     public static int  partition(int arr[] , int si ,int ei ){
//         int pivot =arr[ei];
//         int i = si-1;
//         for (int j =si ; j<ei; j++){
//             if (arr[j] <=pivot ){
//                 i++;
//                 int temp = arr[j];
//                 arr[j] =arr[i];
//                 arr[i] =temp;


//             }
//         }
//         i++;
//         int temp =pivot ;
//         arr[ei] =arr[i];
//         arr[i] =temp;
//         return i;

        
//     }
//     public static void main (String args []) {
//         int arr[] = {6,3,9,8,2,5};
//         quickSort(arr, 0, arr.length-1);
//         printarr(arr);
            
//     }
        
// }


// Search in rotatd sorted array 

 
    // public  static int Search(int arr[] , int tar ,int si ,int ei ){
    //     if(si> ei){
    //         return -1;
    //     }
    //     int mid  = si +(ei-si)/2;
    //     // casr found
    //     if(arr[mid] == tar){
    //         return mid ;
    //     }
    //     //  mid lie on L1
    //     if(arr[si] <= arr[mid]){
    //         //casde a; left;
    //         if(arr[si]<= tar && tar<=arr[mid] ){
    //             return Search(arr, tar, si, mid);

    //         }else{
    //             // case b ;
    //            return  Search(arr, tar, mid+1, ei);

    //         }
    //     }
    //     else{
    //         // case c right ;
    //         if(arr[mid]<= tar && tar <= arr[ei] ){
    //             return Search(arr, tar, mid+1, ei);
    //         }else{
    //             return Search(arr, tar, si, mid-1);
    //         }
    //     }
        


//     }
//     public static void main(String args []){
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         int tarIdx = Search(arr, 0, target, arr.length-1);
//         System.out.println(tarIdx);
//     }
// }


//asssignment questions 

    public static String[] mergeSort (String arr[] , int lo , int hi ){
        if(lo ==hi ){
            String []a ={arr[lo]};
            return a;

        }
        int mid = lo (hi -so )/2;
        String [] arr1 = mergeSort(arr, lo, mid );
        String []arr2 = mergeSort(arr1, mid+1, hi);
        Strin arr3 = merge (arr1 ,arr2);
        
        
        return arr3;

    }
    static String [] merge (String [] arr1 ,String []arr2){
        int m = arr1.length;
        int n = arr2.length ;
        String []arr3 =new String [m+n];

    
        int idx =0; 
        int i =0; 
        int j= 0;
        while(i<m && j<n){
            if (isalphabeticallySmalller (arr[i] ,arr[j])){
                arr3[idx]= arr1[i];
                i++;
                idx++;
            } else{
                arr3[idx] =arr2[j];
                j++;    
                idx++;

            }
            while(i<m){
                arr3[idx] = arr[idx];
                i++;
                idx++;

            }
            while(j<n){
                arr3[idx] =arr2[j];
                j++;
                idx++;

            }
            return arr3;
        }
    }
    static boolean isalphabeticallySmalller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true ;

        }
        return false ; 

        
    }
    public static void main (String args[]){
        String [] arr ={"sun" ," earth ", "mars", "mercury "};
        String []a =merge(arr,0, arr.length-1);
        for (int i= 0; i<a.length ; i++){
            System .out .println(a[i]);
        }
    }
}
