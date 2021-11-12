package com.apiRest.teste.modelClient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class UserClient {

	 /**** Sequencia Dos dados inseridos! ****
		 * 
		 * CNPJ  **
		 * CLIENTE ** 
		 * ENDEREÇO **
		 * EMAIL ** 
		 * REPRESENTANTE 1 ****
		 * REPRESENTANTE 2 ****
		 * NOTA FISCAL **
		 * TIPO DE CHAMADA  **
		 * D.G.E **
		 * TELEFONE **
		 * BAIRRO **
		 * CEP **
		 * OBSERBACAO **
		 * CODIGO Protocolo **
		 * TELEFONE 2 **
		 * CIDADE  **
		 * SUPERVISOR **
		 * UF **
		 * SITUAÇÃO **
		 * 
		 * 
		 **/
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id", nullable = false)
		private Long id;
		
		@Column(name = "cnpj", nullable = false)
		private Long cnpj;
		
		@Column(name = "endereço", nullable = false)
		private String endereco;
		
		@Column(name = "email", nullable = false)
		private String email;
		
		@Column(name = "representanteprimary", nullable = false)
		private String representantePrimary;
		
		@Column(name = "representantesecundary", nullable = false)
		private String representanteSecundary;
		
		@Column(name = "notaFiscal", nullable = false)
		private long notaFiscal;
		
		@Column(name = "tipoDeChamada", nullable = false)
		private String tipochamada;
		
		@Column(name = "DGE", nullable = false)
		private String dge;
		
		@Column(name = "telefoneprimary", nullable = false)
		private long telefone;
		
		@Column(name = "bairro", nullable = false)
		private String bairro;
		
		@Column(name = "cep", nullable = false)
		private long cep;
		
		@Column(name = "observação")
		private String observacao;
		
		@Column(name = "codigoProtocolo")
		private long codProtocolo;
		
		@Column(name = "telefonesecundary")
		private long telefoneSecundary;
		
		@Column(name = "cidade", nullable = false)
		private String cidade;
		
		@Column(name = "supervisor", nullable = false)
		private String supervisor;
		
		@Column(name = "Estado", nullable = false)
		private String UF;
		
		@Column(name = "situação", nullable = false)
		private String situacao;
		
		@Column(name = "cliente", nullable = false)
		private String cliente;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getCnpj() {
			return cnpj;
		}

		public void setCnpj(Long cnpj) {
			this.cnpj = cnpj;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRepresentantePrimary() {
			return representantePrimary;
		}

		public void setRepresentantePrimary(String representantePrimary) {
			this.representantePrimary = representantePrimary;
		}

		public String getRepresentanteSecundary() {
			return representanteSecundary;
		}

		public void setRepresentanteSecundary(String representanteSecundary) {
			this.representanteSecundary = representanteSecundary;
		}

		public long getNotaFiscal() {
			return notaFiscal;
		}

		public void setNotaFiscal(long notaFiscal) {
			this.notaFiscal = notaFiscal;
		}

		public String getTipochamada() {
			return tipochamada;
		}

		public void setTipochamada(String tipochamada) {
			this.tipochamada = tipochamada;
		}

		public String getDge() {
			return dge;
		}

		public void setDge(String dge) {
			this.dge = dge;
		}

		public long getTelefone() {
			return telefone;
		}

		public void setTelefone(long telefone) {
			this.telefone = telefone;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public long getCep() {
			return cep;
		}

		public void setCep(long cep) {
			this.cep = cep;
		}

		public String getObservacao() {
			return observacao;
		}

		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}

		public long getCodProtocolo() {
			return codProtocolo;
		}

		public void setCodProtocolo(long codProtocolo) {
			this.codProtocolo = codProtocolo;
		}

		public long getTelefoneSecundary() {
			return telefoneSecundary;
		}

		public void setTelefoneSecundary(long telefoneSecundary) {
			this.telefoneSecundary = telefoneSecundary;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getSupervisor() {
			return supervisor;
		}

		public void setSupervisor(String supervisor) {
			this.supervisor = supervisor;
		}

		public String getUF() {
			return UF;
		}

		public void setUF(String uF) {
			UF = uF;
		}

		public String isSituacao() {
			return situacao;
		}

		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		
		
		
		
}
