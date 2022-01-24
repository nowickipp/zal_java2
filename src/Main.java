
public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        me.firstName = "Paweł";
        me.lastName = "Nowicki";
        me.pet = new Animal("dog");

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

    }
}