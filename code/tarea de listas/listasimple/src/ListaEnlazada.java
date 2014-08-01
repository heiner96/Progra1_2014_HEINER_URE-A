
import javax.swing.JOptionPane;
import listasimple.Nodo;



/**
 *
 * @author hei
 */
public class ListaEnlazada extends javax.swing.JFrame {

   Nodo primero=null;
   Nodo ultimo=null;
   String d;
    public ListaEnlazada() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Texto = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        insertinicio = new javax.swing.JButton();
        insertfinal = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Simple");
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        Fondo.setBackground(new java.awt.Color(0, 0, 204));

        nuevo.setText("Nueva Lista");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        insertinicio.setText("Insertar los datos al inicio");
        insertinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertinicioActionPerformed(evt);
            }
        });

        insertfinal.setText("Insertar datos al final");
        insertfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertfinalActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir datos");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(insertinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(insertfinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
   Nodo primero=null;
   Nodo ultimo=null;
   String d="";
   
    }//GEN-LAST:event_nuevoActionPerformed

    private void insertinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertinicioActionPerformed
        if(Texto.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo esta en blanco");
        }
        else
        {
            d=Texto.getText();
            Nodo nuevo=new Nodo(d);
            if(primero==null)
            {
                primero=nuevo;
                ultimo=nuevo;
                JOptionPane.showMessageDialog(null, "Se agrego :" + d + " con exito. ");
                Texto.setText("");                
            }
            else
            {
                nuevo.siguiente=primero;
                primero=nuevo;    
                JOptionPane.showMessageDialog(null, "Se agrego :" + d + " con exito. ");
                Texto.setText("");
            }
            
        }
    }//GEN-LAST:event_insertinicioActionPerformed

    private void insertfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertfinalActionPerformed
      
        if(Texto.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "El campo esta en blanco");
        }
        else
        {
            d=Texto.getText();
            Nodo nuevo=new Nodo(d);
            if(primero==null)
            {
                primero=nuevo;
                ultimo=nuevo;
                JOptionPane.showMessageDialog(null, "Se agrego :" + d + " con exito. ");
                Texto.setText("");                
            }
            else
            {
                ultimo.siguiente=nuevo;
                ultimo=nuevo;
                JOptionPane.showMessageDialog(null, "Se agrego :" + d + " con exito. ");
                Texto.setText("");  
            }
        }
        
        
        
    }//GEN-LAST:event_insertfinalActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
       if(primero==null)
       {
            JOptionPane.showMessageDialog(null, "La lista simple esta vacia ");
       }
       else
       {
           Nodo temporal =new Nodo();
           temporal=primero;
           while(temporal!=null)
           {
               System.out.println(temporal.dato);
               temporal=temporal.siguiente;
           }
                   
       }
        
        
        
    }//GEN-LAST:event_imprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEnlazada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEnlazada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Texto;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton insertfinal;
    private javax.swing.JButton insertinicio;
    private javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
