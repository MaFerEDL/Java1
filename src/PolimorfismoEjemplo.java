
    class Animal {
        public void hacerSonido() {
            System.out.println("Haciendo algún sonido");
        }
    }

    // Clase derivada: Perro
    class Perro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Guau! Guau!");
        }
    }

    // Clase derivada: Gato
    class Gato extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("Miau Miau");
        }
    }

        public class PolimorfismoEjemplo {
            public static void main(String[] args) {
                Animal animal1 = new Perro(); // Instancia de Perro como tipo Animal
                Animal animal2 = new Gato(); // Instancia de Gato como tipo Animal

                animal1.hacerSonido(); // Salida: "Guau! Guau!"
                animal2.hacerSonido(); // Salida: "¡Miau! ¡Miau!"
            }
        }


