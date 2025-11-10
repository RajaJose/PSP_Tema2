package es.studium.Ejemplos;
public class PruebaCajeraThread
{
	public static void main(String[] args)
	{
		ClienteConcurrente cliente1 = new ClienteConcurrente("Cliente 1", new int[]
				{ 2, 2, 1, 5, 2, 3 });
		ClienteConcurrente cliente2 = new ClienteConcurrente("Cliente 2", new int[]
				{ 1, 3, 5, 1, 1 });
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);
		cajera1.start();
		cajera2.start();
	}
}
