package com.example.coreJava.collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFramework {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(17);
		nums.add(34);
		nums.add(38);
		nums.add(22);
		nums.add(31);
		nums.add(12);
		nums.add(17);
		nums.add(34);
		nums.add(38);
		nums.add(22);
		nums.add(31);
		
//		for(int i=0;i<nums.size();i++) {
//			System.out.println(nums.get(i));
//		}
//		
		
//		//Advanced for loop
//		for(int x:nums) {
//			System.out.println(x);
//		}
		
//		nums.forEach((x)->{
//					System.out.println(x);
//					});
//		
		
		//nums.forEach(System.out::println);
		
//		Iterator<Integer> iterator = nums.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		ArrayList myList = new ArrayList();
		myList.add(123);
		myList.add("Hello");
		myList.add(true);
		myList.add(1.234);
		myList.forEach(System.out::println);
		
		
		
		
//		System.out.println(nums.remove(0));
//		System.out.println(nums.get(0));
		
		
	}

}
