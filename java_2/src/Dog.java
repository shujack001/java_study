public class Dog {

    public int weightInPounds;
    public static String binomen = "happydog";
    public Dog(int m){
        weightInPounds = m;
    }
    public void makeNoise(){
        if(weightInPounds < 10){
            System.out.println("yipyipyip!");
        }else if (weightInPounds < 30){
            System.out.println("bark. bark.");
        }else {
            System.out.println("woof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){
            return d1;
        }else{
            return d2;
        }

    }

    public Dog maxDog(Dog d2){
        if(this.weightInPounds > d2.weightInPounds){
            return this;
        }else {
            return d2;
        }

    }
}
