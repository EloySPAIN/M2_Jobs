package packageM02.clases;

public interface Valida {
	
	public void validaSueldo() throws Throwable; // IMPLEMENTA LA EXCEPCION OBLIGATORIAMENTE POR SER ABSTRACTA EN LA INTERFACE
	public double plantillaBonus();
	public final double PLUS_PLANTILLA = 0.10;// CONSTANTE BONUS SUELDO A LA PLANTILLA
}
