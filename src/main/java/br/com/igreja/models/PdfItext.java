/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.igreja.models;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author demi
 */
public class PdfItext {
    // Fonte para o título
    private Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
    private Font sectionTitleFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
    private Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
    private Font normalFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
    //Instancias iText
    private Document documentoPdf = new Document();
    private FileOutputStream caminho;
    // Este método gera o Contrato pdf
    public void gerarContrato(Contrato contrato){
         // Verificar e criar diretório se não existir
        File dir = new File(".\\ContratosGerados");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //Definindo tamanho da página para padrão A4
        documentoPdf.setPageSize(PageSize.A4);
        try {
            PdfWriter.getInstance(documentoPdf, new FileOutputStream(".\\ContratosGerados\\newContrato.pdf"));
            documentoPdf.open();
            // Título do contrato
            Paragraph title = new Paragraph("CONTRATO DE LOCAÇÃO DE IMÓVEL", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documentoPdf.add(title);
            // Espaçamento
            documentoPdf.add(new Paragraph("\n"));
            // Criando cabeçalho de acordo com os dados do objeto 'contrato'
            criarCabecalho(contrato.getNomeLocatario(), contrato.getVigenciaMeses(), contrato.getValorAluguel());
            
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (documentoPdf.isOpen()) {
                documentoPdf.close();
            }
        }
    }
    // Este método cria o cabeçalho
    private void criarCabecalho(String nomeLocatario, String vigenciaMeses, String valorAluguel){
        if(!documentoPdf.isOpen()){
            documentoPdf.open();
        }
        // Parágrafo com formatação mista
            Paragraph contractDetails = new Paragraph();
            contractDetails.add(new Chunk("Locador: ", normalFont));
            contractDetails.add(new Chunk("ELIXXX BATXXX XXXX\n", boldFont));
            contractDetails.add(new Chunk("Locatário (a) (s): ", normalFont));
            contractDetails.add(new Chunk(nomeLocatario+"\n", boldFont));
            contractDetails.add(new Chunk("Endereço do imóvel do aluguel: ", normalFont));
            contractDetails.add(new Chunk("QNP XX CONJUNTO X LOTE XX CASA XX\nCEILANDIA/DF\n", boldFont));
            contractDetails.add(new Chunk("Vigência: ", normalFont));
            contractDetails.add(new Chunk(vigenciaMeses+"\n", boldFont));
            contractDetails.add(new Chunk("Valor do aluguel: ", normalFont));
            contractDetails.add(new Chunk("R$ "+valorAluguel+"\n", boldFont));
            contractDetails.add(new Chunk("Reajuste: ", normalFont));
            contractDetails.add(new Chunk("De acordo com 0 - (IGPM)", normalFont));
        try {
            // Adicionar os detalhes do contrato ao documento
            documentoPdf.add(contractDetails);
        } catch (DocumentException e) {
            System.out.println("Erro ao criar cabeçalho.");
            e.printStackTrace();
        }
    }
}
