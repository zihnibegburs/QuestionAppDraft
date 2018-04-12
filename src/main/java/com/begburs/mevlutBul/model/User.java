package com.begburs.mevlutBul.model;




import javax.persistence.*;


@Entity
@javax.persistence.Table(name = "SYS_USER")
public class User {

    @Id
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Long id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private  String surname;

    @Column
    private  Long respectPoint;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getRespectPoint() {
        return respectPoint;
    }

    public void setRespectPoint(Long respectPoint) {
        this.respectPoint = respectPoint;
    }



}
