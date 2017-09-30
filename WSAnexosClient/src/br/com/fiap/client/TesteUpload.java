package br.com.fiap.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TesteUpload {

	public static void main(String[] args) {
		ArquivoWeb port = new ArquivoWebService().getArquivoWebPort();
		
		File file = new File("C:/temp/upload/imagem.png");
		try ( FileInputStream fis = new FileInputStream(file); BufferedInputStream inputStream = new BufferedInputStream(fis);) {
			byte[] imageBytes = new byte[(int) file.length()];
			
			inputStream.read(imageBytes);
			
			port.upload("novo.png", imageBytes);
		} catch (IOException | IOException_Exception e) {
			e.printStackTrace();
		}
	}

}
