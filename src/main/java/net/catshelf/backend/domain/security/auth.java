package net.catshelf.backend.domain.security;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public class auth implements GrantedAuthority, Serializable {
    private static final long serialVersionUID = 12345L;

    private final String authority;

    public auth(String authority){
        this.authority = authority;
    }
    @Override
    public String getAuthority() {
        return authority;
    }
}
