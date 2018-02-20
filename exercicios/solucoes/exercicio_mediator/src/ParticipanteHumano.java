
public class ParticipanteHumano extends Participante{
	

	public ParticipanteHumano(ChatRoomI chat, String nome) {
		super(chat, nome);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println(this.nome+" recebeu a mensagem: " + mensagem);		
	}

}
