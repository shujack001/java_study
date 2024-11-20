public class Test {
    public static void method(Object t) {
        System.out.println("Its an object");
    }
    public static void method(Test t) {
        System.out.println("Its a test");
    }
    public static void main(String[] args) {
        Test t = new Test();
        method(t);
        method((Object) t);
    }
}
