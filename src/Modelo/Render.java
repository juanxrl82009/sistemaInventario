/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import rojerusan.necesario.EstiloTablaHeader;

/**
 *
 * @author John Castro
 */
public class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1, int i, int i1) {
        
        if(o instanceof JButton){
            JButton btn = (JButton)o; 
            return btn;       
        }
        
        
        
    
            
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
