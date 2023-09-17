package br.senai.sp.jandira;

public class CalcularEquacaoSegundoGrau {

	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a=a;	
	}
	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b=b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c=c;
	}

	private double delta() {
		if(a==0) {
			a=1;
		}
		return Math.sqrt(b)-4*a*c;
	}

	public double x1() {
		if(delta()<0) {
			throw new IllegalArgumentException("A equação não possui raízes reais.");
		}
		return (-b+Math.sqrt(delta()))/(2*a);
	}

	public double x2() {
		if(delta()<0) {
			throw new IllegalArgumentException("A equação não possui raízes reais.");
		}
		return (-b-Math.sqrt(delta()))/(2*a);  
	}
	
}