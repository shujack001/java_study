public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size(){
        if(rest == null)
        {
            return 1;
        }
        else{
            return 1 + this.rest.size();
        }
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        return 0;
    }

    /** Returns the ith value in this list.*/
    public int get(int i) {
        return 0;
    }

    public void addlast(int x){
       IntList p = this;
       IntList p2 = null;
       while(p != null){
           p.rest = new IntList(p.first * p.first, p.rest);
           p2 = p;
           p = p.rest.rest;
       }
       if(p2 != null) {
           p2.rest.rest = new IntList(x, null);
       }
       }

    public static void main(String[] args) {
        IntList L = new IntList(1, null);
        L = new IntList(2, L);
        L.addlast(5);
        System.out.println(L.size());
    }


}
//public class IntList{
//    public int first;
//    public IntList rest;
//    public IntList(int f, IntList r){
//        first = f;
//        rest = r;
//    }
//
//    public void addAdjacent(){
//        IntList p = this;
//        while(p.rest != null){
//            if(p.first == p.rest.first){
//                p.first = p.first + p.first;
//                p.rest = p.rest.rest;
//            }else {
//                p = p.rest;
//            }
//        }
//    }
//}
