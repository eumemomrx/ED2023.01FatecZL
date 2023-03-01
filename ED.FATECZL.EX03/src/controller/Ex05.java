package controller;

public class Ex06 {

	public Ex06() {
		super();
	}
	public double RecD(int n){
		double f;
		if(n==1){
			return 1;
		}else{
			f = 1/(double)FFat(n)+ RecD(n-1);
			return(f);
		}
	}
	public int FFat(int n) {
		int x =0;
		if(n==1) {
			//Condição de parada, que é chegar no fim da conta(multiplicação por 1)
			return 1;
		}else {
			x+= n*FFat(n-1);
			//Chama a proxima recursiva com o valor - 1 para realizar a multiplicação
		}
		return x;
	}

}
