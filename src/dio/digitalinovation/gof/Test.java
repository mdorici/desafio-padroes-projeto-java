package dio.digitalinovation.gof;

import dio.digitalinovation.gof.facade.Facade;
import dio.digitalinovation.gof.singleton.SingletonEager;
import dio.digitalinovation.gof.singleton.SingletonLazy;
import dio.digitalinovation.gof.singleton.SingletonLazyHolder;
import dio.digitalinovation.gof.strategy.Comportamento;
import dio.digitalinovation.gof.strategy.ComportamentoAgressivo;
import dio.digitalinovation.gof.strategy.ComportamentoDefensivo;
import dio.digitalinovation.gof.strategy.ComportamentoNormal;
import dio.digitalinovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {	
		
		//Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo(); 
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Vanilton", "14801788");
		

	}

}
