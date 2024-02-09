import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;


//         }
//     }
//     public static void main (String  args [] ){

//         int v =5;
//         ArrayList<Edge>[] graph = new ArrayList[v];

//         for (int i=0; i<v; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add (new Edge(0, 1, 5));

//         graph[1].add(new Edge(1,0, 5));
//         graph[1].add(new Edge(1,2, 1));
//         graph[1].add(new Edge(1,3, 3));

//         graph[2].add(new Edge(2,1, 1));
//         graph[2].add(new Edge(2,3, 1));
//         graph[2].add(new Edge(2,4, 2));

//         graph[3].add(new Edge(3,1, 3));
//         graph[3].add(new Edge(3,2, 1));

//         graph[4].add(new Edge(4,2, 2));
        
        
//         for (int i=0 ; i<graph[2].size() ; i++){
//             Edge e= graph[2].get(i);   
//             System.out.println(e.wt);     
//         }



//     }
// }

/****************************************************************** */

// Bfs 

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;


//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
        

//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add (new Edge(0, 1, 1));

//         graph[1].add(new Edge(1,0, 1));
//         graph[1].add(new Edge(1,2, 1));
//         graph[1].add(new Edge(1,3, 1));

//         graph[2].add(new Edge(2,1, 1));
//         graph[2].add(new Edge(2,3, 1));
//         graph[2].add(new Edge(2,4, 1));

//         graph[3].add(new Edge(3,1, 1));
//         graph[3].add(new Edge(3,2, 1));

//         graph[4].add(new Edge(4,2, 1));
        
        
        
    
//     }
//     public static void bfs (ArrayList<Edge>[]  graph ){

//         Queue <Integer> q = new LinkedList<>();
//         boolean visit []  = new boolean[graph.length];
//         q.add(0);

//         while (!q.isEmpty()){
//             int curr = q.remove ();

//             if (!visit[curr]){
//                 System.out.println(curr +" ");
//                 visit[curr] = true;
//                 for (int i =0; i< graph[curr].size(); i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }

//     }
//     public static void main (String  args [] ){

//         int v =5;
//         ArrayList<Edge>[] graph = new ArrayList[v];
//         CreateGraph(graph);
//         bfs (graph);

 //   }
//}

/***********************************************************8 */
// dfs

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;


//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
        

//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add (new Edge(0, 1, 1));
//         graph[0].add (new Edge(0, 2, 1));

//         graph[1].add(new Edge(1,0, 1));
//         graph[1].add(new Edge(1,3, 1));
        

//         graph[2].add(new Edge(2,0, 1));
//         graph[2].add(new Edge(2,4, 1));
        

//         graph[3].add(new Edge(3,1, 1));
//         graph[3].add(new Edge(3,4, 1));
//         graph[3].add (new Edge(3, 5, 1));

//         graph[4].add(new Edge(4,2, 1));
//         graph[4].add(new Edge(4,3, 1));
//         graph[4].add(new Edge(4,5, 1));

//         graph[5].add(new Edge(5,3, 1));
//         graph[5].add(new Edge(5,4, 1));
//         graph[5].add(new Edge(5,6, 1));
        
        
//         graph[6].add(new Edge(6,5, 1));
        
    
//     }
//     public static void bfs (ArrayList<Edge>[]  graph ){

//         Queue <Integer> q = new LinkedList<>();
//         boolean visit []  = new boolean[graph.length];
//         q.add(0);

//         while (!q.isEmpty()){
//             int curr = q.remove ();

//             if (!visit[curr]){
//                 System.out.println(curr +" ");
//                 visit[curr] = true;
//                 for (int i =0; i< graph[curr].size(); i++){
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }

//     }
//     public static void dfs (ArrayList<Edge>[]  graph ,int curr , boolean visit[] ){
//         // visit
//         System.out.print(curr +" ");
//         visit[curr]= true;

//         for (int i= 0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);

//             if (!visit[e.dest]){
//                 dfs(graph , e.dest , visit );
//             }
//         }
//     }
//     public static void main (String  args [] ){

