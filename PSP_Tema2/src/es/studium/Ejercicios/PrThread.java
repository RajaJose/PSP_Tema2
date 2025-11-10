package es.studium.Ejercicios;

public class PrThread extends Thread
{
	public PrThread(String nombre)
	{
		super(nombre);
	}

	@Override
	public void run()
	{
		boolean sigue = true;
		for (int i = 0; i < 100 && sigue; i++)
			try
		{
				System.out.println(getName() + ": " + i);
				Thread.sleep(500);
				if (i == 10)
				{
					this.interrupt();
				}
		}
		catch (InterruptedException e)
		{
			System.out.println(getName() + "interrumpido.");
			sigue = false;
		}
	}

	public static void main(String[] args)
	{
		PrThread hilo = new PrThread("Hilo");
		hilo.start();
	}
}