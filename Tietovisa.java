package java2021;

import java.util.Scanner;

public class Tietovisa {
	public static void main(String[] args) {

		int pisteet;
		
		Scanner lukija = new Scanner(System.in);
	
		//Aloitetaan peli esittelem�ll� s��nn�t ja kysym�ll� nimi.	
		
		System.out.println("Hei, tervetuloa Tietovisaan!");
				
		System.out.print("\n" + "Pelaajan nimi: ");
		String nimi = lukija.nextLine();
		
		//Kysyt��n pelaajalta haluaako h�n s��nn�t ja tulostetaan ne

		System.out.println("");
		System.out.println("Haluatko s��nn�t?");
		String s��nn�t = lukija.nextLine();

		if (s��nn�t.equalsIgnoreCase("Kyll�")) {
			System.out.println("");
			System.out.println("S��nn�t:");
			System.out.println("Valittaessa aihetta kirjoita pelkk�numero.");
			System.out.println("Kirjoita vastaus kysymyksen j�lkeen.");
			System.out.println("Jos kysymyksess� kysyt��n numeroa kirjoita vastaus k�ytt�en numeroita.");
		} 
		else {
			System.out.println("\n" + "No kerron ne kuitenkin.");
			System.out.println("\n" + "S��nn�t:");
			System.out.println("Valittaessa aihetta kirjoita pelkk� numero.");
			System.out.println("Kirjoita vastaus kysymyksen j�lkeen.");
			System.out.println("Jos kysymyksess� kysyt��n numeroa kirjoita vastaus k�ytt�en numeroita.");
		}
		
	//Kysyt��n mist� aiheesta pelaaja haluaa tulla visatuksi.
		
		System.out.println("\n" + "Mist� aiheesta haluat tulla visatuksi?");
		System.out.println("1. aihe: yleistieto");
		System.out.println("2. aihe: maiden p��kaupungit");
		int aihe = lukija.nextInt();
		
		//Riippuen valitusta aiheesta, suoritetaan aliohjelma (metodi).
		
		if (aihe == 1) {
			pisteet = aihe1();
		} else {
			pisteet = aihe2();
		}
		
		//Tulostetaan pisteet, ja kerrotaan onnittelut tai harmittelut. Peli loppuu t�h�n.
		
		System.out.println("\n" + "Sait " + pisteet + " pistett�.");
		
		if (pisteet == 10) {
			System.out.println("Onneksi olkoon " + nimi + "! Saitkaikki oikein!");
		}else if (pisteet < 10 && pisteet > 5) {
			System.out.println("Sait enemm�n kuin puolet oikein, hyvin meni " + nimi + ".");
		} else if (pisteet < 5 && pisteet > 0) {
			System.out.println("Parempi onni ensi kerralla.");
		} else if (pisteet == 0) {
			System.out.println("Et saanut yht��n oikein. Ehk� kannattaisi harhoitella enemm�n.");
		}
	}

	//Ensimm�isen aiheen kysymykset ja vastaukset. T�ss� aiheessa isoilla alkukirjaimilla ei ole v�li�.
	
	private static int aihe1() {
		int pisteet = 0;
		
		Scanner lukija = new Scanner(System.in);
		
		String[] yleistieto = new String[10];
		
		yleistieto[0] = "\n" + "Mik� p�iv� on 1.5.?";
		yleistieto[1] = "\n" + "Mik� on Suomen kansallis-el�in?";
		yleistieto[2] = "\n" + "Mit� kukkaa poimitaan yleens� �itienp�iv�n�?";
		yleistieto[3] = "\n" + "Kuinka monta syd�nt� mustekalalla on?";
		yleistieto[4] = "\n" + "Min� vuonna Suomi voitti Euroviisut?";
		yleistieto[5] = "\n" + "Min� vuonna Titanic upposi?";
		yleistieto[6] = "\n" + "Miss� kuussa peruskoulut alkavat?";
		yleistieto[7] = "\n" + "Mik� alkuaina on P?";
		yleistieto[8] = "\n" + "Kuka oli Suomen ensimm�inen naispresidentti?";
		yleistieto[9] = "\n" + "Milloin ensimm�inen tietokone keksittiin?";
		
		String[] yleistietoVastaukset = new String[10];
		
		yleistietoVastaukset[0] = "Vappu";
		yleistietoVastaukset[1] = "Karhu";
		yleistietoVastaukset[2] = "Valkovuokko";
		yleistietoVastaukset[3] = "3";
		yleistietoVastaukset[4] = "2006";
		yleistietoVastaukset[5] = "1912";
		yleistietoVastaukset[6] = "Elokuussa";
		yleistietoVastaukset[7] = "Fosfori";
		yleistietoVastaukset[8] = "Tarja Halonen";
		yleistietoVastaukset[9] = "1945";
		
		
		for (int i = 0; i < yleistieto.length; i ++) {
			System.out.println(yleistieto[i]);
			String vastaus = lukija.nextLine();
		
			//Tarkastetaan vastaukset ja lasketaan pisteet.	
			
			int arvo = vastausTarkistus(yleistietoVastaukset[i], vastaus);
		
			if (arvo == 1) {
			pisteet += arvo;
			}
		}
			
		return pisteet;
	}

