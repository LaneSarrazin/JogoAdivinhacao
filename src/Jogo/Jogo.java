package Jogo;

import java.util.Scanner;
import java.util.Random;


public class Jogo {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		int num =0;
		int tentativas = 0;
		int acerto = 0;
		
		while (num != -1) {
			System.out.println("insira um numero[-1 pra sair!]: ");
			num = usuario.nextInt();
			tentativas+=1;
			int numRandow = new Random().nextInt(5);
			System.out.println(numRandow);
			
			if (num == numRandow) {
				System.out.println("voce acertou!");
				acerto += 1;
			}
			if(num != numRandow) {
				System.out.println("voce errou tente de novo!");
			}if (num == -1){
				//System.out.println("voce saiu!");
				break;
			}
				
		}
		
		System.out.println("voce acertou " + acerto + " vezes " +" e jogou " +tentativas + " vezes!");
	

	}

}
