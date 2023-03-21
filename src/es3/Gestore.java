package es3;

import java.util.HashMap;
import java.util.Map;

public class Gestore {

	public static void main(String[] args) {
		Map<String, Integer> nuovaListaContatti = new HashMap<String, Integer>();
		nuovaListaContatti.put("Mario", 12345);
		nuovaListaContatti.put("Luca", 23456);
		nuovaListaContatti.put("Stefano", 34567);
		nuovaListaContatti.put("Luigi", 45678);
		nuovaListaContatti.put("Carlo", 56789);
		nuovaListaContatti.put("Simone", 11111);
		nuovaListaContatti.put("Massimo", 22222);
		
		Rubrica prima = new Rubrica(nuovaListaContatti);
		
		prima.stampaRubrica();
		
		try {
			System.out.println(prima.getNumber("Mario"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		prima.cambiaNumero("Mario", 00000);
		
		try {
			System.out.println(prima.getNumber("Mario"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prima.removeContact("Mario");
		
		try {
			System.out.println(prima.getNumber("Mario"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prima.getNome(34567);

	}

}
