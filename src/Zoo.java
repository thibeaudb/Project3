public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird("Papegaai", 2);
        bird.makeSound();

        Mammal mammal = new Mammal("Leeuw", 5);
        mammal.makeSound();

        Reptile reptile = new Reptile("Slang", 3);
        reptile.makeSound();
    }
}
