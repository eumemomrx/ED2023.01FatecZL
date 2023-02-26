package controller;

public class Controller {

	public Controller() {
		super();
	}
	
	//Ex01
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
	
	//Ex02
	public int NgVet(int[] vet, int n) {
		int x = 0;
		if (n==0) {
			//Condição de parada, que é o vetor chegar ao fim
			return 0;
		}else {
			if(vet[n-1]<0) {
				x++;
				//Verifica se o valor é negativo, caso sim soma ao contador
			}
			x+= NgVet(vet, n-1);
			return x;
			//Chama a recursiva diminuindo 1 do tamanho do vetor
		}
	}
	
	//Ex03
	public int ContDig(int i) {
		int dig = 0;
		if (i<10 && i>=-10) {
			//Condição de parada, que é o numero estar no intervalo >-10 e <10(1 digito), retornando 1
			return 1;
		}else {
			dig+=1 +ContDig(i/10);
			return dig;
			//Soma 1 ao contador de digitos e diminiu um digito do numero
		}
	}
	
	//Ex04
	public String InvP(String pal, int t) {
		//Condição de parada, que é o fim da frase ou palavra
		if(t==0) {
			return "";
		}
		else {
			int letra = t;
			int aux = t-1;
			return pal.substring(aux, letra)+InvP(pal, t-1);
			//Caso nao tenha sido o fim, pega a ultima letra da palavra ou frase e chama a recursiva diminuindo o tamanho em um, para pegar a proxima letra
		}
	}
}
