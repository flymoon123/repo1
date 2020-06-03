class Test03 {
	public static void main(String[]args) {
		Student stu=new Student("zhangsan",16);
		 Undergraduate udg=new  Undergraduate("lisi",18,"bechalor");
		 stu.show();
		 udg.show();
	}
}
public class Student {
	public String name;
	public int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
    public void show() {
    	System.out.println("name:"+name+"age:"+age);
    }
}
class Undergraduate extends Student{
	public String degree;
	public Undergraduate(String name,int age,String degree) {
		super(name,age);
		this.degree=degree;
	}
	public void show() {
		System.out.println("name:"+name+"age:"+age);
	}
}




