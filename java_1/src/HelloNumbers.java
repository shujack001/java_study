public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int temp = 0;
        while (x < 10) {
            System.out.print(x + " ");
            temp = temp + 1;
            x = x + temp ;
        }
    }
}