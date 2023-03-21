package es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Es1Main {

	public static Scanner s = new Scanner(System.in);
	private static final Logger l = LoggerFactory.getLogger(Es1Main.class);

	public static void main(String[] args) {
		Set<String> arr = new HashSet<String>();
		List<String> dublicate = new ArrayList<String>();

		int N;
		try {
			N = start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			N=2;
		}

		riempiArray(N, arr, dublicate);
		stampa(arr, dublicate);

	}

	public static int start() throws Exception{
		System.out.println("Inserisci un numero intero:");
		while(!s.hasNextInt()) {
			l.error("INSERIRE NUMERO INTERO POSITIVO");
			s.next();
			
		}
		int n = s.nextInt();
		if(n<0) {
			throw new Exception ("Avete inserito un valore negativo. inserito valore di default -- 2 ");
		}
		return n;
	}

	public static void riempiArray(int N, Set<String> arr, List<String> b) {
		s.nextLine();
		for (int i = 0; i < N; i++) {
			l.debug("Inserisci stringa n°: " + i);
			String a = s.nextLine();
			boolean bool = arr.add(a);
			if (!bool) {
				b.add(a);
			}
		}
	}

	public static void stampa(Set<String> arr, List<String> b) {
		for (String t : arr) {
			System.out.println("contenuto set: " + t);
		}
		System.out.println("lunghezza array " + arr.size());
		for (int i = 0; i < b.size(); i++) {

			System.out.println("lista duplicati: " + b.get(i));
		}
	}

}
