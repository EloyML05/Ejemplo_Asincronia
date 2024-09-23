package net.ausiasmarch.control.model;

import java.util.Random;

public class Dado {
	Random numeroRandom = new Random();
	int dado = numeroRandom.nextInt(6) + 1;
	
	public int getDado() {
		return dado;
	}
}
