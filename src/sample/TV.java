package sample;

public class TV {
   public int channel;

    public void ChangeChannel(int channel){
        if(channel <= 0 || 13 <= channel){
            System.out.println("1～12までの間で設定してください");
            return;
        }
     this.channel = channel;
        System.out.println(this.channel + "チャンネルに切り替わりました");

    }

}
