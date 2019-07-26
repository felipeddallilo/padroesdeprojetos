package test;

import Singleton.Singleton;
import Singleton.Singleton2;

public class main {

	
	public static void main() {
		Singleton s = Singleton.getInstance();
		Singleton2 s2  = Singleton2.INSTANCE;
	}
	
}
