package com.investree.demo.investreetask5.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
public class UsersDetail extends BaseModel{
    @NotNull
    private String name;

    @NotNull
    private String address;

    @OneToOne(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "id_user", unique = true)
    private Users users;
}
