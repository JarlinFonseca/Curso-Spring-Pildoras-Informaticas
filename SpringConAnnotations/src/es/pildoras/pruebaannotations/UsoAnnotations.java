package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		// Leer el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un Bean al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// Usar el Bean
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		// Cerrar el contexto
		contexto.close();

	}

}
