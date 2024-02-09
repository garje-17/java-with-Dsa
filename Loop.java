import java.util.Scanner;

//print hello world  100 times.................//
/*public class Loop {
    public static void main (String args[]){
        int counter =0;
        while(counter<100){
            System.out.println("Ram Garje");
            counter++;
        }
        
    }
}*/



 //print number 1 to 10  ..........//

/*public class Loop {
    public static void main (String args[]){
        int counter =1;
        while(counter<=10){
            System.out.println(counter+" ");
            counter++;
        }
    }
    
*/


/*public class Loop {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int counter =1;
        while(counter<=n){
            System.out.print(counter+" ");
            counter++;
        }
    }
}

*/

//print sum of first n natural number ..........

/*public class Loop {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0;
        int i=1;
        
        while(i<=n){
            sum += i;
            i++;
           


        }
    
    
        System.out.print("the sum is " +sum);
    } 
    
}
*/


// for loop.............

/*public class Loop {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in );
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("hello world ");
        }
    }

}*/
 //....................SQUARE PATTERN .......................//

 /*public class Loop {
    public static void main (String args[]){
        for (int i=0; i<4; i++){
            System.out.println("**** ");

        }
    }
    
     // for whilee condition logic  ...........//

 }  int line =1;
    while(line <=4){
        System.out.println("**** ");
    } 
 */

//...................RREVERSE THE NUMBER ...............

/*public class Loop {
    public static void main (String args[]){
        int n =10899;

        while(n>0){
            int lastdigit =n%10 ;
            System.out.print(lastdigit + " ");
            n=n/10;
        }
        System.out.println();
    }
}   */


// ...........REVERSE THE GIVEN NUMBER ........//

/*public class Loop {
    public static void main (String args[]){
        int rev =0;
        int n= 10899;
        
        while(n>0){
            int lastdigit =n % 10;
            rev =(rev*10)+ lastdigit;
            n=n/10;
        
            System.out.println(rev);
        }
    }
} */      

/*public class Loop {
    public static void main (String args[]){
       
        int count=1;
        while(count<=15){
            System.out.println(count%2 ==1 ?"***" : "+++++");
            ++count;
        }
    }
}*/


/*public class Loop {
    public static void main (String args[]){
        int ++a =100;
        System.out.println(++a);
       
    }
} */


/* do while  loop   ................abstract..........

public class Loop {
    public static void main (String args[]){
        int counter =1;
        do{
            System.out.println("hello world");
            counter++;

        }while(counter<=10);
    }
} */


/*keep entering numbers tll user enters a multiple of 10.

public class Loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            
        
        do{
            System.out.println(" enter by user");
            int counter =sc.nextInt();
            if(counter % 10==0){
                break;
                continue ; //for skip the iteration go to next word;

            }
            System.out.println(counter );

            
        }while(true);
    }
}
*/
        
/* .........check if number is primr or not..........
import java.util.*;
public class Loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        if(n==2){
            System.out.println("n is prime ");
        }
        else{
            boolean isprime =true ;
            for (int i= 2; i<n-1; i++){
                if(n % i == 0 ){
                    isprime =false ;

                }
            }
            if(isprime ==true ){
                System.out.println("n is prime ");
            }
            else{
                System.out.println("n is not prime ");
            }
        }
    }
}                          */


// Assignment ...............loop.............

import java.util.*;
public class Loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int evennum =0;
        int oddnum ;
        int number ;
        int choice ; 
        
        do{
            System.out.println ("enter the number ");
            number = sc.nextInt();

            if(number % 2==0){
                evennum +=number ;

            }
            else{
                oddnum += nmber ;

            }
            System.out.println(" do you want ti=o continue ? press 1 yes or 0 for no");


        }while(choice ==1);
        System.out.println(" the sum of even number is "+ evennum);
        System.out.println(" the odd of even number is "+ oddnum);
    }
}        */

// question no 2..............factorial of number ...........
/* 
import java.util.*;
public class Loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int fact =1;

        System.out.println("enter any positive number :");
        n =sc.nextInt();

        for (int i= 1; i<n ; i++){
            fact *=i;


        }
        System.out.println("factorial :" + fact);

    }
}                    */  


//question 3rd ...print multiplication table ............

/*import java.util.*;
public class Loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int n =1;
        System.out.println("enter the numbers");
        n =sc.nextInt();

        
        
        for (int i=1; i<=10; i++){
                System.out.println(n +" * " + i + " =" + n*i);

        }
        
    } */


    


