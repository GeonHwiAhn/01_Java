package ncs.test8;

public class User {


//필드
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

//메서드
	// Getter
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	// Setter
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 생성자 기본
	public User() {
	}

	// 생성자 필수
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	//Override toString -> 단축키  Alt shift s  s  enter
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", phone=" + phone + ", toString()=" + super.toString() + "]";
	}
	
	//clone
	// 객체 복사본 Cloneable
	@Override
	public User clone() {
		return new User(this.id,this.password,
						this.name,this.age,
						this.gender,this.phone);
	}
	
	
	

}