package models;

public abstract class Cream {
    public String client;

    public final void preparation () {
        pourMilk();
        pourEggs();
        essence();
        fruitEssence();
        freeze();
        finish();
        System.out.println("Tu crema esta lista, disfrutala!");
    }

    private void pourMilk () {
        System.out.println("Echar dos tazas de leche y azucar en un recipiente");
    }

    private void pourEggs() {
        System.out.println("- Revolver por dos minutos y echar 4 yemas de huevo");
    }

    protected abstract void essence();

    protected abstract void fruitEssence();

    private void freeze(){
        System.out.println("- Cocinar en fuego bajo y revolver constantmente hasta que espese y tenga una textura suave. ");
    }

    protected abstract void finish();
}
