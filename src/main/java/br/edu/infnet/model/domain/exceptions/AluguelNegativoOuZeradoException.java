package br.edu.infnet.model.domain.exceptions;

public class AluguelNegativoOuZeradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public AluguelNegativoOuZeradoException(String message) {
        super(message);
    }
    
}
