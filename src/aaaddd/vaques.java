package aaaddd;

import java.util.Random;

public class vaques {

	private static final int MAXPES = 300;
	private static final int NUMVAQUES = 20;

	public static void main(String[] args) {
		Random aleatori = new Random();
		
		int[] vaques = new int[NUMVAQUES];
		
		//Crear vaques
		
		for(int i=0; i<NUMVAQUES; i++){
			vaques[i]= aleatori.nextInt(MAXPES);
		}
		
		//repartir vaques

		int pescamio = 0;
		for(int pesvaca: vaques){
			if(pesvaca > MAXPES){
				System.out.println("La vaca pesa " + pesvaca + " supera el maxim");
			}
			else{
				if(pescamio + pesvaca > MAXPES){
					System.out.println("Enviar camio amb" + pescamio + "kg");
					pescamio = pesvaca;
				}
				else{
					pescamio=pescamio + pesvaca;
				}
			}
		}
		
		
		
	}

}
