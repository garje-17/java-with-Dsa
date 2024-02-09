import java.util.ArrayList;


public class ArrList {
    
//     public static void main(String agrs[]){
            //syntax
    
        // ArrayList <Integer> list =  new ArrayList<>();
        // ArrayList <String> list2 = new ArrayList<>();
        // ArrayList <Boolean> list3 = new ArrayList<>();
    

            //lets perform some operations on arraylsit
            /*add()  === o(n)...time complextiy 
             * get() ==== o(n)
             * set() -=== o(1)
             * remove () == 0(1)
             * contains () === o(n)
             * 
             */
        // ADD ELEMENT
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
    
        // System.out.println(list);

        //or add functioon
        //list.add(2 , 10);
        //System.out.println(list);

        //get() element 
       // int element = list.get(2);
        // System.out.println(element);

        
        // remove function 

        //list.remove(2);
        //System.out.println(list);

        // set function 
       // list.set(2 ,10);
        //System.out.println(list);
        
        // contains element 

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        
        // define the size of arrylist 

//         for (int i=0; i<list.size(); i++){

//             System.out.print(list.get(i)+" ");

//         }
//         System.out.println();


    
//     }
        
// }
    
    
    
//some basic program using arraylist 


//     public static void main(String agrs[]){
//         ArrayList <Integer> list =  new ArrayList<>();
//         ArrayList <String> list2 = new ArrayList<>();
//         ArrayList <Boolean> list3 = 
        
//          ArrayList<>();
    

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
    
//         System.out.println(list);

// // reverse  an array list

    
//     for (int i =list.size()-1; i>=0; i--){
//              System.out.print(list.get(i)+" ");
//         }
//          System.out.println();




// // find maximum in arraylist 

//         int max = Integer.MIN_VALUE;
//         for (int i=0 ; i<list.size(); i++){
//             if(max < list.get(i)){
//                 max =list.get(i);
//             }
//         }
//         System.out.println(max +" ");

    
//     }
// }


//  problem = container with most water

    public static int MaxStoreWater(ArrayList<Integer> Height ) 
    {
        int MaxWater =0;
        // for checking  max store water using nested loops 
        for (int i=0; i<Height.size(); i++){

            for (int j=i+1; j<Height.size(); j++) {

                int Ht =Math.min(Height.get(i) , Height.get(j));

                int Width = j-i;

                int currwter = Ht * Width;

                MaxWater = Math.max (MaxWater , currwter);

            }
        }
        return MaxWater;

    }
    public static void main (String args [] ){
        ArrayList<Integer> Height =  new ArrayList<>();

        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        

        System.out.println(MaxStoreWater(Height));
    }
}

    



