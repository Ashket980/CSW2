 import java.util.*;

	

public class Student {

	String name;

	int age, marks;

	Student(String n, int a, int m) {

		this.name = n;

		this.age = a;

		this.marks = m;

	}

	public static void main(String[] args) {

		LinkedList<Student> ll = new LinkedList();

		int opt = 1;

		Scanner sc = new Scanner(System.in);

		while (opt != 0) {

			System.out.println("1.add Student");

			System.out.println("2.Search Student");

			System.out.println("3.Remove Student");

			System.out.println("4.Count Student");

			System.out.println("5.To print student");

			System.out.println("6.exit");

			int a = sc.nextInt();

			switch (a) {

			case 1: {

				System.out.println("enter the name");

				String name = sc.next();

				System.out.println("Enter the Marks");

				int marks = sc.nextInt();

				System.out.println("Enter the age");

				int age = sc.nextInt();

				Student n = new Student(name, age, marks);

				ll.add(n);

				System.out.println("Student Added Succesfully");

				break;

			}

			case 2: {

				System.out.println("Enter the Name you want to Search");

				String name = sc.next();

				Iterator i = ll.iterator();

				while (i.hasNext()) {

					Student s = (Student) i.next();

					if (s.name.equalsIgnoreCase(name)) {

						System.out.println("Object Found");

						break;

					}

				}

				break;

			}

			case 3:{

				System.out.println("Enter the name of the Student you want to remove");

				String name=sc.next();

				Iterator i = ll.iterator();

				while (i.hasNext()) {

					Student s = (Student) i.next();

					

					if (s.name.equalsIgnoreCase(name)) {

						int index=ll.indexOf(s.name);

						ll.remove(s);

						System.out.println("Student Removed");

						break;

					}

				}

				break;

				

			}

			case 4:{

				System.out.println("Size of Linked list:"+ll.size());

					

					

					

				break;	

				}

			case 5:{

				Iterator i = ll.iterator();

				while (i.hasNext()) {

					Student s = (Student) i.next();

					System.out.println("name of student " +s.name +" age of student " +s.age +" mark of student " +s.marks);

					

					}

                 

				

				break;

				

			}

			case 6:{

				opt=0;

			}

			break;

			default: {

				System.out.println("invalid input");

			}

			}

		}

	

	}

}
