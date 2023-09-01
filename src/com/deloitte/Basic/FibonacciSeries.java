package com.deloitte.Basic;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	private List<Integer> solve(int terms) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);

		for (int i = 2; i < 10; i++) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		
		return list;
	}

	public static void main(String[] args) {
		FibonacciSeries fbSeries = new FibonacciSeries();

		List<Integer> series = fbSeries.solve(10);
		
		for (int i=0; i<10; i++) 
			System.out.println(series.get(i));
	}
}
