
# PjBL 3 - Tabela Hashing

Tabela Hashing é um método eficiente de armazenar dados, otimizando o uso de memória e agilizando a inserção e recuperação de informações. Ela utiliza um vetor onde os índices correspondem às chaves dos elementos, calculadas por uma função de hashing. Cada elemento deve ter uma chave única, seja numérica ou alfanumérica. O cálculo de chave mais comum para números é o resto da divisão pelo tamanho da tabela.


## Desenvoldido por:

- [@elvisclaudino](https://github.com/elvisclaudino)
- [@GabrielFasolim](https://github.com/GabrielFasolim)

# Estrutura da tabela hash

<p>Atributos:</p>

- **Tamanho**: Referente ao tamanho da tabela.
- **Lista**: Referente aos objetos contidos na tabela.

## A interface `Metodos` representa os metodos contidos na tabela hash.
- **Função Hash**: Obtém o valor da divisão.
- **Inserir**: Adiciona um objeto na tabela.
- **Buscar**: Busca um objeto na tabela.
- **Remover**: Remove um objeto da tabela.
- **Exibir tabela**: Imprime a tabela com todos os valores.
- **Redimensionar**: Duplica o tamanho da tabela caso tenha chegado em seu limite.

## A classe `EstruturaHash` que implementa a interface `Metodos`.
## Utilizamos dois métodos de armazenamento, um de *Endereçamento e aberto* e outro de *Encadeamento*.

<p>Sobrescrevem os métodos da interface conforme a estratégia de armazenamento utilizada</p>

# [Endereçamento aberto](https://edisciplinas.usp.br/pluginfile.php/2340743/mod_resource/content/1/ACH2002-Aula20-HashEnderecamentoAberto.pdf)

Os elementos são armazenados no vetor e o limite de armazenamento é o tamanho do vetor.
Estando o vetor lotado, o próximo que chegar ficará em uma fila até vagar um lugar. Essa
estratégia é utilizada quando os elementos são armazenados de forma temporária, entrando
e saindo ao longo do tempo

Havendo colisão, procura-se a próxima posição vaga e armazena-se aí o novo elemento.
Neste último caso o novo elemento não ficou na posição que deveria, pois estava ocupada.
Armazenou-se na próxima vaga, que não é a dele. O próximo que chegar, caso seja este o
endereço de direito, terá que procurar o próximo vago. 

![image](https://github.com/elvisclaudino/hash-table/assets/102040112/be225014-7a76-40dd-8c82-ad24dfff4e7d)

## Uso

O exemplo de uso pode ser encontrado no arquivo `Teste.java` dentro da pasta ABB, onde são demonstradas as operações de inserção, busca e impressão em uma ABB.

![image](https://github.com/elvisclaudino/hash-table/assets/102040112/2e847ceb-a5e5-476f-82f8-5125ac37d0b1)

# [Encadeamento](https://braganholo.github.io/material/ed/13-TabelasHash-Encadeamento-Exterior.pdf)

Aqui os elementos são armazenados no vetor da mesma forma que na estratégia de
endereçamento aberto, porém, ao haver colisões, passa-se a encadear os elementos em
listas simplesmente encadeadas (listas ligadas). Dessa forma, teoricamente, não há um
limite para armazenamento e é um modelo bastante funcional para armazenamentos, em
memória, de mais longo prazo.

![image](https://github.com/elvisclaudino/hash-table/assets/102040112/1293b1f3-b872-4d0c-8d54-7f8780d1fbbb)

## Uso

O exemplo de uso pode ser encontrado no arquivo `Teste.java` dentro da pasta AVL, onde são demonstradas as operações de inserção, busca e impressão em uma ABB.

![image](https://github.com/elvisclaudino/hash-table/assets/102040112/59fb92d3-428a-4036-9094-03daf7a03b57)








