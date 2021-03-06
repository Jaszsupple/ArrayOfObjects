import java.util.Scanner;
class PersonB{
    String name;
    int age;
    public PersonB() {}
    public PersonB(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
	
	//to string meathod
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
}

public class ArrayOfPeopleAge {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		PersonB[] ArrayPerson = new PersonB[3];
		
		for (int i = 0; i < ArrayPerson.length; i++) {
			System.out.print("Enter person " + (i+1) + " name: ");
			String personName = userinput.next();
			System.out.print("Enter person " + (i+1) + " age: ");
			int personAge = userinput.nextInt();
			ArrayPerson[i] = new PersonB(personName,personAge);			
		}
		
		for (int i = 0; i < ArrayPerson.length; i++) {
			System.out.println(ArrayPerson[i].toString()); 
		}
		
		int max = 0;
		int j = 0;

		for (int i = 0; i < ArrayPerson.length; i++) {
			if (ArrayPerson[i].age > max) {
				max = ArrayPerson[i].age;
				j = i;
			}

		}

		System.out.print("\nThe oldest person is " + ArrayPerson[j].getName() + " with the age of " + ArrayPerson[j].age);

		userinput.close();
	}

}
