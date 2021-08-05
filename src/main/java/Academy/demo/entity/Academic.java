package Academy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class Academic {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "adress")
	private String adress;
	
	@Column(name = "birthDate")
	private String birthDate;
	
	@Column(name = "resume")
	private String resume;
	
	@Column(name = "createdDate")
	private String createdDate;
	
	@Column(name = "updateDate")
	private String updateDate;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}
	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the updateDate
	 */
	public String getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public Academic(Long id, String lastName, String phone, String email, String adress, String birthDate, String resume,
			String createdDate, String updateDate) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.adress = adress;
		this.birthDate = birthDate;
		this.resume = resume;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}
	
	public Academic() {}
	@Override
	public String toString() {
		return "User [id=" + id + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", adress="
				+ adress + ", birthDate=" + birthDate + ", resume=" + resume + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
	
}
