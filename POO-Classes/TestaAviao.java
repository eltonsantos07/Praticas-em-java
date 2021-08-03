package exercicio2;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviaoComum = new Aviao();
		Aviao aviaoParticular = new Aviao();
		
		aviaoComum.setModelo("Boeing 737");
		aviaoComum.setCor("Azul");
		aviaoComum.setHorarioDoVoo(22);
		
		aviaoParticular.setModelo("Boeing 777");
		aviaoParticular.setCor("Branco");
		aviaoParticular.setHorarioDoVoo(23);
		
		Aviao.IprimirDadosDoAviao(aviaoComum.getModelo(), aviaoComum.getCor(), aviaoComum.getHorarioDoVoo());
		if(aviaoComum.getHorarioDoVoo() > 20) {
			int atraso = aviaoComum.getHorarioDoVoo() - 20;
			System.out.println("Este voo está atrasado " + atraso + " horas\n" );
		}
		
		Aviao.IprimirDadosDoAviao(aviaoParticular.getModelo(), aviaoParticular.getCor(), aviaoParticular.getHorarioDoVoo());
		if(aviaoParticular.getHorarioDoVoo() > 20) {
			int atraso = aviaoParticular.getHorarioDoVoo() - 20;
			System.out.println("Este voo está atrasado " + atraso + " horas" );
		}
	}

}
