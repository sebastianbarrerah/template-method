package models;

public class Chocolate extends Cream {

    @Override
    protected void essence() {
        System.out.println("- Revolver esencia de chocolate con agua caliente y echarla ");
    }

    @Override
    protected void fruitEssence() {
        System.out.println("- rayar un poco de canela y dejar reposar");
    }

    @Override
    protected void finish() {
        System.out.println("- No dejar fuera del congelador mucho tiempo.");
    }

}
