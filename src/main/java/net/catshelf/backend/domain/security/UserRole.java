package net.catshelf.backend.domain.security;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "user_roles")
public class UserRole implements Serializable {
    private static final long serialVersionUID = 1234565L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleID;

    public UserRole(){}

    public UserRole(User user, BackendApplication.role role){
        this.user = user;
        this.role = role;
    }
}
