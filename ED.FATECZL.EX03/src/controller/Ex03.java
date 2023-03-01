package controller;

public class Ex03 {
	public Ex03() {
		super();
	}
	public double RecD(int n){
		double f;
		if(n==1){
			//Condição de parada, que é o valor ser igual a 1
			return 1;
		}else{
			//Caso não, chama a função diminuindo o valor em 1
			f = 1/(double)n+ RecD(n-1);
			return(f);
		}
	}
}
