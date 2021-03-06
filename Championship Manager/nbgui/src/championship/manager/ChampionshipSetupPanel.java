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
public class ChampionshipSetupPanel extends javax.swing.JPanel {
    
    /** Creates new form SettupPanel */
    public ChampionshipSetupPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        championshipL = new javax.swing.JLabel();
        championshipTF = new javax.swing.JTextField();
        groupL = new javax.swing.JLabel();
        groupSp = new javax.swing.JSpinner();
        teamL = new javax.swing.JLabel();
        teamSp = new javax.swing.JSpinner();
        intermediatStageL = new javax.swing.JCheckBox();
        qualifyingL = new javax.swing.JLabel();
        qualifyingSp = new javax.swing.JSpinner();
        intermediateStageGroupL = new javax.swing.JLabel();
        intermediateStageGroupSp = new javax.swing.JSpinner();
        quarterFinalCB = new javax.swing.JCheckBox();
        thirdPlaceGameCB = new javax.swing.JCheckBox();

        championshipL.setText("Name des Turnieres");

        groupL.setText("Wie viele Gruppen?");

        teamL.setText("Wie viele Mannschaften?");

        intermediatStageL.setText("Hat das Turnier eine Zwischenrunde?");
        intermediatStageL.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        intermediatStageL.setMargin(new java.awt.Insets(0, 0, 0, 0));

        qualifyingL.setText("Wie viele Mannschaften pro Gruppe qualifizieren sich?");

        intermediateStageGroupL.setText("Wie viele Gruppen gibt es in der Zwischenrunde?");

        quarterFinalCB.setText("Hat das Turnier ein Viertelfinale?");
        quarterFinalCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        quarterFinalCB.setMargin(new java.awt.Insets(0, 0, 0, 0));

        thirdPlaceGameCB.setText("Hat das Turnier ein Spiel um Platz 3?");
        thirdPlaceGameCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        thirdPlaceGameCB.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(championshipTF, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(championshipL)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(intermediatStageL)
                        .addContainerGap(185, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, intermediateStageGroupL)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, qualifyingL)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(groupL)
                                        .add(216, 216, 216))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(teamL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .add(151, 151, 151)))
                                .add(25, 25, 25)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(qualifyingSp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .add(teamSp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .add(groupSp, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .add(intermediateStageGroupSp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(quarterFinalCB)
                        .addContainerGap(207, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(thirdPlaceGameCB)
                        .addContainerGap(189, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .add(championshipL)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(championshipTF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(groupL)
                    .add(groupSp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(teamL)
                    .add(teamSp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(intermediatStageL)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(qualifyingL)
                    .add(qualifyingSp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(intermediateStageGroupL)
                    .add(intermediateStageGroupSp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(quarterFinalCB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(thirdPlaceGameCB)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel championshipL;
    private javax.swing.JTextField championshipTF;
    private javax.swing.JLabel groupL;
    private javax.swing.JSpinner groupSp;
    private javax.swing.JCheckBox intermediatStageL;
    private javax.swing.JLabel intermediateStageGroupL;
    private javax.swing.JSpinner intermediateStageGroupSp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel qualifyingL;
    private javax.swing.JSpinner qualifyingSp;
    private javax.swing.JCheckBox quarterFinalCB;
    private javax.swing.JLabel teamL;
    private javax.swing.JSpinner teamSp;
    private javax.swing.JCheckBox thirdPlaceGameCB;
    // End of variables declaration//GEN-END:variables
    
}
