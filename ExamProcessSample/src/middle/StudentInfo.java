package middle;

public class StudentInfo {
	private String id;
	private String name;
	private String tel;
	private String email;

	//constructor
	public StudentInfo() {
	}
	public StudentInfo(String id, String name, String tel, String email) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	//getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return String.format("StudPersInfo [id=%s, name=%s, tel=%s, email=%s]", id, name, tel, email);
	}
	@Override
	public int hashCode() {
		System.out.println("hash");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfo other = (StudentInfo) obj;

		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (email == null && other.email != null) {
			return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
