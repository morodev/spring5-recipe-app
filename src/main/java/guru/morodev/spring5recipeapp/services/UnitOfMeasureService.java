package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by Luca Moro on 10/11/2020  18:03
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
