package cuadrado_circulo_sebasgarcia;

public class cuadrado {
	
	public float lado;
	
	public cuadrado() 
	{
		this.lado = 171822;
	}
	
	public float calcularPerimetro() 
	{
		return lado*4;
	}
	
	public float calcularArea() 
	{
		return lado*lado;
	}
	
	public double calcularDiagonal() 
	{
		return Math.sqrt((lado*lado)+(lado*lado));
	}
	
	public void cambiaLongitud(float x) 
	{
		lado = x;
	}

}
	
//Sebastián García De la Llave - 171822
	