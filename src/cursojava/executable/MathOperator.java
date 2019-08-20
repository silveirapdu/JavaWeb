package cursojava.executable;

import javax.swing.JOptionPane;

public class MathOperator {
	public static void main(String[] args) {
		double num, num2;
		double result = 0.0;
		boolean bNum = true;
		String sNum;
		String sNum2;
		int result2;
		
		do {
			sNum = JOptionPane.showInputDialog("Informe o Valor para o Num: ");
			sNum2 = JOptionPane.showInputDialog("Informe o Valor para o Num2: ");
			num = Double.parseDouble(sNum);
			num2 = Double.parseDouble(sNum2);
			
			if(num > 0 && num2 > 0){
				bNum = false;
			}
			
		}while(bNum);
		
		
		
		
		/*Sum*/
		result = num + num2;
		System.out.println("The sum of values " + num + " and "+ num2 +" is: "+ result);
		
		/*Negative Sum*/
		result = num - num2;
		System.out.println("The Negative Sum of values " + num + " and "+ num2 +" is: "+ result);
		
		/*multiplication Sum*/
		result = num * num2;
		System.out.println("The multiplication Sum of values " + num + " and "+ num2 +" is: "+ result);
		
		/*division Sum*/
		
		result2 =  (int) (num2 / num);
		System.out.println("The division Sum of values " + num2 + " and "+ num +" is: "+ result2);
		
		/*rest Sum*/
		result = num2 % num;
		System.out.println("The rest Sum of values " + num2 + " and "+ num +" is: "+ result);
		
	}

}
