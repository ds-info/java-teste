package br.net.erponline.model.entity.enums;

public enum WorkerLevel {
	JUNIOR(0),
	MID_LEVEL(1),
	SENIOR(2);
	
	private int id;

	private WorkerLevel(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}