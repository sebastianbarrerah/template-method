package models;

public class Vanilla extends Cream {

    @Override
    protected void essence() {
        System.out.println("Revolver esencia de vainilla con agua caliente y echarla ");
    }

    @Override
    protected void fruitEssence() {
        System.out.println("Sacar del congelador y ponerla a temperatura ambiente");
    }

    @Override
    protected void finish() {
        System.out.println("Dejar reposar y ya puedes disfrutar de la mejor crema de vainilla");
    }
}
