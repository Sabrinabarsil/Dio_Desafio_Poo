package com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(76);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso SpringBoot");
		curso2.setDescricao("Descrição curso Spring");
		curso2.setCargaHoraria(50);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("descrição mentoria");
		mentoria.setCargaHoraria(20);		
		mentoria.setData(LocalDate.now());
		

		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
