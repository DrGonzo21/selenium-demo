package LABS;

public class LAB109Tester {

    public static void main(String[] args) {
        LAB109 meter = new LAB109(120);
        boolean addedTime = meter.add(25);

        if(addedTime){
            System.out.println("Added 30 minutes to the meter. " + "\n" + "True");
        }else {
            System.out.println("Could not add time to the meter " + "\n" + "False");
            meter.tick();
        }
            if(meter.isExpired()){
                System.out.println("The meter expired. ");
            }else{
                System.out.println("The meter has " + meter.timeLeft + " minutes left");
            }
        }
    }

