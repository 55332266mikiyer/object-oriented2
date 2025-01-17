package sample;

public class Car {
    protected int speed;
    protected String name;
    protected int payment;
    protected int price;
    private boolean flag;


    public boolean isFlag() {
        return flag;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public int getPayment() {
        return payment;
    }

    public int getPrice() {
        return price;
    }

   
    public Car(){

    }

    public Car(int speed, String name){
         this.speed = speed;
         this.name = name;

    }

    void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hになりました");


    }

    void payment(){
        System.out.println("料金が");
    }

    void stepOnBreke(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");

    }

}
