package yafinger;

public class Despesa extends Lancamento {
 
	public char formaPagamento;
	 
	private CartaoCredito[] cartaoCredito;

    /**
     * @return the cartaoCredito
     */
    public CartaoCredito[] getCartaoCredito() {
        return cartaoCredito;
    }

    /**
     * @param cartaoCredito the cartaoCredito to set
     */
    public void setCartaoCredito(CartaoCredito[] cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
	 
}
 
