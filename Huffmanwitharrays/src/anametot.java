
public class anametot {
	int[] dizi = new int[]{8, 65, 124, 55, 2, 1, 0, 1}; // Dizimi manuel olu�turdum
    huffman obj = new huffman(); //objem� olu�turuyorum
    output = obj.huffman(dizi); // s�n�f�m�n ��kt�s�n� outputa at�yorum
	for (int i = 0; i < output.length; i++) { //��kt� listemi yazd�r�yorum
	    if (dizi[i] > 0) { 
	        System.out.println(i + "] " + output[i]); // s�k��t�r�lm�� binary hallerini yazd�r�yorum
	    }
	}
	

}
