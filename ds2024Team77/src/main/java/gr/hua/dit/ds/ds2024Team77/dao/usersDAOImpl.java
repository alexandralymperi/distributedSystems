package gr.hua.dit.ds.ds2024Team77.dao;


import gr.hua.dit.ds.ds2024Team77.entities.naUser;
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
    public List<naUser> getUsers() {
        TypedQuery<naUser> query = entityManager.createQuery("from naUser", naUser.class);
        return query.getResultList();
    }

    @Override
    public naUser getUser(Integer user_id) {
        return entityManager.find(naUser.class, user_id);
    }

    @Override
    public void saveUser(naUser user) {

    }

    @Override
    public void deleteUser(Integer user_id) {

    }




}