//         int v =7;
//         ArrayList<Edge>[] graph = new ArrayList[v];
//         CreateGraph(graph);
//         dfs(graph , 0, new boolean [v]);

//     }
// }

/************************************************************************ */
// haspath 
// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;


//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
        

//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add (new Edge(0, 1, 1));
//         graph[0].add (new Edge(0, 2, 1));

//         graph[1].add(new Edge(1,0, 1));
//         graph[1].add(new Edge(1,3, 1));
        

//         graph[2].add(new Edge(2,0, 1));
//         graph[2].add(new Edge(2,4, 1));
        

//         graph[3].add(new Edge(3,1, 1));
//         graph[3].add(new Edge(3,4, 1));
//         graph[3].add (new Edge(3, 5, 1));

//         graph[4].add(new Edge(4,2, 1));
//         graph[4].add(new Edge(4,3, 1));
//         graph[4].add(new Edge(4,5, 1));

//         graph[5].add(new Edge(5,3, 1));
//         graph[5].add(new Edge(5,4, 1));
//         graph[5].add(new Edge(5,6, 1));
        
        
//         graph[6].add(new Edge(6,5, 1));
        
    
//     }
//     public static boolean haspath (ArrayList<Edge>[] graph , int src , int dest, boolean visit[]){

//         if (src == dest){
//             return true ;

//         }
//         visit[src] = true;
//         for (int i= 0; i<graph[src].size(); i++){
//             Edge e = graph[src].get(i);
//             //e.dest = neighbour

//             if (!visit[e.dest] && haspath(graph, e.dest ,dest, visit) ){
//                 return true;

//             }
//         }
//         return false; 

//     }
//     public static void main (String  args [] ){

//         int v =7;
//         ArrayList<Edge>[] graph = new ArrayList[v];
//         CreateGraph(graph);
        
//         System.out.print(haspath(graph ,0,7 ,new boolean[v]));
//     }
// }


/*************************************************************************************/
// CYCLE DETECTION FOR DIRECTED GRAPH

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
        

//         public Edge ( int s, int d){
//             this. src = s ;
//             this. dest = d ;
            

//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
        

//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add(new Edge( 0, 2));

//         graph[1].add(new Edge( 1, 0));

//         graph[2].add(new Edge( 2, 3));

//         graph[3].add(new Edge( 3, 0));
        

        
    
//     }
//     public static boolean isCycle (ArrayList<Edge>[] graph){
//         boolean vis [] = new boolean [graph.length];
//         boolean stack [] = new boolean[graph.length];

//         for (int i=0; i<graph.length; i++){
//             if (!vis[i]){
//                 if (isCycleutil (graph,i,vis,stack));
//                 return true;

//             }
//         }
//         return false;


//     }
//     public static boolean isCycleutil(ArrayList<Edge>[] graph , int curr , boolean vis[] ,boolean stack[]){

//         vis[curr] = true ;
//         stack[curr] = true;

//         for (int i= 0; i<graph[curr].size(); i++){
//             Edge e =graph[curr].get(i);
//             if (stack[e.dest]){
//                 return true ;

//             }
//             if (!vis[e.dest] && isCycleutil(graph, e.dest, vis, stack)){
//                 return true;

//             }
//         }
//         stack[curr] = false;
//         return false;  


//     }
//     public static void main (String  args [] ){

//         int v =4;
//         ArrayList<Edge>[] graph = new ArrayList[v];
//         CreateGraph(graph);
        
//         System.out.print(isCycle(graph));
//     }
// }

/********************************************************************** */
// bellmen ford algorithm


// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;
        

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;
            

//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add(new Edge( 0, 1 ,2));
//         graph[0].add(new Edge( 0, 2 ,4));

//         graph[1].add(new Edge( 1,2,-4));

        
//         graph[2].add(new Edge( 2,3,2));

//         graph[3].add(new Edge( 3,4,4));

