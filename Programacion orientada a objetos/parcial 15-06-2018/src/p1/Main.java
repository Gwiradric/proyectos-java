package p1;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		System.out.println("SERVIDOR DE NOTICIAS");
		System.out.println();
		
		//DEFINO NOTICIA 1
		SortedSet<String> palClaves = new TreeSet<String>();
		palClaves.add("Fafafa");
		palClaves.add("Diegote");
		palClaves.add("Maradroga");
		NAbs n1 = new Noticia("Deportes", "El Diegote atrapado con 100 kilos de crack", "El Pollo", "La fafafa", palClaves);
		
		//DEFINO NOTICIA 2
		SortedSet<String> palClaves2 = new TreeSet<String>();
		palClaves2.add("Mate");
		palClaves2.add("Scorpion");
		NAbs n2 = new Noticia("Chistes", "Scorpion cebando mates es el meme del a�o", "Nico", "Scorpion gana premio", palClaves2);
		
		//DEFINO NOTICIA 3
		SortedSet<String> palClaves4 = new TreeSet<String>();
		palClaves4.add("Monopoly");
		palClaves4.add("Muerte");
		NAbs n3 = new Noticia("Sociedad", "Su primo lo mato por ganarle en el monopoly", "Juan Perez", "Muerte por el Monopoly", palClaves4);
		
		//DEFINO NOTICIA 4
		SortedSet<String> palClaves5 = new TreeSet<String>();
		palClaves5.add("Manute");
		palClaves5.add("League of legends");
		palClaves5.add("Jugador espa�ol");
		NAbs n4 = new Noticia("Sociedad", "Jugador espa�ol salva al mundo con su actitud anti toxica", "Roberto Dota", "De YouTuber a Heroe", palClaves5);
		
		//DEFINO NOTICIA 5
		SortedSet<String> palClaves6 = new TreeSet<String>();
		palClaves6.add("Jojo");
		palClaves6.add("Anime");
		NAbs n5 = new Noticia("Sociedad", "Jojo's Bizarre Adventure regresa con Giorno Giovanna", "Alan Erick Andersson", "Nueva temporada de Jojo's", palClaves6);
		
		//DEFINO NOTICIA 6
		SortedSet<String> palClaves7 = new TreeSet<String>();
		palClaves7.add("Futbol");
		palClaves7.add("Wanda Nara");
		palClaves7.add("Cafesitoo");
		NAbs n6 = new Noticia("Deportes", "Nuevo video de Wanda Nara haciendo un petardo", "El Pollo", "Cafesitooo", palClaves7);
		
		//DEFINO NOTICIA 7
		SortedSet<String> palClaves3 = new TreeSet<String>();
		palClaves3.add("Del Potro");
		palClaves3.add("Tenis");
		NAbs n7 = new Noticia("Deportes", "Del Potro perdio la final de la David por muy poco contra Federer", "TyC Sports", "Del Potro pecheo", palClaves3);
		
		//DEFINO NOTICIA 8
		SortedSet<String> palClaves8 = new TreeSet<String>();
		palClaves8.add("Exactas");
		palClaves8.add("Olimpiadas UNICEN");
		palClaves8.add("Un Decampeon");
		NAbs n8 = new Noticia("Deportes", "La facultad de ciencias exactas volvio a ganar las Olimpiadas de la Unicen", "CEFCE", "EXACAMPEON", palClaves8);
		
		//DEFINO SECCION 1
		Vector<NAbs> secciones1 = new Vector<NAbs>();
		secciones1.add(n1);
		secciones1.add(n2);
		NAbs s1 = new Seccion(secciones1);
		
		//DEFINO SECCION 2
		Vector<NAbs> secciones2 = new Vector<NAbs>();
		secciones2.add(n3);
		secciones2.add(n4);
		NAbs s2 = new Seccion(secciones2);
		
		//DEFINO SECCION 3
		Vector<NAbs> secciones3 = new Vector<NAbs>();
		secciones3.add(s1);
		secciones3.add(s2);
		secciones3.add(n5);
		NAbs s3 = new Seccion(secciones3);
		
		//DEFINO SECCION 4
		Vector<NAbs> secciones4 = new Vector<NAbs>();
		secciones4.add(n6);
		secciones4.add(s3);
		secciones4.add(n7);
		secciones4.add(n8);
		NAbs s4 = new Seccion(secciones4);
		
		//BUSCO POR FILTRO
		Filtro f = new FOr(new FTexto("mates"), new FTitulo("De YouTuber a Heroe"));
		Vector<NAbs> noticias = s4.buscar(f);
		
		//RECORRO NOTICIAS PARA OBTENER LAS CATEGORIAS
		System.out.println("CATEGORIA NOTICIA N1: " + n1.getCategoria());
		System.out.println("CATEGORIA SECCION S4: " + s4.getCategoria());
		
		//DEFINO EL CLASIFICADOR Y CLASIFICO S4
		Clasificador c1 = new Clasificador(new FOr(new FTexto("mates"), new FTitulo("De YouTuber a Heroe")), new APalClave("Meme"));
		Clasificador c2 = new Clasificador(new FCategoria("Deportes"), new APalClave("Fede"));
		Vector<Clasificador> vC = new Vector<Clasificador>();
		vC.add(c1);
		vC.add(c2);
		
		//CLASIFICO
		System.out.println(" ");
		System.out.println("A LAS CATEGORIAS DE DEPORTES SE LE AGREGA LA PALABRA CLAVE Fede Y A EL TEXTO QUE TENGA mates O TENGA DE TITULO De YouTuber a Heroe SE LE AGREGA Meme");
		s4.clasificar(vC);
		
		//IMPRIMO EL RESULTADO DE LA CLASIFICACION DE S4
		noticias = s4.buscar(f);
		System.out.println("");
		System.out.println("BUSQUEDA DE TEXTO Mate O TITULO De Youtuber a Heroe:");
		for (int i = 0; i < noticias.size(); i++) {
			System.out.println(noticias.elementAt(i).getPalClave().toString());
		}
		
		noticias = s4.buscar(new FCategoria("Deportes"));
		System.out.println("");
		System.out.println("BUSQUEDA DE CATEGORIA DEPORTES:");
		for (int i = 0; i < noticias.size(); i++) {
			System.out.println(noticias.elementAt(i).getPalClave().toString());
		}
		
		System.out.println("");
		System.out.println("UNIO DE PALABRAS CLAVE SIN REPETIDOS: ");
		SortedSet<String> set = s4.getPalClave();
		System.out.println(set);
		
		
		System.out.println("");
		System.out.println("COPIA POR FILTRO:");
		NAbs copy = s4.getCopia(new FCategoria("Deportes"));
		System.out.println(copy.toString());
	}

}
