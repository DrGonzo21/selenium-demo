package Notes;

public class Car {
    int instanceCount;
    static int staticCount;




public Car(){
    staticCount++;
    instanceCount++;
}

    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println(car1.instanceCount);
        System.out.println(car1.staticCount);

        Car car2 = new Car();
        System.out.println(car2.instanceCount);
        System.out.println(car2.staticCount);

        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        System.out.println(car5.instanceCount);
        System.out.println(car5.staticCount);

    }

}
