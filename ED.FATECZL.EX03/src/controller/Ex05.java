package controller;

public class Ex05 {
	public Ex05() {
		super();
	}
	public int Fibo(int n){
                if(n>20){
                	return 0;
                }
                if(n==1 || n==2){
			//Condição de parada, que é o valor ser igual a 1 ou 2
                	return 1;
              	}else{
			//Caso nao, retorna a soma de duas chamadas da função, com o valor -1 e -2
			return Fibo(n-1)+Fibo(n-2);
	}
}
