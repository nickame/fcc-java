package com.web.app.model.entity;

import com.web.app.model.entity.templ.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {


    @Column(name = "name", nullable = false, unique = true)
    private String name;


    @Column(name = "password", nullable = false)
    private String password;

    public UserEntity() {
    }

    public UserEntity(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity entity = (UserEntity) o;

        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;
        return password != null ? password.equals(entity.password) : entity.password == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    //    TODO: one to many relationship
//    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
//    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "id_image", unique = true, nullable = false)
//    private AccountEntity image;

}
