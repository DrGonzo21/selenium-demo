package LABS;

public class LAB110Tester{
    public static void main(String[] args) {

            LAB110 fan1 = new LAB110();
            LAB110 fan2 = new LAB110(3, true, 10, "green");

            System.out.println("Fan 1: speed=" + fan1.getSpeed() + ", isOn=" + fan1.isOn() +
                    ", radius=" + fan1.getRadius() + ", color=" + fan1.getColor() +
                    ", manufacturer=" + fan1.getManufacturer() + ", productId=" + fan1.getProductId());

            System.out.println("Fan 2: speed=" + fan2.getSpeed() + ", isOn=" + fan2.isOn() +
                    ", radius=" + fan2.getRadius() + ", color=" + fan2.getColor() +
                    ", manufacturer=" + fan2.getManufacturer() + ", productId=" + fan2.getProductId());

            System.out.println("No. of fans created: " + LAB110.getNoOfFans());
        }
    }

