# Programação Orientada Objetos e Padrões de projetos
Este tutorial apresenta uma serie de conceitos e práticas sobre os padrões de projetos, para isso será contextualizado alguns conceitos básicos de Programação Orientada Objeto (POO), e em seguida serão abordados os principais padrões de criação, estrutural e comportamentais.
A seção de Padrões de Projetos apresenta exemplos e explicações adaptadas de várias fontes, principalmente do sites do [Marcos Brizeno](https://brizeno.wordpress.com/padroes/) e do [Source Making](https://sourcemaking.com/design_patterns). 

# Sumário

- [Programação Orientada Objeto: Introdução](#programação-orientada-objeto:-introdução)
	- [Abstração](#abstração)
	- 
- [Padrões de Projetos](#padr%C3%B5es-de-projetos-1)
	- [Factory Method](#factory-method)
	- [Abstract Factory](#abstract-factory)
	- [Builder](#builder)


## Programação Orientada Objeto: Introdução
Nesta secção, serão apresentados os conceitos básicos de POO, estes conceitos são fundamentais para o entendimento do restante do tutorial, porém se você já é familiarizado com POO, então pode ir direto para a secção de [Padrões de Projetos](#padrões-de-projetos).
> **Atenção:** Para este tutorial, foi utilizado a linguagem de programação Java, com o ambiente de desenvolvimento Eclipse.

### Abstração

Para definirmos bem as funcionalidades de nossos programas, é necessário realizar a abstração do mundo que nossa aplicação irá abranger, por exemplo: Imagine que você irá fazer um sistema simples que calcula a massa corporal ideal de uma pessoa, para essa aplicação serão necessárias informações como idade, altura e peso atual, logo, informações como cor do cabelo, gosto musical, CPF e etc, não serão necessários. Dominar o conceito de abstração é algo importante, pois permite ao desenvolvedor formular um cenário mais enxuto e sem distrações.

### Classes

As **classes** são projetos de um **objetos**, na qual encontramos as características e comportamentos que os objetos terão. Uma analogia: Imagine uma classe como uma receita de bolo simples em que teremos apenas a massa, cobertura e recheio, todas as propriedades necessárias para fazer nosso bolo estão presentes, ou seja, independente se o bolo será de cobertura de chattily ou morango, massa comum ou de chocolate, sabemos que ele terá uma massa, uma cobertura e um recheio. Em Java, uma classe é formada pelo seguinte comando.

			class MeuBolo{
				//corpo da minha class
			}

> **Boa Pratica:** Para melhorar a legibilidade do seu código, é recomendado utilizar nomes intuitivos para suas classes, e também utilizar as letras maiúsculas para destacar o inicio de palavras no nome da classes, por exemplo: ExemploDeClasse.

Tudo o que estiver dentro das chaves 

### Atributos
Agora que sabemos a estrutura básica da nossa classe, falta adicionar as características dela, para isso utilizamos os **atributos**. No código do bolo apresentado anteriormente, foi mostrado apenas a estrutura básica da classe (me Java), porém não foi apresentado nenhuma das suas características como o massa, cobertura e recheio. O código para representar um atributo em Java, é formado por um modificador de acesso (veremos isso mais adiante), o tipo do atributo e o nome, conforme o código a seguir: 

	class MeuBolo{
			//modificador tipo nome
			public String massa;
			public String cobertura;
			public String recheio;
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

 - Boas práticas
	 - Como um método remete a um comportamente, é recomendado usar verbos no infinitivo para nomear-los, por exemplo: calcularValor, descreverBolo, copiarTexto e etc. 

### Objetos


### Funções*

### Enumeração

### Visibilidade

### Interfaces

### Composição
### Herança

### Construtor


## Princípios SOLID



## Padrões de Projetos
> **Atenção:** Os exemplos utilizados neste tutorial são exemplos apresentados como exercícios para o curso de Sistemas Para Internet, no Instituto Federal da Paraíba, há possibilidades de conter alguns erros, caso encontre, basta entrar em contato ou você mesmo consertar via Git.

###  Padrões de Projetos: Criacionais

#### Factory Method
O objetivo do Factory Method é **"Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method permite adiar a instanciação para subclasses."**[[5]](#referências). 

Imagine que temos que construir um sistema para nossa loja de bolos para gerenciar os nosso produtos e fornecedores, e que atualmente temos três fornecedores especializados em tipos de bolos diferentes. Exemplo: 

|Fornecedor|Bolo |
|--|--|
|João Bolos|Bolo de Ovo|
|Recanto da vovô | Bolo de Nata|
|Sabor nordestino|Bolo Baeta|


Para facilitar o exemplo, vamos criar um interface para dar apoio para nossos produtos (bolos). E nessa interface, iremos criar apenas um método que escreve na tela a descrição do bolo.

	public interface Bolo{
		void descreverBolo();
	}

Agora que temos nossa informação e a representação (interface) da nossa classe bolo, vamos direto ao ponto. Como foi visto anteriormente, o **Factory Method** define uma interface (ou uma classe abstrata, caso as subclasses precisem de mais recursos [[4]](#Referências) que possibilita **adiar a instanciação**.  Para isso, precisaremos criar uma interface que será usada pelos responsáveis pela criação do produto.

Interface do fornecedor de bolo.

    public interface FornecedorDeBolo{
	    Bolo criaBolo();
    }
Exemplo de produto/classe concreta (nosso bolo)

	public class BoloDeNata implements Bolo{
		@Override
		void descreverBolo(){
			System.out.print("Bolo de nata da Vovó");
		}
	}
 Exemplo de fornecedor, note que fornecedor carrega a responsabilidade de criar o seu respectivo produto (bolo).
 
	public class RecantoDaVovo implements ForncedorDeBolo{
		@Override
		public Bolo criaBolo(){
			return new BoloDeNata();
		}
	}
Classe de teste com o método main

	public static void main(String[] args){
		FornecedorDeBolo vovo = new RecantoDaVovo();
		Bolo bolo = vovo.criaBolo();
	}

Com essa abordagem, temos os seguintes:

 - Pontos positivos
 -- Aumenta a facilidade para inserção novos produtos sem necessitar alterar o código da aplicação.
 -- Segue o principio da responsabilidade única.
 - Pontos negativos
 -- Requer a criação de muitas estruturas.

#### Abstract Factory
Com o Abstract Factory, é buscado **"fornecer um interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas"**[[4]](#referências). Em outras palavras, o Abstract Factory é utilizado para criar grupos de objetos que possuem algum relacionamento. Vamos ao exemplo:

|Fornecedor|Bolo |Tipo da massa|
|--|--|--|
|Sabor nordestino|Bolo Baeta|Normal
|Sabor nordestino|Bolo de Cenoura|Diet
|Recanto da vovô | Bolo de Nata|Normal
|Recanto da vovô|Bolo de aveia|Diet

Note que agora, além dos bolos tradicionais, também há bolos feitos com receitas diets, note também que um fornecedor pode fornecer mais de um bolo (logo, os bolos que pertence a um fornecedor especifico, passam a fazer parte de um grupo/família).  Um abordagem convencional seria criar uma classe para cada bolo (ou utilizando Factory Method), mas como saber a qual agrupamento que um determinado objeto (bolo) pertence? Ao fornecer uma interface para criar os grupos de objetos, o Abstract Factory resolve este problema permitindo a criação de um ramo em comum na hierarquia, o que possibilita a identificação de um grupo de objetos.

Interface com a criação de famílias de objetos.

	public interface FornecedorDeBolo{
		public BoloDiet criaBoloDiet();
		public BoloNormal criaBoloNormal();
	}
Exemplo de fornecedor criando seus vários produtos.

	public class RecantoDaVovo implements FornecedorDeBolo{
		public BoloDiet criaBoloDiet(){
			return new BoloDeAveia();
		}
		public BoloNormal criaBoloNormal(){
			return new BoloDeNata();
		}
	}
Exemplo de interface para padronização da criação de produtos (bolos). Note que o Abstract Factory é bastante semelhante ao Factory Method, apenas com uma pequena particularidade. Essa sensação de repetição de padrão é comum.

	public interface BoloNormal(){
		public void descreverBoloNormal();
	}

	public interface BoloDiet(){
		public void descreverBoloDiet();
	}
Exemplo de produto do grupo de bolos normais (bolo).

	public class BoloDeNata implements BoloNormal{
		@override 
		public void descreverBoloNormal(){
			System.out.println("Bolo de nata da vovó, bolo normal!");
		}
	}
Exemplo de produto do grupo de bolos diet (bolo).

	public class BoloDeAveia implements BoloDiet{
		@override 
		public void descreverBoloDiet(){
			System.out.println("Bolo de aveia da vovó, bolo diet!");
		}
	}
Agora chamaremos nossa classe de teste. No que com essa abordagem, conseguirmos amarrar um grupo de objetos (bolos) ao seu ramo em comum (neste caso, o fornecedor).

	public static void main(String[] args) {
		FornecedorDeBolo fornecedor = new RecantoDaVovo();
		fornecedor = new RecantoDaVovo();
		BoloDiet bolo_diet = fornecedor.criaBoloDiet();
		BoloNormal bolo_normal = fornecedor.criaBoloNormal();
		bolo_diet.descreverBoloDiet();
		bolo_normal.descreverBoloNormal();
	}

Com essa abordagem, temos os seguintes:

 - Pontos positivos
 -- A classe responsável pelo uso da nossa Abstract Factory fica dependente de uma interface simples e pequena.
 -- Segue o principio da segregação de interface.
 - Pontos negativos
 -- Requer a criação de muitas estruturas.

#### Builder

O padrão Builder visa **“Separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.”[[4]](#refer%C3%AAncias)**. Com esse padrão, a construção do objeto é separada em vários métodos que realizam o trabalho pesado e devolvem um objeto complexo pronto para ser usado.

Para esse exemplo, suponhamos que agora o nosso produto é um pouco mais complexo.


|Fornecedor|Bolo |Massa|Cobertura|Recheio|
|--|--|--|--|--|
|Sabor nordestino|Bolo de Ovo	 |Normal|Brigadeiro| Chocolate | 
|Recanto da vovô |Bolo de Cenoura|Diet	|Coco 	| Morango |

Para isso, vamos criar uma estrutura de bolo diferente.

	public class Bolo{
		private String nome;
		private String massa;
		private String recheio;
		private String cobertura;
		//aqui vai o construtor padrão, os get e set e toString
	}

Nossa classe builder terá um método para construir cada dado no nosso produto (bolo), aqui teremos um objeto bolo que será reaproveitado/construído pelas subclasses por meio dos métodos abstratos.

	public abstract class BoloBuilder{
		protected Bolo bolo;
		public BoloBuilder(){
			bolo = new Bolo();
		}
		public abstract void builderNome();
		public abstract void builderMassa();
		public abstract void builderRecheio();
		public abstract void builderCobertura();
		
		public Bolo getBolo(){
			return this.bolo;
		}
	}
Exemplo de classe Builder concreta:

	public class RecantoDaVovo extends BoloBuilder{
		@override
		public void builderNome(){
			this.bolo.setNome("Bolo de Cenoura");
		}
		
		@override
		public void builderMassa(){
			this.bolo.setMassa("Diet");
		}
		
		@override
		public void builderRecheio(){
			this.bolo.setRecheio("Morango");
		}
		
		@override
		public void builderCobertura(){
			this.bolo.setCobertura("Coco");
		}
	}


Note que dentro de cada método poderia haver **operações mais complexas**, como por exemplo, buscar informações em um banco de dados, realizar cálculos matemáticos complexos, criação de outros objetos e etc.

Agora que criamos nosso builder e um exemplo de classe concreta, precisamos criar a classe responsável gerenciar a construção do nosso objeto, esta classe recebe no seu construtor um objeto do tipo BoloBuilder (ou seja, ConstrutorDirector pode manipular qualquer classe que herda  de BoloBuilder).

	public classe ConstrutorDirector{
		private BoloBuilder fornecedor;
		public ConstrutorBidrector(BoloBuilder fornecedor){
			this.fornecedor = fornecedor; 
		}

		public void construirBolo(){
			this.fornecedor.builderNome();
			this.fornecedor.builderMassa();
			this.fornecedor.builderRecheio();
			this.fornecedor.builderCobertura();
		}

		public Bolo getBolo(){
			return this.fornecedor.getBolo();
		}
	}

Agora criaremos nossa classe para testar.

	public static void main(String[] agrs){
		BoloBuilder fornecedor = new RecantoDaVovo();
		ConstrutorDirector construtor = new ConstrutorDirector(fornecedor);
		construtor.construirBolo();
		Bolo bolo = construtor.getBolo();
		System.out.println(bolo);
	}

Note que agora nossa classe de teste vai lidar **apenas com o código do construtor** e note também que para criar um novo objeto só precisamos utilizar um novo builder (atribuindo-o para o objeto fornecedor).

Com essa abordagem, temos os seguintes:

 - Pontos positivos
 -- Encobre a construção de um objeto, deixando um código mais enxuto para quem vai usar.
 -- Separa a construção de um objeto complexo em parte menores.
 - Pontos negativos
 -- Não há o conceito de famílias de produtos como no Abstract Factory.

#### Prototype
O Prototype **“Especificar tipos de objetos a serem criados usando uma instância protótipo e criar novos objetos pela cópia desse protótipo.”[[4]](#refer%C3%AAncias)**. Em outras palavras, esse padrão utiliza uma classe "esqueleto" para criar um clone completo. 


|Bolo |Tipo da massa|
|--|--|
|Bolo Baeta|Normal
|Bolo de Cenoura|Diet
|Bolo de Nata|Normal


Primeiro criamos nosso esqueleto (**protótipo**) de classe, note que é uma classe abstrata com poucas implementações completa.

	public abstract class BoloPrototype{
		protected String tipo_massa;
		public abstract descreverBolo();
		public abstract clonarBolo();
		public void setTipoMassa(String tipo_massa){
			this.tipo_massa = tipo_massa;
		}
	
		public String getTipoMassa(){
			return this.tipo_massa;
		}
	}


Agora criaremos a classe concreta

	public class BoloBaeta extends BoloPrototype{
		protected BoloBaeta(BoloBaeta bolo_baeta){
			this.tipo_massa = bolo_baeta.getTipoMassa();
		}
		
		public BoloBaeta(){
			tipo_massa = "Diet";
		}
		
		@Override
		public String descreverBolo(){
			return "Bolo baeta com massa " + getTipoMassa();
		}
		@Override 
		public BoloPrototype clonarBolo(){
			return new BoloBaeta(this);
		}
	}



###  Padrões de Projetos: Estruturais

###  Padrões de Projetos: Comportamentais

## Exercícios



## Referências

[1]https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/<br />
[2]https://sourcemaking.com/design_patterns<br />
[3]https://www.devmedia.com.br/introducao-a-programacao-orientada-a-objetos-em-java/26452<br />
[4]https://brizeno.wordpress.com/2011/09/17/mao-na-massa-factory-method/<br />
[5]GAMMA, Erich et al. Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos.<br />
[6]https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)<br />

