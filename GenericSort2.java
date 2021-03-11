package edu.smg;

import java.util.ArrayList;

public class GenericSort2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(-76);
		list.add(3);
		list.add(-5);
		shuffle(list);
		printList(list);
		sort(list);
		printList(list);
		shuffle(list);
		printList(list);
		System.out.println("Min: " + min(list));
	}
	
	public static <E> void shuffle(ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			E swap = list.get(i);
			int random = (int)(Math.random() * list.size());
			list.set(i, list.get(random));
			list.set(random, swap);
		}
	}
	
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.size() - 1; i++) {
// Find the minimum in the list[i+1..list.length-2]
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
	
	
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E currentMin = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(currentMin.compareTo(list.get(i)) > 0) {
				currentMin = list.get(i);
			}
		}
		return currentMin;
	}

	
	public static <E> void printList(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i) + " ");
		System.out.println();
	}
	
}
