package controllers;

import services.CreamService;
import utils.ConsoleUtils;

public class CreamController {

    private final CreamService creamService;
    private final ConsoleUtils console;

    public CreamController(CreamService creamService, ConsoleUtils console){
        this.creamService = creamService;
        this.console = console;
    }

    public void executeController (){
        try {
            creamService.showCreams();
            System.out.println("Que la disfrutes");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
