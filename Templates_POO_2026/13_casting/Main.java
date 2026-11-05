package template13;


// instanceof e conversão de tipo
// ADAPTE: Animal/Cachorro e o método exclusivo buscarBolinha.
class Animal { public String som() { return "Som"; } }
class Cachorro extends Animal {
    @Override public String som() { return "Au au"; }
    public String buscarBolinha() { return "Buscou a bolinha"; }
}
class Gato extends Animal { @Override public String som() { return "Miau"; } }

public class Main {
    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato() };
        for (Animal animal : animais) {
            System.out.println(animal.som());
            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal; // Converte so depois de verificar.
                System.out.println(cachorro.buscarBolinha());
            }
        }
    }
}
