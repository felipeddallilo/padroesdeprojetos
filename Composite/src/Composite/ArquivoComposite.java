package Composite;

import java.util.ArrayList;

public class ArquivoComposite extends Arquivo {
 
    ArrayList<Arquivo> arquivos = new ArrayList<Arquivo>();
 
    public ArquivoComposite(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
 
    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);
        for (Arquivo arquivoTmp : arquivos) {
            arquivoTmp.printNomeDoArquivo();
        }
    }
 
    @Override
    public void adicionar(Arquivo novoArquivo) {
        this.arquivos.add(novoArquivo);
    }
 
    @Override
    public void remover(String nomeDoArquivo) throws Exception {
        for (Arquivo arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
                this.arquivos.remove(arquivoTmp);
                return;
            }
        }
        throw new Exception("Não existe este arquivo");
    }
 
    @Override
    public Arquivo getArquivo(String nomeDoArquivo) throws Exception {
        for (Arquivo arquivoTmp : arquivos) {
            if (arquivoTmp.getNomeDoArquivo() == nomeDoArquivo) {
                return arquivoTmp;
            }
        }
        throw new Exception("Não existe este arquivo");
    }

}
