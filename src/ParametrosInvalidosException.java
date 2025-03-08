public class ParametrosInvalidosException extends Exception{
    private String mensagem;

    public ParametrosInvalidosException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
