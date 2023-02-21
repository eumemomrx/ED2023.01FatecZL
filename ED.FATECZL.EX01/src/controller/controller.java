package controller;


public class controller {

	public controller() {
		super();
	}
	public int Soma(int a, int b) {
		int soma = 0;
		if (b==0) {
			return 0;
			
		}else {
			return soma += a+ Soma(a,b-1);
		}
		
	}
	public int Subt(int c, int d) {
		if (c<d) {
			return c;
		}else {
			return Subt(c-d, d);
		}
	}
	public int PVetor(int[] vetor, int e) {
		int x = 0;


		if (e==0) {
			return 0;
		}else {
			if(vetor[e-1]%2==0) {
				x++;
			}
			x+= PVetor(vetor, e-1);
			return x;
		}
		
	}

}
