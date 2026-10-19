// Clase base para el cálculo de envíos (Cerrada para modificación, abierta a extensión)
abstract class CalculadorEnvio {
    public abstract void calcularCosto(double pesoKg);
}

// Extensión para envíos nacionales
class EnvioNacional extends CalculadorEnvio {
    @Override
    public void calcularCosto(double pesoKg) {
        System.out.println("Calculando costo de envío nacional para " + pesoKg + " kg.");
    }
}

// Extensión añadida posteriormente (sin modificar la clase base ni el código existente)
class EnvioInternacional extends CalculadorEnvio {
    @Override
    public void calcularCosto(double pesoKg) {
        System.out.println("Calculando costo de envío internacional para " + pesoKg + " kg.");
    }
}

public class OCP {
    public static void main(String[] args) {
        EnvioNacional envioNacional = new EnvioNacional();
        EnvioInternacional envioInternacional = new EnvioInternacional();

        procesarEnvio(envioNacional, 5.5);      // Calculando costo de envío nacional...
        procesarEnvio(envioInternacional, 2.0); // Calculando costo de envío internacional...
    }

    // Función genérica para procesar cualquier tipo de envío de forma polimórfica
    public static void procesarEnvio(CalculadorEnvio calculador, double pesoKg) {
        calculador.calcularCosto(pesoKg);
    }
}