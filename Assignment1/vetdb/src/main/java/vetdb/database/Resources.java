package vetdb.database;

import vetdb.facade.Facade;
import vetdb.views.CatsView;
import vetdb.views.DogsView;
import vetdb.views.PetsView;

import javax.persistence.*;
import java.util.List;

public class Resources {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu");
    static EntityManager em;
    private static Facade facade = new Facade();

    public static List<CatsView> getAllCats() {
        em = factory.createEntityManager();
        List<CatsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from CatsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }

    public static List<DogsView> getAllDogs() {
        em = factory.createEntityManager();
        List<DogsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from DogsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }

    public static List<PetsView> getAllPets() {
        em = factory.createEntityManager();
        List<PetsView> list;
        try {
            em.getTransaction().begin();
            Query q = em.createQuery("SELECT cv from PetsView cv");
            list = q.getResultList();
        } finally {
            em.close();
        }
        return list;
    }

    //call insert_dog('Tot', 1, 15478536, 'A4')
//    List<EmployeeDetails> result = query.getResultList();
//    public static void addCat(CatsView entity) {
//
//        em = factory.createEntityManager();
//        try {
//            em.getTransaction().begin();
//            Query query = em.createNativeQuery("{call insert_cat(?,?,?,?)}")
//                    .setParameter(1, entity.getName())
//                    .setParameter(2, entity.getAge())
//                    .setParameter(3, entity.getCvr())
//                    .setParameter(4, entity.getLifes());
//            em.persist(query);
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//    }

    public static void addCat(CatsView entity) {
        StoredProcedureQuery storedProcedure;
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();

            storedProcedure = em.createStoredProcedureQuery("insert_cat");
//            storedProcedure.registerStoredProcedureParameter("new_name", String.class, ParameterMode.IN);
//            storedProcedure.registerStoredProcedureParameter("new_age", Integer.class, ParameterMode.IN);
//            storedProcedure.registerStoredProcedureParameter("new_cvr", Integer.class, ParameterMode.IN);
//            storedProcedure.registerStoredProcedureParameter("new_life_count", Integer.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedure.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
            storedProcedure.setParameter(1, entity.getName());
            storedProcedure.setParameter(2, entity.getAge());
            storedProcedure.setParameter(3, entity.getCvr());
            storedProcedure.setParameter(4, entity.getLifes());
            storedProcedure.execute();
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }


    public static void main(String[] args) {

//        CatsView view = new CatsView(20, 15478536, 7, "Jesus");
//        addCat(view);
        facade.getAllCats();
        facade.getAllDogs();
        facade.getAllPets();

    }
}
