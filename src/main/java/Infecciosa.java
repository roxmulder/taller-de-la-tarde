
public class Infecciosa {
	private int cantidadDeCelulasAmenazadas;
	
	public void setCantidadDeCeuasAmenazadas(int cantidadDeCelulasAmenazadas){
		this.cantidadDeCelulasAmenazadas = cantidadDeCelulasAmenazadas;
	}
	
	public boolean esAgresiva(Persona unaPersona){
		return unaPersona.getCantidadDeCelulasTotales() * 0.1 < this.cantidadDeCelulasAmenazadas;
	}
}
