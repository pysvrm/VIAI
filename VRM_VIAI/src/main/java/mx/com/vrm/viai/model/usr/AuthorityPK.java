package mx.com.vrm.viai.model.usr;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the authorities database table.
 * 
 */
@Embeddable
public class AuthorityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idAUTHORITIES;

	private int USUARIOS_idUSUARIOS;

	public AuthorityPK() {
	}
	public int getIdAUTHORITIES() {
		return this.idAUTHORITIES;
	}
	public void setIdAUTHORITIES(int idAUTHORITIES) {
		this.idAUTHORITIES = idAUTHORITIES;
	}
	public int getUSUARIOS_idUSUARIOS() {
		return this.USUARIOS_idUSUARIOS;
	}
	public void setUSUARIOS_idUSUARIOS(int USUARIOS_idUSUARIOS) {
		this.USUARIOS_idUSUARIOS = USUARIOS_idUSUARIOS;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AuthorityPK)) {
			return false;
		}
		AuthorityPK castOther = (AuthorityPK)other;
		return 
			(this.idAUTHORITIES == castOther.idAUTHORITIES)
			&& (this.USUARIOS_idUSUARIOS == castOther.USUARIOS_idUSUARIOS);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAUTHORITIES;
		hash = hash * prime + this.USUARIOS_idUSUARIOS;
		
		return hash;
	}
}