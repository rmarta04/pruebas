package es.unileon.prg1.sieteYmedia;

public enum Numero {
	AS(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	SOTA(0.5f),		//tipos float se definen con 0.635f (f al final)
	CABALLO(0.5f),
	REY(0.5f);
	
	private float valor;	//atributo creado para asignar un valor a cada Numero
	private Numero(float valor){
		this.valor = valor;
	}
	
	public float getValorNumero(){	//método creado para devolver valor del número
		return valor;
	}
}
