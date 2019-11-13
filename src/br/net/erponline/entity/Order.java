package br.net.erponline.entity;

import java.util.Date;

import br.net.erponline.entity.enums.Genere;
import br.net.erponline.entity.enums.OrderStatus;

public class Order {
	private int id;
	private Date moment;
	private OrderStatus status;
	private Genere genero;
		
	public Order() {

	}
	
	public Order(int id, Date moment, OrderStatus status, Genere genero) {
		this.id = id;
		this.moment = moment;
		this.status = status;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + ", genero=" + genero + ", idgenero=" + genero.getGenere() + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Genere getGenero() {
		return genero;
	}

	public void setGenero(Genere genero) {
		this.genero = genero;
	}
}