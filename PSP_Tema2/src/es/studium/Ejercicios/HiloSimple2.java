package es.studium.Ejercicios;

public class HiloSimple2 implements Runnable {

	String nombre;
	public HiloSimple2 (String n)
	{
		this.nombre = n;
	}

	// Método que ejecuta el hilo
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println( "Este es el Hilo: " + nombre);
		}
	}

	// Método principal
	public static void main(String[] args)
	{
		HiloSimple2 h = new HiloSimple2("Hilo de prueba");
		Thread miHilo = new Thread(h);
		miHilo.start();
	}
}