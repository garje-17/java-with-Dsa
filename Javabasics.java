
import java.util.Scanner;

public class Javabasics {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int income  =sc.nextInt();

        if(income < 500000){
            System.out.println("no tax");
        }
        else if(income >500000 && income <1000000){
                int tax =income*20/100;
                int total =income-tax ;
                System.out.println("total  is after tax :" +total);
            }
        else {
                int tax =income *20/100;
                int total =income-tax;
                System.out.println("total  is after tax :" +total);

            
        


        }

        

    }
        
}

