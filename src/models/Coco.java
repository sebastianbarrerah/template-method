package models;

public class Coco extends Cream {

    @Override
    protected void essence() {
        System.out.println("- Echar un par de gotas de esencia de coco con azucar al gusto");
    }

    @Override
    protected void fruitEssence() {
        System.out.println("- Revolver por encima coco rayado, meter al congelador por 2 horas");
    }

    @Override
    protected void finish() {
        System.out.println("- Dejar reposar y ya puedes disfrutar de la mejor crema de coco");
    }

}
