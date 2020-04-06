package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();

		System.out.println("ArrayList와 LinkedList 비교");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			arrayList.add(String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			linkedList.add(String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start) + "ms");
		
		
		
		
		System.out.println("ArrayList와 LinkedList 비교");
		 start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		 end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + (end - start) + "ms");

	}
}
