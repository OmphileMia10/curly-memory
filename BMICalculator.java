import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BMICalculator extends javax.swing.JFrame {

    public BMICalculator() {
        initComponents();
        this.setTitle("Patient BMI Calculator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PatientIDT = new javax.swing.JTextField();
        NameT = new javax.swing.JTextField();
        GenderT = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WeightT = new javax.swing.JTextField();
        HeightT = new javax.swing.JTextField();
        DisplayT = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        DisP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient_ID");

        jLabel2.setText("Name");

        jLabel3.setText("Gender");

        jRadioButton1.setText("Male");

        jRadioButton2.setText("Female");

        jLabel4.setText("Weight in Kg");

        jLabel5.setText("Height in metres");

        jLabel6.setText("Message");

        WeightT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTActionPerformed(evt);
            }
        });

        DisplayT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayTActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate BMI");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        DisP.setText("Display");
        DisP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(WeightT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(HeightT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DisplayT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DisP, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GenderT, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(NameT)
                                    .addComponent(PatientIDT)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(PatientIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(GenderT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(WeightT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(HeightT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DisplayT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate)
                    .addComponent(DisP))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WeightTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightTActionPerformed
       
    }//GEN-LAST:event_WeightTActionPerformed

    private void DisplayTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayTActionPerformed
        
    }//GEN-LAST:event_DisplayTActionPerformed

    private void DisPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisPActionPerformed
        String url = "jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            //Establish connection 
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                java.sql.Statement st = conn.createStatement();
                //Create the query that will display all information from the database
                String query = "Select * FROM patient WHERE Patient_ID = '" + PatientIDT.getText() + "%'";
                //Place all records retrieved in a result get
                java.sql.ResultSet result = st.executeQuery(query);
                // Iterate through the result set and dieplay the records on the screen
                if (result.next()) {
                    String patId = result.getString("Patient_ID");
                    String patName = result.getString("Name");
                    String patGender = result.getString("Gender");
                    String patWeight = result.getString("Weight");
                    String patHeight = result.getString("Height");
                    
                    PatientIDT.setText(patId);
                    NameT.setText(patName);
                    GenderT.setText(patGender);
                    WeightT.setText(patWeight);
                    HeightT.setText(patHeight);
                }//display success of insertion
                JOptionPane.showMessageDialog(null, "The patient's record was successfully displayed");
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection failed:" + e);   //catch exception  if there is an error 
        }
    }//GEN-LAST:event_DisPActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed

        String url = "jdbc:mysql://localhost:3306/hospital?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            
            Class.forName(driver).newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                java.sql.Statement st = conn.createStatement();
                
                String query = "Select * FROM patient WHERE Patient_ID = '" + PatientIDT.getText() + "%'";
                
                java.sql.ResultSet result = st.executeQuery(query);
                
                if (result.next()) {
                    String progId = result.getString("Patient_ID");
                    String progName = result.getString("Name");
                    String progGender = result.getString("Gender");
                    String progWeight = result.getString("Weight");
                    String progHeight = result.getString("Height");
                    
                    double progWeightD = Double.parseDouble(progWeight);
                    double progHeightD = Double.parseDouble(progHeight);
                    double BMI = progWeightD / (progHeightD * progHeightD);
                    
                    String display;
                    
                    PatientIDT.setText(progId);
                    NameT.setText(progName);
                    GenderT.setText(progGender);
                    WeightT.setText(progWeight);
                    HeightT.setText(progHeight);
                    
                    JOptionPane.showMessageDialog(null, "The patient's BMI is " + BMI);
                    
                    if ("Male".equals(progGender)) {
                        if (BMI < 22.5) {
                            display = "You're Underweight";
                            DisplayT.setText(display);
                        } else if (BMI > 22.5 && BMI < 29.5) {
                            display = "You Have An Ideal Weight";
                            DisplayT.setText(display);
                        } else if (BMI > 29.5 && BMI < 32.9) {
                            display = "You Are Overweight";
                            DisplayT.setText(display);
                        } else if (BMI > 33) {
                            display = "You Are Obese";
                            DisplayT.setText(display);
                        }
                    } else if ("Female".equals(progGender)) {
                        if (BMI < 18.5) {
                            display = "You're Underweight";
                            DisplayT.setText(display);
                        } else if (BMI > 18.5 && BMI < 24.5) {
                            display = "You Have An Ideal Weight";
                            DisplayT.setText(display);
                        } else if (BMI > 24.5 && BMI < 29.9) {
                            display = "You Are Overweight";
                            DisplayT.setText(display);
                        } else if (BMI > 30) {
                            display = "You Are Obese";
                            DisplayT.setText(display);
                        }
                    }
                    
                    String sql = "INSERT INTO `bmi progress` (``, `userId`, `BMI`) VALUES (, " + progId + "','" + BMI + "')";
                    
                    
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.execute();
                    JOptionPane.showMessageDialog(this, "Saved Successfully");
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(this, "An Error Occurred"+e);
        }
        
    }//GEN-LAST:event_CalculateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMICalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMICalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton DisP;
    private javax.swing.JTextField DisplayT;
    private javax.swing.JTextField GenderT;
    private javax.swing.JTextField HeightT;
    private javax.swing.JTextField NameT;
    private javax.swing.JTextField PatientIDT;
    private javax.swing.JTextField WeightT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
