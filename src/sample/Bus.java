package sample;

public class Bus extends Car {
    public static void main(String[] args) {

        // int price;
        Bus bus = new Bus();  // Bus のインスタンスを作成

        bus.speed = 10;  // 初期速度を10km/hに設定
        
        // アクセルを踏む
        bus.stepOnAccele();  // スピードが10 + 10 = 20 km/h になる
        
    }

 }
