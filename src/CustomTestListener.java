import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Iniciando prueba: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Prueba exitosa: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Prueba fallida: " + result.getName());
    }

    // Implementa otros métodos según sea necesario
}
