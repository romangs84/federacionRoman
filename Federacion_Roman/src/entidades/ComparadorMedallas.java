package entidades;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import utils.Datos;

public class ComparadorMedallas implements Comparator<Metal> {

	@Override
	public int compare(Metal o1, Metal o2) {

		return (int) (o1.getPureza() - o2.getPureza());
	}

	public static void medallasOrdenadas() {
		LinkedList<Metal> aux = new LinkedList<Metal>();
		for (Oro m : Datos.OROS)
			aux.add(m);
		for (Plata m : Datos.PLATAS)
			aux.add(m);
		for (Bronce m : Datos.BRONCES)
			aux.add(m);

		Collections.sort(aux, new ComparadorMedallas());
		Iterator<Metal> it = aux.iterator();
		while (it.hasNext());
		System.out.println("Metal" + it.next());
	}

}
