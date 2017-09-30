package com.fiap.exemplo.ws;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService
public class AlunoWeb {
	
	@Resource
	WebServiceContext wsctx;
	
	private List<Aluno> alunos;
	
	public AlunoWeb() {
		alunos = new ArrayList<>();
	}
	
	private boolean autenticado(String usuario, String senha) {
		return usuario != null && usuario.equals("pedro") && senha != null && senha.equals("123");
	}
	
	@WebMethod
	public String novo(	@WebParam(name="Aluno",		header=false)	Aluno a,
						@WebParam(name="Usuario",	header=true)	String usuario,
						@WebParam(name="Senha",		header=true)	String senha) throws Exception {
		if (this.autenticado(usuario, senha)) {
			this.alunos.add(a);
			return "Cadastrado";
		} else {
			throw new Exception("Usuário e/ou senha inválida");
		}
	}
	
	@WebMethod
	public List<Aluno> listar(	@WebParam(name="Usuario",	header=true)	String usuario,
								@WebParam(name="Senha",		header=true)	String senha) throws Exception {
		if (this.autenticado(usuario, senha)) {
			return this.alunos;
		} else {
			throw new Exception("Usuário e/ou senha inválida");
		}
	}
	
}
