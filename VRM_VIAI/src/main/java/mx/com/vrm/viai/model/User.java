package mx.com.vrm.viai.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

// TODO: Auto-generated Javadoc
/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private UserPK id;

	/** The apellidom. */
	private String apellidom;

	/** The apellidp. */
	private String apellidp;

	/** The correo. */
	private String correo;

	/** The enabled. */
	private String enabled;

	/** The fecha A. */
	private String fechaA;

	/** The nombre. */
	private String nombre;

	/** The password. */
	private String password;

	/** The telefono. */
	private String telefono;

	/** The username. */
	private String username;

	/** The user role. */
	// bi-directional many-to-one association to UserRole
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_roles_id", updatable = false, insertable = false)
	private UserRole userRole;

	/**
	 * Instantiates a new user.
	 */
	public User() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public UserPK getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(UserPK id) {
		this.id = id;
	}

	/**
	 * Gets the apellidom.
	 *
	 * @return the apellidom
	 */
	public String getApellidom() {
		return this.apellidom;
	}

	/**
	 * Sets the apellidom.
	 *
	 * @param apellidom
	 *            the new apellidom
	 */
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	/**
	 * Gets the apellidp.
	 *
	 * @return the apellidp
	 */
	public String getApellidp() {
		return this.apellidp;
	}

	/**
	 * Sets the apellidp.
	 *
	 * @param apellidp
	 *            the new apellidp
	 */
	public void setApellidp(String apellidp) {
		this.apellidp = apellidp;
	}

	/**
	 * Gets the correo.
	 *
	 * @return the correo
	 */
	public String getCorreo() {
		return this.correo;
	}

	/**
	 * Sets the correo.
	 *
	 * @param correo
	 *            the new correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * Gets the enabled.
	 *
	 * @return the enabled
	 */
	public String getEnabled() {
		return this.enabled;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled
	 *            the new enabled
	 */
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the fecha A.
	 *
	 * @return the fecha A
	 */
	public String getFechaA() {
		return this.fechaA;
	}

	/**
	 * Sets the fecha A.
	 *
	 * @param fechaA
	 *            the new fecha A
	 */
	public void setFechaA(String fechaA) {
		this.fechaA = fechaA;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre
	 *            the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono
	 *            the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the user role.
	 *
	 * @return the user role
	 */
	public UserRole getUserRole() {
		return this.userRole;
	}

	/**
	 * Sets the user role.
	 *
	 * @param userRole
	 *            the new user role
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}