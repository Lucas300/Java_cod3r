package estruturas_repeticao;

public class Continue {
	//o continue pulará o valor que for atribuido
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//nesse caso ele pulará os impares e mostrará somente os pares
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
			System.out.println();
			for (int i = 0; i < 10; i++) {
				//nesse caso ele pulara o número 5 e motrará do 1 ao 9
				if (i == 5)continue;
				System.out.println(i);
			}
	}

}
