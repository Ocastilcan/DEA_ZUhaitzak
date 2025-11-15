package zenbatHandiago;

import java.util.Scanner;

public class BZBAdabegia {
	int info;
	BZBAdabegia ezkerra;
	BZBAdabegia eskuina;

	/**
	 * BZBAdabegia klasearen eraikitzailea.
	 * 
	 * @param elem adabegiko elementua, int motakoa.
	 */
	public BZBAdabegia(int info) {
		this.info = info;
		ezkerra = null;
		eskuina = null;
	}

	public BZBAdabegia(Scanner source) throws Exception {
		this.info = source.nextInt();
		String token = source.next();
		if (token.equals("]")) {
			this.ezkerra = null;
			this.eskuina = null;
		} else {
			if (token.equals("["))
				this.ezkerra = new BZBAdabegia(source);
			else if (token.equals("*"))
				this.ezkerra = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (token.equals("["))
				this.eskuina = new BZBAdabegia(source);
			else if (token.equals("*"))
				this.eskuina = null;
			else
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
			token = source.next();
			if (!token.equals("]"))
				throw new Exception(String.format("Unexpected token when " + "reading binary tree: %s", token));
		}
	}

	/**
	 * BZBAdabegiak ezkerreko umea baduen ala ez itzultzen du.
	 * 
	 * @return true, ezkerreko umea baldin badu; false, bestela.
	 */
	public boolean baduEzkerra() {
		return this.ezkerra != null;
	}

	/**
	 * BZBAdabegiak eskuineko umea baduen ala ez itzultzen du.
	 * 
	 * @return true, eskuineko umea baldin badu; false, bestela.
	 */
	public boolean baduEskuina() {
		return this.eskuina != null;
	}

	/**
	 * BZBAdabegia hostoa den ala ez itzultzen du.
	 * 
	 * @return true, hostoa bada; false, bestela.
	 */
	public boolean hostoaDa() {
		return !this.baduEzkerra() && !this.baduEskuina();
	}

	@Override
	public String toString() {
		String emaitza = "[ " + this.info + " ";
		if (!this.hostoaDa()) {
			if (this.baduEzkerra())
				emaitza += this.ezkerra.toString();
			else
				emaitza += "* ";
			if (this.baduEskuina())
				emaitza += this.eskuina.toString();
			else
				emaitza += "* ";
		}
		emaitza += "] ";
		return emaitza;
	}

	
	// zenbatHandiago
	
	// HAU OSATU

}
