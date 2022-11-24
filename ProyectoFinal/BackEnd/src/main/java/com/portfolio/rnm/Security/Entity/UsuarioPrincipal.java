package com.portfolio.rnm.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioPrincipal implements UserDetails {

    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    //CONSTRUCTOR
    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsarioPrincipal build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), Uuario.getNombreUsuario(), usuario.getEmail(), usuariogetPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

}
