package Polimorfismo;

public class Animal {
    String nombre;
    Double especie;
    int ID;

    public Animal() {
    }

    public Animal(String nombre, Double especie, int ID) {
        this.nombre = nombre;
        this.especie = especie;
        this.ID = ID;
    }

    public Animal(int ID) {
        this.ID = ID;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(Double especie) {
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("Haciendo algún sonido");
    }
}
