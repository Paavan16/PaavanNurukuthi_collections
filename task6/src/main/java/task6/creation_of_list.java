package task6;
import java.util.*;

public class creation_of_list {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		collection_list<Integer> list=new collection_list<Integer>();
		System.out.println("Elements in the list initially are:");
		System.out.println(list);
		
		System.out.println("Number of elements you want to add in the list??");
		int n=sc.nextInt();
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			int newele=sc.nextInt();
			list.add(newele);
		}
		System.out.println("List after adding new elements:");
		System.out.println(list);
		
		System.out.println("enter index of the element you wanted to remove:");
		int rmvele;
		rmvele=sc.nextInt();
		list.remove(rmvele);
		System.out.println("List after removing the elements:"+list);
		
		System.out.println("enter an index to know the value:");
		int index=sc.nextInt();
		System.out.println("value in list at index "+index+":"+list.fetch(index));
		
		System.out.println("Final List size="+list.size());
		
		sc.close();
	}
}