//         graph[4].add(new Edge( 4,1,-1));
//     } 

    // public static void bellmenDFord(ArrayList<Edge> graph [], int src ){
    //     int dist [] = new int [graph.length ];
    //     for (int i=0; i< dist.length; i++){
    //         if (i != src){
    //             dist[i]= Integer.MAX_VALUE;

    //         }
    //     }
    //     int  V =graph.length;

    //     // algo
    //     for (int i =0 ; i<V-1 ; i++){
    //         //edges - O(E)
    //         for (int j=0; j< graph.length; j++){
    //             for (int k=0; k<graph[j].size(); k++){
    //                 Edge e = graph[j].get(i);


    //                 int u =e.src;
    //                 int v = e.dest;
    //                 int wt = e.wt;

//                     //relaxatition 
//                     if( dist[u] !=  Integer.MAX_VALUE && dist[u] + wt <dist[v]){
//                         dist[v] = dist[u] +wt;
//                     }
//                 }
//             }
//         }
    

//          // print 
//         for (int i=0 ; i<dist.length; i++){
//             System.out.print(dist[i]+" ");

//         }   
//         System.out.println();
//     }
//     public static void main (String [] args){
//         int  V = 5;
//         ArrayList<Edge> graph [] = new ArrayList[V];
//         CreateGraph(graph);
//         bellmenDFord(graph, 0);
//     }
// }
    
    

//**************************************************************************************************** */
// Minimum spanning tree (Prims algorithm);

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;
        

//         public Edge ( int s, int d, int w){
//             this. src = s ;
//             this. dest = d ;
//             this.wt = w;
            

//         }
//     }
//     public static void CreateGraph (ArrayList<Edge>[] graph ){
       
//         for (int i=0; i<graph.length; i++){
//              graph[i] = new ArrayList<>();

//         }
//         graph[0].add(new Edge( 0, 1 ,10));
//         graph[0].add(new Edge( 0, 2 ,15));
//         graph[0].add(new Edge( 0, 3 ,30));


//         graph[1].add(new Edge( 1, 0, 10));
//         graph[1].add(new Edge( 1, 3, 40));
        

        
//         graph[2].add(new Edge( 2, 0, 15));
//         graph[2].add(new Edge( 2, 3, 50));


//         graph[3].add(new Edge( 3, 1, 40));

//         graph[3].add(new Edge( 3, 2, 50));
//     } 
//     public  class Pair {
//         int v ;
//         int cost;
         
//         public Pair imple (int v, int c ){
//             this.v = v;
//             this.cost = c;

//         }
//     }

//     public static void prims (ArrayList<Edge> graph []){
//         boolean vis [] = new boolean[graph.length];
//         PriorityQueue< Pair > pq = new PriorityQueue<>();
//     }

//     public static void main(String args [] ){
//         int v =4;
//         ArrayList <Edge> graph [] = new ArrayList[v];
//         CreateGraph(graph);

//     }

// }
/*************************************************************** */
// connecting cities 


public class Graph{
    static class Edge implements Comparable<Edge> {

        int  dest ;
        int cost ;

        public Edge (int d ,int c){
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo( Edge e2){
            return this.cost - e2.cost;
        }
    }

    public static int connectcities (int cities [][]){
        PriorityQueue<Edge> pq  =new PriorityQueue<>();
        boolean vis []= new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalcost =0;

        while (!pq.isEmpty()){
            Edge curr = pq.remove();

            if (!vis[curr.dest]){
                vis[curr.dest] = true;
                finalcost += curr.cost;

                for (int i=0; i<cities[curr.dest].length; i++){
                    if (cities[curr.dest] [i] != 0){
                        pq.add(new Edge(i ,cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }
    public static void main (String args [] ){
        int cities [][] = {{0, 1, 2 , 3 , 4},
                          {1 , 0, 5 , 0, 7},
                          {2 , 5, 0, 6 , 0},
                          {3 , 0 , 6, 0 , 0},
                          {4 ,7 , 0, 0 , 0}};
        System.out.println(connectcities(cities));
    }
}