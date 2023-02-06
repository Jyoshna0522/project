package java_polymorphism;

public class B_overriding extends A{
	@Override
	public void studendetails(String name) {
		super.studendetails(name);
	}
	@Override
	public void studendetails(short percentage) {
		super.studendetails(percentage);
	}
	@Override
	public void studendetails(int age) {
		super.studendetails(age);
	}
public static void main(String[] args) {
	B_overriding ref = new B_overriding();
	ref.studendetails(24);
	ref.studendetails(90);
	ref.studendetails("jyoshna");
}
}
 