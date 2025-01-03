package utils;

import controllers.CreamController;
import repositories.CreamRepository;
import services.CreamService;

import java.util.Map;

public class Menu {
    private final Map<Integer, Runnable> controllers;
    private static final String MENU_MESSAGE = """
        La receta para hacer las mejores cremas.
        Elije tu sabor favorito:
        1. Vainilla
        2. Coco
        3. Chocolate
        4. Salir
    """;

    public Menu() {
        CreamController creams = createCreamController();
        this.controllers = Map.of(
                1, creams::executeVanilla,
                2, creams::executeCoco,
                3, creams::executeChocolate
        );
    }

    private CreamController createCreamController() {
        CreamRepository repository = new CreamRepository();
        CreamService service = new CreamService(repository);
        return new CreamController(service);
    }

    public void menuItems() {
        ConsoleUtils consola = new ConsoleUtils();
        int option;
        do {
            option = consola.getInteger(MENU_MESSAGE);
            handleOption(option);
        } while (option != 4);
    }

    private void handleOption(int option) {
        if (controllers.containsKey(option)) {
            controllers.get(option).run();
        } else if (option != 4) {
            System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }
}
