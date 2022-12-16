package com.stackroute.authenticationservice.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;

    @Column
    private String lender_id;

    @Column
    private String borrower_id;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLender_id(String lender_id) {
        return this.lender_id;
    }

    public void setLender_id(String lender_id) {
        this.lender_id = lender_id;
    }

    public String getBorrower_id() {
        return borrower_id;
    }

    public void setBorrower_id(String borrower_id) {
        this.borrower_id = borrower_id;
    }
}