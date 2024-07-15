package com.sprigngmysql.springmysql;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="usertable")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_Id;
    private String f_name;
    private String l_name;

}
