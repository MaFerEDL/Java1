package TESTNG_workshop;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    // Definición del método de proveedor de datos
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "Datos 1", 1 },
                { "Datos 2", 2 },
                { "Datos 3", 3 }
        };
    }

    // Método de prueba que utiliza el proveedor de datos
    @Test(dataProvider = "data-provider")
    public void testMethod(String data, int value) {
        System.out.println("Datos: " + data + ", Valor: " + value);
        // Lógica de la prueba con los datos proporcionados
    }
}
