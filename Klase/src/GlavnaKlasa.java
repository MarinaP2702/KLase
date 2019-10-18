
public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car automobil = new Car();			// Instanca klase Car
		
		automobil.boja = "crvena";
		automobil.cena = 150000;
		automobil.kubikaza = 4.8;
		automobil.marka = "ferari";
		automobil.model = "la ferrara";
		automobil.daljinskoZakljucavanje = true;
		
		System.out.println("Napravio sam auto marke" + automobil.marka);
		System.out.println("Model je " + automobil.model);
		System.out.println("Boje: " + automobil.boja);
		System.out.println("Koji kosta: " + automobil.cena + " evra.");
		System.out.println("I koji ima " + automobil.kubikaza + "L");
		System.out.println("Daljinsko zakljucavanje: " + automobil.daljinskoZakljucavanje);
		
		Car automobil2 = new Car();
		automobil2.marka = "McLaren";
		automobil2.model = "Sena";
		
		System.out.println("Najbryi automobil je: " + automobil.marka + " " + automobil.model);
		
	}

}
