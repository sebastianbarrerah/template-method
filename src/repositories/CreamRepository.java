package repositories;

import models.Vanilla;

public class CreamRepository {

    private static CreamRepository instance;

    public static CreamRepository getInstance(){
        if (instance == null){
            instance = new CreamRepository();
        }
        return instance;
    }

    public Vanilla CreamVainilla(){
        return new Vanilla();
    }

}
