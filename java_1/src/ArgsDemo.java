public class ArgsDemo {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        int len = args.length;
        while(i < len){
            sum += Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}
