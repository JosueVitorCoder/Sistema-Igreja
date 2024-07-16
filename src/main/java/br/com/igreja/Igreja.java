package br.com.igreja;

import br.com.igreja.models.Contrato;
import br.com.igreja.models.PdfItext;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 *
 * @author demi
 */
public class Igreja {

    public static void main(String[] args) {
        // Aqui faço vários testes aleatórios para testar certas funcionalidades
        Contrato contrato = new Contrato("Paulozinho", "01 MESES", "350 reais");
        PdfItext pdf = new PdfItext();
        pdf.gerarContrato(contrato);
    }
}