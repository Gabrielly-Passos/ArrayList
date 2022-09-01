package br.com.arraylist.beans;

public class Cargo {

	private String posicao;
	private String nivel;
	private double salario;
	

	public Cargo(String posicao, String nivel, double salario) {
		setPosicao(posicao);
		setNivel(nivel);
		setSalario(salario);
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
}
