package controller;

public class Ex04 {
	public Ex04() {
		super();
	}
	public int VDig(int v, int d){
		int i;
		if(v>=10 && v<=999999){
			if(v==0){
				//Condição de parada, que é o valor ser igual a 0
				return 0;
			}else{
				//Caso não, chama a função dividindo o valor por 10 após verificar se encontra o dígito
				if(v%10==d){
					i= 1+ VDig(v/10, d);
					return i;
				}else{
					return VDig(v/10, d);
				}
			}
		}else{
			return 0;
		}
	}
}
