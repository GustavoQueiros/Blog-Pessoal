package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails {
//Falar para a sgunrança quais as informações vamos usar para o login
	
	private static final long serialVersionUID = 1L;//É um identificador dad versão da classe
	
	
	private String userName;//email do usuario
	private String passWord;//Senha 
	private List<GrantedAuthority> autohorities;//essa classe consegue passar os niveis de acesso de um usuario
	
	//Metodo construtor esta passando o usuario e senha informados para os atributos dessa classe
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.passWord = user.getSenha();
	}
	
	//metodo construtor vazio só para garantir o funcionamento da api mesmo quando não receber esses dados 
	public UserDetailsImpl() {
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return autohorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passWord;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
