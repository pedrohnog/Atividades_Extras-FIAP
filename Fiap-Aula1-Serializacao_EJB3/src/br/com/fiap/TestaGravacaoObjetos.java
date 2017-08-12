package br.com.fiap;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestaGravacaoObjetos {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("medicamentos.txt"));

		Item med1 = new Item();
		med1.setNome("Doril");
		med1.setPreco(3.0);
		System.out.println(med1);

		Item med2 = new Item();
		med2.setNome("Dorflex");
		med2.setPreco(5.0);
		System.out.println(med2);

		List<Item> medicamentos = new ArrayList<Item>();
		medicamentos.add(med1);
		medicamentos.add(med2);
		
		oos.writeObject(medicamentos);
		oos.close();
	}

}
