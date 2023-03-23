package es.studium.refactorizacion;

public class CalculoCostes
{

	private static final double SUELDO_TRABAJADORES = 1200.5;

	public static void main(String[] args)
	{
		System.out.println(costeTrabajadores(50));
	}
	
	public static double costeTrabajadores(int numeroTrabajadores) //la función se implementa fuera del main, dentro de la misma clase lo llamamos por su propio nombre en el main (costeTrabajadores) y si es fuera de ella, llamamos primero a la clase (CalculoCostes)
	{
	return SUELDO_TRABAJADORES * numeroTrabajadores; //refactor -> extract class (le ponemos el nombre que deseemos en mayus)
	}

}
