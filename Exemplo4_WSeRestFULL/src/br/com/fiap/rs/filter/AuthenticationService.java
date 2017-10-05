package br.com.fiap.rs.filter;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenticationService {
	public boolean authenticate(String authCredentials) {
		if (authCredentials == null)
			return false; // Liga desliga

		// O formato do header será "Basic encodedstring" para Basic authentication
		final String encodedUserPassword = authCredentials.replaceFirst("Basic" + " ", "");
		System.out.println("encodedUserPassword: " + encodedUserPassword);

		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// A classe StringTokenizer quebra uma String em tokens
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");

		if (tokenizer.countTokens() < 2)
			return false;

		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();

		boolean authenticationStatus = "fabio".equals(username) && "123".equals(password);
		return authenticationStatus;
	}
}
