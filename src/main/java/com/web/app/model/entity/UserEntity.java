package com.web.app.model.entity;

import com.web.app.model.entity.templ.BaseEntity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@ToString(callSuper = true)
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Setter
    @Getter
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Setter
    @Getter
    @Column(name = "password", nullable = false)
    private String password;


//    TODO: one to many relationship
//    @Setter
//    @Getter
//    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
//    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
//    @JoinColumn(name = "id_image", unique = true, nullable = false)
//    private AccountEntity image;

}
