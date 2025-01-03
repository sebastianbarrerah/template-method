package services;

import repositories.CreamRepository;
import utils.ConsoleUtils;

public class CreamService {

    private final CreamRepository repository;
    private final ConsoleUtils console;


    public CreamService(CreamRepository repository, ConsoleUtils console) {
        this.repository = repository;
        this.console = console;
    }

    public void showCreams(){
        System.out.println("Ricas cremas");
    }
}
