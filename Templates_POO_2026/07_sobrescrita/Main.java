package template07;


// Sobrescrita e polimorfismo: animais
// ADAPTE: Animal/Cachorro/Gato e emitirSom.
class Animal {
    public String emitirSom() { return "Som generico"; }
}
class Cachorro extends Animal {
    @Override public String emitirSom() { return "Au au"; }
}
class Gato extends Animal {
    @Override public String emitirSom() { return "Miau"; }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato(), new Animal() };
        for (Animal animal : animais) {
            // Mesmo tipo da variavel; a implementacao depende do objeto real.
            System.out.println(animal.emitirSom());
        }
    }
}
