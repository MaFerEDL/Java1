package TESTNG_workshop;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataProviderCSV {

    @DataProvider(name = "datosDesdeCSV")
    public Object[][] obtenerDatosDesdeCSV() {
        String csvFilePath = "C:/Users/mxmluna/Documents/datos.csv";
        List<String[]> datos = new ArrayList<>();
    //BufferedReader es una clase en Java que se utiliza para leer texto de una secuencia de entrada (como archivos, flujos de entrada, etc.)
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String linea;

    //Depuración de datos
            while ((linea = br.readLine()) != null) {
                // Dividir la línea por comas y almacenar los datos en un array
                String[] datosLinea = linea.split(",");
                datos.add(datosLinea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir la lista de arrays en una matriz de objetos para el DataProvider
        Object[][] datosArray = new Object[datos.size()][];
        for (int i = 0; i < datos.size(); i++) {
            datosArray[i] = datos.get(i);
        }

        return datosArray;
    }

    @Test(dataProvider = "datosDesdeCSV")
    public void pruebaUsandoDatosCSV(String nombre, String edad, String ciudad) {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Ciudad: " + ciudad);

    }
}

