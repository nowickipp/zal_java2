public class Animal {
    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = 20.0;
            case "cat":
                this.weight = 2.5;
        }
    }

    boolean isAlive() {
        return this.weight >= 0;
    }

    boolean isObese() {
        return  this.weight < 25;
    }

    public void feed() {
        if (isAlive()) {
            this.weight++;
            System.out.println("Yum Yum Yum, Your animal weight is: " + this.weight + " kg");
        }

    }

    public void takeForAWalk() {
        if (isAlive()) {
            this.weight--;
            System.out.println("I'm a ha-ppy ha-ppy dog, yes I'm a happy happy happy dog. Your animal weight is: " + this.weight + " kg");
        }
        else System.out.println("Dude, your pet will unfortunately not go anywhere anymore!");
    }
}


