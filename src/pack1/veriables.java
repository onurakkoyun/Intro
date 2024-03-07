package pack1;

public class veriables {
	
	public static void mesajVer(String mesaj) {
		 System.out.println(mesaj);
	}
	
	public static void sayiBulmaca(){
		int[] sayilar= new int[] {1,2,5,7,9};
		
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			mesajVer("Sayı mevcuttur : " + aranacak);
		}
		else {
			mesajVer("Sayı mevcut değildir : " + aranacak);
		}
	}
	
	public static void ekle() {
		 System.out.println("Eklendi");
	}
	public static void sil() {
		 System.out.println("Silindi");
	}
	public static void guncelle() {
		 System.out.println("Güncellendi");
		 return;
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		 return "Ankara";
	}

	public static void main(String[] args) {
		// Video-25
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
		
		// Video-24
		
//		sayiBulmaca();
		
		// Video-23
		
//		int[] sayilar= new int[] {1,2,5,7,9};
//		
//		int aranacak = 6;
//		boolean varMi = false;
//		
//		for (int sayi : sayilar) {
//			if (sayi == aranacak) {
//				varMi = true;
//				break;
//			}
//		}
//		
//		if (varMi) {
//			System.out.println("Sayı mevcuttur");
//		}
//		else {
//			System.out.println("Sayı mevcut değildir");
//		}
		
		// Video-22

//		int sayi1 = 222;
//		int sayi2 = 284;
//		int toplam1 = 0;
//		int toplam2 = 0;
//
//		for (int i = 1; i < sayi1; i++) {
//			if (sayi1 % i == 0) {
//				toplam1 += i;
//			}
//		}
//
//		for (int i = 1; i < sayi2; i++) {
//			if (sayi2 % i == 0) {
//				toplam2 += i;
//			}
//		}
//		
//		if (sayi1 == toplam2 && sayi2 == toplam1) {
//			System.out.println("Bu iki sayı arkadaştır");
//		}
//		else {
//			System.out.println("Bu iki sayı arkadaş değildir");
//		}

		// Video-21

//		int number = 28;
//		int total =	0;
//		
//		for (int i = 1; i < number; i++) {
//			if (number % i == 0) {
//				total += i;
//			}
//		}
//		if (total == number) {
//			System.out.println("Mükemmel sayıdır");
//		}
//		else {
//			System.out.println("Mükemmel sayı değildir");
//		}

		// Video-20

//		char harf = 'E';
//		
//		switch (harf) {
//		case 'A': 
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("Kalın sesli harf");
//			break;
//		default:
//			System.out.println("İnce  sesli harf");
//		}

		// Video-19

//		int number = 23;
//		int remainder = number % 2;
//		
//		boolean isPrime = true;
//		
//		if (number == 1) {
//			return;
//		}
//		
//		if (number < 1) {
//			System.out.println("Geçersiz sayı");
//		}
//		
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				isPrime = false;
//			}
//		}
//		if (isPrime) {
//			System.out.println("Sayı asaldır.");
//		}
//		else {
//			System.out.println("Sayı asal değildir");
//		}
//		

		// Video-18
//		String mesaj = "Bugün hava çok güzel.";
//		System.out.println(mesaj);
//		
//		String yeniMesaj = mesaj.replace(' ', '-');
//		System.out.println(yeniMesaj);
//		System.out.println(mesaj.substring(2, 5));
//		
//		for (String kelime : mesaj.split(" ")) {
//			System.out.println(kelime);
//		}
//		
//		System.out.println(mesaj.toLowerCase());
//		System.out.println(mesaj.toUpperCase());
//		System.out.println(mesaj.trim());

		// Video-17

//		String mesaj = "Bugün hava çok güzel.";
//		System.out.println(mesaj);
//		
//		System.out.println("Eleman sayısı : " +mesaj.length());
//		System.out.println("5. eleman : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaşasın!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("av"));
//		System.out.println(mesaj.lastIndexOf("a"));

		// Video-16

//		String[][] sehirler = new String[3][3];
//		
//		sehirler[0][0] = "İstanbul";
//		sehirler[0][1] = "Bursa";
//		sehirler[0][2] = "Bilecik";
//		sehirler[1][0] = "Ankara";
//		sehirler[1][1] = "Konya";
//		sehirler[1][2] = "Kayseri";
//		sehirler[2][0] = "Diyarbakır";
//		sehirler[2][1] = "Şanlıurfa";
//		sehirler[2][2] = "Gaziantep";
//		
//		for (int i = 0; i <= 2; i++) {
//			System.out.println("----------");
//			for (int j = 0; j <=2; j++) {
//				System.out.println(sehirler[i][j]);
//			}
//		}

		// Video-15

//		double[] myList = {1.2, 6.3, 4.3, 5.6};
//		
//		double total = 0;
//		double max = myList[0];
//		
//		for (double number : myList) {
//			if (number > max) {
//				max = number;
//			}
//			total += number;
//			System.out.println(number);
//		}
//		System.out.println("En büyük :" + max);
//		System.out.println("Toplam : " + total);

		// Video-14

//		String ogrenci1 = "Engin";
//		String ogrenci2 = "Derin";
//		String ogrenci3 = "Salih";
//		String ogrenci4 = "Ahmet";
//		
//		System.out.println(ogrenci1);
//		System.out.println(ogrenci2);
//		System.out.println(ogrenci3);
//		System.out.println(ogrenci4);
//		
//		System.out.println("------------------");
//		
//		String[] ogrenciler = new String[4];
//		ogrenciler[0] = "Engin";
//		ogrenciler[1] = "Derin";
//		ogrenciler[2] = "Salih";
//		ogrenciler[3] = "Ahmet";
//		
//		for (int i = 0; i < ogrenciler.length; i++) {
//			System.out.println(ogrenciler[i]);
//		}
//		
//		System.out.println("------------------");
//		for (String ogrenci : ogrenciler) {
//			System.out.println(ogrenci);
//		}

		// Video-13

//		int j = 1000;
//		do {
//			System.out.println(j);		
//			 j+=2;
//		} while (j<10);
//		System.out.println("Do-While döngüsü bitti");

		// Video-12

//		int i = 2;
//		
//		while (i<10) {
//			System.out.println(i);		
//			i+=2;
//		}
//		System.out.println("While döngüsü bitti");

		// Video-11

//		for (int i = 2; i < 10; i+=2) {
//			System.out.println(i);
//		}
//		System.out.println("Döngü bitti");

//		Video-10
//		char grade = 'K';
//		
//		switch (grade) {
//		case 'A': 
//			System.out.println("Mükemmel : Geçtiniz");
//			break;
//		case 'B':
//			System.out.println("Çok güzel : Geçtiniz");
//			break;
//		case 'C':
//			System.out.println("İyi : Geçtiniz");
//			break;
//		case 'D':
//			System.out.println("Fena değil : Geçtiniz");
//			break;
//		case 'F':
//			System.out.println("Maalesef : Kaldınız");
//			break;
//		default:
//			System.out.println("Geçersiz not girdiniz");
//		}

//		Video-9
//		int sayi1 = 266;
//		int sayi2 = 25;
//		int sayi3 = 26;
//		
//		int enBuyuk = sayi1;
//		
//		if (sayi2 > enBuyuk) {
//			enBuyuk = sayi2;
//		}
//		
//		if (sayi3 > enBuyuk) {
//			enBuyuk = sayi3;
//		}
//		
//		System.out.println("En büyük : " + enBuyuk);

	}

}

