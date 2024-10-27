public class Car{
    String model;
    int wheels;
    public Car(String m){
        this.model = m;
        this.wheels = 4;
    }
    public void drive(){
        if(this.wheels < 4){
            System.out.println(this.model + " no go vroom");
        }else{
            System.out.println(this.model + " goes vroom");
        }
    }
    public int getNumWheels(){
        return this.wheels;
    }
    public void driveIntoDitch(int wheelslost){
        this.wheels = this.wheels - wheelslost;
    }
    public static void main(String[] args){
        Car c1 = new Car("xiaomi su7");
        Car c2 = new Car("xiaomi si7 utral");
        c1.drive();
        c1.driveIntoDitch(2);
        c1.drive();
        System.out.println(c2.getNumWheels());
    }
}