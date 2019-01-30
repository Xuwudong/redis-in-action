package test;

import java.util.ArrayList;

public class ToArrayTest {
	public static void main(String[] args) {
		ArrayList<Node> list = new ArrayList<>();
		list.add(new Node());
		list.add(new Node());
		list.add(null);
		Node[] arr = list.toArray(new Node[list.size()-1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static class Node {

	}
}
