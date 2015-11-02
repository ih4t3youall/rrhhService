package ar.com.rrhhService.dto;

import java.sql.Date;

public class CrearUsuarioDTO {

	private String username;
	private String password;
	private String nombre;
	private String apellido;
	private String documento;
	private String legajo;
	private String cargo;
	private String subCargo;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String celular;
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCcargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSubCargo() {
		return subCargo;
	}

	public void setSubCargo(String subCargo) {
		this.subCargo = subCargo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
