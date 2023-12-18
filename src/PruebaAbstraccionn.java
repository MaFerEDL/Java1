//public class Abstraccion {
    // Definición de una clase abstracta
    abstract class Forma {
        abstract void dibujar();
    }

    // Clases que extienden la clase abstracta y proporcionan implementación
    class Circulo extends Forma {
        void dibujar() {
            System.out.println("Dibujando un círculo");
        }
    }

    class Cuadrado extends Forma {
        void dibujar() {
            System.out.println("Dibujando un cuadrado");
        }
    }

    public class PruebaAbstraccionn {
        public static void main(String[] args) {
            Forma miCirculo = new Circulo();
            Forma miCuadrado = new Cuadrado();

            miCirculo.dibujar(); // Salida: Dibujando un círculo
            miCuadrado.dibujar(); // Salida: Dibujando un cuadrado
        }
    }

//}
