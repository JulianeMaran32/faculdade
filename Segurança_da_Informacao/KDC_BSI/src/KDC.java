import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class KDC {
	private Pessoa bob;
	private Pessoa alice;
	private byte[] ksCifradaBob;
	private byte[] ksCifradaAlice;
	
	
	public KDC(Pessoa bob, Pessoa alice) {
		this.bob = bob;
		this.alice = alice;
	}
	
	public String getKS()
	{
		//random 16 ou 32 caracteres
		return "1234567890abcdef";
	}
	
	public void gerarChaveSessao(String id, byte[] idCifrado, byte[] destinatarioCifrado) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException
	{
		//Será que é realmente o bob?
		String idDecifrado = AES.decifra(idCifrado, bob.getChaveMestre());
		if( id.equals(idDecifrado) )
		{
			String destinatario = AES.decifra(destinatarioCifrado, bob.getChaveMestre());
			if( destinatario.equals(alice.getID()) )
			{
				//Bob quer falar com a Alice
				String chaveSessao = getKS();
				this.ksCifradaBob = AES.cifra(chaveSessao, bob.getChaveMestre());
				this.ksCifradaAlice = AES.cifra(chaveSessao, alice.getChaveMestre());
				
			}
		}
		else
		{
			System.out.println("Deu ruim!");
		}
	}
	

	public byte[] getKSCifradaBob()
	{
		return this.ksCifradaBob;
	}
	public byte[] getKSCifradaAlice()
	{
		return this.ksCifradaAlice;
	}
}
