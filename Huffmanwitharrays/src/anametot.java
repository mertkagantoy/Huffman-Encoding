
public class anametot {
	int[] dizi = new int[]{8, 65, 124, 55, 2, 1, 0, 1}; // Dizimi manuel oluþturdum
    huffman obj = new huffman(); //objemý oluþturuyorum
    output = obj.huffman(dizi); // sýnýfýmýn çýktýsýný outputa atýyorum
	for (int i = 0; i < output.length; i++) { //çýktý listemi yazdýrýyorum
	    if (dizi[i] > 0) { 
	        System.out.println(i + "] " + output[i]); // sýkýþtýrýlmýþ binary hallerini yazdýrýyorum
	    }
	}
	

}
