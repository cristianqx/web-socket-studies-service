package br.com.web.socket.studies.entity;

public class Notificacoes {

	private int count;
	
	public Notificacoes(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void increment() {
		this.count++;
	}
}
