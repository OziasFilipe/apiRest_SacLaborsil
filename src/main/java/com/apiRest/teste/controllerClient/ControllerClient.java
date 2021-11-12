package com.apiRest.teste.controllerClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRest.teste.RepositoryClient.RepositoryClient;
import com.apiRest.teste.modelClient.UserClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/")
@Api(value="Api Cliente")
@CrossOrigin(origins="*")
public class ControllerClient {

	@Autowired 
	private RepositoryClient repositorio;
	
	// Buscar Dados - Metodo GET//
		
		
		@GetMapping("")
		@ApiOperation(value="Buscar Todos os elementos")
		public List<UserClient> findAll(){
			return repositorio.findAll();
		}
		@GetMapping("cliente/{Id}")
		@ApiOperation(value="Buscar elemento através do identificador na (URL)")
		public UserClient BuscarAtravezDoid(@PathVariable(value="Id")long id) {
			return repositorio.findById(id);
		}
		
		// Inserir Dados - Metodo POST
		@PostMapping("")
		public UserClient InserirCliente(@RequestBody UserClient cliente) {
			return repositorio.save(cliente);
		}
		
	
	
	
}

