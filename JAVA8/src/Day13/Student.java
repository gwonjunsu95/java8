package Day13;

public class Student { // DAO(data access object), java bean

	private String name; // �̸�
	private String gender; // ����
	private int age; // ����
	private int sNo; // �й�

	public String getName() {	//��Ŭ�� �ҽ� get set
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		if(gender.equals("����")) {
			sNo += 2000;
		} else {
			sNo += 1000;
		}
		this.sNo = sNo;
	}

	public void showInfo() {
		System.out.println("����: " + name);
		System.out.println("����: " + gender);
		System.out.println("����: " + age);
		System.out.println("�й�: " + sNo);
	}

	
	
	
	
	
	public Student(String name, String gender, int age, int sNo) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.sNo = sNo;
	}

	public Student() {

	}
//	String getName() {
//		return name;
//	}
//	
//	void setName(String name) {
//		this.name = name;
//	}

}
