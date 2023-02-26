package view;
import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int n = 5;
		int[] vet = {-1,16,-5,-27,42,-100};
		int tam = vet.length;
		int i = 716;
		String palavra = "sodaD ed aruturtsE";
		int tam1 = palavra.length();
		Controller c = new Controller();
		System.out.println(c.FFat(n));
		System.out.println(c.NgVet(vet, tam));
		System.out.println(c.ContDig(i));
		System.out.println(c.InvP(palavra, tam1));
	}

}
