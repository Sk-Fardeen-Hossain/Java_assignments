/*------------Problem 3: Implementation of Educational
Institution database-----------*/



import java.util.Vector;
import java.util.Scanner;
class Staff{
	int code;
	String name;
	public Staff(int code, String name)
	{
		this.code = code;
		this.name = name;
	}
	public String toString()
	{
		return "Code: " + code + ", Name: " + name;
	}
}

class Teacher extends Staff{
	String subject, publication;
	Teacher(int code, String name, String subject, String publication)
	{
		super(code, name);
		this.subject = subject;
		this.publication = publication;
	}
	public String toString()
	{
		return super.toString() + ", Subject: " + subject + ", Publication: " +
		publication;
	}
}

class Officer extends Staff{
	String grade;
	Officer(int code, String name, String grade)
	{
		super(code, name);
		this.grade = grade;
	}
	public String toString()
	{
		return super.toString() + ", Grade: " + grade;
	}
}

class Typist extends Staff{
	int speed;
	Typist(int code, String name, int speed)
	{
		super(code, name);
		this.speed = speed;
	}
	public String toString()
	{
		return super.toString() + ", Speed: " + speed;
	}
}

class Regular_typist extends Typist{
	Regular_typist(int code, String name, int speed)
	{
		super(code, name, speed);
	}
}

class Casual_typist extends Typist{
	int wage;
	Casual_typist(int code, String name, int speed, int wage)
	{
		super(code, name, speed);
		this.wage = wage;
	}
	public String toString()
	{
		return super.toString() + ", Wage: " + wage;
	}
}

public class CollegeDB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Staff> staff = new Vector<>();
		Staff s1 = new Teacher(1, "Cashew", "Math", "Fun with maths");
		Staff s2 = new Officer(2, "Manya", "A");
		Staff s3 = new Regular_typist(3, "John", 30);
		Staff s4 = new Casual_typist(4, "Sushmit", 30, 10);
		staff.add(s1);
		staff.add(s2);
		staff.add(s3);
		staff.add(s4);	
		while(true)
		{
			System.out.println("\n1 to print employee list");
			System.out.println("2 to search for employee");
			System.out.println("3 to exit");
			System.out.println("\nEnter choice: ");	
			int op = sc.nextInt();
			switch (op) {
				case 1:	
				for(Staff s : staff)
				{
					System.out.println(s);
				}
				break;

				case 2:
				System.out.println("\nEnter id to search: ");
				int id = sc.nextInt();	
				for(Staff s : staff)
				{
					if(s.code == id)
					{
						System.out.println(s);
					}
				}
				break;

				case 3:
				System.exit(0);
				break;

				default:
				System.out.println("\nInvalid choice");
				break;
			}
		}
	}
}


/*------------OUTPUT-------------
1 to print employee list
2 to search for employee
3 to exit

Enter choice:
1
Code: 1, Name: Cashew, Subject: Math, Publication: Fun with maths
Code: 2, Name: Manya, Grade: A
Code: 3, Name: John, Speed: 30
Code: 4, Name: Sushmit, Speed: 30, Wage: 10

1 to print employee list
2 to search for employee
3 to exit

Enter choice:
2

Enter id to search:
3
Code: 3, Name: John, Speed: 30

1 to print employee list
2 to search for employee
3 to exit

Enter choice:
3*///