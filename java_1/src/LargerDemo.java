public class LargerDemo {
    public static int larger(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] argvs){
        System.out.println(larger(8,10));
    }
}
