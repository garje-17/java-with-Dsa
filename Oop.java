//import java.util.Scanner;
import java.util.*;

    
//     class bankAccount{
//         public String username ;
//         private String  passWord ;
//         public static void passWord(String password,String pwd){
//             password = pwd;
    
//         }
//     }
//     public static void main (String args[]){
//         bankAccount myacc = new bankAccount();
//         myacc.username = "Ram garje";
        
            
    
//    }
// }
    
// getters and setters 
/*get :- To return a value  
 * set :- to modify the value 
 * this :- This keyword is used to refer the current object 
// */
//     public static void main (String args []){
//         pen p1 =new pen();
//         p1.Setcolor("blue");
//         System.out.println(p1.getcolor());
//         p1.Settip(5);
//         System.out.println(p1.gettip());
//         p1.Setcolor("yellow");
//         System.out.println(p1.getcolor());
//         }

//     }
//     class pen{
//         private String color ;
//         int tip ;
//         String getcolor(){
//             return this.color ;

//         }
//         int Gettip(){
//             return this.tip;

//         }
//         void Setcolor (String newcolor){
//             this.color =newcolor ;

//         }
//         void gettip(int tip){
//             this.tip = newtip;
//         }
//     }

                   //            error are occured in above program 


//print the sum ,difference and prodcut of two complex number by creatig a 
//class named "complex "with a separate methods whose real and imaginary
//parts are entered by the user ........
public class Oop{
    
        
    public static void main (String[] args) {
        complex c = new complex (4,5);
        complex d =new complex(9, 4);

        complex e = complex .add(c,d);
        complex f = complex.diff(c,d);
        complex g = complex .product (c,d);
        e.printcomplex();
        f.printcomplex();
        g.printcomplex();
        
    }
}


    

class complex{
    int real ;
    int imag;

    public complex(int i ,int r){
        real =r;
        imag =i;

    }
    public static complex add(complex a, complex b){
        return new complex((a.real+b.real) ,(a.imag + b.imag));
    }
    public static complex diff(complex a, complex b){
        return new complex((a.real-b.real) ,(a.imag - b.imag));
    }
    public static complex product(complex a, complex b){
        return new complex(((a.real+b.real)-(a.imag + b.imag)),((a.real+b.real)+(a.imag + b.imag)));
    }
    public void printcomplex(){
        if(real == 0 && imag !=0){
            System.out.println(imag+"i");
        }
        else if(imag ==0 && real !=0){
            System.out.print(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
    
        
}
    