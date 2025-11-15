package baDaukaNtarra;

import java.util.List;
import java.util.Scanner;


import java.util.LinkedList;

public class AdabegiNtarra<T> {
	private T info;
	private List<AdabegiNtarra<T>> umeak;

	public AdabegiNtarra(T datua) {
		this.info = datua;
		umeak = new LinkedList<AdabegiNtarra<T>>();
	}

	public AdabegiNtarra(Scanner source, Class<T> clazz) throws Exception {
		String balioa = source.next();
		this.info = bihurtuBalioa(balioa, clazz);
		this.umeak = new LinkedList<AdabegiNtarra<T>>();
		String token = source.next();
		if (!token.equals("]")) {
			while ((token.equals("["))) {
				this.umeak.add(new AdabegiNtarra<T>(source, clazz));
				token = source.next();
			}
		}
	}

	/**
	 * Parametroz emandako clazz datu-motara bigurtzen du emandako 'balioa'
	 * 
	 * @param balioa Bihurtu beharreko balioa
	 * @param clazz  Bihurketak helburu duen datu-motaren klase deklarazioa
	 * @return Bihurketarako helburu den datu-motako balioa
	 * @exception ClassCastException salbuespena gertatu daiteke 'balioa' ezin bada
	 *                               emandako datu-motara bihurtu
	 */
	@SuppressWarnings("unchecked")
	private T bihurtuBalioa(String balioa, Class<T> clazz) {
		if (clazz.equals(Integer.class) || clazz.equals(int.class))
			return (T) Integer.valueOf(balioa);
		if (clazz.equals(Long.class) || clazz.equals(long.class))
			return (T) Long.valueOf(balioa);
		else if (clazz.equals(Float.class) || clazz.equals(float.class))
			return (T) Float.valueOf(balioa);
		else if (clazz.equals(Double.class) || clazz.equals(double.class))
			return (T) Double.valueOf(balioa);
		else if (clazz.equals(Character.class) || clazz.equals(char.class))
			return (T) Character.valueOf(balioa.charAt(0));
		else if (clazz.equals(Boolean.class) || clazz.equals(boolean.class))
			return (T) Boolean.valueOf(balioa);
		else
			return (T) balioa;
	}

	
	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public List<AdabegiNtarra<T>> getUmeak() {
		return umeak;
	}

	public void setUmeak(List<AdabegiNtarra<T>> umeak) {
		this.umeak = umeak;
	}

	public boolean hostoaDa() {
		return this.umeak.isEmpty();
	}


	@Override
	public String toString() {
		String emaitza = "[ " + this.info + " ";
			for (AdabegiNtarra<T> adaNtarra : this.umeak) {
				emaitza += adaNtarra.toString();
			}
		emaitza += "] ";
		return emaitza;
	}
	

	// baDauka AdabegiNtarra klasean
	
	// HAU OSATU



}