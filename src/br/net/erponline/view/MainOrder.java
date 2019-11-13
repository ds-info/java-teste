package br.net.erponline.view;

import java.util.Date;

import br.net.erponline.entity.Order;
import br.net.erponline.entity.enums.Genere;
import br.net.erponline.entity.enums.OrderStatus;

public class MainOrder {

	public static void main(String[] args) {
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT, Genere.FEMELE);
		System.out.println(order);
		System.out.println(OrderStatus.valueOf("DELIVERED"));
	}
}