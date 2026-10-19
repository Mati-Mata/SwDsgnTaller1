// Interfaz (Abstracción) para el servicio de notificaciones
interface ServidorNotificacion {
    void enviarMensaje(String destinatario, String mensaje);
    void conectar();
    void desconectar();
}

// Implementación de bajo nivel para Notificaciones por Correo Electrónicoaa
class NotificacionCorreo implements ServidorNotificacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando Correo a " + destinatario + " con el mensaje: " + mensaje);
    }

    @Override
    public void conectar() {
        System.out.println("Conectando al servidor SMTP de correo electrónico.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando del servidor SMTP.");
    }
}

// Módulo de alto nivel que depende de la abstracción (ServidorNotificacion) y no de implementaciones concretas
class GestorNotificacionesEquipo {
    private final ServidorNotificacion servidorNotificacion;

    // Inyección de dependencias a través del constructor
    public GestorNotificacionesEquipo(ServidorNotificacion servidor) {
        this.servidorNotificacion = servidor;
    }

    public void notificarInicio(String destinatario, String mensaje) {
        servidorNotificacion.conectar();
        servidorNotificacion.enviarMensaje(destinatario, mensaje);
    }

    public void finalizarNotificacion() {
        servidorNotificacion.desconectar();
    }
}

public class DIP {
    public static void main(String[] args) {
        // Creamos la implementación concreta de bajo nivel
        NotificacionCorreo correo = new NotificacionCorreo();

        // Inyectamos la dependencia en el módulo de alto nivel mediante la interfaz
        GestorNotificacionesEquipo gestor = new GestorNotificacionesEquipo(correo);

        gestor.notificarInicio("equipo@empresa.com", "¡Proyecto iniciado con éxito!");
        gestor.finalizarNotificacion();
    }
}