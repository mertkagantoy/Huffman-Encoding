
public class huffman {

	public static String[] huffman(int [] dizi) { //histo dizi, valeur deger valeur,index dizin
	    String[] output = new String[dizi.length]; //codage output
	    int deger1; // geçiþ iþlemlerindee sürekli güncelleyeceðim 2 deger 2 index tanýmlýyorum
	    int deger2;
	    int dizin1 = 0;
	    int dizin2 = 0;
	    for (int i = 0; i < dizi.length; i++) {
	        output[i] = new String(); /* aðacaý bir dizi þeklinde implement etmek için iç içe listeye
	                                 ihtiyacým var*/
	    }
	    do {
	        deger1 = Integer.MAX_VALUE;
	        deger2 = Integer.MAX_VALUE;
	        for (int i = 0; i < dizi.length; i++) {
	            if (dizi[i] > 0) { // elemanlar sýfýrdan büyükse devam et
	                if (dizi[i] < deger1) { // dizi deki eleman en büyük deðerden küçükse
	                    deger2 = deger1;
	                    deger1 = dizi[dizin1 = i];
	                } else if (dizi[i] < deger2) {
	                    deger2 = dizi[dizin2 = i];
	                }
	            }
	        }
	        dizi[dizin1] = 0;
	        dizi[dizin2] += deger1;
	        output[dizin1] = output[dizin1] + "0"; // binary kodlarý yerleþtiriyorum
	        output[dizin2] = output[dizin2] + "1";
	    } while (deger2 != Integer.MAX_VALUE); // max yani en saðdaki eleman deðilse devam et

	    return output;

	}
	
	
}
