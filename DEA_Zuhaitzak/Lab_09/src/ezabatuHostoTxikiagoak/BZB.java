package ezabatuHostoTxikiagoak;

import java.util.Scanner;


/**
 * Bilaketa Zuhaitz Bitarrak (BZB) errepresentatzeko klasea
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
	 * BZB klasearen eraikitzailea: fitxategiko edukietatik zuhaitza
	 * sortzen du.
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
	 * Uneko BZBtik e zenbaki osoa baino txikiagoak diren hostoak ezabatzen ditu,
	 * eta geratzen den BZBa itzultzen du.
	 * 
	 * @param e, zenbaki osoa
	 * @return BZBa, e baino txikiagoak diren hostoak ezabatuta
	 */
	public BZB ezabatuHostoTxikiagoak(int e) {

		if (this.erroa == null || (this.erroa.hostoaDa() && this.erroa.info < e)) return null;
		this.erroa.ezabatuHostoTxikiagoak(e);
		return erroa;
		
	}
}