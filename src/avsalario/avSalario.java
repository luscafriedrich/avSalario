package salario;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class avSalario {
    public static void main(String[] args) {
        String nome;
        double salarioB, salarioL, total, bonus, ir;
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite seu nome: ");
                nome = ler.nextLine();
                System.out.println("Digite seu salário bruto: ");
                salarioB = ler.nextDouble();
                salarioL = salarioB * 1.055;
                bonus = salarioL - salarioB;
                
                
                ir = salarioL-salarioB;
                    if(salarioL<3.500){
                        total = salarioL + 0.035;
                        ir = total - salarioL;
                    }else{
                        total = salarioL + 0.075;
                        ir = total - salarioL;
                        
                    }
                System.out.println("Nome: "+nome+"\n"
                                 + "Salario bruto: R$"+salarioB+"\n"
                                 + "Bônus: R$"+bonus+"\n"
                                 + "I.R: R$"+ir+"\n"
                                 + "Salário liquido: R$"+salarioL);
                
    }
    
}
