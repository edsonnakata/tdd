# Dinheiro Mult-Moeda

Começaremos com o objeto que Ward criou no WyCash, dinheiro multi-moeda
(mencionado na Introdução). Suponha que tenhamos um relatório como esse:

| Instrumento | Ações | Preço | Total  |
| ----------- | ----- | ----- | ------ |
| IBM         | 1.000 | 25    | 25.000 |
| GE          | 400   | 100   | 40.000 |
|             |       | Total | 65.000 |

Para fazer um relatório multi-moeda, precisamos adicionar moedas:

| Instrumento | Ações | Preço   | Total      |
| ----------- | ----- | ------- | ---------- |
| IBM         | 1.000 | 25 USD  | 25.000 USD |
| GE          | 400   | 100 CHF | 40.000 CHF |
|             |       | Total   | 65.000 USD |

Precisamos também especificar taxas de câmbio:

| De  | Para | Taxa |
| --- | ---- | ---- |
| CHF | USD  | 1,5  |

De que comportamento precisaremos para produzir o relatório revisado?
Dito de outra forma, qual conjunto de testes, quando passarem, demonstrará a
presença de código que estamos confiantes que irá calcular o relatório corretamente?

* Precisamos ser capazes de somar valores em duas moedas diferentes e de converter o resultado, dado um conjunto de taxas de câmbio.
* Precisamos ser capazes de multiplicar um valor (preço por ação) por um número (número de ações) e de receber uma quantia.

Baseado nestas condições vamos ao código em DollarTest;