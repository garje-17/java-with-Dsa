import java.util.*;
//import java.util.ArrayList;

// implemention of stack using ArrayList

//public class StackB {
//     static class  Stack {
//         static ArrayList<Integer>list = new ArrayList<>();

//         public static boolean isEmpty(){
//             return list.size ()== 0;
//         }

//         // push 
//         public static  void push (int data ){
//             list.add (data);

//         }

//         //pop 
//         public static int pop (){
//             if (isEmpty()){
//                 return -1;

//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;

//         }
//             // peek 
//         public static int peek (){
//             if (isEmpty()){
//                 return -1;
                
//             }
//             return  list.get(list.size()-1);

         
//         }
//     }
//     public static void main (String args [] ){
//         Stack s  =new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s. isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
            
//     }
// }
//************************************************************************ */

// Stack using Linked list ................

//public class StackB {
//     static class Node {
//         int data;
//         Node next ;

//         Node(int data){

//             this.data = data;
//             this.next = null;

//         }
//     }
//     static class Stack {
//         static Node head = null;

//         public static boolean isEmpty(){
//             return head == null;

//         }
//         public static void push (int data ){
//             Node newNode = new Node(data);

//             if (isEmpty()){
//                 head = newNode;
//                 return ;
//             }
//             newNode.next = head;
//             head =newNode;

//         }
//         public static int pop (){
//             if (isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head= head.next;
//             return top;

//         }
//         public static int  peek (){
//             if(isEmpty()){
//                 return -1;

//             }
//             return head.data;
//         }
//     }

//********************************************************************** */

    // Push the element at the bottom of the stack ....Amazon

    // public static void pushAtBottom (Stack<Integer> s ,int data ){

    //     if (s.isEmpty()){
    //         s.push(data);
    //         return ;
    //     }
    //     int top = s.pop();
    //     pushAtBottom(s, data);
    //     s.push(top);
    // }


//     public static void main (String agrs []){
//         Stack s = new Stack();
//         Stack<Integer> s = new Stack<>();// java collection frameWrok no required other function 
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         pushAtBottom(s, 4);
//         while (!s.isEmpty()){
//             System.out.println(s.pop());


        
//         }    
//     }   
       
// }
        


//*********************************************************************** */
    // Reverse a String using Stack ,,,,,,,, microsoft ,flipkart,paytm
// public class StackB{
//     public static String reverseString(String str ){
//         Stack <Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()){
//             s.push (str.charAt(idx));
//             idx ++;

//         }

//         StringBuilder result = new StringBuilder("");
//         while (!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);

//         }
//         return result.toString();
//     }

//  public static void main (String agrs []){
//         //Stack s = new Stack();
//         // Stack<Integer> s = new Stack<>();// java collection frameWrok no required other function 
//         // s.push(1);
//         // s.push(2);
//         // s.push(3);
//         //s.push(4);

//         // pushAtBottom(s, 4);
//         // while (!s.isEmpty()){
//         //     System.out.println(s.pop());


//         // for reverse a String 
//         String str = "helloWorld";
//         String result = reverseString(str);
//         System.out.println(result);
            
//     }   
       
// }


//********************************************************************** */
// reverse a stack 

// public class StackB {
//     public static void pushAtBottom (Stack<Integer> s ,int data){
//         if (s.isEmpty()){
//             s.push(data);
//             return ;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
    
//     }
//     public static void reverseStack(Stack<Integer> s){

//         if (s.isEmpty()){
//             return ;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s , top);
//     }


//     public static void printStack(Stack<Integer> s){
//         while(! s.isEmpty()){
//             System.out.println(s.pop());

//         }
//     }
//     public static void main (String args []){

//         Stack <Integer> s = new Stack <>();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverseStack(s);
//         printStack(s);

        
//     }
// }


/******************************************************************************************************************************** */

//stock  span problem ....................

// public class StackB{
//     public static void StockSpan (int span[] , int Stock[]){
        
//         Stack<Integer> s= new Stack<>();
//         span[0] = 1;
//         s.push(0);// push first index valuee on to the stack                

