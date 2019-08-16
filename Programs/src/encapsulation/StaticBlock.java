package encapsulation;

public class StaticBlock {
	String name;
	String id;
	double salary;
	static String ceo;
	static {
		ceo="mithra";
	}
	public StaticBlock(String name,String id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
      System.out.println(this.name+" "+this.id+" "+this.salary+" "+ceo);
	}
	public static void main(String[] args) {
		StaticBlock obj=new StaticBlock("kiruthika","hg67",567.8);
		StaticBlock obj1=new StaticBlock("puni","hg68",767.8);
		StaticBlock obj2=new StaticBlock("abi","hg69",967.8);
		
	}

}
