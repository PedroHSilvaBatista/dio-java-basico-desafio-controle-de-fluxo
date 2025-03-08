# Desafio Controle de Fluxo Trilha-Dio-Java-Básico

## Contextualização
Este projeto consiste em um sistema que recebe dois parâmetros inteiros via terminal e os utiliza para determinar a quantidade de iterações a serem realizadas em um loop `for`. O objetivo é imprimir no console uma sequência de mensagens contendo a numeração correspondente.

## Regras de Funcionamento
1. O sistema deve receber dois números inteiros via terminal.
2. O primeiro número representa o valor inicial e o segundo o valor final.
3. O loop `for` deve iterar a diferença entre os dois números e imprimir mensagens no seguinte formato:
   ```
   Imprimindo o número 1
   Imprimindo o número 2
   ...
   ```
4. Caso o primeiro número seja **maior** que o segundo, o sistema deve lançar uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem:
   ```
   O segundo parâmetro deve ser maior que o primeiro
   ```

## Exemplo de Execução
Entrada:
```
12 30
```
Saída esperada:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

Se a entrada for:
```
30 12
```
A saída será:
```
O segundo parâmetro deve ser maior que o primeiro
```

## Tecnologias Utilizadas
- Java
- IntelliJ
- Console para entrada e saída de dados
