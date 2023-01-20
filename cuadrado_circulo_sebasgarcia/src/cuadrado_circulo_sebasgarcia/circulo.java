package cuadrado_circulo_sebasgarcia;

public class circulo {
	
	public float radio;
	
	public circulo() 
	{
		this.radio = 171822;
	}
	
	public double calcularCircunferencia() 
	{
		return 2*(3.1416)*(radio);
	}
	
	public double calcularArea() 
	{
		return 3.1416*(radio*radio);
	}
	
	public void cambiaLongitud(float x) 
	{
		radio = x;
	}

}

//Sebastián García De la Llave - 171822