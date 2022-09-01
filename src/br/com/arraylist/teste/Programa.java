package br.com.arraylist.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.arraylist.beans.Cargo;

public class Programa {

	public static void main(String[] args) {
		
		Cargo c1 = new Cargo("DBA", "Junior", 3500);
		Cargo c2 = new Cargo("Estagiário", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3500);
		
	    List<Cargo> cargos = new ArrayList<Cargo>();
	     
	   cargos.add(c1);
	   cargos.add(c2);
	   cargos.add(c3);
	}

}
