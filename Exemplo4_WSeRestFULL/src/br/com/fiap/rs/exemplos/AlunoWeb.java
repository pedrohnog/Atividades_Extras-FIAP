package br.com.fiap.rs.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alunos")
public class AlunoWeb {

	private static List<Aluno> alunos;

	static {
		alunos = new ArrayList<>();

		Aluno a = new Aluno();
		a.setNome("José");
		a.setMedia(6.7d);
		a.setTurma("29SCJ");

		Aluno a2 = new Aluno();
		a2.setNome("Fecharo");
		a2.setMedia(8.9d);
		a2.setTurma("29SCJ");

		alunos.add(a);
		alunos.add(a2);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunos() {
		return alunos;
	}

	@GET
	@Path("{indice}")
	@Produces(MediaType.APPLICATION_JSON)
	public Aluno getAluno(@PathParam("indice") int indice) {
		return alunos.get(indice);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Mensagem novo(Aluno a) {
		alunos.add(a);

		return new Mensagem("Aluno foi adicionado com sucesso.");
	}
	
	@PUT
	@Path("{indice}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Mensagem alterar(Aluno a, @PathParam("indice") int indice) {
		alunos.set(indice, a);
		return new Mensagem("Aluno foi alterado");
	}
	
	@DELETE
	@Path("{indice}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Mensagem excluir(@PathParam("indice") int indice) {
		alunos.remove(indice);
		return new Mensagem("Aluno foi removido");
	}

}
