public class list {
    public int first;
    public list rest;
    public list(int f, list r){
        this.first = f;
        this.rest = r;
    }

    public int size(){
        if(rest == null)
        {
            return 1;
        }
        else{
            return 1 + this.rest.size();
        }
    }

    public int get(int i){
        if(i == 0)
        {
            return first;
        }
        else{
            return rest.get(i - 1);
        }
    }
    public int iterativeSize(){
        list p = this;
        int total = 0;
        while(p != null){
            total += 1;
            p = p.rest;
        }
        return total;
    }

    public static void main(String[] args){
        list l = new list(5, null);
        l = new list(10, l);
        l = new list(15, l);
        System.out.println(l.get(1));
        System.out.println((l.size()));

    }
}
