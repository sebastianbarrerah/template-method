package services;

import models.Chocolate;
import models.Coco;
import models.Vanilla;
import repositories.CreamRepository;

public class CreamService {

    private final CreamRepository repository;


    public CreamService(CreamRepository repository) {
        this.repository = repository;
    }

    public Vanilla creamVanilla(){
        return repository.CreamVanilla();
    }


    public Coco creamCoco(){
        return repository.CreamCoco();
    }

    public Chocolate creamChocolate(){
        return repository.CreamChocolate();
    }
}
