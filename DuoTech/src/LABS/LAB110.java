package LABS;
import java.util.Random;

public class LAB110 {
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        private static int noOfFans = 0;

        private int speed;
        private boolean isOn;
        private double radius;
        private String color;
        private String manufacturer;
        private String productId;

        public LAB110() {
            this(SLOW, false, 5, "blue");
        }

        public LAB110(int speed, boolean isOn, double radius, String color) {
            this.speed = speed;
            this.isOn = isOn;
            this.radius = radius;
            this.color = color;
            this.manufacturer = "WhirlWind";
            this.productId = generateProductId();
            noOfFans++;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setIsOn(boolean isOn) {
            this.isOn = isOn;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getProductId() {
            return productId;
        }

        public static int getNoOfFans() {
            return noOfFans;
        }

        private String generateProductId() {
            Random rand = new Random();
            int num = rand.nextInt(900) + 100;
            return manufacturer + num;
        }

    }

