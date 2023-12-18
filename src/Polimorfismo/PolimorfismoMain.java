package Polimorfismo;

public class PolimorfismoMain {
    public static void main(String[] args) {
        Animal animal1 = new Perro(); // Instancia de Perro como tipo Animal
        Animal animal2 = new Gato(); // Instancia de Gato como tipo Animal

        animal1.hacerSonido(); // Salida: "Guau! Guau!"
        animal2.hacerSonido(); // Salida: "¡Miau! ¡Miau!"
    }
}
