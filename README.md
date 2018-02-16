
# Padrões de projetos
Este tutorial apresenta uma serie de conceitos e práticas sobre os padrões de projetos, para isso será contextualizado alguns conceitos básicos de Programação Orientada Objeto (POO), e em seguida serão abordados os principais padrões de criação, estrutural e comportamentais.


## Programação Orientada Objeto: Introdução
Nesta secção, serão apresentados os conceitos básicos de POO, estes conceitos são fundamentais para o entendimento do restante do tutorial, porém se você já é familiarizado com POO, então pode ir direto para a secção de [Padrões de Projetos](#Padrões-de-Projetos).
> **Atenção:** Para este tutorial, foi utilizado a linguagem de programação Java, com o ambiente de desenvolvimento Eclipse.


### Abstração

Para definirmos bem as funcionalidades de nossos programas, é necessário realizar a abstração do mundo que nossa aplicação irá abranger, por exemplo: Imagine que você irá fazer um sistema simples que calcula a massa corporal ideal de uma pessoa, para essa aplicação serão necessárias informações como idade, altura e peso atual, logo, informações como cor do cabelo, gosto musical, CPF e etc, não serão necessários. Dominar o conceito de abstração é algo importante, pois permite ao desenvolvedor formular um cenário mais enxuto e sem distrações.

### Classes

As **classes** são projetos de um **objetos**, na qual encontramos as características e comportamentos que os objetos terão. Uma analogia: Imagine uma classe como uma receita de bolo simples em teremos apenas a recheio, cobertura e tempo ao forno, todas as propriedades necessárias para fazer nosso bolo estão presentes, ou seja, independente se o bolo será de cobertura de chattily ou morango, massa comum ou de chocolate, sabemos que ele terá um massa, uma cobertura e o tempo ao forno. Em Java, uma classe é formada pelo seguinte comando.

			class MeuBolo{
				//corpo da minha class
			}

> **Boa Pratica:** Para melhorar a legibilidade do seu código, é recomendado utilizar nomes intuitivos para suas classes, e também utilizar as letras maiúsculas para destacar o inicio de palavras no nome da classes, por exemplo: ExemploDeClasse.

Tudo o que estiver dentro das chaves 

### Atributos
Agora que sabemos a estrutura básica da nossa classe, falta adicionar as características dela, para isso utilizamos os **atributos**. No código do bolo apresentado anteriormente, foi mostrado apenas a estrutura básica da classe (me Java), porém não foi apresentado nenhuma das suas características como o massa, cobertura e tempo ao forno. O código para representar um atributo em Java, é formado por um modificador de acesso (veremos isso mais adiante), o tipo do atributo e o nome, conforme o código a seguir: 

	class MeuBolo{
			//modificador tipo nome
			public String massa;
			public String cobertura;
			public int tempo_forno;
	}

Os atributos, como foi dito anteriormente, correspondem as características da nossa classe, na nossa abstração para o exemplo, o bolo contem apenas três atributos, mas em uma situação real (ou dependendo da sua abstração), poderia haver vários e mais complexos (incluindo outras classes). Os atributos podem ser do  diversos tipos, na tabela a seguir é apresentado deles. 
| Tipo | Descrição | Exemplos|
|--|--|--|
|int  | Valor inteiro | 1 , 2 , 2018|
|float  | Valor real (com tamanho de 32 bits) |  1.38, 3.14 , 0.0001|
|double | Valor real (com tamanho de 64 bits)  |  1 , 2, 2018|
|char  | Caractere (números,letras ou especias) |'a' , '%' , '1'|
|String  | Palavras, frases e demais conjuntos de caracteres |  "José" , "Java" , "meu bolo!"|


Há outros tipos, porém ficaremos apenas com estes para não confundir. Outra coisa importante sobre os tipos, é que eles podem ser primitivos ou não-primitivos (ou também chamados de compostos), em Java os tipos primitivos iniciam com a primeira letra minuscula, enquanto os tipos não-primitivos iniciam com letra maiúscula. Os tipos primitivos são os componentes básicos (atômicos) das classes, eles correspondem a um espaço de memória com tamanho fixo destinado para armazenar o valor que é atribuído a ele. Enquanto os tipos não-primitivos são compostos por outros atributos, um exemplo de tipo não-primitivo é o String, que contem próprios atributos (conjunto de caracteres do tipo char) e  também carrega seus próprios comportamentos (**métodos**).

### Métodos 
Os métodos correspondem ao comportamento da nossa classe. A estrutura básica de um métodos possui um modificador de acesso (veremos isso mais tarde), um tipo de retorno, o nome do método e os parâmetros.

	//modificador retorno nome(parametros){bloco de código}
	public void meuMetodo(){
		//realiza algum processamento
	}

Um método pode ou não receber um **parâmetro**, um parâmetro é um atributo de escopo 

 e pode ter ou não um retorno, caso não tenha o local do tipo deve conter o termo **void**.

### Objetos


### Funções*

### Visibilidade

### Interfaces

### Herança


## Padrões de Projetos
> **Atenção:** Os exemplos utilizados neste tutorial são exemplos apresentados como exercícios para o curso de Sistemas Para Internet, no Instituto Federal da Paraíba, há possibilidades de conter alguns erros, caso encontre, basta entrar em contato ou você mesmo consertar via Git.

###  Padrões de Projetos: Criacionais
#### Abstract Factory

###  Padrões de Projetos: Estruturais

###  Padrões de Projetos: Comportamentais


## Referências
[1] https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/
[2] https://sourcemaking.com/design_patterns
[2] https://www.devmedia.com.br/introducao-a-programacao-orientada-a-objetos-em-java/26452
