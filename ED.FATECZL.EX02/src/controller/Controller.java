package controller;

public class Controller {

	public Controller() {
		super();
	}
	public int FFat(int n) {
		int x =0;
		if(n==1) {
			return 1;
		}else {
			x+= n*FFat(n-1);
		}
		return x;
	}
	public int NgVet(int[] vet, int n) {
		int x = 0;
		if (n==0) {
			return 0;
		}else {
			if(vet[n-1]<0) {
				x++;
			}
			x+= NgVet(vet, n-1);
			return x;
		}
		
	}
	public int ContDig(int i) {
		int dig = 0;
		if (i<10 && i>=-10) {
			return 1;
		}else {
			dig+=1 +ContDig(i/10);
			return dig;
		}
	}
	public String InvP(String pal, int t) {
		if(t==0) {
			return "";
		}
		else {
			int letra = t;
			int aux = t-1;
			return pal.substring(aux, letra)+InvP(pal, t-1);
		}
	}

}
