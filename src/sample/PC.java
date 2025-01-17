package sample;

public class PC implements Electrical{

    private boolean powerOn;

    public boolean isPower() {
        return powerOn;
    }

    public void setPower(boolean power) {
        this.powerOn = power;
    }

    @Override
    public void power() {

    if (powerOn = true){
        //テレビの電源を切る

     System.out.println("PCの電源が切れました");
    }

    if (powerOn = false){
        System.out.println("設定ファイルを読み込んでいます");
        powerOn = true;
        System.out.println("PCの電源が入りました");
    }
}
}


