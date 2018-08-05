package corejavapratice.demo.sorting;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<Employee> treeSet=new TreeSet<Employee>();
		//List<int> list=new ArrayList<int>();
		Employee e1=new Employee(1, "A");
		Employee e2=new Employee(2, "B");
		
		treeSet.add(e1);
		treeSet.add(e2);
		System.out.println(treeSet);
		
		
		
	}

}
