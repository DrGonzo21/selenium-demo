package Instancevariable;

public class Tv{

    int channel;
    int volume;
    boolean isOn;


    public Tv() {
        this.channel = 1;
        this.volume = 1;
        this.isOn = false;
    }
    public Tv(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = false;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
    public void setChannel(int newChannel) {
        if (this.isOn && newChannel >= 1 && newChannel <= 120) {
            this.channel = newChannel;
        }
    }
    public void setVolume(int newVolumeLevel) {
        if (this.isOn && newVolumeLevel >= 1 && newVolumeLevel <= 50) {
            this.volume = newVolumeLevel;
        }
    }
    public void channelUp() {
        if (this.isOn && this.channel < 120) {
            this.channel++;
        }
    }


    public void channelDown() {
        if (this.isOn && this.channel > 1) {
            this.channel--;
        }
    }
    public void volumeUp() {
        if (this.isOn && this.volume < 50) {
            this.volume++;
        }
    }
    public void volumeDown() {
        if (this.isOn && this.volume > 1) {
            this.volume--;
        }
    }
    public int getChannel() {
        return this.channel;
    }
    public int getVolume() {
        return this.volume;
    }
    public boolean isOn() {
        return this.isOn;
    }
}