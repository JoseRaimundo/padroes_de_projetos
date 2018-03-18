#include "Bolo.h"
#include <iostram>

class BoloBaeta: public Bolo
{
public:
	BoloBaeta();
	void boloDescricao(){
		cout << "Bolo Baeta!" << endl;
	}	
};