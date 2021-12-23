package com.prueba.funcionalLux.model;

public class Usuario {
	
	String nombre;
	String userName;
	String password;
	
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(String nombre, String userName, String password) {
		super();
		this.nombre = nombre;
		this.userName = userName;
		this.password = password;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
