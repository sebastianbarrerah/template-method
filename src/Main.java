import controllers.CreamController;
import repositories.CreamRepository;
import services.CreamService;
import utils.ConsoleUtils;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a el menu- que quieres hacer hoy? \n");
        ConsoleUtils consola = new ConsoleUtils();
        CreamRepository repository = new CreamRepository();
        CreamService service = new CreamService(repository);
        CreamController creams = new CreamController(service);
        Map<Integer, Runnable> controllers = Map.of(
                1, creams::executeVanilla,
                2, creams::executeCoco,
                3, creams::executeChocolate
        );
        // Menú principal
        int option;
        do {
            option = consola.getInteger("""
                            La receta para hacer las mejores cremas.
                            ¿Elije tu sabor favorito?
                            1. Vainilla
                            2. Chocolate
                            3. Coco
                            4. Regresar atras
                    """);
            if (controllers.containsKey(option)) {
                controllers.get(option).run();
            } else if (option != 4) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 4);
        System.out.println("Gracias por usar la aplicación. ¡Adiós!");
        System.exit(0);

    }
}