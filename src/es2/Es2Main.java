package es2;

import java.util.ArrayList;
import java.util.List;

public class Es2Main {
	public static void main(String[] args) {
		List<Integer> prima = numRandom(5);
		System.out.println(prima);
		List<Integer> dopo = reorderList(prima);
		System.out.println(dopo);
	}

	static List<Integer> numRandom(int n) {
		List<Integer> nRan = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int r = (int) (Math.random() * 100);
			// System.out.println(r);
			nRan.add(r);
		}

		return nRan;
	}

	static List<Integer> reorderList(List<Integer> a) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			arr.add(a.get(i));
		}
		for (int i = a.size()-1; i >= 0; i--) {
			arr.add(a.get(i));
		}
		return arr;

	}
}
