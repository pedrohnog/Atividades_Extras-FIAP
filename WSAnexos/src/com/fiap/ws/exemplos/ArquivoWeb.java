package com.fiap.ws.exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ArquivoWeb {
	
	@WebMethod
	public void upload(String filename, byte[] imageBytes) throws IOException {
		String filePath = "C:/temp/upload/" + filename;
		
		try (FileOutputStream fos = new FileOutputStream(filePath); BufferedOutputStream outputStream = new BufferedOutputStream(fos);) {
			outputStream.write(imageBytes);
		}
	}
	
	@WebMethod
	public byte[] download(String filename) throws IOException {
		String filePath = "C:/temp/download/" + filename;
		
		File file = new File(filePath);
		
		try (FileInputStream fis = new FileInputStream(file); BufferedInputStream inputStream = new BufferedInputStream(fis);) {
			byte[] fileBytes = new byte[(int) file.length()];
			
			inputStream.read(fileBytes);
			
			return fileBytes;
		}
	}
	
}
