package Test;

import java.util.ArrayList;

import Interpreter.Contexto;
import Interpreter.DoisDigitosRomano;
import Interpreter.NumeroRomanoInterpreter;
import Interpreter.QuatroDigitosRomano;
import Interpreter.TresDigitosRomano;
import Interpreter.UmDigitoRomano;

public class Main {

	public static void main(String[] args) {
	    ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
	    interpretadores.add(new QuatroDigitosRomano());
	    interpretadores.add(new TresDigitosRomano());
	    interpretadores.add(new DoisDigitosRomano());
	    interpretadores.add(new UmDigitoRomano());
	 
	    String numeroRomano = "CXCIV";
	    Contexto contexto = new Contexto(numeroRomano);
	 
	    for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
	        numeroRomanoInterpreter.interpretar(contexto);
	    }
	 
	    System.out.println(numeroRomano + " = "
	            + Integer.toString(contexto.getOutput()));
	}
	
}
