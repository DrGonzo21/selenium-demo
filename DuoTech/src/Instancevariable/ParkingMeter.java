package Instancevariable;

public class ParkingMeter {
    int timeLeft = 0;
    public boolean add(int value){
        if (value ==25) {
            timeLeft += 30;
            return true;
        }else{
            return false;
        }
    }
    public void tick(){
        if (timeLeft > 0){
            timeLeft--;
        }
    }
    public boolean isExpired(){

       return (timeLeft ==0);
        }
    }

