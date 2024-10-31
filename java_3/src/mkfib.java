public class mkfib {
//    public static int fib(int n){
//        if(n <= 1){
//            return n;
//        }
//        int[] arr = new int[n];
//        arr[0] = 0;
//        arr[1] = 1;
//        for(int i = 2; i < n; i++){
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//        return arr[n - 1];
//    }
    public static int fib(int n, int f0, int f1){
      if(n == 0) {
          return f0;
      }else if(n == 1){
          return f1;
      }else{
          return fib(n - 1, f1, f0 + f1);
      }
    }
    public static void main(String[] args){
        System.out.println(fib(7, 0, 1));
    }
}
