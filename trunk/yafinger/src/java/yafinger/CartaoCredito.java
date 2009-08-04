package yafinger;

import java.util.Date;

public class CartaoCredito {
 
	public String financeira;
	 
	public String nome;
	 
	public Date dataLimiteCompra;
	 
	public float limiteCompra;
	 
	private Despesa despesa;

    /**
     * @return the despesa
     */
    public Despesa getDespesa() {
        return despesa;
    }

    /**
     * @param despesa the despesa to set
     */
    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }
	 
}
 
