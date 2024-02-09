// testing

// public class QueueB {
//     static class Queue{
//         static int arr[];
//         static int rear;
//         static int size ;

//         Queue(int n){
//             arr =new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty(){
//             return rear == -1;

//         }
//         public static void add (int data ){
//             if(rear == size-1){
//                 System.out.println("queue is full");
//                 return;

//             }
//             rear = rear +1;
//             arr[rear] = data;

//         }
//         public static int remove (){
//             if (isEmpty()){
//                 System.out.println("empty Queue");
//                 return -1;

//             }
//             int front = arr[0];
//             for (int i=0 ; i<rear; i++){
//                 arr[i] =arr[i+1];

//             }
//             rear = rear - 1;
//             return front;

//         }
//         public static int peek(){
//             if (isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;

//             }
//             return arr[0];
//         }        
//     }
//     public static void main (String agrs []){

//         Queue q = new Queue(5);

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

/******************************************************************************* */

// Circular queue 
// public class QueueB {
//     static class Queue{
//         static int arr[];
//         static int rear;
//         static int size ;
//         static int front ;

//         Queue(int n){
//             arr =new int[n];
//             size = n;
//             rear = -1;
//             front = -1;

//         }

//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;

//         }
//         public static boolean isFull(){
//             return (rear+1) % size == front;

//         }

//         public static void add (int data ){
//             if(isFull()){
//                 System.out.println("queue is full");
//                 return;

//             }
//             // add first element
//             if (front == -1){
//                 front = 0;
//             }
//             rear = (rear +1) % size;
//             arr[rear] = data;

//         }
//         // remove 
//         public static int remove (){
//             if (isEmpty()){
//                 System.out.println("empty Queue");
//                 return -1;

//             }
//             int result = arr[front];
//             // last element delete

//             if (rear == front){
//                 rear = front = -1;

//             }
//             else{
//                 front = (front +1) %size ;
//             }
//             return result;

    
//         }
//         public static int peek(){
//             if (isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;

//             }
//             return arr[front];
//         }        
//     }
//     public static void main (String agrs []){

//         Queue q = new Queue(3);

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);


//         while (!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

/******************************************************************* */
// circular queue using arrays

// public class QueueB {
//     static class Node {
//         int data;
//         Node next;

//         Node (int data){
//             this.data = data;
//             this.next = null;

//         }

//     }
    
//     static class Queue{
//         static Node head =null;
//         static Node tail = null;

//         public static boolean isEmpty(){
//             return head== null && tail == null;

//         }


//         public static void add (int data){
//             Node newnoNode = new Node(data);
//             if (head == null){
//                 head = tail = newnoNode;
//                 return;
//             }
//             head.next = newnoNode;
//             tail = newnoNode;
        

//         }

//         // remove 
//         public static int remove (){
//             if (isEmpty()){
//                 System.out.println("empty Queue");
//                 return -1;

//             }
            
//             int front = head.data;
//             //single element 
//             if (tail == head){
//                 tail = head = null;

//             }
//             else{
//                 head = head.next;
//             }
//             return front;
//         }
//         public static int peek(){
//             if (isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;

//             }
//             return head.data;
            
//         } 
        
           
//     }
//     public static void main (String agrs []){

//         Queue q = new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
        


//         while (!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

//import java.util.Stack;

/************************************************************************************************************* */
// queue using 2 stacks


// public class QueueB{
//     static class Queue {
//         static Stack<Integer>  s1 = new Stack<>();
//         static Stack<Integer>  s2 = new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         public static void add (int data ){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }

//         }

//         public static int remove(int data){
//             if (isEmpty()){
//                 System.out.println("queueis empty ");
//                 return -1 ;
//             }
//             return s1.peek();
//         }
        

//     }
//     public static void main (String args[] ){
//         Queue q =new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/******************************************************************************************************* */

// stack using 2 queues 

// public class QueueB{
//     static class Stack{
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();

//         }

//         public static void push (int data ){
//             if (!q1.isEmpty()){
//                 q1.add(data);

//             }else{
//                 q2.add(data);

//             }


//         }
//         public static int Top (){
//             if (isEmpty()){
//                 System.out.println ("empty queue");
//                 return -1;

