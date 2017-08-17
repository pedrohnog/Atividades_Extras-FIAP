package br.com.fiap.autenticacao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

public class CustomLoginModule implements LoginModule {

	private CallbackHandler handler;
	private Subject subject;
	private UsuarioEntidade usuarioEntidade;
	private PerfilEntidade perfilEntidade;
	private String login;
	private List<String> userGroups;

	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
		handler = callbackHandler;
		this.subject = subject;
	}

	@Override
	public boolean login() throws LoginException {

		Callback[] callbacks = new Callback[2];
		callbacks[0] = new NameCallback("login");
		callbacks[1] = new PasswordCallback("password", true);

		try {

			handler.handle(callbacks);

			String name = ((NameCallback) callbacks[0]).getName();
			String password = String.valueOf(((PasswordCallback) callbacks[1]).getPassword());

			if (name != null && name.equals("usr") && password != null && password.equals("pass")) {
				login = name;
				userGroups = new ArrayList<String>();
				userGroups.add("role-admin");
				return true;
			}

			throw new LoginException("Authentication failed");

		} catch (IOException e) {
			throw new LoginException(e.getMessage());
		} catch (UnsupportedCallbackException e) {
			throw new LoginException(e.getMessage());
		}

	}

	@Override
	public boolean commit() throws LoginException {
		usuarioEntidade = new UsuarioEntidade(login);
		subject.getPrincipals().add(usuarioEntidade);

		if (userGroups != null && userGroups.size() > 0) {
			for (String groupName : userGroups) {
				perfilEntidade = new PerfilEntidade(groupName);
				subject.getPrincipals().add(perfilEntidade);
			}
		}

		return true;
	}

	@Override
	public boolean abort() throws LoginException {
		return false;
	}

	@Override
	public boolean logout() throws LoginException {
		subject.getPrincipals().remove(usuarioEntidade);
		subject.getPrincipals().remove(perfilEntidade);
		return true;
	}

}
