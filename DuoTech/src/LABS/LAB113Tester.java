package LABS;

public class LAB113Tester {
    public static void main(String[] args) {


            LAB113 elevator = new LAB113(10);
            System.out.println("Current floor: " + elevator.getCurrentFloor());
            System.out.println("Number of floors: " + elevator.getNumberOfFloors());
            System.out.println("Door open: " + elevator.isDoorOpen());

            elevator.goUp(5);
            System.out.println("Current floor: " + elevator.getCurrentFloor());

            elevator.openDoor();
            System.out.println("Door open: " + elevator.isDoorOpen());

            elevator.goDown(3);
            System.out.println("Current floor: " + elevator.getCurrentFloor());

            elevator.closeDoor();
            System.out.println("Door open: " + elevator.isDoorOpen());

            elevator.goDown(3);
            System.out.println("Current floor: " + elevator.getCurrentFloor());
        }
    }


