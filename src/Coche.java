//public class Encapsulamiento {
    public class Coche {
        private String marca;
        private String modelo;
        private int velocidadMaxima; // Variable privada

    public Coche() {
    }

    public Coche(String marca, String modelo, int velocidadMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadMaxima = velocidadMaxima;
        }

        // Getter para obtener la velocidad máxima

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int obtenerVelocidadMaxima() {
            return velocidadMaxima;
        }

        // Setter para establecer la velocidad máxima
        public void establecerVelocidadMaxima(int nuevaVelocidad) {
           this.velocidadMaxima = nuevaVelocidad;
        }

        public static void main(String[] args) {
            // Crear un objeto de la clase Coche
          Coche miCoche = new Coche("Toyota", "Corolla", 180);

           // Coche miCoche = new Coche();
            // Acceder a la velocidad máxima utilizando el getter
            System.out.println("Velocidad máxima: " + miCoche.obtenerVelocidadMaxima());

            // Intentar cambiar la velocidad máxima directamente (esto funcionará gracias al setter)
            miCoche.establecerVelocidadMaxima(200);
            System.out.println("Nueva velocidad máxima: " + miCoche.obtenerVelocidadMaxima());
        }
    }
//}
