package tests_vikingo;

import org.junit.Assert;
import org.junit.Test;

import paqueteVikingo.Estado;
import paqueteVikingo.Vikingo;

public class TestVikingo {

	@Test
	public void testMNaMB() {
		Vikingo v1 = new Vikingo();
		Assert.assertEquals(Estado.NORMAL, v1.getEstado());
		v1.recibirDano(15+10);
		Assert.assertEquals(Estado.BERSERKER, v1.getEstado());
		Assert.assertEquals(30, v1.getAtaque());
		Assert.assertEquals(1, v1.getDefensa());
	}
	
	@Test
	public void testMBaMN() {
		Vikingo v1 = new Vikingo();
		v1.recibirDano(15+10);
		Assert.assertEquals(Estado.BERSERKER, v1.getEstado());
		v1.calmar();
		v1.calmar();
		v1.calmar();
		Assert.assertEquals(Estado.NORMAL, v1.getEstado());
		Assert.assertEquals(10, v1.getAtaque());
		Assert.assertEquals(10,v1.getDefensa());
	}
	
	@Test
	public void testMNaMM() {
		Vikingo v1 = new Vikingo();
		Assert.assertEquals(Estado.NORMAL, v1.getEstado());
		v1.calmar();
		Assert.assertEquals(Estado.MEDITAR, v1.getEstado());
		Assert.assertEquals(1, v1.getAtaque());
		Assert.assertEquals(50,v1.getDefensa());
		v1.calmar();
		Assert.assertEquals(Estado.MEDITAR, v1.getEstado());
		Assert.assertEquals(1, v1.getAtaque());
		Assert.assertEquals(50,v1.getDefensa());
	}
	
	@Test
	public void testMMaMN() {
		Vikingo v1 = new Vikingo();
		Assert.assertEquals(Estado.NORMAL, v1.getEstado());
		v1.calmar();
		Assert.assertEquals(Estado.MEDITAR, v1.getEstado());
		v1.recibirDano(50+5);
		Assert.assertEquals(Estado.NORMAL, v1.getEstado());
		Assert.assertEquals(10, v1.getAtaque());
		Assert.assertEquals(10,v1.getDefensa());
	}
	
	@Test
	public void testMMaMNBis() {
		Vikingo v1 = new Vikingo();
		v1.calmar();
		Assert.assertEquals(Estado.MEDITAR, v1.getEstado());
		v1.recibirDano(50+2);
		Assert.assertEquals(Estado.MEDITAR, v1.getEstado());
		Assert.assertEquals(1, v1.getAtaque());
		Assert.assertEquals(50,v1.getDefensa());
	}
	
}
