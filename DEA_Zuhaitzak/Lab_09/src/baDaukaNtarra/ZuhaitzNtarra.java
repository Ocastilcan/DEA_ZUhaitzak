package baDaukaNtarra;

import java.util.Scanner;


public class ZuhaitzNtarra<T> {
	private AdabegiNtarra<T> erroa;
	
	/**
	 * ZuhaitzNtarra klasearen eraikitzailea: zuhaitz hutsa sortzen du.
	 * 
	 */
	public ZuhaitzNtarra() {
		this.erroa = null;
	}
	
	public AdabegiNtarra<T> getErroa() {
		return this.erroa;
	}
	/**
	 * ZuhaitzNtarra klasearen eraikitzailea: fitxategiko edukietatik zuhaitza
	 * sortzen du.
	 * 
	 */
	public ZuhaitzNtarra(Scanner source, Class<T> clazz) throws Exception {
		String token = source.next();
		if (token.equals("*"))
			this.erroa = null;
		else if (token.equals("["))
			this.erroa = new AdabegiNtarra<T>(source, clazz);
		else
			throw new Exception(String.format("Unexpected token when reading " + "N-tree: %s", token));
	}
	
	public boolean hutsaDa() {
		return this.erroa == null;
	}
	
	@Override
	public String toString() {
		if (this.hutsaDa())
			return " * ";
		return this.erroa.toString();
	}
	
	public boolean baDauka(T elem) {

		// HAU OSATU
		return false; // aldatu
	}

}
