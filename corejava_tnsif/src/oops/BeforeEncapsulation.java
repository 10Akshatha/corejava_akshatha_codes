package oops;

class Humann{

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
		
}

public class BeforeEncapsulation {
	public static void main(String[] args) {
		Humann obj= new Humann();
		obj.setAge(23);
		obj.setName("Bhanu");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(21);
		obj.setName("Usha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}
}
