package com.luiz.JavaDate;

import java.sql.Date;

public class JavaDate {

	public static void main(String[] args) {

		Date hoje = new Date(0);

		System.out.println(hoje);

		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

		System.out.println(hoje.getDate());

	}
}
