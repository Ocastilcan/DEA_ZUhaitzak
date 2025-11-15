package tartekoLista;

import java.util.Scanner;
import java.util.LinkedList;

/**
 * Bilaketa Zuhaitz Bitarrak (BZB) errepresentatzeko klasea
 * 
 * @param <T>
 */
public class BZB {

	private BZBAdabegia erroa;

	/**
	 * BZB klasearen eraikitzailea: zuhaitz hutsa sortzen du.
	 * 
	 */
	public BZB() {
		this.erroa = null;
	}

	/**
	 * BZB klasearen eraikitzailea: fitxategiko edukietatik zuhaitza sortzen du.
	 * 
	 */
	public BZB(Scanner source) throws Exception {
		String token = source.next();
		if (token.equals("*"))
			this.erroa = null;
		else if (token.equals("["))
			this.erroa = new BZBAdabegia(source);
		else
			throw new Exception(String.format("Unexpected token when reading " + "binary tree: %s", token));
	}

	/**
	 * BZB hutsa den ala ez itzultzen du.
	 * 
	 * @return true, zuhaitz bitarra hutsa bada; false, bestela.
	 */
	public boolean hutsaDa() {
		return (erroa == null);
	}

	/**
	 * Erroa izeneko adabegia BZBaren erroan jartzen du.
	 * 
	 * @param erroa, BZBaren erroan jarriko den adabegia.
	 * @return eguneratutako zuhaitza itzultzen du.
	 */
	public BZB errotu(BZBAdabegia erroa) {
		this.erroa = erroa;
		return this;
	}

	/**
	 * java.lang.Object-etik heredatutako metodoaren gainidazketa.
	 * 
	 * @return zuhaitzaren edukia String formatuan.
	 */
	@Override
	public String toString() {
		if (this.hutsaDa())
			return " * ";
		return this.erroa.toString();
	}
	
	/**
	 * Zenbaki osoen BZB bat, eta bi zenbaki oso emanda, itzultzen du bi zenbaki horien artean
	 * dauden elementuekin osatutako lista.
	 * 
	 * @param behe, parametro honek markatzen du beheko balioa
	 * @param goi,  parametro honek markatzen du goiko balioa
	 * @return lista, BZBan behe<=x<=goi propietatea betetzen duten x guztiez osatua
	 * @aurre behe<=goi
	 */
	public LinkedList<Integer> tartekoLista(int behe, int goi) {

		// HAU OSATU
		return null;   // aldatu
	}
	
}