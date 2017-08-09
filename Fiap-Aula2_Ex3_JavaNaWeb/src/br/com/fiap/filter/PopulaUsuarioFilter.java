package br.com.fiap.filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.fiap.bean.UsuarioSessaoBean;

@WebFilter("/*")
public class PopulaUsuarioFilter implements Filter {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		
		HttpSession sessao = httpRequest.getSession(true);
		
		UsuarioSessaoBean usuario = (UsuarioSessaoBean) sessao.getAttribute("usuario");
		
		if (usuario == null) {
			usuario = new UsuarioSessaoBean();
			usuario.setPrimeiroAcesso(sdf.format(new Date()));
		}
		
		usuario.setUltimoAcesso(sdf.format(new Date()));
		
		sessao.setAttribute("usuario", usuario);
		
		chain.doFilter(request, response);
	}

}
