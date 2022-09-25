
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author David
 */
public class Frame_SelectAdditionalAttributeFileBrowser extends javax.swing.JFrame {

    /**
     * Creates new form Frame_SelectAdditionalAttributeFileBrowser
     */
    public Frame_SelectAdditionalAttributeFileBrowser(Frame_DataSampler f_ds) {
        this.f_ds = f_ds;

        initComponents();

        if (f_ds.getRootDirectory() != null && f_ds.defaultAttributesDirectory!=null) {
            currentDirectory = f_ds.getRootDirectory() + File.separator + f_ds.defaultAttributesDirectory;
            SelectAttributesFile.setCurrentDirectory(new File(currentDirectory));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectAttributesFile = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelectAttributesFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAttributesFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SelectAttributesFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SelectAttributesFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectAttributesFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAttributesFileActionPerformed
        if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION)) {
            String path = SelectAttributesFile.getSelectedFile().getAbsolutePath();
            currentDirectory = SelectAttributesFile.getCurrentDirectory().getAbsolutePath();
            f_ds.setAttributesList(path);
            if (f_ds.getRootDirectory() == null) {
                f_ds.setRootDirectory(SelectAttributesFile.getCurrentDirectory().getParentFile().getAbsolutePath());
            }
            this.setVisible(false);
        } else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION)) {
            this.setVisible(false);
        }

    }//GEN-LAST:event_SelectAttributesFileActionPerformed
    public void setDirectory() {
        try {
            SelectAttributesFile.setCurrentDirectory(new File(currentDirectory));
        } catch (Exception e) {
            //System.out.println("Directory not set");
        }
    }

    public String getDirectory() {
        return currentDirectory;
    }
    private String currentDirectory;
    private Frame_DataSampler f_ds;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser SelectAttributesFile;
    // End of variables declaration//GEN-END:variables
}
