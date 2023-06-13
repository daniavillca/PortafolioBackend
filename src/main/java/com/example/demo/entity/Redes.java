package com.example.demo.entity;

public class Redes {
	private String id;
	private String redes;
	private String urlRed;

	public Redes(String id, String redes, String urlRed) {
		this.id = id;
		this.redes = redes;
		this.urlRed = urlRed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRedes() {
		return redes;
	}

	public void setRedes(String redes) {
		this.redes = redes;
	}

	public String getUrlRed() {
		return urlRed;
	}

	public void setUrlRed(String urlRed) {
		this.urlRed = urlRed;
	}

}
