package br.com.dio.desafio.dominio;

public class Forum extends Conteudo{
	
	private boolean status; //false - aberta - true - fechada
	private Dev autor;
	
	public Forum() {	
	}

	public boolean isStatus() {
		return status;
	}

	public Dev getAutor() {
		return autor;
	}

	public void setAutor(Dev autor) {
		this.autor = autor;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public double calcularXp() {
		 return XP_PADRAO + 5;
	}

}
