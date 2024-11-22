public class Max {
    public static Comparable max(Comparable[] items){
        int maxDex = 0;
        for (int i = 0; i < items.length; i += 1) {
            int compare = items[maxDex].compareTo(items[i]);
            if(compare < 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("Benjamin", 15)};
        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();
//        String[] a = {"nihao", "wobuhao"};
//        String c = (String) max(a);
//        System.out.println(c);
    }
}
