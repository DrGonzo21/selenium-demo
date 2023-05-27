package Instancevariable;

public class TvMain {
    public static void main(String[] args) {

        Tv tv1 = new Tv();
        System.out.println("TV1 isOn: " + tv1.isOn());
        tv1.turnOn();
        System.out.println("TV1 isOn: " + tv1.isOn());
        tv1.setChannel(60);
        System.out.println("TV1 channel: " + tv1.getChannel());
        tv1.setVolume(50);
        System.out.println("TV1 volume: " + tv1.getVolume());
        tv1.channelUp();
        System.out.println("TV1 channel: " + tv1.getChannel());
        tv1.volumeUp();
        System.out.println("TV1 volume: " + tv1.getVolume());


        Tv tv2 = new Tv(88, 20);
        System.out.println("TV2 isOn: " + tv2.isOn());
        tv2.turnOn();
        System.out.println("TV2 isOn: " + tv2.isOn());
        tv2.setChannel(110);
        System.out.println("TV2 channel: " + tv2.getChannel());
    }

}
