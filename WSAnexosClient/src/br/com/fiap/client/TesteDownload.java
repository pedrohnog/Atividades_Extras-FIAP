package br.com.fiap.client;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteDownload {

	public static void main(String[] args) {
		ArquivoWeb port = new ArquivoWebService().getArquivoWebPort();
		
		try (FileOutputStream fos = new FileOutputStream("c:/temp/imagem.png"); BufferedOutputStream outputStream = new BufferedOutputStream(fos);) {
			byte[] fileBytes = port.download("03.png");
			
			outputStream.write(fileBytes);
		} catch (IOException_Exception | IOException e) {
			e.printStackTrace();
		}
	}

}
