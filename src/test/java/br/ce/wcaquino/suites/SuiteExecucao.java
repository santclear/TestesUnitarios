package br.ce.wcaquino.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.servicos.CalculadoraTest;
import br.ce.wcaquino.servicos.CalculoValorLocacaoTest;
import br.ce.wcaquino.servicos.LocacaoServiceTest;

/*
 * Os sistemas de IC por padrão rodam todos os testes que estão no pacote src/test,
 * inclusive a classe de suite, portanto os testes serão executados ao menos 2x. 
 * Esse tipo de classe pode não ser interessante em alguns casos. Sendo assim, 
 * sugere-se avaliar e necessidade do uso de classes similares a essa.
 * */
@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculoValorLocacaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {}
