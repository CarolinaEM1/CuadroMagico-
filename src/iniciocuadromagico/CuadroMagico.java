
package iniciocuadromagico;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class CuadroMagico {
    
    public int[][] cuadroM(){
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número impar"));
        while (n%2==0){
            n=Integer.parseInt(JOptionPane.showInputDialog(" Error, Ingresa otro número impar"));
        }
        int[][]cuad=new int[n][n];
        int i=0,j=n/2,x=0,y=0;
        cuad[i][j]=1;
        
        for (int a=2;a<=n*n;a++){
            if(i-1<0){
                i=n-1;
            }
            else{
                i=i-1;
            }
            if(j+1>n-1){
                j=0;
            }
            else {
                j=j+1;
            }
            if (cuad[i][j]==0){
                cuad[i][j]=a;
                x=i;
                y=j;
            }
            else {
                i=x+1;
                j=y;
                cuad[i][j]=a;
            }
        }
        return cuad;
    }
    public String mosMat(int[][]mat){
        String auxf,auxc="";
        int sum=0,sumc=0,sumd=0;
        auxf="Cuadro Mágico\n";
        
        for(int i=0;i<mat.length;i++){
            sumd=sumd+mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                sumc=sumc+mat[j][i];
                auxc=auxc;
            }
            auxc=" "+auxc+sumc+"  ";
            sumc=0;
        }
        for(int r=0;r<mat.length;r++){
            auxf=auxf+" {"+r+"}";
        }
        auxf=auxf+"\n";
        for(int i=0;i<mat.length;i++){
            auxf=auxf+"{"+i+"}";
            for(int j=0;j<mat.length;j++){
                sum=sum+mat[i][j];
                if(mat[i][j]<10){
                    auxf=auxf+"[0"+mat[i][j]+"] \t";
                }
                 else {
                    auxf=auxf+"["+mat[i][j]+"] \t";
                }
            }
            auxf=auxf+"|"+sum+"\n";
            sum=0;
        }
        return auxf+auxc+sumd;
}
    
}
