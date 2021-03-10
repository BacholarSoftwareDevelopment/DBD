package vetdb.database;

import vetdb.entities.CatsEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class Resources {

    private static EntityManager manager;
    private static Factory factory = new Factory(manager);

    public static List<CatsEntity> getAllCats() {
        List<CatsEntity> list;
        try {
          manager.getTransaction().begin();
          Query q = manager.createQuery("SELECT c from CatsEntity c");
          list = q.getResultList();
        } finally {
            manager.close();
        }
        return list;
    }

    public static void main(String[] args) {
        getAllCats();
    }
}
