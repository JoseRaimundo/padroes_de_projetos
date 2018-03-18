class SaborNordestino: public FornecedorBolo
{
public:
	SaborNordestino();
	virtual Bolo criarBolo() {
		return new BoloBaeta();
	}	
};