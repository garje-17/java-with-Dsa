// // print subarry and his sum 
// public class Pratice {

//     public static void subarray(int numbers []){
        
        
//         for (int i=0; i<numbers.length; i++){
//             int start = i;
//             for (int j=i; j<=numbers.length; j++){
//                 int end  =j;
//                 int sum = 0;
//                 for (int k = start ; k<end ; k++){
//                     System.out.print(numbers[k]+ " ");
                    
//                     sum += numbers[k];
                    
                    
//                 }
//                 System .out.print("= " + sum);
//                 System.out.println();
//             }
//             System.out.println();
            
//         }
        

//     }
//     public static void main (String agrs []){
//         int numbers [] = {2,4,6,8,10};
//         subarray(numbers);

//     }
// }



// container wiht most water 
 import java.util.ArrayList;

// public class Pratice{
//     public static int StoreWater(ArrayList<Integer> height){

//         int maxWater = 0;
//         int lp = 0;
//         int rp =height.size()-1;


//         while(lp < rp){

//             int ht = Math.min(height.get(lp) , height.get(rp));
//             int width = rp -lp;
//             int currWater = ht * width ;
//             maxWater = Math.max(maxWater, currWater);


//             if(height.get(lp) < height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return maxWater;
//     }
//     public static void main (String args []){
//         ArrayList<Integer> height = new ArrayList<>();

//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(StoreWater(height));
    

//     }
// }

public class Pratice{
    public static boolean PairSum(ArrayList<Integer> list ,int target){

        int lp =0;
        int rp = list.size()-1;


        while (lp< rp){

            if (list.get(lp)+ list.get(rp) == target){
                return true ;
            }
            else if (list.get(lp)+ list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;
    }
    public static void main (String args [] ){
        ArrayList <Integer> list = new ArrayList<>();

       
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target =50;

        System.out.println(PairSum(list, target));
        
    }
}