//         for (int i = 1; i<Stock.length; i++){
//             int currPrice = Stock[i];
//             while (!s.isEmpty() && currPrice >Stock[s.peek()]){
//                 s.pop();
//             }
//             if (s.isEmpty()){
//                 span[i] =i+1;

//             }else{
//                 int prevhigh = s.peek();
//                 span[i] = i- prevhigh;

//             }
//             s.push(i);

//         }
//     }
//     public static void main (String agrs [] ){

//         int Stock []= {100, 80, 60, 70, 60 ,85 , 100};
//         int span [] = new int [Stock.length];
//         StockSpan(span, Stock);

//         for (int i=0; i<span.length; i++){
//             System.out.println (span [i] +" ");
//         }
//     }
// }

/*********************************************************************************************************************************************** */
// next Greater element ..........

// public class StackB{
//     public static void main (String agrs []){
//         int arr[] = {6,8,0,1,3};
//         Stack<Integer>  s =  new Stack<>();
//         int nxtGreater[] = new int [arr.length];
         
//         for (int i= arr.length-1; i>=0 ; i--){
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
//                 s.pop();

//             }
//             if (s.isEmpty()){
//                 nxtGreater[i] = -1;
//             }
//             else{
//                 nxtGreater[i]= arr[s.peek()];

//             }
//             s.push(i);
//         }
//         for (int i=0; i<nxtGreater.length; i++){
//             System.out.println(nxtGreater[i]+" ");

//         }
//         System.out.println();
//     }
// }

/************************************************************************************************************************************ */
// // String is valid or not ....................................................
// public class StackB{
//     public static boolean isValid (String str ){
//         Stack<Character> s = new Stack<>();

//         for (int i= 0; i<str.length(); i++){
//             char ch = str.charAt(i);

//             if (ch == '(' || ch == '{' || ch == '[' ){//opening
                
//                 s.push(ch);

//             } else{
//                 //closing
//                 if(s.isEmpty()){
//                     return false ;

//                 }
//                 if (s.peek() == '(' && ch == ')') || (s.peek() == '(' && ch == ')') || (s.peek() == '(' && ch == ')'){
//                     s.pop();

//                 }

//                     return false ;
//                 }

//             }
//         }
//         if (s.isEmpty()){
//             return true;

//         }
//         else{
//             return false;
//         }
//     }
    
//     public static void main (String args []){
//         String str = "{({[]})}";
//         System.out.println(str);
//     }
// }


/************************************************************************************************************************** */

//check in String duplicate paranthesis is exist or not ..............if exist then return true else false...................

// public class StackB{
//     public static boolean isDuplicate(String str ){

//         Stack <Character> s = new Stack<>();

//         for (int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);

//             //closing 
//             if (ch == ')'){
//                 int count =0; 

//                 while (s.peek() != '('){
//                     s.pop();
//                     count++;
//                 }
//                 if (count <1){
//                     return true ; // duplicate is exist 
//                 }
//                 else{
//                     s.pop();// remove the opning pair ]
//                 }
//             }
//             //opening 
//             else{
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//     public static void main (String args[]){

//         String str = "((a+b))";// true 
//         String  str2 = "(a+b)"; //false 
//         System.out.println(isDuplicate(str));
//     }
// }

/************************************************************************************************************************/
//Palindrome linked list using stack
//Input = a->B->c->B->a
//Yes its palindrome 

public class StackB{
    class Node{
        int data;
        Node next;
        Node (int data){
            this.data =head;
            this.next = null;

        }
    
        public static boolean isPalindrome(Node head){

            Node slow = head;
            boolean isPalin =true;

            Stack<Integer> s = new Stack<>();

            while (slow != null){
                s.push(slow.data);
                slow = slow.next;

            }
            while(head != null){

                int i = s.pop();
                if (head.data == i){
                    isPalin =true;
                    
                }
                else{
                    isPalin =false;
                    break;
                }
                head= head.next;

            }
            return isPalin;
            
        }
        
    }
    public static void main(String[] args ){

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node (1);

        one.next = two;
        one.next =three;
        one.next =four;
        one.next =five;

        boolean result = isPalindrome(1);
        System.out.println("it is palindrome :" +result);

    }
}