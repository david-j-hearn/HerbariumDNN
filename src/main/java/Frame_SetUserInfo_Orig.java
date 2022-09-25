
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author David
 */
public class Frame_SetUserInfo_Orig extends javax.swing.JFrame {

    /**
     * Creates new form Frame_SetUserInfo
     */
    public Frame_SetUserInfo_Orig(Frame_DataSampler fds) {
        initComponents();
        this.fds = fds;
        time = new Date().getTime();
        this.TextField_RootDirectory.setText(fds.rootDirectory);
        this.TextField_Attributes.setText(fds.defaultAttributesDirectory);
        this.TextField_Characters.setText(fds.defaultCharactersDirectory);
        this.TextField_Images.setText(fds.defaultImagesDirectory);
        this.TextField_Samples.setText(fds.defaultSamplesDirectory);
        this.TextField_K.setText(Integer.toString(fds.kDefault));
        this.TextField_Small.setText(Integer.toString(fds.defaultLocalSize));
        this.TextField_Medium.setText(Integer.toString(fds.defaultWindowSize));
        this.TextField_Large.setText(Integer.toString(fds.defaultOverviewSize));
        this.TextField_MinimumSize.setText(Integer.toString(fds.defaultImageWidth));

        //Note that this was changed so we could duplicate this class and alter it, but have a backup as needed
        //fsrd = new Frame_SelectRootDirectory(this);
        fsrd = new Frame_SelectRootDirectory(null);
        if (this.TextField_RootDirectory.getText().length() > 0) {
            fsrd.setDirectory(this.TextField_RootDirectory.getText());
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

        Label_Title = new javax.swing.JLabel();
        Button_OK = new javax.swing.JButton();
        Button_Cancel = new javax.swing.JButton();
        Panel_SessionInfo = new javax.swing.JPanel();
        Label_Name = new javax.swing.JLabel();
        TextField_Name = new javax.swing.JTextField();
        Label_Session = new javax.swing.JLabel();
        TextField_Session = new javax.swing.JTextField();
        Panel_Directories = new javax.swing.JPanel();
        Label_Images = new javax.swing.JLabel();
        Label_Attributes = new javax.swing.JLabel();
        Label_Characters = new javax.swing.JLabel();
        TextField_RootDirectory = new javax.swing.JTextField();
        Samples = new javax.swing.JLabel();
        TextField_Images = new javax.swing.JTextField();
        TextField_Attributes = new javax.swing.JTextField();
        TextField_Characters = new javax.swing.JTextField();
        TextField_Samples = new javax.swing.JTextField();
        Button_RootDirectory = new javax.swing.JButton();
        Panel_Sizes = new javax.swing.JPanel();
        Label_Small = new javax.swing.JLabel();
        Label_Medium = new javax.swing.JLabel();
        Label_Large = new javax.swing.JLabel();
        Label_MinSize = new javax.swing.JLabel();
        TextField_Small = new javax.swing.JTextField();
        TextField_Medium = new javax.swing.JTextField();
        TextField_Large = new javax.swing.JTextField();
        TextField_MinimumSize = new javax.swing.JTextField();
        Panel_Clustering = new javax.swing.JPanel();
        Label_K = new javax.swing.JLabel();
        TextField_K = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_Title.setText("Set your name and session name");

        Button_OK.setText("OK");
        Button_OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_OKMouseClicked(evt);
            }
        });

        Button_Cancel.setText("Cancel");
        Button_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CancelMouseClicked(evt);
            }
        });

        Panel_SessionInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Session Information"));

        Label_Name.setText("Name:");

        TextField_Name.setColumns(25);
        TextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_NameKeyPressed(evt);
            }
        });

        Label_Session.setText("Project Name:");

        TextField_Session.setColumns(25);
        TextField_Session.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_SessionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_SessionInfoLayout = new javax.swing.GroupLayout(Panel_SessionInfo);
        Panel_SessionInfo.setLayout(Panel_SessionInfoLayout);
        Panel_SessionInfoLayout.setHorizontalGroup(
            Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SessionInfoLayout.createSequentialGroup()
                .addGroup(Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Name)
                    .addComponent(Label_Session))
                .addGap(65, 65, 65)
                .addGroup(Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_Session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_SessionInfoLayout.setVerticalGroup(
            Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SessionInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Name)
                    .addComponent(TextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SessionInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Session)))
        );

        Panel_Directories.setBorder(javax.swing.BorderFactory.createTitledBorder("Directory Information"));

        Label_Images.setText("Images Directory:");

        Label_Attributes.setText("Attributes Directory:");

        Label_Characters.setText("Characters Directory:");

        TextField_RootDirectory.setEditable(false);
        TextField_RootDirectory.setColumns(25);

        Samples.setText("Samples Directory:");

        TextField_Images.setColumns(25);
        TextField_Images.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_ImagesKeyPressed(evt);
            }
        });

        TextField_Attributes.setColumns(25);
        TextField_Attributes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_AttributesKeyPressed(evt);
            }
        });

        TextField_Characters.setColumns(25);
        TextField_Characters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_CharactersKeyPressed(evt);
            }
        });

        TextField_Samples.setColumns(25);
        TextField_Samples.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_SamplesKeyPressed(evt);
            }
        });

        Button_RootDirectory.setText("Root Directory:");
        Button_RootDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_RootDirectoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_DirectoriesLayout = new javax.swing.GroupLayout(Panel_Directories);
        Panel_Directories.setLayout(Panel_DirectoriesLayout);
        Panel_DirectoriesLayout.setHorizontalGroup(
            Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DirectoriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DirectoriesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Images)
                            .addComponent(Label_Attributes)
                            .addComponent(Label_Characters)
                            .addComponent(Samples)))
                    .addComponent(Button_RootDirectory))
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_DirectoriesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_RootDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Images, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Attributes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_Characters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DirectoriesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_Samples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Panel_DirectoriesLayout.setVerticalGroup(
            Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DirectoriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_RootDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RootDirectory))
                .addGap(9, 9, 9)
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Images)
                    .addComponent(TextField_Images, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Attributes)
                    .addComponent(TextField_Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Characters)
                    .addComponent(TextField_Characters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_DirectoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Samples)
                    .addComponent(TextField_Samples, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Sizes.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample Image Sizes"));

        Label_Small.setText("Small Window Size:");

        Label_Medium.setText("Medium Window Size:");

        Label_Large.setText("Large Window Size:");

        Label_MinSize.setText("Minimum Image Width:");

        TextField_Small.setColumns(25);
        TextField_Small.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_SmallKeyPressed(evt);
            }
        });

        TextField_Medium.setColumns(25);
        TextField_Medium.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_MediumKeyPressed(evt);
            }
        });

        TextField_Large.setColumns(25);
        TextField_Large.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_LargeKeyPressed(evt);
            }
        });

        TextField_MinimumSize.setColumns(25);
        TextField_MinimumSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_MinimumSizeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_SizesLayout = new javax.swing.GroupLayout(Panel_Sizes);
        Panel_Sizes.setLayout(Panel_SizesLayout);
        Panel_SizesLayout.setHorizontalGroup(
            Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SizesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_SizesLayout.createSequentialGroup()
                        .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Medium)
                            .addComponent(Label_Large)
                            .addComponent(Label_Small))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SizesLayout.createSequentialGroup()
                        .addComponent(Label_MinSize)
                        .addGap(18, 18, 18)))
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_MinimumSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Small, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Large, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_SizesLayout.setVerticalGroup(
            Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SizesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Small)
                    .addComponent(TextField_Small, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Medium)
                    .addComponent(TextField_Medium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Large)
                    .addComponent(TextField_Large, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SizesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_MinimumSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_MinSize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_Clustering.setBorder(javax.swing.BorderFactory.createTitledBorder("Clustering"));

        Label_K.setText("K in K-Means Clustering:");

        TextField_K.setColumns(25);
        TextField_K.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_KKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ClusteringLayout = new javax.swing.GroupLayout(Panel_Clustering);
        Panel_Clustering.setLayout(Panel_ClusteringLayout);
        Panel_ClusteringLayout.setHorizontalGroup(
            Panel_ClusteringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ClusteringLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_K)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextField_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_ClusteringLayout.setVerticalGroup(
            Panel_ClusteringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ClusteringLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ClusteringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_K)
                    .addComponent(TextField_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Title)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Panel_Directories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_SessionInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_OK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_Cancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Panel_Clustering, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel_Sizes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_SessionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Directories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Sizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Clustering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_OK)
                    .addComponent(Button_Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_NameKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Name);
    }//GEN-LAST:event_TextField_NameKeyPressed

    private void TextField_SessionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_SessionKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Session);
    }//GEN-LAST:event_TextField_SessionKeyPressed

    private void Button_OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_OKMouseClicked
        name = this.TextField_Name.getText();
        session = this.TextField_Session.getText();
        fds.rootDirectory = this.TextField_RootDirectory.getText();
        //session = session + "_" + time;

        if (name.length() <= 0 || session.length() <= 0 || fds.rootDirectory.length() <= 0) {
            JOptionPane.showMessageDialog(this, "You must provide your name, a label for this session, and a project root directory to continue with this application. Quitting.");
            System.exit(0);
        }
        fds.projectName = session;
        fds.user = name;

        fds.rootDirectory = this.TextField_RootDirectory.getText();
        fds.defaultAttributesDirectory = this.TextField_Attributes.getText();
        fds.defaultCharactersDirectory = this.TextField_Characters.getText();
        fds.defaultImagesDirectory = this.TextField_Images.getText();
        fds.defaultSamplesDirectory = this.TextField_Samples.getText();

        fds.kDefault = Integer.parseInt(this.TextField_K.getText());
        fds.defaultLocalSize = Integer.parseInt(this.TextField_Small.getText());
        fds.defaultWindowSize = Integer.parseInt(this.TextField_Medium.getText());
        fds.defaultOverviewSize = Integer.parseInt(this.TextField_Large.getText());
        fds.defaultImageWidth = Integer.parseInt(this.TextField_MinimumSize.getText());

        
        /*
        //make and use a static method that checks / creates the directories as needed!!;
        try {
            Files.createDirectories(Paths.get(fds.rootDirectory + File.separator + fds.defaultImagesDirectory));
        } catch (IOException ex) {

            //Logger.getLogger(Frame_Parameters.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Could not create Images directory. Be sure your path information is valid. Quitting.");
            System.exit(0);
        }

        try {
            Files.createDirectories(Paths.get(fds.rootDirectory + File.separator + fds.defaultCharactersDirectory));
        } catch (IOException ex) {
            //Logger.getLogger(Frame_Parameters.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Could not create Characters directory. Be sure your path information is valid. Quitting.");
            System.exit(0);

        }

        try {
            Files.createDirectories(Paths.get(fds.rootDirectory + File.separator + fds.defaultAttributesDirectory));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not create Attributes directory. Be sure your path information is valid. Quitting.");
            System.exit(0);

            //Logger.getLogger(Frame_Parameters.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Files.createDirectories(Paths.get(fds.rootDirectory + File.separator + fds.defaultSamplesDirectory));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not create Samples directory. Be sure your path information is valid. Quitting.");
            System.exit(0);

            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!make and use a static method to set / check all the directories;
                        Samples directory structure:;
            Samples project folder;
                file mapping file (train, test, validate);
                validation folder;
                    validation sample metadata;
                    pixel folder;
                    local folder;
                    window folder;
                    overview folder;
                    montage folder;
                training folder;
                    training sample metadata;
                    pixel folder;
                    local folder;
                    window folder;
                    overview folder;
                    montage folder;
                testing folder;
                    testing sample metadata;
                    pixel folder;
                    local folder;
                    window folder;
                    overview folder;
                    montage folder;
            
//Logger.getLogger(Frame_Parameters.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (session.length() == 0) {
                JOptionPane.showMessageDialog(this, "Could not create Project Samples directory. Be sure your path information is valid and that your Project Name is entered. Quitting.");
                System.exit(0);
            }
            Files.createDirectories(Paths.get(fds.rootDirectory + File.separator + fds.defaultSamplesDirectory + File.separator + session));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Could not create Project Samples directory. Be sure your path information is valid and that your Project Name is entered. Quitting.");
            System.exit(0);

//Logger.getLogger(Frame_Parameters.class.getName()).log(Level.SEVERE, null, ex);
        }
*/

        fds.initializeDataFromDefaults();
        fds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_OKMouseClicked

    private void Button_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Button_CancelMouseClicked

    private void TextField_ImagesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_ImagesKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Images);
    }//GEN-LAST:event_TextField_ImagesKeyPressed

    private void TextField_AttributesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_AttributesKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Attributes);
    }//GEN-LAST:event_TextField_AttributesKeyPressed

    private void TextField_CharactersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_CharactersKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Characters);
    }//GEN-LAST:event_TextField_CharactersKeyPressed

    private void TextField_SamplesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_SamplesKeyPressed
        Frame_Parameters.setStandardCharacterSetEditable(evt, TextField_Samples);
    }//GEN-LAST:event_TextField_SamplesKeyPressed

    private void TextField_SmallKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_SmallKeyPressed
        Frame_Parameters.setIntegerEditable(evt, TextField_Small);
    }//GEN-LAST:event_TextField_SmallKeyPressed

    private void TextField_MediumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_MediumKeyPressed
        Frame_Parameters.setIntegerEditable(evt, TextField_Medium);
    }//GEN-LAST:event_TextField_MediumKeyPressed

    private void TextField_LargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_LargeKeyPressed
        Frame_Parameters.setIntegerEditable(evt, TextField_Large);
    }//GEN-LAST:event_TextField_LargeKeyPressed

    private void TextField_MinimumSizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_MinimumSizeKeyPressed
        Frame_Parameters.setIntegerEditable(evt, TextField_MinimumSize);
    }//GEN-LAST:event_TextField_MinimumSizeKeyPressed

    private void TextField_KKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_KKeyPressed
        Frame_Parameters.setIntegerEditable(evt, TextField_K);
    }//GEN-LAST:event_TextField_KKeyPressed

    private void Button_RootDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RootDirectoryMouseClicked
        this.fsrd.setVisible(true);
    }//GEN-LAST:event_Button_RootDirectoryMouseClicked

    public void setRootDirectory(String directory) {
        this.TextField_RootDirectory.setText(directory);
    }

    public String getRootDirectory() {
        return this.TextField_RootDirectory.getText();
    }

    Frame_SelectRootDirectory fsrd;
    Frame_DataSampler fds;
    String name;
    String session;
    long time = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancel;
    private javax.swing.JButton Button_OK;
    private javax.swing.JButton Button_RootDirectory;
    private javax.swing.JLabel Label_Attributes;
    private javax.swing.JLabel Label_Characters;
    private javax.swing.JLabel Label_Images;
    private javax.swing.JLabel Label_K;
    private javax.swing.JLabel Label_Large;
    private javax.swing.JLabel Label_Medium;
    private javax.swing.JLabel Label_MinSize;
    private javax.swing.JLabel Label_Name;
    private javax.swing.JLabel Label_Session;
    private javax.swing.JLabel Label_Small;
    private javax.swing.JLabel Label_Title;
    private javax.swing.JPanel Panel_Clustering;
    private javax.swing.JPanel Panel_Directories;
    private javax.swing.JPanel Panel_SessionInfo;
    private javax.swing.JPanel Panel_Sizes;
    private javax.swing.JLabel Samples;
    private javax.swing.JTextField TextField_Attributes;
    private javax.swing.JTextField TextField_Characters;
    private javax.swing.JTextField TextField_Images;
    private javax.swing.JTextField TextField_K;
    private javax.swing.JTextField TextField_Large;
    private javax.swing.JTextField TextField_Medium;
    private javax.swing.JTextField TextField_MinimumSize;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_RootDirectory;
    private javax.swing.JTextField TextField_Samples;
    private javax.swing.JTextField TextField_Session;
    private javax.swing.JTextField TextField_Small;
    // End of variables declaration//GEN-END:variables
}