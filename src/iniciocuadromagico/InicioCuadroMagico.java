
package iniciocuadromagico;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class InicioCuadroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]mat=null;
        CuadroMagico a= new CuadroMagico();
        mat=a.cuadroM();
        JOptionPane.showMessageDialog(null, a.mosMat(mat));
        System.exit(0);
    }
    
}
