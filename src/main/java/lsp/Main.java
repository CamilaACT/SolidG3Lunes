package lsp;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((Walker) dog).walk();  

        fish.makeSound();
        
    }
}
