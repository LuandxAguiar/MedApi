package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Data
public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String uf;
	
	

	public Endereco(DadosEndereco dados) {
		
		this.logradouro = dados.logradouro();
		this.bairro = dados.bairro();
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.complemento = dados.complemento();
		this.uf = dados.uf();
	}
}
