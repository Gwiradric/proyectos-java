package e4;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		//DEFINO LOTE 1
		Vector<String> v1 = new Vector<String>();
		v1.add("Zinc");
		v1.add("Yodo");
		v1.add("Hierro");
		v1.add("Agua");
		Lote l1 = new Lote(25, 25, v1);
		
		//DEFINO LOTE 2
		Vector<String> v2 = new Vector<String>();
		v2.add("Acido");
		v2.add("Calcio");
		v2.add("Yodo");
		v2.add("Agua");
		Lote l2 = new Lote(37, 150, v2);
		
		//DEFINO LOTE 3
		Vector<String> v3 = new Vector<String>();
		v3.add("Acido");
		v3.add("Calcio");
		v3.add("Yodo");
		v3.add("Zinc");
		v3.add("Yodo");
		v3.add("Hierro");
		v3.add("Agua");
		Lote l3 = new Lote(79, 2000, v3);
		
		//AGREGO LOTES A LA COMPARATIVA
		Cooperativa coop1 = new Cooperativa();
		coop1.add(l1);
		coop1.add(l2);
		coop1.add(l3);
		
		//AGREGO LOS MINERALES DEL CEREAL 1 Y LO DEFINO
		Criterio c1 = new CMinerales(v2);
		Cereal cereal1 = new Cereal("Trigo", c1);
		
		//AGREGO LOS MINERALES DEL CEREAL 2 Y LO DEFINO
		Vector<String> v4 = new Vector<String>();
		v4.add("Agua");
		Criterio c2 = new CMinerales(v4);
		Cereal cereal2 = new Cereal("Soja", c2);
		
		//CAMBIO EL CRITERIO POR UN AND
		Criterio c3 = new CSuperficie(150);
		Criterio c5 = new CMinerales(v3);
		Criterio c4 = new CAnd(c5, c3);
		Cereal cereal3 = new Cereal("Girasol", c4);
		
		//CREO UN VECTOR DE CEREALES
		Vector<Cereal> cereales = new Vector<Cereal>();
		cereales.add(cereal1);
		cereales.add(cereal2);
		cereales.add(cereal3);
		
		//IMPRIMO LOS LOTES QUE CORRESPONDEN A CADA CEREAL
		System.out.println("RECOMENDACION DE LOTES PARA CADA CEREAL: ");
		for (int i = 0; i < cereales.size(); i++) {
			System.out.println("NOMBRE DE CEREAL: " + cereales.elementAt(i).getNombre() + ". ");
			Vector<Lote> lotes = coop1.getLotesCerealEspecifico(cereales.elementAt(i));
			for (int j = 0; j < lotes.size(); j++) {
				System.out.print("NUMERO DE LOTE: " + lotes.elementAt(j).getNumeroLote() + ". ");
			}
			System.out.println(" ");
		}
		
		//IMPRIMO TODOS LOS CEREALES QUE SIRVEN PARA CADA LOTE
		System.out.println(" ");
		System.out.println("RECOMENDACION DE CEREALES PARA CADA LOTE: ");
		Vector<Cereal> cerealesResultado;
		for (int i = 0; i < coop1.getCantidadLotes(); i++) {
			System.out.println("NUMERO DE LOTE: " + coop1.getLoteEspecifico(i).getNumeroLote() + ".");
			cerealesResultado = coop1.getCerealesLoteEspecifico(i, cereales);
			for (int j = 0; j < cerealesResultado.size(); j++) {
				System.out.print("NOMBRE CEREAL: " + cerealesResultado.elementAt(j).getNombre() + ". ");
			}
			System.out.println(" ");
		}
		
		//CREO UN VECTOR DE INTERESES PRIMARIOS
		Vector<String> v5 = new Vector<String>();
		v5.add("Zinc");
		coop1.setIntPrimario(v5);
		
		//VERIFICO SI ES ESPECIAL CADA LOTE
		System.out.println(" ");
		for (int i = 0; i < coop1.getCantidadLotes(); i++) {
			System.out.println("ES ESPECIAL?: " + coop1.esEspecial(i));
		}
	}

}
