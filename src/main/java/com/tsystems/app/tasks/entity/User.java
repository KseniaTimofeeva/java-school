package com.tsystems.app.tasks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Created by ksenia on 28.09.2017.
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = User.GET_ALL,
                query = "select u from User u"),
        @NamedQuery(name = User.GET_BY_ID,
                query = "select u from User u where str(u.id) like :id or u.firstName like :id or u.lastName like :id")
})
public class User {

    public static final String GET_ALL = "User.allUsers";
    public static final String GET_BY_ID = "User.userById";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
