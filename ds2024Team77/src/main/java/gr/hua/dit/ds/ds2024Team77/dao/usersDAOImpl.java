package gr.hua.dit.ds.ds2024Team77.dao;


import gr.hua.dit.ds.ds2024Team77.entities.users;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class usersDAOImpl implements usersDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<users> getUsers() {
        TypedQuery<users> query = entityManager.createQuery("from users", users.class);
        return query.getResultList();
    }

    @Override
    public users getUser(Integer user_id) {
        return entityManager.find(users.class, user_id);
    }

    @Override
    public void saveUser(users user) {

    }

    @Override
    public void deleteUser(Integer user_id) {

    }




}
