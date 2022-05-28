//import java.util.*;
//
//class Student
//{
//	Student next;
//	String name;
//	String age;
//	String rollNumber;
//	
//	public Student (String name,String age, String rollNumber) {
//		this.name = name;
//		this.age = age;
//		this.rollNumber = rollNumber;
//		next = null;
//	}
//}
//	
//
//public class Q2
//{
//	Student head = null;
//	Student tail = null;
//	public Student takeInput() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 0 to continue : ");
//		int sign = sc.nextInt();
//		
//		while (sign == 0)
//		{
//			System.out.println("Enter name ");
//			String name = sc.next();
//			System.out.println("Enter age ");
//			String age = sc.next();
//			System.out.println("Enter number ");
//			String rollNumber = sc.next();
//			
//			Student newNode = new Student (name,age,rollNumber);
//			if (head == null) {
//				head = newNode;
//				tail = newNode;
//			}
//			else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//			System.out.println("If you want to end press 1 ");
//			sign = sc.nextInt();
//		}
//		return head;
//	}
//	public boolean isEmpty() {
//		return tail == null;
//	}
//	
//	public void print (Student head) {
//		while(head != null) {
//			System.out.print(head.name+  " " + head.age + " " + head.rollNumber);
//			head = head.next;
//			System.out.println();
//		}
//	}
//	public static void main(String[] args) 
//	{
//		Q2 s = new Q2();
//		Student head = s.takeInput();
//		s.print(head);
//	}
//}

//import java.util.*;
//class Student {
//	String name;
//	int age;
//	int marks;
//	Student(String name,int age, int marks){
//		this.name=name;
//		this.age=age;
//		this.marks=marks;
//	}
//}
//public class Q2
//{
//	public static void main(String[] args) 
//	{
//		Student A= new Student("A",20,85);
//		Student B= new Student("B",21,78);
//		Student C= new Student("C",22,65);
//		List <Student> li = new LinkedList<Student>();
//		li.add(A);
//		li.add(B);
//		li.add(C);
//		int count = 0;
//		for(Student s:li)
//		{
//			System.out.println("name : " + s.name + "age : "+ s.age + "marks : " + s.marks);
//			count++;
//		}
//		System.out.println("No of objects : " + count);
//		li.remove(B);
//		System.out.println();
//		System.out.println("After removing an object : ");
//		for (Student s:li) {
//			System.out.println("name : " + s.name + "age : "+ s.age + "marks : " + s.marks);
//		}
//		
//	}
//}



import java.util.*;

	


public class Q2 {
	String name;
	int age, marks;

	Q2(String n, int a, int m) {
		this.name = n;
		this.age = a;
		this.marks = m;
	}

	public static void main(String[] args) {
		LinkedList<Q2> ll = new LinkedList();

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
				Q2 n = new Q2(name, age, marks);
				ll.add(n);
				System.out.println("Student Added Succesfully");
				break;
			}
			case 2: {
				System.out.println("Enter the Name you want to Search");
				String name = sc.next();
				Iterator i = ll.iterator();

				while (i.hasNext()) {
					Q2 s = (Q2) i.next();
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
					Q2 s = (Q2) i.next();
					
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
					Q2 s = (Q2) i.next();
					System.out.print(" name of student : " +s.name +"\n age of student : " +s.age +" \n mark of student : " +s.marks + "\n\n");
					
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