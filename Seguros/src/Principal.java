import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DEFINO TODOS LOS SEGUROS DE LOS CASOS DE TESTING
		Individual i1 = new Individual(1200);
		i1.setAtributo("Tipo Seguro", "Empleado");
		i1.setAtributo("Nombre", "Lionel Messi");
		i1.setAtributo("Club actual", "Barcelona");
		i1.setAtributo("Puesto", "Delantero");
		i1.setAtributo("Edad", "30");
		
		Individual i2 = new Individual(1000);
		i2.setAtributo("Tipo Seguro", "Empleado");
		i2.setAtributo("Nombre", "Gonzalo Higuain");
		i2.setAtributo("Club actual", "Juventus");
		i2.setAtributo("Puesto", "Delantero");
		i2.setAtributo("Edad", "30");
		
		Individual i3 = new Individual(1100);
		i3.setAtributo("Tipo Seguro", "Empleado");
		i3.setAtributo("Nombre", "Sergio Aguero");
		i3.setAtributo("Club Actual", "Manchester City");
		i3.setAtributo("Puesto", "Delantero");
		i3.setAtributo("Edad", "29");
		
		Individual i4 = new Individual(350);
		i4.setAtributo("Tipo Seguro", "Empleado");
		i4.setAtributo("Puesto", "Tecnico");
		i4.setAtributo("Nombre", "Jorge Sampaoli");
		i4.setAtributo("Edad", "58");
		
		Individual i5 = new Individual(450);
		i5.setAtributo("Tipo Seguro", "Empleado");
		i5.setAtributo("Nombre", "Cristian Ansaldi");
		i5.setAtributo("Club Actual", "Torino");
		i5.setAtributo("Puesto", "Defensor");
		i5.setAtributo("Edad", "31");
		
		Individual i6 = new Individual(234);
		i6.setAtributo("Tipo Seguro", "Hogar");
		i6.setAtributo("Direccion", "España 1234");
		i6.setAtributo("Edad", "47");
		i6.setAtributo("Tipo", "Casa");
		
		Individual i7 = new Individual(187);
		i7.setAtributo("Tipo Seguro", "Automotor");
		i7.setAtributo("Modelo", "2014");
		i7.setAtributo("Edad", "4");
		i7.setAtributo("Tipo", "4 puertas");
		
		Individual i8 = new Individual(194);
		i8.setAtributo("Tipo Seguro", "Automotor");
		i8.setAtributo("Modelo", "2008");
		i8.setAtributo("Edad", "10");
		i8.setAtributo("Tipo", "Coupe");
		
		//CREO EL CONJUNTO INTEGRADOR DE DOS SEGUROS AUTOMOTORES CON UN DESCUENTO DEL 20%
		Conjunto automotores = new Conjunto();
		automotores.agregarSeguro(i7);
		automotores.agregarSeguro(i8);
		automotores.setDescuento(20);
		
		//IMPRIMO LOS VALORES DE CADA SEGURO DEL CONJUNTO INTEGRADOR DE LOS AUTOMOTORES
		String l1 = automotores.toString();
		System.out.println("Seguro integador de los dos automotores: ");
		System.out.println(l1);
		System.out.println("Costo del Seguro Integrador con el 20% de descuento: " + automotores.getCosto());
		
		//SEGURO INTEGRADOR DEL PLANTEL
		Conjunto jugadores = new Conjunto();
		jugadores.setDescuento(20);
		jugadores.agregarSeguro(i1);
		jugadores.agregarSeguro(i2);
		jugadores.agregarSeguro(i3);
		jugadores.agregarSeguro(i4);
		jugadores.agregarSeguro(i5);
		
		//CREO LA REFERENCIA A LAS FECHAS DE INICIO Y FIN
		LocalDate inicio = LocalDate.of(2018, Month.JUNE, 14);
		LocalDate fin = LocalDate.of(2018, Month.JULY, 15);
		
		//DEFINO LA REFERENCIA A VIAJERO
		Viajero v = new Viajero(inicio, fin, jugadores);
		
		//IMPRIMO LOS VALORES DE CADA SEGURO DENTRO DE VIAJERO
		System.out.println("Valores del seguro Viajero: " + "");
		l1 = v.toString();
		System.out.println(l1);
		System.out.println("Costo del Seguro Viajero" + v.getCosto());
		
		
		//CREO EL CONJUNTO COLECTIVO CON EL SEGURO DE SAMPAOLI, EL DE HOGAR Y EL AUTOMOTOR COUPE
		//CON EL DESCUENTO DEL 17.5%
		Conjunto mixto = new Conjunto();
		mixto.agregarSeguro(i4);
		mixto.agregarSeguro(i6);
		mixto.agregarSeguro(i8);
		mixto.setDescuento(17.5);
		
		//IMPRIMO LOS VALORES DE LOS SEGUROS DEL SEGURO INTEGRADOR MIXTO
		l1 = mixto.toString();
		System.out.println("Valores del seguro Mixto: " + "");
		System.out.println(l1);
		System.out.println("Costo del Seguro Mixto: " + mixto.getCosto());
		
		//CREO CRITERIOS DE BUSQUEDA PARA LISTAR
		IgualA B1 = new IgualA("Tipo Seguro", "Automotor");
		IgualA B2 = new IgualA("Puesto", "Delantero");
		CostoMayorA B3 = new CostoMayorA(600.0);
		IgualA B4 = new IgualA("Tipo Seguro", "Empleado");
		IgualA B5 = new IgualA("Puesto", "Delantero");
		CostoMayorA B6 = new CostoMayorA(1100.0);
		Multiple B7 = new Multiple();
		B7.agregarElementos(B4);
		B7.agregarElementos(B5);
		B7.agregarElementos(B6);
		
		//LISTAR
		
		
		
		
		
		
		/*List<Individual> lista1 = jugadores.Listar(B1);
		List<Individual> lista2 = automotores.Listar(B1);
		List<Individual> lista3 = mixto.Listar(B1);
		List<Individual> lista4 = jugadores.Listar(B2);
		List<Individual> lista5 = automotores.Listar(B2);
		List<Individual> lista6 = mixto.Listar(B2);
		List<Individual> lista7 = jugadores.Listar(B3);
		List<Individual> lista8 = automotores.Listar(B3);
		List<Individual> lista9 = mixto.Listar(B3);
		List<Individual> lista10 = jugadores.Listar(B7);
		List<Individual> lista11 = automotores.Listar(B7);
		List<Individual> lista12 = mixto.Listar(B7);
		
		//IMPRIMO LISTAS
		
		System.out.println("Lista 1: " + lista1.size());
		System.out.println("Lista 2: " + lista2.size());
		for (Individual i : lista2) {
			System.out.println(i.getAtributo("Tipo Seguro"));
		} 
		System.out.println("Lista 3: " + lista3.size());
		System.out.println("Lista 4: " + lista4.size());
		for (Individual i : lista4) {
			System.out.println(i.getAtributo("Nombre"));
		}
		System.out.println("Lista 5: " + lista5.size());
		System.out.println("Lista 6: " + lista6.size());
		System.out.println("Lista 7: " + lista7.size());
		for (Individual i : lista7) {
			System.out.println(i.getAtributo("Nombre"));
		}
		System.out.println("Lista 8: " + lista8.size());
		System.out.println("Lista 9: " + lista9.size());
		System.out.println("Lista 10: " + lista10.size());
		for (Individual i : lista10) {
			System.out.println(i.getAtributo("Nombre"));
		}
		System.out.println("Lista 11: " + lista11.size());
		System.out.println("Lista 12: " + lista12.size());
		*/
	}

}