//             }
//             int top = -1;

//             if (!q1.isEmpty()){
//                 while (!q1.isEmpty()){
//                     top = q1.remove();
//                     if (q1.isEmpty()){
//                         break; 
//                     }
//                     q2.add(top);

//                 }

//             }
//             else{
//                 while (!q2.isEmpty()){
//                     top =q2.remove();
//                     if (q2.isEmpty()){
//                         break;
//                     }
//                     q2.add(top );
//                 }
//             }
//             return top;
//         }
//         public static int peek (){
//             if (isEmpty()){
//                 System.out.println("empty queue");
//                 return -1;

//             }
//             int top = -1;

//             if (!q1.isEmpty()){
//                 while (!q1.isEmpty()){
//                     top = q1.remove();
                    
//                     q2.add(top);

//                 }

//             }
//             else{
//                 while (!q2.isEmpty()){
//                     top =q2.remove();
                    
//                     q2.add(top );
//                 }
//             }
//             return top;
//         }
//         public static void main (String [] args ){
//             Stack s = new Stack();

//             s.push(1);
//             s.push(2);
//             s.push(3);

//             while (s.isEmpty()){
//                 System.out.println(s.peek());
//                 s.pop();
//             }
//         }
//     }
// }


/**********************************************************************************************************************************/
// first non repeating charcter letter in stream of charcteer 

// public class QueueB{
//     public static void printNonrepeting (String str ){

//         int freq []= new int [26];
//         Queue<Character> q = new LinkedList<>();

//         for (int i=0 ; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch -'a']++;
            
//             while (!q.isEmpty() && freq[q.peek() -'a']> 1){
//                 q.remove();

//             }
//             if (q.isEmpty()){
//                 System.out.println (-1 + " ");

//             }else{
//                 System.out.println(q.peek() +" ");
//             }

//         }
//         System.out.println();

            
        
//     }
//     public static void main (String args [] ){
//         String str = "aabccxb";
//         printNonrepeting(str);
        
//     }
// }



/***************************************************************************************************************** */

// interleve 2 hlaves of a queue //

// public class QueueB {
//     public static void interLeave (Queue<Integer> q){
//         Queue<Integer> firstHalf  = new LinkedList<>();

//         int size = q.size();

//         for (int i=0; i<size /2 ; i++){
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()){
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }
//     public static void main (String args []){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
        
//         interLeave(q);
//         while (!q.isEmpty()){
//             System.out.println(q.remove());
//         }

//         System.out.println();
//     }
// }

/********************************************************************************************** */

//queue reversal 

// public class QueueB{
//     public static void reversal(Queue<Integer> q ){
//         Stack<Integer> s= new Stack<>();

//         while (!q.isEmpty()){
//             s.add(q.remove());
//         }
//         while (!s.isEmpty()){
//             q.add(s.pop());
//         }

//     }
//     public static void main (String args [] ){
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reversal(q);

//         while(!q.isEmpty()){
//             System.out.print(q.remove() +" ");

//         }
//         System.out.println();


//     }
// }

/********************************************************************************************************************* */

// Deque

// public class QueueB {
//     public static void main (String args[]){
//         Deque<Integer> d = new LinkedList<>();

//         d.addFirst(1); // 1 
//         d.addFirst(2); // 2 ,1
//         d.addLast(3); // 2 , 1, 3
        
//         System.out.println(d);// [2 ,1]
//         d.removeFirst();// 1, 3
//         d.removeLast();
//         d.getFirst();// return first element
//         d.getLast(); // return last element
//         System.out.println(d);
//     }
// }


// /*************************************************************************************************** */
// import java.util.*;
// public class QueueB{
 
//     static void generatePrintBinary(int n)
//     {
//         Queue<String> q = new LinkedList<String>();
//         q.add("1");
//         while (n-- > 0)
//         {
//             String s1 = q.peek();
//             q.remove();
//             System.out.println(s1);
//             String s2 = s1;
//             q.add(s1 + "0");
//             q.add(s2 + "1");
//         }
//     }
//     public static void main(String[] args){
//         int n = 10;
//         generatePrintBinary(n);
//     }
// }


/*******************************************************************/
