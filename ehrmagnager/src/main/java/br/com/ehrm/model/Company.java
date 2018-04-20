package br.com.ehrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Company.
 */
@Entity
public class Company {

	/** The id. */
	@Id
	@GeneratedValue
	private Long id;

	/** The name. */
	private String name;

	/** The cnpj. */
	private String cnpj;

	/** The tenanty id. */
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the cnpj.
	 *
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Sets the cnpj.
	 *
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
