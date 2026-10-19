// Clase exclusiva para la reparación de vehículos
class Mecanico {
    public void repararVehiculo() {
        System.out.println("Reparando el vehículo con alta calidad...");
    }
}

// Clase exclusiva para la gestión del inventario de repuestos
class GestorInventario {
    public void gestionarInventario() {
        System.out.println("Gestionando el inventario de repuestos...");
    }
}

// Clase exclusiva para el pedido de nuevos suministros o piezas
class PedidoRepuestos {
    public void solicitarRepuestos() {
        System.out.println("Solicitando nuevos repuestos al proveedor...");
    }
}

// Clase exclusiva para la atención y asesoramiento a los clientes
class AtencionCliente {
    public void atenderCliente() {
        System.out.println("Atendiendo al cliente y explicando el diagnóstico...");
    }
}

// Clase exclusiva para la limpieza y mantenimiento del taller
class LimpiadorTaller {
    public void limpiarTaller() {
        System.out.println("Limpiando y ordenando el área de trabajo del taller...");
    }
}

public class SRP {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico();
        GestorInventario gestorInventario = new GestorInventario();
        PedidoRepuestos pedidoRepuestos = new PedidoRepuestos();
        AtencionCliente atencionCliente = new AtencionCliente();
        LimpiadorTaller limpiadorTaller = new LimpiadorTaller();

        // Cada clase se enfoca en una única responsabilidad específica
        mecanico.repararVehiculo();
        gestorInventario.gestionarInventario();
        pedidoRepuestos.solicitarRepuestos();
        atencionCliente.atenderCliente();
        limpiadorTaller.limpiarTaller();
    }
}