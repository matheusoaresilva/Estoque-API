package com.matheus.EstoqueAPI.exception;

public class CodigoDeBarrasExistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CodigoDeBarrasExistenteException(String mensagem) {
		super(mensagem);
	}

}
