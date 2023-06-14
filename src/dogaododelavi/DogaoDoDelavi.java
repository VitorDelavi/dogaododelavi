/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogaododelavi;

import apoio.ConexaoBD;
import javax.swing.JOptionPane;
import telas.frmprincipal;

/**
 *
 * @author vitor
 */
public class DogaoDoDelavi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
            ConexaoBD.getInstance().getConnection();
            frmprincipal tela = new frmprincipal ();
            tela.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados!\nPor favor entre em contato com o suporte.");
        }
    }
    
}
