from pessoa import Pessoa

## ------------ Classes e objetos -------------
## Uma classe é uma espécie de molde que carrega as informações (atributos e comportamentos)
## de estruturas chamadas de objetos. No exemplo, temos a classe (molde) Pessoa
## da qual será possível criar vários objetos (instâncias)

pessoa_1 = Pessoa()

pessoa_2 = Pessoa()

## Apesar de pessoa_n receber o mesmo parâmetros, 
## o programa aloca um endereço e espaço de memória 
## para cada novo objeto, veja os endereço na saída do print

print(pessoa_1)
print(pessoa_2)

## Python possibilita criar atributos em tempo de execução
## Ex. pessoa_1 agora possui o atributo 'nacionalidade', porém este atributo 
## só é existente para pessoa_1, caso seja chamado sem a criação prévia em 
## pessoa_2, irá gerar um erro (AttributeError)

pessoa_1.nacionalidade = 'Brasileiro'
print(pessoa_1.nacionalidade)

# print(pessoa_2.nacionalidade)## Gera um erro

### ------------ Comportamento (funções) ----------------
## As funções de uma classe são chamadas destas formas, podendo ou não ter parâmetros,
## o que depende da função.
pessoa_1.falar()
## a chamada abaixo realiza a mesma coisa que a chamada acima, porém passando a instância
## como parâmetros, na classe está instância será representada pelo parâmetro self
Pessoa.falar(pessoa_1)
