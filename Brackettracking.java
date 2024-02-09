import java.io.NotActiveException;

public class Brackettracking {
    // public static void changearr(int arr[] , int i ,int val ){
    //     // base case 
    //     if(i ==arr.length){
    //         printArr(arr);
    //         return;
    //     }

    //     //recursion
    //     arr[i] =val;
    //     changearr(arr ,i+1 ,val+1);
    //     arr[i] =arr[i]-2;
    // }
    // public static void  printArr(int arr[] ){
    //     for (int i =0; i< arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //             // the time complexity of this program is o(n)
    //     }
    //     System.out.println();
    // }

    // public static void main(String agrs[]){

    //  int arr[] = new int [5];
//         changearr(arr, 0, 1);
//         printArr(arr);
            
        
//     }
    
// }


// find all subset of a given string following ar the given choices 
// subset of this String "abc"  = {a ,b ,c , ab , ac, abc};
  
//     public static void findSubsets(String str, String ans ,int i ) {
//         if( i == str.length()){
//             if(ans.length() ==0){
//                 System.out.println("null");
//             }else{
//                 System.out.println(ans);
//             }
//             return;

            
//         }
//         findSubsets(str, ans+str.charAt(i), i+1);
//         findSubsets(str, ans, i+1);

//     }
//     public static void main(String agrs[]){
//         String str="abc";
//         findSubsets(str, "", 0);
//     }
        
// }
//     public static void findpermutation(String str ,  String ans ){
//         //base case
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         } 

//         //recursion
//          for (int i =0; i <str.length(); i++) {
//             char curr  = str.charAt(i);
//             // "abcde" = "ab" +"de";
//             String newStr =str.substring(0,i)+str.substring(i+1);
//             findpermutation(newStr, ans+curr);
//         }
//     }

//     public static void main (String agrs []){
//         String str = "abc";
//         findpermutation(str, "");
//     }
// }


//     



// n queens for 5 ways to sit queens
    public static boolean isSafe (char board[][] ,int row ,int col){
        //vertical up 
        for(int  i=row-1; i>=0 ;i--){
            if(board[i][j] =' q'){
                return false;
            }
            
        }
        //diagonally left up

        for(int i=row-1 ; j=col-1; i>=0 &&  j>=0; i-- ,j--){
            if(board [i][j] = 'Q'){
                return false;
            }
        }
        //diagonally right up
        for(int i =row-1; j =col+1; i>=0 && j<board.length
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         ; i-- , j++){
            if(board [i][j] ='Q'){
                return false;
            }
        
        }
        return true;
    }
    
    
    public static void nQueens(char board [][] , int row){
        if(row == board.length){
            printBoard(board);
            return;


        }
        for (int i=0 ; i<board.length; j++){
            if(isSafe(board ,row ,j)){
                board[i][j] ='Q';
                nQueens(board ,row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static void printBoard(char board[][] ){
        System.out.println("______- chess board _________");
        for(int i=0; i<board.length ; i++){
            for(int j=0;  j<board.length; j++){
                System.out.println(board[i][j]+ " ");
            }
            System.out.println();

        }
        
    }
    public static void main(String  agrs[]){
        int n =4;
        char board [][] = new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length ; j++){
                board[i][j]= 'x';

            }
        }
        nQueens(board ,0);
    }
}




































































