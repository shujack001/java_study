public class Doglauncher {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(9), new Dog(10)};
        dogs[0].makeNoise();
        dogs[1].makeNoise();
    }
}