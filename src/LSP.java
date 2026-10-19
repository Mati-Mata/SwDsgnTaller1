import java.util.*;

// Clase base para cajas rectangulares
class Caja {
    protected double ancho;
    protected double alto;

    public Caja(double a, double h) {
        ancho = a;
        alto = h;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double a) {
        ancho = a;
    }

    public void setAlto(double h) {
        alto = h;
    }
}

// Clase derivada para cajas cúbicas (fuerza la igualdad en ambas dimensiones)
class CajaCubica extends Caja {
    public CajaCubica(double lado) {
        super(lado, lado);
    }

    @Override
    public void setAncho(double a) {
        ancho = alto = a; // Modifica ambos lados por la naturaleza de un cubo
    }

    @Override
    public void setAlto(double h) {
        ancho = alto = h; // Modifica ambos lados
    }
}

public class LSP {
    public static void main(String[] args) {
        CajaCubica caja = new CajaCubica(5);
        caja.setAncho(10);
        System.out.println("Área de la caja: " + caja.calcularArea()); // Imprime 100 en lugar del comportamiento esperado de un rectángulo genérico
    }
}