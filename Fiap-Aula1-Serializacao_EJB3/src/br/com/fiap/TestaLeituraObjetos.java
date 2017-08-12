package br.com.fiap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraObjetos {

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("medicamentos.txt"));
		List<Item> medicamentos = (List<Item>) ois.readObject();

		for (Item med : medicamentos) {
			System.out.println(med);
			System.out.println(med.getNome());
			System.out.println(med.getPreco());
			System.out.println("---------------------");
		}
	}

}
