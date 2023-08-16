package enumeracoes;


/**
 *
 * @author silviacb
 */
public class TesteEnumBebidas {
    public static void main(String[] args) {
       // System.out.println(Bebida.CocaCola.getDescricao() + ": R$" + Bebida.CocaCola.getPreco());
       // Percorre a enumeração (percorre as constantes) e para cada item da enum
       // vai permitir fazer uma ação, neste caso linha 14 - estamos pegando a descrição	
        for (Bebida bebida : Bebida.values()) {
            //System.out.println(bebida.getDescricao());
            
            System.out.print(bebida.getDescricao() + " -> ");
            System.out.println(bebida.getPreco());
        }
    }
}
