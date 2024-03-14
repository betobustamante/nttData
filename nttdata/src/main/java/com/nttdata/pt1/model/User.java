package com.nttdata.pt1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @Column(name = "ID_NUMBER")
    private String idNumber;
    @Column(name = "ID_TYPE")
    private String idType;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "SECONDNAME")
    private String secondName;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "SECONDSURNAME")
    private String secondSurname;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITYOFRESIDENCE")
    private String cityOfResidence;
}
