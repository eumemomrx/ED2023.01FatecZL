package view;
import controller.controller;

public class Principal {

	public static void main(String[] args) {
		controller cn = new controller();
		int a = 3;
		int b = 5;
		int c = 26;
		int d = 5;
		int[] vetor = {1, 2, 3,  4, 5, 6, 7, 8, 9, 10};
		int e = vetor.length;
		System.out.println(cn.Soma(a, b));
		System.out.println(cn.Subt(c, d));
		System.out.println(cn.PVetor(vetor, e));
	}



}