	//Toinen aihe ja sen vastaukset. T�ss� aiheessa isot alkukirjaimet t�ytyy olla oikein.
	
	private static int aihe2() {
		int pisteet = 0;
		
		Scanner lukija = new Scanner(System.in);
		String[] maita = new String[10];
		
		maita[0] = "\n" + "Mik� on Saksan p��kaupunki?";
		maita[1] = "\n" + "Mik� on Italian p��kaupunki?";
		maita[2] = "\n" + "Mik� on Portugalin p��kaupunki?";
		maita[3] = "\n" + "Mik� on Alankomaiden p��kaupunki?";
		maita[4] = "\n" + "Mik� on Luxemburgin p��kaupunki?";
		maita[5] = "\n" + "Mik� on Australian p��kaupunki?";
		maita[6] = "\n" + "Mik� on Argentiinan p��kaupunki?";
		maita[7] = "\n" + "Mik� on Intian p��kaupunki?";
		maita[8] = "\n" + "Mik� on Indonesian p��kaupunki?";
		maita[9] = "\n" + "Mik� on Ugandan p��kaupunki?";
		
		String[] maitaVastaukset = new String[10];
		
		maitaVastaukset[0] = "Berliini";
		maitaVastaukset[1] = "Rooma";
		maitaVastaukset[2] = "Lissabon";
		maitaVastaukset[3] = "Amsterdam";
		maitaVastaukset[4] = "Luxemburg";
		maitaVastaukset[5] = "Canberra";
		maitaVastaukset[6] = "Buenos Aires";
		maitaVastaukset[7] = "New Delhi";
		maitaVastaukset[8] = "Jakarta";
		maitaVastaukset[9] = "Kampala";
		
		
		for (int i = 0; i < maita.length; i ++) {
			System.out.println(maita[i]);
			String vastaus = lukija.nextLine();

			//Taas tarkistetaan vastaukset ja lasketaan pisteet.	
			int arvo = maitaTarkistus(maitaVastaukset[i], vastaus);
		
			if (arvo == 1) {
			pisteet += arvo;
			}
		}
			
		return pisteet;
	}
	
	//T�t� metodia k�ytet��n 1. aiheen vastausten tarkistamiseen. 
	//Tarkastetaan vastaako pelaajan antama vastaus m��ritelty� vastausta, isoista kirjaimista huolimatta.
	//Kerrotaan onko vastaus oikein vai v��rin.
	
	private static int vastausTarkistus(String yleistietoVastaukset, String vastaus) {
		
		int arvo;
		
		if (vastaus.equalsIgnoreCase(yleistietoVastaukset)) {
			arvo = 1;
			System.out.println("Oikein!");
		} else {
			arvo = 0;
			System.out.println("V��rin!");
		}
		
		return arvo;
				
	}

	//T�t� metodia k�ytet��n 2. aiheen vastausten tarkistamiseen. 
	//Tarkastetaan vastaako pelaajan antama vastaus m��ritelty� vastausta, isojen alkukirjaimien tarkuudella.
	//Kerrotaan onko vastaus oikein vai v��rin. Jos vastaus oli v��rin, kerrotaan mik� oikea vastaus oli.
	
	private static int maitaTarkistus(String maitaVastaukset, String vastaus) {
		
		int arvo;
		
		if (vastaus.equals(maitaVastaukset)) {
			arvo = 1;
			System.out.println("Oikein!");
		} else {
			arvo = 0;
			System.out.println("V��rin!");
			System.out.println("Oikea vastaus on " + maitaVastaukset);
		}
		
		return arvo;
				
	}
}

 
