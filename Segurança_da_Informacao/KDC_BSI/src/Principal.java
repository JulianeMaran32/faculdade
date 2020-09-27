import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Principal {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
		Pessoa bob = new Pessoa("bob", "bolabolabolabola");
		Pessoa alice = new Pessoa("alice","patopatopatopato");
		
		KDC kdc = new KDC(bob,alice);
		
		//Identificador
		String p1 = bob.getID();
		//Identificador cifrado na k_bob
		byte[] p2 = AES.cifra(bob.getID(), bob.getChaveMestre());
		//Alice cifrado na k_bob
		byte[] p3 = AES.cifra(alice.getID(), bob.getChaveMestre());	

		kdc.gerarChaveSessao(p1, p2, p3);
		kdc.getKSCifradaBob();
		//????????????????
	}
}
