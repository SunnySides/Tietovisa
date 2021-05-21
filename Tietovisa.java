package java2021;

import java.util.Scanner;

public class Tietovisa {
	public static void main(String[] args) {

		int pisteet;
		
		Scanner lukija = new Scanner(System.in);
	
		//Aloitetaan peli esittelemällä säännöt ja kysymällä nimi.	
		
		System.out.println("Hei, tervetuloa Tietovisaan!");
				
		System.out.print("\n" + "Pelaajan nimi: ");
		String nimi = lukija.nextLine();
		
		//Kysytään pelaajalta haluaako hän säännöt ja tulostetaan ne

		System.out.println("");
		System.out.println("Haluatko säännöt?");
		String säännöt = lukija.nextLine();

		if (säännöt.equalsIgnoreCase("Kyllä")) {
			System.out.println("");
			System.out.println("Säännöt:");
			System.out.println("Valittaessa aihetta kirjoita pelkkänumero.");
			System.out.println("Kirjoita vastaus kysymyksen jälkeen.");
			System.out.println("Jos kysymyksessä kysytään numeroa kirjoita vastaus käyttäen numeroita.");
		} 
		else {
			System.out.println("\n" + "No kerron ne kuitenkin.");
			System.out.println("\n" + "Säännöt:");
			System.out.println("Valittaessa aihetta kirjoita pelkkä numero.");
			System.out.println("Kirjoita vastaus kysymyksen jälkeen.");
			System.out.println("Jos kysymyksessä kysytään numeroa kirjoita vastaus käyttäen numeroita.");
		}
		
	//Kysytään mistä aiheesta pelaaja haluaa tulla visatuksi.
		
		System.out.println("\n" + "Mistä aiheesta haluat tulla visatuksi?");
		System.out.println("1. aihe: yleistieto");
		System.out.println("2. aihe: maiden pääkaupungit");
		int aihe = lukija.nextInt();
		
		//Riippuen valitusta aiheesta, suoritetaan aliohjelma (metodi).
		
		if (aihe == 1) {
			pisteet = aihe1();
		} else {
			pisteet = aihe2();
		}
		
		//Tulostetaan pisteet, ja kerrotaan onnittelut tai harmittelut. Peli loppuu tähän.
		
		System.out.println("\n" + "Sait " + pisteet + " pistettä.");
		
		if (pisteet == 10) {
			System.out.println("Onneksi olkoon " + nimi + "! Saitkaikki oikein!");
		}else if (pisteet < 10 && pisteet > 5) {
			System.out.println("Sait enemmän kuin puolet oikein, hyvin meni " + nimi + ".");
		} else if (pisteet < 5 && pisteet > 0) {
			System.out.println("Parempi onni ensi kerralla.");
		} else if (pisteet == 0) {
			System.out.println("Et saanut yhtään oikein. Ehkä kannattaisi harhoitella enemmän.");
		}
	}

	//Ensimmäisen aiheen kysymykset ja vastaukset. Tässä aiheessa isoilla alkukirjaimilla ei ole väliä.
	
	private static int aihe1() {
		int pisteet = 0;
		
		Scanner lukija = new Scanner(System.in);
		
		String[] yleistieto = new String[10];
		
		yleistieto[0] = "\n" + "Mikä päivä on 1.5.?";
		yleistieto[1] = "\n" + "Mikä on Suomen kansallis-eläin?";
		yleistieto[2] = "\n" + "Mitä kukkaa poimitaan yleensä äitienpäivänä?";
		yleistieto[3] = "\n" + "Kuinka monta sydäntä mustekalalla on?";
		yleistieto[4] = "\n" + "Minä vuonna Suomi voitti Euroviisut?";
		yleistieto[5] = "\n" + "Minä vuonna Titanic upposi?";
		yleistieto[6] = "\n" + "Missä kuussa peruskoulut alkavat?";
		yleistieto[7] = "\n" + "Mikä alkuaina on P?";
		yleistieto[8] = "\n" + "Kuka oli Suomen ensimmäinen naispresidentti?";
		yleistieto[9] = "\n" + "Milloin ensimmäinen tietokone keksittiin?";
		
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

	//Toinen aihe ja sen vastaukset. Tässä aiheessa isot alkukirjaimet täytyy olla oikein.
	
	private static int aihe2() {
		int pisteet = 0;
		
		Scanner lukija = new Scanner(System.in);
		String[] maita = new String[10];
		
		maita[0] = "\n" + "Mikä on Saksan pääkaupunki?";
		maita[1] = "\n" + "Mikä on Italian pääkaupunki?";
		maita[2] = "\n" + "Mikä on Portugalin pääkaupunki?";
		maita[3] = "\n" + "Mikä on Alankomaiden pääkaupunki?";
		maita[4] = "\n" + "Mikä on Luxemburgin pääkaupunki?";
		maita[5] = "\n" + "Mikä on Australian pääkaupunki?";
		maita[6] = "\n" + "Mikä on Argentiinan pääkaupunki?";
		maita[7] = "\n" + "Mikä on Intian pääkaupunki?";
		maita[8] = "\n" + "Mikä on Indonesian pääkaupunki?";
		maita[9] = "\n" + "Mikä on Ugandan pääkaupunki?";
		
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
	
	//Tätä metodia käytetään 1. aiheen vastausten tarkistamiseen. 
	//Tarkastetaan vastaako pelaajan antama vastaus määriteltyä vastausta, isoista kirjaimista huolimatta.
	//Kerrotaan onko vastaus oikein vai väärin.
	
	private static int vastausTarkistus(String yleistietoVastaukset, String vastaus) {
		
		int arvo;
		
		if (vastaus.equalsIgnoreCase(yleistietoVastaukset)) {
			arvo = 1;
			System.out.println("Oikein!");
		} else {
			arvo = 0;
			System.out.println("Väärin!");
		}
		
		return arvo;
				
	}

	//Tätä metodia käytetään 2. aiheen vastausten tarkistamiseen. 
	//Tarkastetaan vastaako pelaajan antama vastaus määriteltyä vastausta, isojen alkukirjaimien tarkuudella.
	//Kerrotaan onko vastaus oikein vai väärin. Jos vastaus oli väärin, kerrotaan mikä oikea vastaus oli.
	
	private static int maitaTarkistus(String maitaVastaukset, String vastaus) {
		
		int arvo;
		
		if (vastaus.equals(maitaVastaukset)) {
			arvo = 1;
			System.out.println("Oikein!");
		} else {
			arvo = 0;
			System.out.println("Väärin!");
			System.out.println("Oikea vastaus on " + maitaVastaukset);
		}
		
		return arvo;
				
	}
}

 
