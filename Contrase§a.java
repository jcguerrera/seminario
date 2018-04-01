
/**
 * Write a description of class Contraseña here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
public class Contraseña

{
    public static void punto6() {
        JOptionPane.showMessageDialog(null, "En el día de hoy realizará el ingreso de dos cuentas de usuario");

        String id = JOptionPane.showInputDialog("Ingrese su ID");
        String dominio = JOptionPane.showInputDialog("Ingrese su dominio \nEjemplo @gmail, @eafit, @yahoo, @outlook, etc.");
        String com = JOptionPane.showInputDialog("Ingrese otro dominio \nEjemplo .com, edu.co, .es, .org, etc.");
        String pas = JOptionPane.showInputDialog("Ingrese su contraseña \nLa contraseña debe tener entre 4 y 10 caracteres");
        int condicion = pas.length() - 1;
        if ((condicion >= 4) && (condicion <= 10)) {
            String pas2 = JOptionPane.showInputDialog("ingrese de nuevo la contraseña");
            if ((pas.equals(pas2))) {
                System.out.println("Su cuenta ha sido creaada correctamente");
                System.out.println(id + dominio + com);

            } else {
                System.out.println("La contraseña no es igual, \n Revise que su contraseña debe ser igual a la digitada anteriormente");

            }
        } else {
            System.out.println("Lo sentimos no se pudo crear la cuenta, la contraseña es muy corta o es muy larga, \npor favor vuelvelo a intentar");

        }

    }
}
