package g4s22p7viktoralcan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fprincipal extends javax.swing.JFrame {
    
    ArrayList<String> lista = new ArrayList<>();

    public Fprincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnShow = new javax.swing.JButton();
        BtnShr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtLista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel1.setText("Captura de datos");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setText("Nombre: ");

        TxtName.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        BtnAdd.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnAdd.setText("Agregar");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnShow.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnShow.setText("Mostrar");
        BtnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnShowActionPerformed(evt);
            }
        });

        BtnShr.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnShr.setText("Buscar");
        BtnShr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnShrActionPerformed(evt);
            }
        });

        TxtLista.setEditable(false);
        TxtLista.setColumns(20);
        TxtLista.setLineWrap(true);
        TxtLista.setRows(5);
        TxtLista.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TxtLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnAdd)
                                .addGap(46, 46, 46)
                                .addComponent(BtnShow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnShr))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnShow)
                    .addComponent(BtnShr))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        
        String cadena = TxtName.getText();
        lista.add(cadena);
        limpiar();
        
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnShowActionPerformed
        
        lista.forEach(cadena -> {
            System.out.println("contenido: " + cadena);
        });
        
        String nombre = TxtName.getText();
        TxtLista.setText("Nombre: " + nombre);
        
            // Usuario();
        
    }//GEN-LAST:event_BtnShowActionPerformed

    private void BtnShrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnShrActionPerformed
        
        String busca = JOptionPane.showInputDialog("Ingresa el nombre a buscar");
        
        System.out.println("Valor a buscar: " + busca);
        
        for (String cadena: lista){
        
            if (cadena.equals(busca)){
            
                JOptionPane.showMessageDialog(null, "Se encontró");
                
            }
            
        }
        
    }//GEN-LAST:event_BtnShrActionPerformed

    private void limpiar(){
        TxtName.setText("");
    }
    
  /* public void Usuario(){
        
        TxtLista.setText(lista.contains(this));
       
    }*/
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnShow;
    private javax.swing.JButton BtnShr;
    private javax.swing.JTextArea TxtLista;
    private javax.swing.JTextField TxtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
