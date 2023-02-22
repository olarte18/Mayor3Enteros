package ejecutable ;

import javax.swing.JOptionPane ;

public class Test 
{
    public static void main(String[] args) {
        //declaracion de variables
        int x;
        int y;
        int z;
        int m;

        x= Integer.parseInt(JOptionPane.showInputDialog("Digite x :"));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite y :"));
        z= Integer.parseInt(JOptionPane.showInputDialog("Digite z :"));
        
        if(x>y){if (x>z){JOptionPane.showMessageDialog(null, "el mayor de los tres es"+x);}
        else {JOptionPane.showMessageDialog(null, "el mayor de los tres es"+z);}}
        else if(y>x){JOptionPane.showMessageDialog(null, "el mayor de los tres es"+z);}
        
    
        
        //end
        System.exit(0);
    

    }


}