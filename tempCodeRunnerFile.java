
    }
    public static void main (String args [] ){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversal(q);

        while (!q.isEmpty()){
            System.out.println(q.remove() +" ");
