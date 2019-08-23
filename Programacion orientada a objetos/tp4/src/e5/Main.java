package e5;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		System.out.println("CONGRESO CIENCIAS DE LA COMPUTACION");
		System.out.println();
		
		//CREO TRABAJO 1
		Vector<String> t1 = new Vector<String>();
		t1.add("Algoritmos");
		t1.add("Lenguajes de programacion");
		Criterio c1 = new CTodosTemas();
		Trabajo trabajo1 = new Trabajo(t1, c1);
		
		//CREO TRABAJO 2
		Criterio c2 = new CAlgunTema();
		Trabajo trabajo2 = new Trabajo(t1, c2);
		
		//CREO TRABAJO 3
		Vector<String> t3 = new Vector<String>();
		t3.add("POO");
		t3.add("Tic");
		t3.add("Visualizacion");
		Criterio c4 = new CAlgunTema();
		Trabajo trabajo3 = new Trabajo(t3, c4);
		
		//CREO TRABAJO 4
		Criterio c5 = new CTodosTemas();
		Trabajo trabajo4 = new Trabajo(t3, c5);
		
		//CREO EVALUADOR 1
		Vector<String> conocimiento1 = new Vector<String>();
		conocimiento1.add("Lenguajes de programacion");
		conocimiento1.add("Redes de comunicacion");
		Evaluador evaluador1 = new Evaluador(conocimiento1);
		
		//DEFINO EVALUADOR 2
		Vector<String> conocimiento2 = new Vector<String>();
		conocimiento2.add("Java");
		conocimiento2.add("Tic");
		Evaluador evaluador2 = new Evaluador(conocimiento2);
		
		//DEFINO EVALUADOR 3
		Vector<String> conociminetos3 = new Vector<String>();
		conociminetos3.add("Visualizacion");
		conociminetos3.add("Redes de comunicacion");
		conociminetos3.add("POO");
		conociminetos3.add("Lenguajes de programacion");
		conociminetos3.add("Java");
		conociminetos3.add("Tic");
		Evaluador evaluador3 = new Evaluador(conociminetos3);
		
		//DEFINO CONOCIMIENTOS DE EXPERTOS
		Vector<String> t2 = new Vector<String>();
		t2.add("Visualizacion");
		t2.add("Redes de comunicacion");
		t2.add("POO");
		
		//CREO EL ORGANIZADOR
		Organizador org = new Organizador(t2);
		org.addEvaluador(evaluador1);
		org.addEvaluador(evaluador2);
		org.addEvaluador(evaluador3);
		
		//AGREGO LOS TRABAJOS A UN ARREGLO
		Vector<Trabajo> trabajos = new Vector<Trabajo>();
		trabajos.add(trabajo1);
		trabajos.add(trabajo2);
		trabajos.add(trabajo3);
		trabajos.add(trabajo4);
		
		//PREGUNTO SI SON EXPERTOS
		for (int i = 0; i < org.getCantidadEvaluadores(); i++) {
			System.out.println("ES EXPERTO EL EVALUADOR " + (i + 1) + ": " + org.getExperto(i) + ". ");
		}
		System.out.println(" ");
		
		//PREGUNTO LOS TRABAJOS QUE PUEDE HACER CADA UNO
		for (int i = 0; i < org.getCantidadEvaluadores(); i++) {
			System.out.println("EVALUADOR " + (i + 1) + ": ");
			Vector<Trabajo> trabajosRes = org.getTrabajosEvaluadorDeterminado(i, trabajos);
			for (int j = 0; j < trabajosRes.size(); j++) {
				System.out.println("TEMAS: " + trabajosRes.elementAt(j).getTemas());
			}
		}
		
		//ASIGNO TODOS LOS TRABAJOS QUE SE PUEDAN A CADA UNO
		for (int i = 0; i < org.getCantidadEvaluadores(); i++) {
			for (int j = 0; j < trabajos.size(); j++) {
				org.addTrabajo(i, trabajos.elementAt(j));
			}
		}
		
		//PREGUNTO LA CANTIDAD DE TRABAJOS DE CADA UNO
		System.out.println(" ");
		for (int i = 0; i < org.getCantidadEvaluadores(); i++) {
			System.out.println("CANTIDAD DE TRABAJOS DEL EVALUADOR " + (i + 1) + ": " + org.getCantidadTrabajosEvaluador(i));
		}
		System.out.println("");

	}

}
