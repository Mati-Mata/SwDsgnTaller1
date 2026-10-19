import java.util.*;

// Interfaz para la sección de libros de ficción
interface MenuFicion {
    List<String> obtenerLibrosFicion();
}

// Interfaz para la sección de libros de no ficción
interface MenuNoFicion {
    List<String> obtenerLibrosNoFicion();
}

// Interfaz para la sección de revistas
interface MenuRevistas {
    List<String> obtenerRevistas();
}

// Clase que implementa exclusivamente el menú de ficción
class SeccionFicion implements MenuFicion {
    public List<String> obtenerLibrosFicion() {
        return Arrays.asList("El Señor de los Anillos", "Cien Años de Soledad", "Dune");
    }
}

// Clase que implementa exclusivamente el menú de no ficción
class SeccionNoFicion implements MenuNoFicion {
    public List<String> obtenerLibrosNoFicion() {
        return Arrays.asList("Sapiens", "Breve historia del tiempo", "El poder del ahora");
    }
}

// Clase que implementa exclusivamente el menú de revistas
class SeccionRevistas implements MenuRevistas {
    public List<String> obtenerRevistas() {
        return Arrays.asList("National Geographic", "Muy Interesante", "Forbes");
    }
}

// Clase encargada de mostrar los elementos de los menús de forma segregada
class VisualizadorCatalogo {
    public static void mostrarMenuFicion(MenuFicion menu) {
        System.out.println("Catálogo de Ficción:");
        for (String item : menu.obtenerLibrosFicion()) {
            System.out.println("- " + item);
        }
    }

    public static void mostrarMenuNoFicion(MenuNoFicion menu) {
        System.out.println("Catálogo de No Ficción:");
        for (String item : menu.obtenerLibrosNoFicion()) {
            System.out.println("- " + item);
        }
    }
}

public class ISP {
    public static void main(String[] args) {
        SeccionFicion seccionFicion = new SeccionFicion();
        SeccionNoFicion seccionNoFicion = new SeccionNoFicion();
        SeccionRevistas seccionRevistas = new SeccionRevistas();

        VisualizadorCatalogo.mostrarMenuFicion(seccionFicion);
        System.out.println();
        VisualizadorCatalogo.mostrarMenuNoFicion(seccionNoFicion);
    }
}