//public class Interface {
    // Definición de una interfaz
    interface IAnimal {
        void hacerSonido();
    }

    // Clase que implementa la interfaz
    class Perroo implements IAnimal {
        public void hacerSonido() {
            System.out.println("El perro hace 'Guau guau'");
        }
    }

    class Gatoo implements IAnimal {
        public void hacerSonido() {
            System.out.println("El gato hace 'Miau miau'");
        }
    }

    public class PruebaAbstraccion {
        public static void main(String[] args) {
            IAnimal miPerro = new Perroo();
            IAnimal miGato = new Gatoo();

            miPerro.hacerSonido(); // Salida: El perro hace 'Guau guau'
            miGato.hacerSonido();  // Salida: El gato hace 'Miau miau'
        }
    }

//}
