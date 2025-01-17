package sample;

public class Taxi extends Car {

    int price;

    void payment(){
     System.out.println("料金を" + price +"円支払われました");
        price = 0;


}
}
