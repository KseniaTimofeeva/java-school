package com.tsystems.app.tasks.dao;

import com.tsystems.app.tasks.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by ksenia on 28.09.2017.
 */
@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public List<User> getUsers() {
        return em.createNamedQuery(User.GET_ALL, User.class).getResultList();
    }

    public List<User> findUsers(String searchedParam) {
        return em.createNamedQuery(User.GET_BY_ID, User.class).setParameter("id", '%' + searchedParam + '%').getResultList();
    }
}
