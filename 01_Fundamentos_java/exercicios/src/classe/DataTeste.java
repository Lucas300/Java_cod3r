package classe;

public class DataTeste {

	public static void main(String[] args) {
		var data1 = new Data();
		data1.ano = 2000;
		data1.dia =13;
		data1.mes = "Maio";
		
		Data data2 = new Data();
		data2.ano = 1980;
		data2.dia = 11;
		data2.mes = "Janeiro";
		
		System.out.printf("Eu nasci dia %d de %s de %d\n",data1.dia,data1.mes,data1.ano);
		System.out.printf("Minha mãe nasceu dia %d de %s de %d",data2.dia,data2.mes,data2.ano);

	}

}
