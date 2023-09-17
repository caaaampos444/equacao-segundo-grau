package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class TestarEquacaoSegundoGrau {

	public static void main(String[] args) {

		CalcularEquacaoSegundoGrau calc=new CalcularEquacaoSegundoGrau();

		//c.setA(1);
		//c.setB(-3);
		//c.setC(2);
		//double delta=c.delta();
		//double x1=c.x1();
		//double x2=c.x2();
		String aStr=JOptionPane.showInputDialog(null,"Digite o valor de A: ");
		String bStr=JOptionPane.showInputDialog(null,"Digite o valor de B: ");
		String cStr=JOptionPane.showInputDialog(null,"Digite o valor de C: ");
		
		double a=Double.parseDouble(aStr);
		double b=Double.parseDouble(bStr);
		double c=Double.parseDouble(cStr);

		calc.setA(a);
		calc.setB(b);
		calc.setC(c);

		//System.out.println("Delta: "+delta);
		//System.out.println("x': "+x1);
		//System.out.println("x'': "+x2);

		JOptionPane.showMessageDialog(null,"x': "+calc.x1()+"\nx'': "+calc.x2());

	}

}