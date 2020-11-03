package br.com.healthtrack.utils;

public class Util {
	public boolean tryParse(String value) {
		try {
			int teste = Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
