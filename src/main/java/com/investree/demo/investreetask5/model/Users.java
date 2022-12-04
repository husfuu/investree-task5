package com.investree.demo.investreetask5.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users extends BaseModel{
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private boolean is_active;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "peminjam",
            orphanRemoval = true)
    private List<Transaction> transactions_peminjam;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "meminjam",
            orphanRemoval = true)
    private List<Transaction> transactions_meminjam;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Users users = (Users) o;
        return getId() != null && Objects.equals(getId(), users.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
