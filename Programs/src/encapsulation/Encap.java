package encapsulation;

public class Encap {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Encap e=new Encap();
		e.setAge(20);
		e.setName("nandhini");
		System.out.println(e.getAge());
		System.out.println(e.getName());
	}

}
