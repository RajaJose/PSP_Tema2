package es.studium.Ejercicios;

import java.util.Random;

public class Nombre extends Thread
{
	public Nombre(String nombre)
	{
		super(nombre);
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Este es el Hilo: " + getName());
		}
	}

	public static void main(String[] args)
	{
		String[] nombre = {
				"Mercurio", "Venus", "Tierra", "Marte",
				"Júpiter", "Saturno", "Urano", "Neptuno", "Plutón"
		};

		Random aleatorio = new Random();
		for (int i = 0; i < 3; i++)
		{
			new Nombre(nombre[aleatorio.nextInt(9)]).start();
		}
	}
}