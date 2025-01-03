
import utils.Menu;


public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al menú de recetas de cremas - ¿Qué quieres hacer hoy?\n");
        Menu menu = new Menu();
        menu.menuItems();
        System.out.println("Gracias por usar la aplicación. ¡Adiós!");
    }
}
