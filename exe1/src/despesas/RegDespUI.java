package despesas;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i111057
 */
public class RegDespUI {
    int valor;
    String descricao, confirm;
    
    public RegDespUI()
    {
        confirm="A";
    }
    
    public void Reg(){
        System.out.print("Insira valor: ");
        Scanner scan=new Scanner(System.in);
        valor = scan.nextInt();
        System.out.print("Insira descricao: ");
        descricao = scan.nextLine();
        while(!confirm.equals("S") && !confirm.equals("N"))
        {
            System.out.print("Confirma despesa?(S/N): ");
            confirm = scan.next();
            if(confirm.equals("S"))
            {
                RegDespController a = new RegDespController();
                System.out.print("Confirmado\n");
            }
            else
                System.out.print("Nao confirmado\n");
        } 
    }
}
