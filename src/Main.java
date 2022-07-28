import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Forum;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	
		//Instanciando curso de Java
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Java Básico");
		cursoJava.setDescricao("Fundamentos da linguagem");
		cursoJava.setCargaHoraria(4);
		
		Curso cursoJava2 = new Curso();
		cursoJava2.setTitulo("Java Intermediario");
		cursoJava2.setDescricao("Java II");
		cursoJava2.setCargaHoraria(4);
		
		Curso cursoJava3 = new Curso();
		cursoJava3.setTitulo("Java Avançado");
		cursoJava3.setDescricao("Java III");
		cursoJava3.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Aprenda na prática");
		LocalDate data = LocalDate.of(2022, 7, 2);
		mentoria.setData(data);
		
		
		//Vinculando cursos ao bootcamp		
		Bootcamp camp = new Bootcamp();
		camp.setNome("BootCamp JAVA");
		camp.setConteudo(cursoJava);
		camp.setConteudo(cursoJava2);
		camp.setConteudo(cursoJava3);
		camp.setConteudo(mentoria);
		
		
		Dev devAlex = new Dev();
		devAlex.setNome("Alex");
		devAlex.inscreverBootcamp(camp);
		devAlex.progredir();
		devAlex.progredir();
		
		Forum forum = new Forum();
		forum.setAutor(devAlex);
		forum.setDescricao("Como configurar as variaveis de ambiente?");
		forum.setStatus(false);
		forum.setTitulo("Variaveis de Ambiente");
		devAlex.postarDuvida(forum);
		devAlex.responderDuvida(forum);
		
		//Relatório
		
		System.out.println("Olá " + devAlex.getNome() + ", segue abaixo um relatório sobre suas atividades na plataforma: ");
		System.out.println("===============");
		System.out.println("BootCamp inscrito: " + camp.getNome());
		System.out.println("Total XP: "+ devAlex.calcularTotalXp());
		System.out.println("===============");
				
	}

}
