import devices.Car;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.firstName = "John";
        me.lastName = "Doe";
        me.pet = new Animal("dog");

        System.out.println(" \n \" DOGGO \" \n ");

        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();



        System.out.println(" \n \" CAR \" \n ");

        Car volvo = new Car("volvo", "s90", 200, 2010, 3500.0);
        me.setMachine(volvo);


        System.out.println(" \n \" CAR COMPRASION  \" \n ");
        Car volvo2 = new Car("volvo", "s90", 200, 2010, 35000.0);
        System.out.println("Are they the same cars?");
        System.out.println(volvo == volvo2);

        System.out.println(" \n \" CAR \" \n ");
        System.out.println(volvo);

        System.out.println(" \n \" ANIMAL \" \n ");
        System.out.println(me.pet);
    }
}