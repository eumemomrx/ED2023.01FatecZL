package controller;

public class Ex02 {
	public Ex02() {
		super();
	}
	public String CBinario(int n){
		String bin;
		String cnv;
		if(n==0){
			//Condição de parada que é, o valor ser igual a 0
			return "";
		}
		if(n>=2000){
			return("Valor acima do limite");
		}else{
			//Caso não, chama a função dividindo o valor por 2
			bin = String.valueOf(n%2);
			cnv = String.valueOf(CBinario(n/2))+bin;
			return(cnv);
		}
	}
}
