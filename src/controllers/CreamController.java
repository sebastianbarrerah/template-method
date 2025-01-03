package controllers;

import services.CreamService;
import utils.ConsoleUtils;

public class CreamController {

    private final CreamService creamService;

    public CreamController(CreamService creamService){
        this.creamService = creamService;
    }

    public void executeVanilla(){
        System.out.println("----------------------%n Comparte la receta con tus amigos%n----------------------");
    }

    public String executeCoco(){

        return creamService.creamCoco().toString();
    }

    public void executeChocolate(){
        creamService.creamChocolate();
        System.out.println("----------------------%n Comparte la receta con tus amigos%n----------------------");
    }


}
