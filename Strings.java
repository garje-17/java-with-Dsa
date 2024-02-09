
import java.nio.channels.Pipe;
import java.security.PublicKey;
import java.util.Scanner;
/* 
public class Strings {
    public static void printString (String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }

    }
    public static void main (String agrs []){
        //declaratiom

    //     String  str ="abcd";
    //     System.out.println(str);
    //     //for create a new string 
    //     String str2 =new String ("xyzrsm^$13");

    // // .................String are immutable ........


    //     // input output 

    //     Scanner sc =new Scanner( System.in );
    //     String name ;
    //     name =sc.nextLine();
    //     System.out.println(name);


        //for finding length ...............

        // String fullnamString ="ram garje";
        // System .out.println(fullnamString.length());

        // for concatenate the string 

        String name = "ram";
        String sirname ="garje";
        String fullname = name +" "+sirname ;
        // System.out.println(fullname);

        printString(fullname);// call function for print using loop

        // //for finding a character or word in string ;
        // System.out.println(fullname.charAt(1));

        
        
    }
    
}*/


// check if a string is palindrome 
// "racecar " ," noon "
/* 
public class Strings {
    public static boolean isPalindrome (String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrome 
                return false;

            }
        }
        return true;
    }
    public static void main(String agrs[]){
        String str ="noon";
        System.out.println(isPalindrome(str));
        
    }
}*/


// Q2] given a route containing 4 directioms (E,W,N,S),
//Find the shortest path to reach destination
/* 
public class Strings{
    public static float shortestPath(String path){

        int x=0 , y=0;
        for(int i=0; i<path.length(); i++){
            char dir =path.charAt(i);
            if(dir =='s'){
                y--;
            }
            else if( dir == 'n'){
                y++;
            }
            else if(dir =='w'){
                x--;
            }
            else{
                x++;
            }
            

        }
        int x2 =x*x;
        int y2 =y*y;
        return (float)Math.sqrt(x2 +y2);
    }
    public static void main(String agrs[]){
        String path ="wneenesennn" ;
        System.out.print(shortestPath(path) );      
    }
}*/


// String function
//1] substring
// public class Strings{
//     public static void main (String agrs []){
//         String str ="helloworld";
//         //substring is a special keyword in java 
//         System.out.println(str.substring (0,5));

//     }
// }*/


//Q3]for a given of strings ,print the largest string.
//compareTo keyword

// public class Strings{
//     public static void  main(String args[]) {
        
//         String fruits[] ={"banana" ,"mango", "apple"};
//         String  largest = fruits[0];
//         for(int i=0; i<fruits.length; i++){
//             if(largest.compareTo(fruits[i]) <0){
//                 largest =fruits[i];
            
//             }
//         }
//         System.out.println(largest);
                
//     }
    
// }

// string are immmutable
//stringbuilder
// public class Strings{
//     public static void  main(String args[]) {
//         StringBuilder sb =new StringBuilder("");
//         for( char ch ='a'; ch<='z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }

//Q4] for a given string convert each the first letter
//of each word to uppercase
/*  
public class Strings{
    public static String toupperCase(String str) {
        StringBuilder sb =new StringBuilder("");

        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for (int i =1; i<str.length();i++){
            if(str.charAt(i) ==' '  &&  i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
            
    }
    public static void  main(String args[]) {
        
        String str ="hi, i am ram";
        System.out.println(toupperCase(str));

    }
}*/

// string compresssion
 //"aaabbbbcccdd" =="a3b4c3d2"; 

// public class Strings{
//     public static String compreString(String str){
//         String newStr ="";
//         for(int i=0; i<str.length(); i++){
//             Integer count =1;
//             while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr +=str.charAt(i);
//             if(count >1){
//                 newStr +=count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main (String args []){
//         String str ="aaabbbbccddd";
//         System.out.println(compreString(str));

//     }
// }

// count how many times lowercase vowels occured in a string entered by
//the user
// public class Strings{

//     public static void main(String args []) {

//         String str = new Scanner (System.in).next();
//         int count =0;

//         for(int i=0; i<str.length(); i++){
//             char ch =str.charAt(i);
//             if(ch =='a'|| ch =='e' || ch =='i' ||ch =='o' || ch =='u'){
//                 count ++;
//             }
//         }
//         System.out.println("count of vowels is " +count );
//     }
    
    
public class Strings{
    public static void  main (String args []){
        String str ="Ram";
        String str1 ="sameer";
        String str2 ="Ram";
        System.out.println(str.equals(str1)+ " "+ str.equals(str2));
        String str3 ="RamaGarje".replace("1","");
        System.out.println(str3);
    }
}