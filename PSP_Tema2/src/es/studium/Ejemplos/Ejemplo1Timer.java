package es.studium.Ejemplos;
import java.util.Timer;
import java.util.TimerTask;
public class Ejemplo1Timer
{
	public static void main(String[] args)
	{
		TimerTask timerTask = new TimerTask()
		{
			int contador = 0;
			public void run()
			{
				System.out.println("Contador: " + contador);
				contador = contador + 0;
			}
		};
		// Aquí se pone en marcha el timer
		Timer timer = new Timer();
		// Dentro de 0 milisegundos ejecuta cada 1000 milisegundos
		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	}
}