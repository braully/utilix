/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:15:18
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:15:18
 * 
 */


package br.com.nordestefomento.jrimum.utilix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.text.ParseException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMonetaryId {
	
	private BigDecimal numero;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testFmt_Real() {
		
		try {
			
			numero = new BigDecimal(".50");
			assertEquals("0,50", MonetaryUtil.FORMAT_REAL.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL.parse(MonetaryUtil.FORMAT_REAL.format(numero)));
			
			numero = new BigDecimal("100.50");
			assertEquals("100,50", MonetaryUtil.FORMAT_REAL.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL.parse(MonetaryUtil.FORMAT_REAL.format(numero)));
			
			numero = new BigDecimal("15100.50");
			assertEquals("15.100,50", MonetaryUtil.FORMAT_REAL.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL.parse(MonetaryUtil.FORMAT_REAL.format(numero)));
			
			numero = new BigDecimal("100.509");
			assertEquals("100,51", MonetaryUtil.FORMAT_REAL.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL.parse(MonetaryUtil.FORMAT_REAL.format(numero)));
			
			numero = new BigDecimal("10050");
			assertEquals("10.050,00", MonetaryUtil.FORMAT_REAL.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL.parse(MonetaryUtil.FORMAT_REAL.format(numero)));
		}
		catch(ParseException e) {
			fail("Erro de PARSE: " + e);
		}
	}
	
	@Test
	public void testFmt_R$_Real() {
		
		try {
		
			numero = new BigDecimal("0.50");
			assertEquals("R$ 0,50", MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL_COM_PREFIXO.parse(MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero)));
			
			numero = new BigDecimal("100.50");
			assertEquals("R$ 100,50", MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL_COM_PREFIXO.parse(MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero)));
			
			numero = new BigDecimal("15100.50");
			assertEquals("R$ 15.100,50", MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL_COM_PREFIXO.parse(MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero)));
			
			numero = new BigDecimal("100.509");
			assertEquals("R$ 100,51", MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL_COM_PREFIXO.parse(MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero)));
			
			numero = new BigDecimal("10050");
			assertEquals("R$ 10.050,00", MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero));
			assertEquals(numero, MonetaryUtil.FORMAT_REAL_COM_PREFIXO.parse(MonetaryUtil.FORMAT_REAL_COM_PREFIXO.format(numero)));
		}
		catch(ParseException e) {
			fail("Erro de PARSE: " + e);
		}
	}

}
