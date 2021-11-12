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

	@Autowired 
	private RepositoryClient repositorio;
	
		/**Metodo de Busca de Elementos (GET)*/
		/**                                     **/
		
		@GetMapping("cliente/{Id}")
		@ApiOperation(value="Buscar elemento através do identificador na (URL)")
		public UserClient BuscarAtravezDoid(@PathVariable(value="Id")long id) {
			return repositorio.findById(id);
		}
		
		@GetMapping("cnpj")
		@ApiOperation(value = "Buscar elemento através do CNPJ")
		public List<UserClient> getByCnpj(long cnpj){
			return repositorio.findByCnpj(cnpj);
		}
		
		@GetMapping("cliente")
		@ApiOperation(value = "Buscar elemento através do nome do cliente")
		public List<UserClient> getBycliente(String cliente){
			return repositorio.findByNomeCliente(cliente);
		}
		
		@GetMapping("clientAll")
		@ApiOperation(value="Buscar Todos os elementos")
		public List<UserClient> getAll(){
			return repositorio.findAll();
		}
		
	
		
		@GetMapping("protocolo")
		@ApiOperation(value = "Buscar atraves do protocolo")
		public List<UserClient> getByProtocolo(long codProtocolo){
			return repositorio.findByProtocolo(codProtocolo);
		}
		
		@GetMapping("notafiscal")
		@ApiOperation(value = "Buscar atraves do numero da nota fiscal")
		public List<UserClient> getByNotaFiscal(long notafiscal){
			return repositorio.findByNotaFiscal(notafiscal);
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

