package Test;

import Composite.Arquivo;
import Composite.ArquivoComposite;
import Composite.ArquivoVideo;

public class Main {

	public static void main(String[] args) {
	    Arquivo minhaPasta = new ArquivoComposite("Minha Pasta/");
	    Arquivo meuVideo = new ArquivoVideo("meu video.avi");
	    Arquivo meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");
	 
	    try {
	        meuVideo.adicionar(meuOutroVideo);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	 
	    try {
	        minhaPasta.adicionar(meuVideo);
	        minhaPasta.adicionar(meuOutroVideo);
	        minhaPasta.printNomeDoArquivo();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	 
	    try {
	        System.out.println("\nPesquisando arquivos:");
	        minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
	                .printNomeDoArquivo();
	        System.out.println("\nRemover arquivos");
	        minhaPasta.remover(meuVideo.getNomeDoArquivo());
	        minhaPasta.printNomeDoArquivo();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
