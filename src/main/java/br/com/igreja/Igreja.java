package br.com.igreja;

import br.com.igreja.models.Contrato;
import br.com.igreja.models.PdfItext;


/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        // Aqui faço vários testes aleatórios para testar certas funcionalidades
        Contrato contrato = new Contrato("MARIA DO AMPARO TEIXEIRA", "06 MESES", "R$ 750,00 (SETECENTOS E CINQUENTA REAIS)");
        PdfItext gerador = new PdfItext();
        gerador.gerarContrato(contrato);
    }
}