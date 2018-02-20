import java.util.ArrayList;

public class ChatRoom implements ChatRoomI{
	
	protected ArrayList<Participante> participantes;
	
	public ChatRoom() {
		this.participantes = new ArrayList<>();
	}
	
	public void addParticipante(Participante participante){
		this.participantes.add(participante);
	}

	@Override
	public void enviar(String mensagem, Participante participante) {
		for (Participante p : this.participantes) {
			if (p != participante) {
				p.receberMensagem(mensagem + " Evniado por: " + participante.getNome());
			}
		}
	}
}