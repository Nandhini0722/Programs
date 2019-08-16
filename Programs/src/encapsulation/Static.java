package encapsulation;

public class Static {
	int age;
	String id;
	String name;
	static String ceo;
	public void details() {
		System.out.println(name+" "+id+" "+age+" "+ceo);
	}
	public static void main(String[] args) {
		Static a=new Static();
		a.name="kiruthika";
		a.id="464kjfg";
		a.age=20;
		Static.ceo="sundar";
		Static b=new Static();
		b.name="keerthi";
		b.id="245nbf";
		b.age=21;
		Static.ceo="mirudan";
		a.details();
		b.details();
		
	}

}
