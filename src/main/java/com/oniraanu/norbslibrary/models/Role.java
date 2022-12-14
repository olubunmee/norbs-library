package com.oniraanu.norbslibrary.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Setter
@Getter
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "role_id_sequence",
            sequenceName = "role_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_id_sequence"
    )
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
}
