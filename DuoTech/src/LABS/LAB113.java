package LABS;

public class LAB113 {
    private  int currentFloor;
    private final int numberOfFloors;
    private boolean doorOpen;

    public LAB113(int numberOfFloors) {
        this.currentFloor = 1;
        this.numberOfFloors = numberOfFloors;
        this.doorOpen = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor() {
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }


    public void goUp(int desiredFloor) {
        if (!doorOpen && desiredFloor <= numberOfFloors) {
            currentFloor = Math.min(desiredFloor, numberOfFloors);
        }
    }

    public void goDown(int desiredFloor) {
        if (!doorOpen && desiredFloor >= 1) {
            currentFloor = Math.max(desiredFloor, 1);
        }
    }
}

