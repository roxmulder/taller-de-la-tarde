import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestEnfermedad {
	
	private Infecciosa malaria;
	private Persona frank;
	
	@Before
	public void inicializarEscenario(){
	
		malaria.setCantidadDeCeuasAmenazadas(101);
		frank.setCantidadDeCelulasTotales(1000);
	}
	
	
	
	@Test
	public void unaEnfermedadInfecciosaEsAgresiva(){
	
		malaria.setCantidadDeCeuasAmenazadas(100);
		frank.setCantidadDeCelulasTotales(1000);
	
	
	
	boolean esAgresiva = malaria.esAgresiva(frank);
	Assert.assertTrue(esAgresiva);

	}
}
