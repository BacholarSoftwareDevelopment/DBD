package vetdb;

import vetdb.database.Resources;
import vetdb.views.CatsView;
import javax.persistence.*;

public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    private static Resources rs = new Resources();

    public static void main(String[] args) {
        // CatsView view = new CatsView(20, 15478536, 7, "Jesus");
        // insertCat(view);
        rs.getAllCats();
        rs.getAllDogs();
        rs.getAllPets();
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

    public static void insertCat(CatsView entity) {
        StoredProcedureQuery storedProcedure;
        EntityManager em = emf.createEntityManager();
        //em = factory.createEntityManager();
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
}
