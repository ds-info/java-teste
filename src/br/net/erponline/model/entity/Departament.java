package br.net.erponline.model.entity;

public class Departament {
	private int id;
	private String name;
	
	public Departament() {

	}
	public Departament(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Departament [id=" + id + ", name=" + name + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}