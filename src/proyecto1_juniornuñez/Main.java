    
package proyecto1_juniornuñez;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<DatosUser> listaUsuarios = new ArrayList<>();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogIn logInWindow = new LogIn(listaUsuarios); 
                logInWindow.setVisible(true);
                
            }
        });
    }
}