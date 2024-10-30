public class Dog {
    public int weightInPounds;
    public Dog(int n){
        weightInPounds = n;
    }
    public void makeNoise(){
        if(weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        }else {
            System.out.println("woof");
        }

    }

    public static Dog maxdog(Dog d1, Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        }else{
            return d2;
        }
    }

    public Dog maxdog(Dog d2){
        if(this.weightInPounds > d2.weightInPounds){
            return this;
        }else{
            return d2;
        }
    }

    public static void main(String[] args){
        Dog d1 = new Dog(10);
        Dog d2 = new Dog(100);
        Dog.maxdog(d1,d2).makeNoise();
        d2.maxdog(d2).makeNoise();


    }
}