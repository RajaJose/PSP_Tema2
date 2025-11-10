package es.studium.Ejemplos;
public class ClienteConcurrente
{
	private String nombre;
	private int[] carroCompra;
	public ClienteConcurrente(String n, int[] c)
	{
		nombre = n;
		carroCompra = c;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public int[] getCarroCompra()
	{
		return carroCompra;
	}
}
