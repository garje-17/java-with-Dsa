import java.time.LocalDateTime;


 public class LinkedList {

    public static class Node{

        int data;
        Node next;
        
    
        public Node (int data){
            this.data = data;
            this.next =null;
        }

    }
    public static  Node Head ;
    public static Node Tail;

    public void addFirst (int data){
        //Step 1 = create a newnode 
        Node newNode = new Node (data);
        if (Head == null){
            Head = Tail = newNode;
            return;
        }
        //step 2 =newnode next =head 
        newNode.next =Head;

        // step 3 = head = newnode 
        Head = newNode;

    }
    public void addLast (int data ){
        Node newNode = new Node( data);
        if (Head == null ){
            Head = Tail = newNode;
            return ;

        }
        Tail.next =newNode;
        Tail =newNode;
    }
   
    
//     public void AddMidddle(int idx ,int data){

//         Node newNode = new Node(data);
//         Node temp= Head;
//         int i =0;
//         while(i < idx -1){
//             temp =temp.next;
//             i++;
//         }
//         newNode.next = temp.next;
//         temp.next =newNode;

//     }
//     // public int removeFirst(){
//     //     int size;
//     //     if (size == 0){
//     //         System.out.print("ll is empty");
//     //         return Integer.MIN_VALUE;

//     //     }
//     //     else if(size ==1){
//     //         int val = Head.data;
//     //        Head =Tail =null; 
//     //        return val;
//     //     }

        
//     //     int val = Head.data;
//     //     Head = Head.next;
//     //     return val;
//     // }

    public void print (){
        Node temp = Head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp =temp.next;

        }
        System.out.println("null");
    }

//     // Search a key in a linked list .return the posotion
//     //where it is found if not found returnll.addFirst(1); -1

//     public int itSearch (int  key ){
//         Node temp = Head;
//         int i =0 ;

//         while( temp != null){
//             if (temp.data == key ){
//                 return i;
//             }
//             temp = temp.next ;
//             i++;

//         }
//         // not key found 
//         return -1;
//     }
//     //Search for a key in a linked list .return list a position where it is found if not fouond return -1 uses recursion 

//     public int helper(Node Head, int key ){
//         if (Head == null){
//             return -1;
//         }
//         if (Head.data == key ){
//             return 0;
//         }
//         int idx= helper(Head.next , key);
//         if(idx ==-1){
//             return -1;
//         }
//         return  idx+1;

//     }
//     public int recSearch (int key ){
//         return helper(Head, key);
//     }

//     // Reverse a linked list 
//     public void Reverse(){
//         Node prev = null;
//         Node curr = Tail = Head;
//         Node next ;

//         while (curr != null){
//             next = curr.next ;
//             curr.next = prev;
//             prev= curr;
//             curr = next ;

//         }
//         Head =prev;

//     }

//     // remove nth node from the endd ...............

//     public void deleteNthNodefromend (int n){
//         int sz =0 ;
//         Node temp=  Head;
//         while(temp != null){
//             temp =temp.next ;
//             sz++;
//         }
//         if (n == sz){
//             Head = Head.next ;
//             return ;
//         }
//         int i =1;
//         int iTOFind  =sz -n;
//         Node prev = Head;
//         while ( i<iTOFind){
//             prev = prev.next;
//             i++;
//         }
        
//         prev.next = prev.next.next;
//         return;
//     }
//     // check a linked list is palindrome or not 
//     /*there are some steps to check the list is palindrome or not 
//      * 1) find midnode
//      * 2) reverse a linked list from mid node 
//      * 3) check leftvalue and right vlaue are equal or not 
//      */
//     private Node findMid(Node Head){
//         Node slow = Head;
//         Node fast = Head;

//         while (fast != null && fast.next != null){

//             slow= slow.next;// +1
//             fast = fast.next.next;//+2
//         }
//         return slow ;// slow is my midddle 
//     }

//     public boolean checkPalindrome (){
//         if (Head == null || Head.next == null){
//             return true;

//         }
//         //Step 1  = find mid 
//         Node  mid = findMid(Head);

//         //step 2 = reverse a linked list from mid ;
//         Node curr  = mid;
//         Node prev = null;
//         Node next;
//         while (curr != null){

//             // reverse step 
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         Node right = prev;
//         Node left = Head;

//         //Step 3 = check i Equal

