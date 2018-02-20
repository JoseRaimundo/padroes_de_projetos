
public abstract class Participante {
	protected ChatRoomI chat;
	protected String nome;
	
	public Participante(ChatRoomI chat, String nome){
		this.chat = chat;
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void enviarMensagem(String mensagem){
		chat.enviar(mensagem, this);
	}
	
	public abstract void receberMensagem(String mensagem);
}
