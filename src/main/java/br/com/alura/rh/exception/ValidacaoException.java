package br.com.alura.rh.exception;

public class ValidacaoException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String mensagem;

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
