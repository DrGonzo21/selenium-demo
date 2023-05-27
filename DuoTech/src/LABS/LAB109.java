package LABS;

public class LAB109 {
    int timeLeft;
    int maxTime;

    public LAB109(int maxTime){
        this.maxTime = maxTime;
        this.timeLeft = 0;
    }
    public boolean add(int value){
        if(value == 25 && timeLeft + 30 <= maxTime){
            timeLeft += 30;
            return true;
        }else{
            return false;
        }
    }
    public void tick(){
        if(timeLeft > 0){
            timeLeft --;
        }
    }
    public boolean isExpired(){
        return timeLeft == 0;
    }


}
