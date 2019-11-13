package br.net.erponline.entity.enums;

public enum Genere {
	MALE(0),
	FEMELE(1);
	
	private int id;
	Genere(int id) {
		this.id = id;
	}
	
	public int getGenere() {
		return this.id;
	}
}