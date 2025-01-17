package sample;

public class InstantiateTaxi {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();

        taxi.speed = 0;
        taxi.name = "タクシー仕様のプリウス";

        taxi.stepOnAccele();
        taxi.stepOnAccele();
        taxi.stepOnBreke();

        System.out.println(taxi.name + "は" + taxi.speed + "km/hです");
    }

}
