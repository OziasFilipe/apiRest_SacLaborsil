package com.apiRest.teste.controllerClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.teste.RepositoryClient.RepositoryClient;
import com.apiRest.teste.modelClient.UserClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(value="Api Cliente")
@CrossOrigin(origins="*")
public class ControllerClient {
	//Auxiliar 
	//cliente?clienteuser=oziasfilipe
	
	@Autowired 
	private RepositoryClient repositorio;
	
		/**Metodo de Busca de Elementos (GET)*/
		/**                                     **/
		
		@GetMapping("cliente/{Id}")
		@ApiOperation(value="Buscar elemento através do identificador na (URL)")
		public UserClient getById(@PathVariable(value="Id")long id) {
			return repositorio.findById(id);
		}
		
		@GetMapping("cnpj/{Cnpj}")
		@ApiOperation(value = "Buscar elemento através do CNPJ")
		public List<UserClient> getByCnpj(@PathVariable(value="Cnpj") long cnpj){
			return repositorio.findByCnpj(cnpj);
		}
		
		
		@GetMapping("cliente")
		@ApiOperation(value = "Buscar elemento através do nome do cliente")
		public List<UserClient> getBycliente(@RequestParam(value="clienteuser") String cliente){
			return repositorio.findByNomeCliente(cliente);
		}

		@GetMapping("protocolo/{CodProtocolo}")
		@ApiOperation(value = "Buscar atraves do protocolo")
		public List<UserClient> getByProtocolo(@PathVariable(value="CodProtocolo")long codProtocolo){
			return repositorio.findByProtocolo(codProtocolo);
		}
		
		@GetMapping("notafiscal/{notafiscal}")
		@ApiOperation(value = "Buscar atraves da numeração da nota fiscal")
	public List<UserClient> getByNotaFiscal(@PathVariable(value="notafiscal")long notaFiscal){
			return repositorio.findByNotaFiscal(notaFiscal);
		}
		
		@GetMapping("email")
		@ApiOperation(value = "Buscar através do email")
		public List<UserClient> getByEmail(@RequestParam(value="email") String email){
			return repositorio.findByEmail(email);
		}
		
		@GetMapping("representante")
		public List<UserClient>getByRepresentante(@RequestParam(value="representanteprimary")String representantePrimary){
			return repositorio.findByRepresentante(representantePrimary);
		};
		
		@GetMapping("situacao")
		@ApiOperation(value = "Buscar através da situação")
		public List<UserClient> getBySitucao(@RequestParam(value="situacao")String situacao){
			return repositorio.findBySituacao(situacao);
		}
		
		@GetMapping("clientAll")
		@ApiOperation(value="Buscar Todos os elementos")
		public List<UserClient> getAll(){
			return repositorio.findAll();
		}
		
		/**Metodo de Inserção de Elementos (POST)*/
		/**                                     **/
		
		@PostMapping("")
		@ApiOperation(value="Inserir coleção de dados no banco")
		public UserClient InsertClient(@RequestBody UserClient client) {
			return repositorio.save(client);
		}
		
		/**Metodo de Atualização de Elementos (PUT)*/
		/**                                     **/
		@PutMapping("")
		@ApiOperation(value ="Atualizar dados no banco de dados")
		public  UserClient UpdateClient(@RequestBody UserClient client) {
			return repositorio.save(client);
		}
		
		/**Metodo de deletar Elementos (DELETE)*/
		/**                                   **/
		
		@DeleteMapping("")
		@ApiOperation(value = "Excluir todos os dados do banco")
		public String DeleteAll(){
			repositorio.deleteAll();
			return "Deletou todos os dados do banco";
		}
		
}

