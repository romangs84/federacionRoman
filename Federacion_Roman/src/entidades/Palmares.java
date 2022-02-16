package entidades;

public class Palmares<T extends Metal, S extends Participante> {
	private long id;

	private T medalla;
	private S participante;
	private Prueba prueba;

	private String observaciones;

	private long pureza;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public T getMedalla() {
		return medalla;
	}

	public void setMedalla(T medalla) {
		this.medalla = medalla;
	}

	public S getParticipante() {
		return participante;
	}

	public void setParticipante(S participante) {
		this.participante = participante;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Palmares() {

	}

	public Palmares(long id, T medalla, S participante, Prueba prueba, String observaciones) {
		super();
		this.id = id;
		this.medalla = medalla;
		this.participante = participante;
		this.prueba = prueba;
		this.observaciones = observaciones;
	}

	public String toString() {
		return this.getId() + this.getMetal() + "O" + id + "(" + pureza + "%) de fecha:" + this.getFecha()
				+ " ¿asignado?=" + this.isAsignada() + this.getPrueba() + this.getPrueba().getFecha()
				+ this.getPrueba().getLugar() ; 
	}

	private long getFecha() {
	
		return 0;
	}

	private long isAsignada() {
		
		return 0;
	}

	private long getMetal() {
		return 0;
	}

}
