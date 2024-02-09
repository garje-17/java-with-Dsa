// public class Bit {
//     public static int GetithBit( int n ,int i){
//         int bitmark = 1<<i;

//         if((n & bitmark )== 0){
//             return 0;
//         }
//         else{
//             return 1;
//         }
//     }
//     public static int SetithBit(int n , int i ){
//         int bitmask = 1 << i;
//         return  n | bitmask ; 
//     }
//     public static int  clearithBit( int n ,int i){
//         int bitmask = ~(1<<i);
//         return n & bitmask ;

//     }
//     public static int updateithBit( int n ,int i ,int  newBit){
//         n = clearithBit(n, i);
//         int bitmask =newBit<< i;
//         return n |bitmask;

//     }
//     public static int clearlastBit( int n ,int i){
//         int bitmask =(~0)<<i ;
//         return n & bitmask;
//     }
//     public static int clearrangeBit( int n ,int i ,int j){
//         int a =((~0)<<(j+1));
//         int b= (1<<i )-1;
//         int bitmask = a|b;
//         return n & bitmask ;

//     }
        
//     public static void main(String [] args){
//         // System.out.print(GetithBit(10 ,2 ));
//         // System.out.print(SetithBit(10 ,2));
//         //System.out.print(clearithBit(10,1));
//         //System.out.print(updateithBit(10, 02, 1));
//         //System.out.print((clearlastBit(15, 2)));
//         System.out.print((clearrangeBit(10, 2 ,4)));

//     }
    
// }
//check a number is a power of 2 or not 

//     public static boolean isPowerOfTwo (int n) {
//         return (n & (n-1)) == 0;
        
//     }
//     public static void main(String [] args){
//         System.out.print(isPowerOfTwo(12));

//     }
// }

// count set bits in a number

public class Bit{
    public static int countSetBIts(int n){
        int counter =0;
        while(n>0){
            if((n & 1 )!= 0){
                counter++;

            }
            n =n>>1;
        }
        return  counter;
    }
    public static void main(String [] args){
        System.out.print(countSetBIts(16));
        
   }
        

} 