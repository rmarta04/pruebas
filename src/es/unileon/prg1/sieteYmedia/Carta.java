package es.unileon.prg1.sieteYmedia;

import es.unileon.prg1.sieteYmedia.Palo;
import es.unileon.prg1.sieteYmedia.SieteYmediaException;

public class Carta {

	private int numero;
	private Palo palo;

	/**
	 * 
	 * @param numero
	 * @param palo
	 * @throws SieteYmediaException
	 */
	public Carta(int numero, Palo palo) throws SieteYmediaException {
		StringBuilder error = new StringBuilder();

		if ((numero < 0 ) || (numero==8)||(numero==9)||(numero>12)) {
			error.append("Carta - Error: Numero " + numero + "no vï¿½lido.");
		} else {
			this.numero = numero;
		}

		if (palo ==null) {
			error.append("Carta - Error: Palo " + palo + "no válido.");
		} else {
			this.palo = palo;
		}

		if (error.length() != 0) {
			throw new SieteYmediaException(error.toString()); 
		}

	}

	public float getValor() throws SieteYmediaException {

		float valor = 0;

		switch (this.numero) {

		case 1:
			valor = 1;
			break;
		case 2:
			valor = 2;
			break;
		case 3:
			valor = 3;
			break;
		case 4:
			valor = 4;
			break;
		case 5:
			valor = 5;
			break;
		case 6:
			valor = 6;
			break;
		case 7:
			valor = 7;
			break;
		case 10:
			valor = 0.5f;
			break;
		case 11:
			valor = 0.5f;
			break;
		case 12:
			valor = 0.5f;
			break;
		}
		return valor;
	}

	/**
	 * @return numero de la carta 
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return el palo de la carta escrito
	 */
	public Palo getPalo() {
		return palo;
	}

	public String toString() {

		String numero = " ";

		switch (this.numero) {

		case 1:
			numero = "AS";
			break;
		case 2:
			numero = "DOS";
			break;
		case 3:
			numero = "TRES";
			break;
		case 4:
			numero = "CUATRO";
			break;
		case 5:
			numero = "CINCO";
			break;
		case 6:
			numero = "SEIS";
			break;
		case 7:
			numero = "SIETE";
			break;
		case 10:
			numero = "SOTA";
			break;
		case 11:
			numero = "CABALLO";
			break;
		case 12:
			numero = "REY";
			break;
		}

		return numero + " de " + palo + "\n";
	}

}
