package com.apiRest.teste.RepositoryClient;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apiRest.teste.modelClient.UserClient;

@Repository
public interface RepositoryClient extends JpaRepository<UserClient,Long> {

	UserClient findById(long id);
	
	 @Query("FROM UserClient WHERE cnpj = ?1")
	    List<UserClient> findByCnpj(long cnpj);

	 @Query("FROM UserClient WHERE cliente = ?1")
	 	List<UserClient> findByNomeCliente(String cliente);
	 
	 @Query("FROM UserClient WHERE codProtocolo = ?1")
	 	List<UserClient> findByProtocolo(long codProtocolo);

	 @Query("FROM UserClient WHERE notafiscal = ?1")
	 List<UserClient> findByNotaFiscal(long notafiscal);
	 
	 @Query("FROM UserClient WHERE email = ?1")
	 	List<UserClient> findByEmail(String email);
	
	 @Query("FROM UserClient WHERE representantePrimary =?1")
	 	List<UserClient> findByRepresentante(String representanteprimary);
	 
	 @Query("FROM UserClient WHERE situacao = ?1")
	 	List<UserClient> findBySituacao(String situacao);
}
