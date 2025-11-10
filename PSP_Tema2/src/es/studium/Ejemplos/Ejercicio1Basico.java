package es.studium.Ejemplos;

public class Ejercicio1Basico extends Thread
{
	
	String nombre;
	
	public Ejercicio1Basico(String nombreHilo)
	{
		nombre = nombreHilo;
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i + " " + nombre);
			
		}
		System.out.println("Termina thread " + nombre);
	}
	public static void main(String[] args)
	{
		Ejercicio1Basico e1b = new Ejercicio1Basico("Hilo de Prueba");
				e1b.start();

	}

}
