
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

		public void exibirPagina(String url) {
			System.out.println("Exibindo nova página ...");
		}

		public void adicionarNovaAba(String url) {
			System.out.println("Adicionano nova aba ...");	
		}

		public void atualizarPagina() {
			System.out.println("Atualizando página ...");			
		}
		
		public void ligar(String numero) {
			System.out.println("Ligando ...");	
			
		}

		public void atender(String numero) {
			System.out.println("Atendendo ...");	
			
		}

		public void iniciarCorreioVoz(String mensagem, String destinatario) {
			System.out.println("Iniciando correio de voz ...");	
			
		}

		public void tocar() {
			System.out.println("Tocando música ...");	
			
		}

		public void pausar() {
			System.out.println("Pausando música ...");	
			
		}

		public void selecionarMusica() {
			System.out.println("Selecionando música ...");	
			
		}

		@Override
		public void exibirPagina(src.String url) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void adicionarNovaAba(src.String url) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void ligar(src.String numero) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void atender(src.String numero) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void iniciarCorreioVoz(src.String mensagem, src.String destinatario) {
			// TODO Auto-generated method stub
			
		}



}
