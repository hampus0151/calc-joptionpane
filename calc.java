import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Objects;

public class calc 
{

    public static void main(String[] args) 
    {
        String num1;
        String num2;
        String operation;
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        Scanner input = new Scanner(System.in);
     
        num1 = JOptionPane.showInputDialog(null,"first number");
        
      

        num2 = JOptionPane.showInputDialog(null,"second number");
        

        
        operation = JOptionPane.showInputDialog(null,"operation");

        

        double num1double = Double.parseDouble(num1);
        double num2double = Double.parseDouble(num2);

        if (Objects.equals(operation,"+"))
        {
            JOptionPane.showMessageDialog(null,"svar pa talet "+ num1double + operation + num2double + " = " + (num1double + num2double));
        }

         if (Objects.equals(operation,"-"))
        {
            JOptionPane.showMessageDialog(null,"svar pa talet "+ num1double +  operation + num2double + " = "+ (num1double - num2double));
        }

         if (Objects.equals(operation,"/"))
        {
            JOptionPane.showMessageDialog(null,"svar pa talet "+ num1double +  operation + num2double + " = " + (num1double / num2double));
        }
         if (Objects.equals(operation,"x"))
        {
             JOptionPane.showMessageDialog(null,"svar pa talet "+ num1double +  operation + num2double + " = " + (num1double * num2double));
        }
        

   input.close();
    }
}