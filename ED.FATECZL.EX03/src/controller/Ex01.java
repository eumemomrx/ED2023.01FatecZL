package controller;

public class Ex01 {

	public Ex01() {
		super();
	}
	public int SNat(int n){
		int soma = 0;
		if(n<=0 ){
			//Condição de parada, que é o valor ser menor ou igual a zero
			return 0;
		}else{
			//Caso não seja o fim, chama a função diminuindo 1 do valor
			soma += n+ SNat(n-1);
		}
		return soma;
	}
}
