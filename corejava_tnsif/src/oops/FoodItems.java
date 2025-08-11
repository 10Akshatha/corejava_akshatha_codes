package oops;

	public class FoodItems{
		
		String name;
		double price;
		String category;
		
		void displayDetails()
		{
			System.out.println("Food Name "+name);
			System.out.println("Food price "+price);
			System.out.println("Food category "+category);
			System.out.println("................");
		}
		
		public static void main(String[] args) {
			FoodItems obj=new FoodItems();
			obj.name="Cheeze Pizza";
			obj.price=249.9;
			obj.category="Italian";
			
			FoodItems obj1=new FoodItems();
			obj1.name="Veg Noodles";
			obj1.price=80.9;
			obj1.category="Fast food";
			
			obj.displayDetails();
			obj1.displayDetails();		
		}

	}

