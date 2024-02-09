import java.net.PortUnreachableException;

// .........print star pattern ................
/*

*
**
***
**** 

public class Pattern {
    public static void main(String [] args  ){
        // outer loop  ................
        for (int i=1; i<=4 ; i++){ // inner loop.........
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); /// new line ....
        }
    }
}                        */

// ...........invertd star pattern.......................... 
/*   

****
***
**
*
public class Pattern {
    public static void main(String [] args  ){
        // outer loop  ................
        int n =4;
        for (int i=1; i<=n ; i++){ // inner loop.........
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println(); /// new line ....
        }
    }
} 
              */

public class Pattern{
    public static void main(String agrs[]){
        for(int i=5; i>=0; i--){
                                                                                                                                                                                                                          
        }
    }
}









// ... print half pattern ...............//
/*
1
12
123
1234 */
/* 
public class Pattern {
    public static void main(String [] args  ){
        for (int line =1; line <=4; line ++){
            for (int number =1; number <=line ; number ++){
                System.out.print(+number );
            }
            System.out.println();
        }
    }
}  */

//.................character pattern .....................

/*
 a
 bc
 def
 ghij

*/
/*public class Pattern {
    public static void main(String [] args  ){
        int n=1;
        char ch ='A';

        for (int line =1; line <=4; line ++){
            for (int number =1; number <=line ; number ++){
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }
    }
}       */
    
// ............assignment pattern      .....................
/* 
public class Pattern {
    public static void main(String [] args  ){
        int n =4;
        for (int line =1; line <=n ; line++){
            for (int j=1; j<=line ; j++}{
                if(line ==1 ||line ==4){
                    System.out.print("*");
                }
                else{
                    System.out.println(" ");

                }
                System.out.println();
            }
        }
    }    */
    /*  import java. util.Scanner;
    public class Pattern
    {
      public static void main(String args[])
      {
        int rows, columns, i, j;
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter the no. of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        columns = sc.nextInt();
     
        System.out.print("Rectangular star Pattern: \n\n");
        for (i = 1; i <= rows; i++)
        {
          for (j = 1; j <= columns; j++)
          {
            if (i == 1 || i == rows || j == 1 || j == columns)
              System.out.print("*");
            else
              System.out.print(" ");
          }
     
          System.out.println();
        }
      }
    }       */

// pattern two assignament......../
/* 
public class Pattern {
    public static void main (String [] args){
        int n=4;
        for (int i=1; i <=n ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}   */



//.....  ADVANCED PATTERN PART 2 OR ASSIGNMENT .........
/* 
******
*    *
*    *
******
*/
/* 
public class Pattern{
    public static void pattern (int rows, int cols ){
        //outer loop
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if( i==1 || i==rows || j==1 || j==cols ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
        
    }
    public static void main(String args[]){
        pattern(4, 5);
    }
}      */


// pattern question 2.....................
/* 
          *
        * *
     *  * *
  *  *  * *
    */
/* 
    public class Pattern{
        public static void   pattern (int n ){
            //outer loop
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                   System.out.print(" "); 
                }
                for(int j=1; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            
            }
            
        }    
        public static void main(String args[]){
            pattern(4);
        }
    }      */

  //  pattern question 3
  /* 
12345
1234
123
12
1

public class Pattern {
    public static void pattern( int n){
        for( int i=1; i<=n; i++){
            for( int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        

    }
    public static void main (String args []){
        pattern(5);
    }
}                          */

/* pattern triangle .......


1
01
101
0101
10101



public class Pattern{
     public static void triangle ( int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j) %2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }
     public static void main (String args[]){
        pattern(5);
    
     }
     
}             */

// buttterfly pattern.........................................

/* 
public class Pattern{
    public static void buttterfly(int n){

        //outer loop
        for (int i=1; i<=n; i++){

            // star ====i
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }
            //spaces ====2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //Star ....   ==i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=n; i>=1; i--){
            for(int j=1; j<=i ; j++){
                System.out.print("*");
            }
            //spaces ====2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //Star ....   ==i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        

        }
    }
    public static void main (String args []){
        buttterfly(4);
    }
}      */


/* //////////////////Rhombus pattern //////////////////

    8888
   8888
  8888
 8888
8888 

public class Pattern{
    public static void buttterfly(int n)
    {

        //outer loop
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
            
        }
    } 
    public static void main(String args []){
        buttterfly(20);

    } 
        
}       */


public class Pattern{
    public static void pattern (int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
    public static void main(String args[]){
        pattern(5);
    }
}