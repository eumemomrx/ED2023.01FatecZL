package view;
import controller.Ex01;
import controller.Ex02;
import controller.Ex03;
import controller.Ex04;
import controller.Ex05;
import controller.Ex06;

public class Principal {
public static void main(String[] args) {
		Ex01 e1 = new Ex01();
		Ex02 e2 = new Ex02();
		Ex03 e3 = new Ex03();
		Ex04 e4 = new Ex04();
		Ex05 e5 = new Ex05();
		Ex06 e6 = new Ex06();
		
		System.out.println(e1.SNat(5));
		System.out.println(e2.CBinario(199));
		System.out.println(e3.RecD(6));
		System.out.println(e4.VDig(1223254, 2));
		System.out.println(e5.Fibo(5));
		System.out.println(e6.RecD(6));
	}
}
