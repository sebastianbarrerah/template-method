package controllers;

import services.CreamService;

public class CreamController {

    private final CreamService creamService;

    public CreamController(CreamService creamService){
        this.creamService = creamService;
    }

    public void executeVanilla() {
        creamService.creamVanilla().preparation();
        System.out.println("----------------------\nComparte la receta con tus amigos\n----------------------");
    }

    public void executeCoco() {
        creamService.creamCoco().preparation();
        System.out.println("----------------------\nComparte la receta con tus amigos\n----------------------");
    }

    public void executeChocolate() {
        creamService.creamChocolate().preparation();
        System.out.println("----------------------\nComparte la receta con tus amigos\n----------------------");
    }



}
