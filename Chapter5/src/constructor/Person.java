package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() { } //�ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������
	
	public Person(String pname) { //��� �̸��� �Ű������� �Է¹޾Ƽ� Person Ŭ������ �����ϴ� ������
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
