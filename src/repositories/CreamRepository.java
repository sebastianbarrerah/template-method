package repositories;

import models.Chocolate;
import models.Coco;
import models.Vanilla;

public class CreamRepository {

    private static CreamRepository instance;

    public static CreamRepository getInstance(){
        if (instance == null){
            instance = new CreamRepository();
        }
        return instance;
    }

    public Vanilla CreamVanilla(){
        return new Vanilla();
    }

    public Coco CreamCoco(){
        return new Coco();
    }

    public Chocolate CreamChocolate(){
        return new Chocolate();
    }

}
