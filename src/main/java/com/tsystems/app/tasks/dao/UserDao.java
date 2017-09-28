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
        return em.createQuery("select u from User u", User.class).getResultList();
    }
}
