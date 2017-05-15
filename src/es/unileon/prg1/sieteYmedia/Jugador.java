package es.unileon.prg1.sieteYmedia;

public class Jugador {

	private String nombre;
	
	protected Carta[] CartasJugador;
	protected float puntosJugador;
	
	public Jugador(String Numero, Carta CartasJugador){ 
		
		
	}
//Para la hora de nombrar al jugador
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public float getPuntos(){
		
			puntosJugador += CartasJugador.getValor();
		return this.puntosJugador;
	}
	
    public Carta[] tomaCarta(int carta){
    	 
for(int i=0;i<Baraja.lenght;i++){
	

    		CartasJugador= PedirCarta(i);
    	
    			   
    	return this.CartasJugador[i];
}
}


	}
	