/*
 * ShowGameTablePanel.java
 *
 * Created on 2. Januar 2006, 17:13
 */

package championship.manager;

/**
 *
 * @author  Roman Georg R�dle
 */
public class ShowGameTableObserverPanel extends javax.swing.JPanel {
    
    /** Creates new form ShowGameTablePanel */
    public ShowGameTableObserverPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        showTableP = new championship.manager.ShowTablePanel();
        currentHometeamL = new javax.swing.JLabel();
        currentAwayteamL = new javax.swing.JLabel();
        currentGameL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        currentHometeamL.setFont(new java.awt.Font("Tahoma", 1, 56));
        currentHometeamL.setText("3    SV Ennetach");
        currentHometeamL.setIconTextGap(0);

        currentAwayteamL.setFont(new java.awt.Font("Tahoma", 1, 56));
        currentAwayteamL.setText("1    FV Weithart");
        currentAwayteamL.setIconTextGap(0);

        currentGameL.setFont(new java.awt.Font("Tahoma", 1, 48));
        currentGameL.setText("Spiel-Nr. 1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setText("CLOCKI");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(currentGameL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, currentAwayteamL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .add(showTableP, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, currentHometeamL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(currentGameL)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(currentHometeamL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(currentAwayteamL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(showTableP, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentAwayteamL;
    private javax.swing.JLabel currentGameL;
    private javax.swing.JLabel currentHometeamL;
    private javax.swing.JLabel jLabel1;
    private championship.manager.ShowTablePanel showTableP;
    // End of variables declaration//GEN-END:variables
    
}