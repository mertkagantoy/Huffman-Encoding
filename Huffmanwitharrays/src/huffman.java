
public class huffman {

	public static String[] huffman(int [] dizi) { //histo dizi, valeur deger valeur,index dizin
	    String[] output = new String[dizi.length]; //codage output
	    int deger1; // ge�i� i�lemlerindee s�rekli g�ncelleyece�im 2 deger 2 index tan�ml�yorum
	    int deger2;
	    int dizin1 = 0;
	    int dizin2 = 0;
	    for (int i = 0; i < dizi.length; i++) {
	        output[i] = new String(); /* a�aca� bir dizi �eklinde implement etmek i�in i� i�e listeye
	                                 ihtiyac�m var*/
	    }
	    do {
	        deger1 = Integer.MAX_VALUE;
	        deger2 = Integer.MAX_VALUE;
	        for (int i = 0; i < dizi.length; i++) {
	            if (dizi[i] > 0) { // elemanlar s�f�rdan b�y�kse devam et
	                if (dizi[i] < deger1) { // dizi deki eleman en b�y�k de�erden k���kse
	                    deger2 = deger1;
	                    deger1 = dizi[dizin1 = i];
	                } else if (dizi[i] < deger2) {
	                    deger2 = dizi[dizin2 = i];
	                }
	            }
	        }
	        dizi[dizin1] = 0;
	        dizi[dizin2] += deger1;
	        output[dizin1] = output[dizin1] + "0"; // binary kodlar� yerle�tiriyorum
	        output[dizin2] = output[dizin2] + "1";
	    } while (deger2 != Integer.MAX_VALUE); // max yani en sa�daki eleman de�ilse devam et

	    return output;

	}
	
	
}
