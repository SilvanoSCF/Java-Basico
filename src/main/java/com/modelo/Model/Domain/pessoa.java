package com.modelo.Model.Domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	/**
	 * Objeto pessoa 
	 * @author Silvano Filho
	 *
	 */
	@Entity
	public class pessoa extends GenericDomain{

		
		
		@Column(length = 50, nullable = false)
		private String nome;
		
		@Column(length = 20)
		private String cpf;
		
		@Column(length = 20)
		private String rg;
		
		@Column(nullable = true)
		@Temporal(TemporalType.DATE)
		private Date dataNasc;
		
		@Column(length = 20)
		private String sexo;
		
		@Column(length = 20)
		private String naturalidade;
		
		@Column(length = 20)
		private String eCivil;
		
		@Column(length = 20)
		private String habilitacaoNum;
		
		@Column(length = 60)
		private String filiacaoMae;
		
		@Column(length = 60)
		private String filiacaoPae;		
		
		@Column(length = 20)
		private String Telefone;
		
		@Column(length = 20)
		private String celular;
		
		@Column(length = 60)
		private String email;
		
		@Column(length = 30)
		private String profissao;
		
		@Column(length = 35)
		private String rua;
		
		@Column(length = 35)
		private String bairro;
		
		@Column(length = 35)
		private String cidade;
		
		@Column(length = 12)
		private String cep;
		
		@Column(length = 4)
		private String estado;
		
		@Column(length = 20)
		private String pais;
		
		@Column(length = 10)
		private String numero;
		
		@Column(length = 20)
		private String departamento;
		
		@Column(length = 20)
		private String desdepartamento;
		
		@Column(length = 20)
		private String aread;
		
		@Column(length = 20)
		private String depanterior;
		
		@Column(length = 5)
		private String batizado;
		
		@Column(length = 5)
		private String diz;	
		
		@Column(length = 10)
		private String obs;
		
		@Column(length = 20)
		private String complemento;
		
		
		
		
		
		
			

		
		public pessoa(){
			
		}
		
		
		


		//////////////////////////////////////////////////////////
		
		public String getNome() {
			return nome;
		}

		public pessoa(String nome, String cpf, String rg, Date dataNasc, String sexo, String naturalidade,
				String eCivil, String habilitacaoNum, String filiacaoMae, String filiacaoPae, String telefone,
				String celular, String email, String profissao, String rua, String bairro, String cidade, String cep,
				String estado, String pais, String numero, String departamento, String desdepartamento, String aread,
				String depanterior, String batizado, String diz, String obs, String complemento) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.rg = rg;
			this.dataNasc = dataNasc;
			this.sexo = sexo;
			this.naturalidade = naturalidade;
			this.eCivil = eCivil;
			this.habilitacaoNum = habilitacaoNum;
			this.filiacaoMae = filiacaoMae;
			this.filiacaoPae = filiacaoPae;
			Telefone = telefone;
			this.celular = celular;
			this.email = email;
			this.profissao = profissao;
			this.rua = rua;
			this.bairro = bairro;
			this.cidade = cidade;
			this.cep = cep;
			this.estado = estado;
			this.pais = pais;
			this.numero = numero;
			this.departamento = departamento;
			this.desdepartamento = desdepartamento;
			this.aread = aread;
			this.depanterior = depanterior;
			this.batizado = batizado;
			this.diz = diz;
			this.obs = obs;
			this.complemento = complemento;
		}


	

		
		
		//////////////////////////////////////////////////////////


		




		@Override
		public String toString() {
			return "pessoas [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNasc=" + dataNasc + ", sexo=" + sexo
					+ ", naturalidade=" + naturalidade + ", eCivil=" + eCivil + ", habilitacaoNum=" + habilitacaoNum
					+ ", filiacaoMae=" + filiacaoMae + ", filiacaoPae=" + filiacaoPae + ", Telefone=" + Telefone
					+ ", celular=" + celular + ", email=" + email + ", profissao=" + profissao + ", rua=" + rua
					+ ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pais="
					+ pais + ", numero=" + numero + ", departamento=" + departamento + ", desdepartamento="
					+ desdepartamento + ", aread=" + aread + ", depanterior=" + depanterior + ", batizado=" + batizado
					+ ", diz=" + diz + ", obs=" + obs + ", complemento=" + complemento + "]";
		}



		//////////////////////////////////////////////////////////

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public Date getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(Date dataNasc) {
			this.dataNasc = dataNasc;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getNaturalidade() {
			return naturalidade;
		}

		public void setNaturalidade(String naturalidade) {
			this.naturalidade = naturalidade;
		}

		public String geteCivil() {
			return eCivil;
		}

		public void seteCivil(String eCivil) {
			this.eCivil = eCivil;
		}

		public String getHabilitacaoNum() {
			return habilitacaoNum;
		}

		public void setHabilitacaoNum(String habilitacaoNum) {
			this.habilitacaoNum = habilitacaoNum;
		}

		public String getFiliacaoMae() {
			return filiacaoMae;
		}

		public void setFiliacaoMae(String filiacaoMae) {
			this.filiacaoMae = filiacaoMae;
		}

		public String getFiliacaoPae() {
			return filiacaoPae;
		}

		public void setFiliacaoPae(String filiacaoPae) {
			this.filiacaoPae = filiacaoPae;
		}

		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone) {
			Telefone = telefone;
		}

		public String getCelular() {
			return celular;
		}

		public void setCelular(String celular) {
			this.celular = celular;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getDepartamento() {
			return departamento;
		}


		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}


		public String getDesdepartamento() {
			return desdepartamento;
		}


		public void setDesdepartamento(String desdepartamento) {
			this.desdepartamento = desdepartamento;
		}


		public String getAread() {
			return aread;
		}


		public void setAread(String aread) {
			this.aread = aread;
		}


		public String getDepanterior() {
			return depanterior;
		}


		public void setDepanterior(String depanterior) {
			this.depanterior = depanterior;
		}


		public String getBatizado() {
			return batizado;
		}


		public void setBatizado(String batizado) {
			this.batizado = batizado;
		}


		public String getDiz() {
			return diz;
		}


		public void setDiz(String diz) {
			this.diz = diz;
		}


		public String getObs() {
			return obs;
		}


		public void setObs(String obs) {
			this.obs = obs;
		}





		public String getComplemento() {
			return complemento;
		}





		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		
		
		
		




	
		
		
		
		
		
	

		
		
}
	
	
	
	
	
	
	
	
	
	
