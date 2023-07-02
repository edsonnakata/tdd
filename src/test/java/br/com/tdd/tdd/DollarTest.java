package br.com.tdd.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.tdd.tdd.Entidades.Dollar;

@SpringBootTest
class DollarTest {

	@Test
	void testMultiplication() {
		/*
		* Primeiro cenário de teste
		* 1 sem a classe Dollar
		* 2 sem construtor
		* 3 sem método times()
		* 4 sem o campo amount
		*/

		// cenário
		Dollar five = new Dollar(5);

		// ação
		five.times(2);

		// validação
		assertEquals(10, five.amount);
	}

}
