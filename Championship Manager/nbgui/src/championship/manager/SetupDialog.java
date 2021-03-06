/*
 * SettupPanel.java
 *
 * Created on 30. Dezember 2005, 20:26
 */

package championship.manager;

/**
 *
 * @author  Roman Georg R�dle
 */
public class SetupDialog extends javax.swing.JPanel {
    
    /** Creates new form SettupPanel */
    public SetupDialog() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        okB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        applyB = new javax.swing.JButton();
        setupTP = new javax.swing.JTabbedPane();
        championshipSetupP = new championship.manager.ChampionshipSetupPanel();
        groupSetupP = new championship.manager.GroupSetupPanel();
        intermediateStageGroupSetupP = new championship.manager.GroupSetupPanel();
        intermediateStageLinkingP = new championship.manager.TeamLinkingPanel();
        quarterFinalLinkingP = new championship.manager.TeamLinkingPanel();
        semiFinalLinkingP = new championship.manager.TeamLinkingPanel();
        thirdPlaceGameLinkingP = new championship.manager.TeamLinkingPanel();
        finalLinkingP = new championship.manager.TeamLinkingPanel();

        okB.setText("Abbrechen");

        cancelB.setText("OK");

        applyB.setText("\u00dcbernehmen");

        setupTP.addTab("Turnier", championshipSetupP);

        setupTP.addTab("Gruppen", groupSetupP);

        setupTP.addTab("Gruppen Zwischenrunde", intermediateStageGroupSetupP);

        setupTP.addTab("Zwischenrunde", intermediateStageLinkingP);

        setupTP.addTab("Viertelfinale", quarterFinalLinkingP);

        setupTP.addTab("Halbfinale", semiFinalLinkingP);

        setupTP.addTab("Spiel um Platz 3", thirdPlaceGameLinkingP);

        setupTP.addTab("Finale", finalLinkingP);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(setupTP)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(cancelB)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(okB)
                        .add(10, 10, 10)
                        .add(applyB)))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {applyB, cancelB, okB}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .add(setupTP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 334, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(applyB)
                    .add(okB)
                    .add(cancelB))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyB;
    private javax.swing.JButton cancelB;
    private championship.manager.ChampionshipSetupPanel championshipSetupP;
    private championship.manager.TeamLinkingPanel finalLinkingP;
    private championship.manager.GroupSetupPanel groupSetupP;
    private championship.manager.GroupSetupPanel intermediateStageGroupSetupP;
    private championship.manager.TeamLinkingPanel intermediateStageLinkingP;
    private javax.swing.JButton okB;
    private championship.manager.TeamLinkingPanel quarterFinalLinkingP;
    private championship.manager.TeamLinkingPanel semiFinalLinkingP;
    private javax.swing.JTabbedPane setupTP;
    private championship.manager.TeamLinkingPanel thirdPlaceGameLinkingP;
    // End of variables declaration//GEN-END:variables
    
}
