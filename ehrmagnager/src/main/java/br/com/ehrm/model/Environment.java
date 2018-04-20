package br.com.ehrm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Environment.
 */
@Entity
public class Environment implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 753219491337009140L;

	/** The id. */
	@Id
	@GeneratedValue
	private Long id;

	/** The user name. */
	private String userName;

	/** The password. */
	private String password;

	/** The tenant id. */
	private String tenantyId;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((getTenantyId() == null) ? 0 : getTenantyId().hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Environment))
			return false;
		Environment other = (Environment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (getTenantyId() == null) {
			if (other.getTenantyId() != null)
				return false;
		} else if (!getTenantyId().equals(other.getTenantyId()))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/**
	 * Gets the tenanty id.
	 *
	 * @return the tenanty id
	 */
	public String getTenantyId() {
		return tenantyId;
	}

	/**
	 * Sets the tenanty id.
	 *
	 * @param tenantyId
	 *            the new tenanty id
	 */
	public void setTenantyId(String tenantyId) {
		this.tenantyId = tenantyId;
	}

}
