import java.util.*;
/*
public class function {
    public static void changeA(int a){
        a=10;// limited for function on;y print this value
        System.out.println(a);
        


    }
    public static void main (String args[]){
        
        int a=6;   //java always calls by value 
        changeA(a);
        System.out.print(a);
    }
    
}*/


//.......... find product of a & b .........
/* 
public class function {
    public static int  multiply (int a , int b ){
         int c = a * b ;
        return c;
        
    }
    public static void main (String args[]){
        
        int a=6;
        int b =5;   //java always calls by value 
        multiply(a, b);
        System.out.print( " a * b = " + multiply(a, b));
    }
    
}       */

//.................... find factorial ..............//
/* 
public class function {
    public static int factorial (int n){
        int f=1;


        for (int i =1; i<=n ; i++){
            f = f * i;

        }
        return f;

    }
    public static void main (String args[]){
        
        int n=4;   //java always calls by value 
        factorial(n);
        System.out.print(" factorial of 4 is " +factorial(n));
    }
    
}                   */



//.................. BIONOMIAL COEEFICIENT ..............//
/* bionomial coefficient    formula 
          BIONOMAIL FORMULA =  n!/r!(N-R)!

public class function {
    public static int factorial (int n){
        int f=1;


        for (int i =1; i<=n ; i++){
            f = f * i;

        }
        return f;

    }
    public static int  biocoeff( int n , int r ){
        int fact_n =factorial(n);
        int fact_r =factorial(r);
        int fact_nmr =factorial(n-r);

        int biocoeff = fact_n /(fact_r* fact_nmr);
        return biocoeff;
    }
    public static void main (String args[]){
        System.out.println(biocoeff(5,4));
       
    }
    
}*/
   
//.........................................................................
//...... FUNCTION OVERLAODING  WITH PARATMETERS ...............//
/*
public  class function {
    public static int sum (int a , int b ){ // SAME FUNCTION NAME 
         return a+b;

    }
    public static int sum (int a, int b , int c){// SAME FUNCTION NAME 
        return a+b+c;
    }
    public static void main (String args []){
        System.out. println(sum (3,2,4));
    }
}          */

//................................................................................,


// function overloading using data types ........../

 // function to calaculate to int sum 
/* 
 public class function {
    public static  int sum (int a, int b ){
        return a+b; 

    }
    public static float sum (float a, float b){
        return a+b;
    }
    public static void main (String args []){
        System.out.println(sum (4.5f,6.1f));
        System.out.println(sum (4,6));

    }
 }     */

      
///////////////////////////////////////////////////////////////////////////
 // prime oe not 
 /* 
public class function {
    public static boolean isprime (int n){
        boolean isprime =true;

        if( n ==2){
            return true ;
        }
        for (int i=2; i<n-1; i++){   // optimized loop  for(int i=2; i<=marh.sqrt(n) ; i++)
            if ( n % i==0){
                return false ;
            }
        }
        return true ;
    }
    public static void main (String aegs []){
        System.out. println(isprime(12));
    }
}*/


//// print all primes in a range ///

/* 
public class function {
    public static boolean isprime (int n){
        boolean isprime =true;

        if( n ==2){
            return true ;
        }
        for (int i=2; i<n-1; i++){   // optimized loop  for(int i=2; i<=marh.sqrt(n) ; i++)
            if ( n % i==0){
                return false ;
            }
        }
        return true ;
    }
    
    public static void primeinrange (int n ){
        for (int i= 2; i<=n ;i++){
            if(isprime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main (String args[]){
        primeinrange(20);
    }
}                     */



// convert form binary to decimal //
/* 

public class function{
    public static void bintodec(int binNum){
        int mynumber =binNum;
        int pow =0;
        int decNum= 0;
        
        while(binNum >0){
            int lastdigit =binNum%10;
            decNum =decNum +( lastdigit * (int )Math.pow(2, pow));

            pow++;
            binNum =binNum/10;
        }
        System.out.println("decimal of " + mynumber +" = "+  decNum);

    }
    public static void main (String args[]){
        bintodec(101);
    }

}             */


//convert from deciaml to binary 
/*
public class function{
    public static void DecTobin(int n){
        int mynumber =n;
        int pow =0;
        int binNum= 0;
        
        while(n > 0){
            int lastdigit = n % 2;
            binNum = binNum +( lastdigit * (int )Math.pow(10, pow));

            pow++ ;
            n = n / 2 ;
        }
        System.out.println("decimal of " + mynumber +" = "+  binNum);

    }
    public static void main (String args[]){
        DecTobin(7);
    }

}             
 */

 /////////Assignment questions /////////
/* 

//write a java mathod to compute the averge of three numbers 

public class function{
    public static int avg (int a, int b, int c){
        int avg =(a+b+c)/3 ;
        return avg;
    }
    public static void main(String args[]){
        System.out.print(avg(2,3,6));
    }
}   */

//      question 2

/*write a method namec isEven that accepts an int argument .The mathod
 * should return true if the argument is even ,or false  otherwise also
 * write a program to test your method 
 

public class function{
    public static void isEven (int n ){
        boolean isEven =true;
        for(int i=0; i<=n; i++){
            if( n % 2 == 0){
                System.out.println("true");
            }
        }
        System.out.print("false");
    }
    public static void main (String args[]){
        isEven(5);
    }
}             */


//               question 3

public class Function{
    public static void ispalindrome (int number  )
    {
        int palindrome =number;
        int reverse =0;

        while(palindrome != 0){


            int remainder  =palindrome % 10 ;
            reverse =reverse *10 +remainder ;
            palindrome = palindrome /10;

        }
        
    }
    public static void main(String args[]){
        System.out.print("enter the numbers ");
        Scanner sc =new Scanner(System.in);
        int  palindrome =sc.nextInt();

        if(ispalindrome (palindrome)){
            System.out.print("number " +palindrome + " is a palindrome ");
        }
        else{
            System.out.print("number " +palindrome + " is not a palindrome ");

        }
    }
}


    