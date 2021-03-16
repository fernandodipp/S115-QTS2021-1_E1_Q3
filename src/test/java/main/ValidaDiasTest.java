package main;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;


public class ValidaDiasTest {
	@Test
	public void ValidaDiasTest1() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 0;
		boolean resultadoesperado = false;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaDiasTest2() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 1;
		boolean resultadoesperado = true;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaDiasTest3() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 30;
		boolean resultadoesperado = true;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaDiasTest4() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 31;
		boolean resultadoesperado = false;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaDiasTest5() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 15;
		boolean resultadoesperado = true;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaDiasTest6() {
		ValidaDias objExerc = new ValidaDias();		
		int entradaUser = 99;
		boolean resultadoesperado = false;
		boolean resultadoPrograma = objExerc.validaDias(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}

}
