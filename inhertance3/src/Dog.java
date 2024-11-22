public class Dog implements Comparable<Dog>{
    public String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    @Override
    public int compareTo(Dog o){
        return this.size - o.size;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }
}
