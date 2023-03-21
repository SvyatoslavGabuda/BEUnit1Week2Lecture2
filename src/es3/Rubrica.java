package es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Rubrica {
	Map<String, Integer> Contatti = new HashMap<String, Integer>();

	public Rubrica(Map<String, Integer> i) {
		this.Contatti = i;
	}
	public void stampaRubrica() {
		for(String i : this.Contatti.keySet()) {
			System.out.println(i + "\t" + this.Contatti.get(i) );
		}
	}

	public void addToContatti(String s, int i) {
		this.Contatti.put(s, i);
	}

	public int getNumber(String s) throws Exception{
		if (this.Contatti.containsKey(s)) {

			return this.Contatti.get(s);
		}else {
			throw new Exception("Contatto inesistente");
			
		}
	}

	public void getNome(int i) {
		if (this.Contatti.containsValue(i)) {
			for (Entry<String, Integer> entry : Contatti.entrySet()) {
				if (Objects.equals(i, entry.getValue())) {
					System.out.println("trovato " + entry.getKey());
				}
			}
		}
		;
	}

	public void cambiaNumero(String s, int i) {
		if (this.Contatti.containsKey(s)) {
			this.Contatti.replace(s, this.Contatti.get(s), i);
			System.out.println("Contatto aggiornato");
		} else {
			System.out.println("Contatto non trovato");
		}

	}

	public void removeContact(String s) {
		if (this.Contatti.containsKey(s)) {

			this.Contatti.remove(s);
		} else {
			System.out.println("Contatto non trovato");
		}
	}

}
