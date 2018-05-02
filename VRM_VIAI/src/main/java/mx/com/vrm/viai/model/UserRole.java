package mx.com.vrm.viai.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

// TODO: Auto-generated Javadoc
/**
 * The persistent class for the user_roles database table.
 * 
 */
@Entity
@Table(name = "user_roles")
@NamedQuery(name = "UserRole.findAll", query = "SELECT u FROM UserRole u")
public class UserRole implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The iduser roles. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "iduser_roles")
	private int iduserRoles;

	/** The rol. */
	private String rol;

	/** The users. */
	// bi-directional many-to-one association to User
	@JsonManagedReference
	@OneToMany(mappedBy = "userRole")
	private List<User> users;

	/**
	 * Instantiates a new user role.
	 */
	public UserRole() {
	}

	/**
	 * Gets the iduser roles.
	 *
	 * @return the iduser roles
	 */
	public int getIduserRoles() {
		return this.iduserRoles;
	}

	/**
	 * Sets the iduser roles.
	 *
	 * @param iduserRoles
	 *            the new iduser roles
	 */
	public void setIduserRoles(int iduserRoles) {
		this.iduserRoles = iduserRoles;
	}

	/**
	 * Gets the rol.
	 *
	 * @return the rol
	 */
	public String getRol() {
		return this.rol;
	}

	/**
	 * Sets the rol.
	 *
	 * @param rol
	 *            the new rol
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public List<User> getUsers() {
		return this.users;
	}

	/**
	 * Sets the users.
	 *
	 * @param users
	 *            the new users
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * Adds the user.
	 *
	 * @param user
	 *            the user
	 * @return the user
	 */
	public User addUser(User user) {
		getUsers().add(user);
		user.setUserRole(this);

		return user;
	}

	/**
	 * Removes the user.
	 *
	 * @param user
	 *            the user
	 * @return the user
	 */
	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUserRole(null);

		return user;
	}

}