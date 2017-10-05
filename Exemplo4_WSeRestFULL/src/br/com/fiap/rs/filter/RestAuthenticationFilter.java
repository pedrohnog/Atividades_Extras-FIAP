package br.com.fiap.rs.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RestAuthenticationFilter implements javax.servlet.Filter {
	public static final String AUTHENTICATION_HEADER = "Authorization";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {

		if (request instanceof HttpServletRequest) {

			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			// Pega o cabeçalho de autenticação
			String authCredentials = httpServletRequest.getHeader(AUTHENTICATION_HEADER);

			AuthenticationService authenticationService = new AuthenticationService();

			// Verifica a autenticação com as credenciais recebidas no Header

			boolean authenticationStatus = authenticationService.authenticate(authCredentials);

			// Se autenticado
			if (authenticationStatus) {
				// O Filtro libera a execução do request e do response
				filter.doFilter(request, response);
			} else {
				if (response instanceof HttpServletResponse) {
					// Cria um obj HttpServletResponse
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					// Atribui o status 401 - não autorizado
					httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					// Escreve a mensagem como retorno a quem chamou, envia e fecha
					httpServletResponse.getWriter().write("Acesso ao serviço não autorizado!");
					httpServletResponse.getWriter().flush();
					httpServletResponse.getWriter().close();
				}
			}
		}

	}

	@Override
	public void destroy() {
		// executa quando o filtro não descarregado pelo container
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// executa quando o filtro carregado pelo container
	}
}
