
public class Teste {
	public static void main(String[] agrs){
		ChatRoom sala = new ChatRoom();
		
		ParticipanteHumano jose 	= new ParticipanteHumano(sala, "José");
		ParticipanteHumano paulo	= new ParticipanteHumano(sala, "Paulo");
		ParticipanteRobo exter 		= new ParticipanteRobo(sala, "Exterminador");
		
		sala.addParticipante(jose);
		sala.addParticipante(paulo);
		sala.addParticipante(exter);
		
		jose.enviarMensagem("Bom dia pro grupo!");
		System.out.println("---------------------");
		paulo.enviarMensagem("Bom dia!");
		System.out.println("---------------------");
		exter.enviarMensagem("Boa tarde :)");
		
		
		
		
	}

}
