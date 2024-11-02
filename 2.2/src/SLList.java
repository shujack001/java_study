public class SLList {

    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    /** The first item (if it exists) is at sentinel.next.*/
    private IntNode sentinel;
    private int size;

    public SLList(){
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x){
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** add an item to the front of the list*/
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** return the first item int the list*/
    public int getfirst(){
        return sentinel.next.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        size += 1;
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** return the size of list that starts at IntNode p*/
//    private static   int size(IntNode p){
//        if(p.next == null){
//            return 1;
//        }else{
//            return size(p.next) + 1;
//        }
//    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
//        return size(first);
        return size;

    }
    public static void main(String[] argvs){
        SLList L = new SLList();
//        L.addFirst(10);
//        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }
}
//你好