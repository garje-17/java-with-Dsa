public class Soluation {
    public static void rotate(int arr[]  ,int order){
        order =order % arr.length;

    
        if(arr == null || order <0){
            throw new IllegalArgumentException("Illegal argument !");

        }
        int a =arr.length -order;

        reverse (arr , 0, a-1);
        reverse(arr ,a, arr.length-1);
        reverse(arr ,0 ,arr.length-1);
    }
    public static void reverse(int arr[], int left ,int right){
        if(arr == null || arr.length ==1 )
            return;
    
        while(left < right){
            int temp =arr[left];
            arr[left] =arr[right];
            arr[right] =temp;
            left++;
            left--;

            
        }
    }
    public static void main(String agrs[]){
        int arr[] ={1,2,3,4,5,6};
        
        System.out.print(reverse(arr, 0, 0));

    }
}
