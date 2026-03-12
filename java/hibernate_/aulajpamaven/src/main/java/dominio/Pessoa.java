package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//cria a tabela com o nome da classe e seus atributos com o nome dos atributos da classe

@Entity //Indica que essa classe é uma entidade do banco de dados.
public class Pessoa  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id //Define qual atributo é a chave primária da tabela.
	@GeneratedValue(strategy=GenerationType.IDENTITY) //serve para dizer ao JPA que o valor da chave primária será gerado automaticamente pelo banco de dados.
	private Integer id;
	//caso nao queria esse nome, pode fazer:
	//@Column(name="nomecompleto")
	private String nome;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(Integer id, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
}
