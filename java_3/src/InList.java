public class InList {
    public int first;
    public InList rest;

    public InList(int f, InList r){
        first = f;
        rest = r;
    }

    public int size(){
        if(rest == null){
            return 1;
        }else{
            return 1 + rest.size();
        }
    }

    public int iterativeSize(){
        InList p = this;
        int sum = 0;
        while(p != null){
            sum++;
            p = p.rest;
        }
        return sum ;

    }

    public int get(int i){
        if(i == 0){
            return first;
        }else{
            return rest.get(i - 1);
        }

    }
    public static void main(String[] args){
       InList L = new InList(15, null);
       L = new InList(10, L);
       L = new InList(5, L);
       System.out.printf("size: %d iterativeSize: %d first: %d", L.size(), L.iterativeSize(), L.get(2));

    }

}
