public class DataTypes {
    int[] numeros = {1, 2, 3, 4, 5};
    String[] nombres = {"Juan", "María", "Carlos"};

    public void datatypesMethod() {
        // Declaración e inicialización de un array de enteros


        // Declaración de un array de cadenas
        // String[] nombres;
        // String[] nombres;

// Inicialización de un array de cadenas
        // String[] nombres = new String[]{"Juan", "María", "Carlos"};

// Acceso a elementos del array
        System.out.println("El primer número es: " + numeros[0]);  // Imprime: El primer número es: 1
        System.out.println("El segundo nombre es: " + nombres[1]); // Imprime: El segundo nombre es: María

// Modificación de un elemento del array
        numeros[2] = 10;

        // Obtención de la longitud del array
        int longitudNumeros = numeros.length;
        int longitudNombres = nombres.length;

        System.out.println(numeros[2]);
        System.out.println(longitudNumeros);
        System.out.println(longitudNombres);

    }
}