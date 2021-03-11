package vetdb.facade;

import vetdb.database.Resources;
import vetdb.views.CatsView;
import vetdb.views.DogsView;
import vetdb.views.PetsView;

import java.util.List;

public class Facade {

    public void getAllCats() {
        List<CatsView> cats = Resources.getAllCats();
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }

    public void getAllDogs() {
        List<DogsView> dogs = Resources.getAllDogs();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i));
        }
    }

    public void getAllPets() {
        List<PetsView> pets = Resources.getAllPets();
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }
    }
}
