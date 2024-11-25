import java.util.Comparator;

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
        Comparator<Dog> nc = Dog.getNameComparator();
        Dog d1 = new Dog("Elyse", 3);
        Dog d2 = new Dog("shu", 4);
        if(nc.compare(d1, d2) > 0){
            d1.bark();
        }else{
            d2.bark();
        }
    }
}
