package mx.com.vrm.viai.model;

import java.io.Serializable;
import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The primary key class for the users database table.
 * 
 */
@Embeddable
public class UserPK implements Serializable {

	/** The Constant serialVersionUID. */
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/** The idusers. */
	private int idusers;

	/** The user roles id. */
	@Column(name = "user_roles_id", insertable = false, updatable = false)
	private int userRolesId;

	/**
	 * Instantiates a new user PK.
	 */
	public UserPK() {
	}

	/**
	 * Gets the idusers.
	 *
	 * @return the idusers
	 */
	public int getIdusers() {
		return this.idusers;
	}

	/**
	 * Sets the idusers.
	 *
	 * @param idusers
	 *            the new idusers
	 */
	public void setIdusers(int idusers) {
		this.idusers = idusers;
	}

	/**
	 * Gets the user roles id.
	 *
	 * @return the user roles id
	 */
	public int getUserRolesId() {
		return this.userRolesId;
	}

	/**
	 * Sets the user roles id.
	 *
	 * @param userRolesId
	 *            the new user roles id
	 */
	public void setUserRolesId(int userRolesId) {
		this.userRolesId = userRolesId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPK)) {
			return false;
		}
		UserPK castOther = (UserPK) other;
		return (this.idusers == castOther.idusers) && (this.userRolesId == castOther.userRolesId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idusers;
		hash = hash * prime + this.userRolesId;

		return hash;
	}
}