//         while(right != null ){
//             if(left.data != right.data){
//                 return false ;

//             }
//             left = left.next;
//             right = right.next ;
//         }
//         return true;
//     }
//     public static void main (String agrs []){

//         LinkedList ll = new LinkedList();
//         // ll.print();
//         // ll.addFirst(2);
//         // ll.print();
//         // ll.addFirst(1);
//         // ll.print();
//         // ll.addLast(3);
//         // ll.print();
//         // ll.addFirst(4);
//         // ll.AddMidddle(2, 9);
//         // ll.print();

//         // ll.removeFirst();
//         // ll.print();
//         // System.out.println(ll.itSearch(3));
//         // System.out.println(ll.itSearch(10));

//         //System.out.println(ll.recSearch(3));
//         //System.out.println(ll.recSearch(10));

//         // ll.Reverse();
//         // ll.print();
        
//         // ll.deleteNthNodefromend(3);
// //         // ll.print();

// //         ll.print();
// //         ll.addLast(1);
// //         ll.addLast(2);
// //         //ll.addLast(2);
// //         ll. addLast(2);
        
    
// //         ll.print();
// //         System.out.println(ll.checkPalindrome());

// //     }
    
// // }


// detect  a loop cycle is present or not 

    // public static boolean isCycle(){
    //     Node slow   =Head;
    //     Node fast  = Head ;


    //     while (fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next ;
    //         if (slow == fast ){
    //             return true ;
    //         }
    //     }
    //     return false; 

    // }


    // // detect LoopCycle is present or not and if present then remove the cycle 

    public static void removeCycle(){
        Node slow = Head;
        Node fast = Head;
        boolean cycle = false ;// intialize with false  that means cycle is not formed 

        while(fast != null && fast.next != null ){

            slow = slow.next ;
            fast =fast.next.next ;
            if (slow == fast ){
                cycle =true ; // true here cycle is formed 
                break; 
            }
        }
        if (cycle == false){
            return ;
        }

        // find meeting point 
        slow = Head;
        Node prev = null; 

        while (slow != fast ){
            slow = slow.next;
            fast = fast.next;
            prev = fast;
        }
        prev.next = null;// last.next = null ; remove cycle 

    }


    // merge Sort on lndked list 

    private Node getMid (Node Head){


        Node slow = Head;
        Node fast = Head.next;

        while(fast != null && fast.next != null ){
            slow = slow.next ;
            fast  = fast.next ;

        }
        return slow ;

    }
    private Node merge (Node Head1 , Node Head2){
        Node mergeLL = new Node (-1);
        Node temp = mergeLL;

        while (Head1 != null && Head2 != null){
            if (Head1.data <= Head2.data){
                temp.next = Head1;
                Head1 = Head1.next ;
                temp = temp.next ;

            }else{
                temp.next = Head2;
                Head2 = Head2.next ;
                temp = temp.next ;
            }
        }
        while (Head1 != null ){
            temp.next = Head1;
            Head1 = Head1.next ;
            temp = temp.next ;
        }
        while (Head2 != null){
            temp.next = Head2;
            Head2 = Head2.next ;
            temp = temp.next ;
        }
        return mergeLL.next;

    }

    public Node mergeSort( Node Head){
        if (Head == null || Head.next == null){
            return Head;
        }
        Node  mid = getMid(Head);
        Node rightHead = mid.next;
        mid.next = null ; 
        Node newLeft = mergeSort(Head);
        Node newright = mergeSort(rightHead);

        return merge(newLeft , newright);
    }

    // zig - zag linked list 

    public void zigzig(){

        //find mid 
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid  =slow ;

        // reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = Head;
        Node right = prev;
        Node nextL , nextR;

        // alter merge = zig zag merge 

        while(left != null && right != null ){
            nextL = left.next ;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    
    public static void main (String agrs []){
        
        // Head = new Node(1);
        // Head.next  = new Node (2);
        // Head.next.next = new Node(3);
        // Head.next.next.next = Head;

        // System.out.println(isCycle());

        // //for  remove cycle from LL
        // Head = new Node(1);
        // Node temp = new Node (2);
        // Head.next  = temp;
        // Head.next.next = new Node(3);
        // Head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        

        // for  mergesort

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // 5-> 4-> 3-> 2-> 1;

        ll.print();
        ll.zigzig();
        ll.print();

    }
}



