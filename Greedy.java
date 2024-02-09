import java.util.ArrayList;
//  Activity selection code 
import java.util.Arrays;
import java.util.Comparator;

// public class Greedy {
//     public static void main (String args []){
//         int Start[] = {1,3,0,5,8,5};
//         int End [] = {2,4,6,7,9,9,};

//         // end time basis sorted 
//         int maxAct = 0;

//         ArrayList<Integer> ans = new ArrayList<>();

//         maxAct =1;
//         ans.add(0);
//         int lastend  = End[0];
//         for (int i=1; i<End.length; i++){
//             if( Start[i] >= lastend ){
//                 // activities sselect 
//                 maxAct++;
//                 ans.add(i);
//                 lastend = End[i];

//             }
//         }
//         System.out.println ("max activies = "+ maxAct);
//         for (int i=0; i<ans.size(); i++){
//             System.out.println("A" +ans.get(i)+" ");
//         }
//         System.out.println ();
//     }
// }

/*********************************************************************************************************************** */
//Fractional knapSack 

// public class Greedy{
//     public static void main(String args[]){
//         int val [] = {200 , 500 ,400};
//         int weight [] = {20,25 ,50};
//         int w =28;

//         double ratio [][] = new double[val.length][2];

//         for (int i=0; i<val.length; i++){
//             ratio[i][0] =i;
//             ratio [i][1] = val[i]/(double) weight[i];

//         }
//         //Ascending oreder
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity =w;
//         int finalval = 0;
//         for (int i= ratio.length-1 ; i>=0; i--){
//             int idx = (int) ratio[i][0];
//             if(capacity >= weight[idx]){// full conditon include
//                 finalval += val[idx];
//                 capacity -= weight[idx];
//             }
//             else{
//                 // include fractional item ;
//                 finalval += (ratio[i][1]* capacity);
//                 capacity =0; 
//                 break;
//             }

//         }
//         System.out.println("final value ="+ finalval);
//     }
// }
/********************************************************************************************* */

// FIND ABSOLUTE DIFFERENCE OF ALL PAIR IS MINIMUM

// public class Greedy{
//     public static void main (String args [] ){
//         int A[] = {1,2,3};
//         int b[] = {2,1,4};

//         Arrays.sort(A);
//         Arrays.sort(b);

//         int mindiff =0 ;


//         for (int i =0 ; i<A.length; i++){
//             mindiff += Math.abs(A[i] -b[i]);

//         }
//         System.out.println (" mi absolute pair is  =" + mindiff);
//     }
// }

/********************************************************************************************************************************************* */

// maximum length of chain of pairs /.................it is same as a activity  selection code 

public class Greedy{
    public static void main (String args [] ){
        int pair [][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50, 90}};

        int count = 0;
        int
    }
}

