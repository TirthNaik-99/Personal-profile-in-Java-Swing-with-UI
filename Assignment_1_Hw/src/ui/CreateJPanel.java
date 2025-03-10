/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author tirthnaik
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    Product product;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Product p) {
        initComponents();
        product = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDrivingLicenseNo = new javax.swing.JLabel();
        lblDrivingLicenseState = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        lblAddressLine2 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblTelephoneNumber = new javax.swing.JLabel();
        lblFaxNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblMaritalStatus = new javax.swing.JLabel();
        lblEmergencyContactNumber = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDrivingLicenseNumber = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDrivingLicenseState = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMaritalStatus = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtTelelphoneNumber = new javax.swing.JTextField();
        txtFaxNumber = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtEmergencyContactNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Person Profile");

        lblFirstname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstname.setText("FirstName");

        lblLastname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastname.setText("LastName");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone");

        lblDrivingLicenseNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDrivingLicenseNo.setText("Drivers License Number");

        lblDrivingLicenseState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDrivingLicenseState.setText("Drivers License State");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSSN.setText("SSN");

        lblAddressLine1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressLine1.setText("Address Line 1");

        lblAddressLine2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddressLine2.setText("Address Line 2");

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City");

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblState.setText("State");

        lblZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblZip.setText("ZIP");

        lblTelephoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelephoneNumber.setText("Telephone Number");

        lblFaxNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFaxNumber.setText("Fax Number");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender");

        lblOccupation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOccupation.setText("Occupation");

        lblNationality.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNationality.setText("Nationality");

        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date Of Birth");

        lblMaritalStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaritalStatus.setText("Marital Status");

        lblEmergencyContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmergencyContactNumber.setText("Emergency Contact Number");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNationality)
                    .addComponent(lblGender)
                    .addComponent(lblLastname)
                    .addComponent(lblFirstname)
                    .addComponent(lblEmail)
                    .addComponent(lblPhone)
                    .addComponent(lblDrivingLicenseNo)
                    .addComponent(lblDrivingLicenseState)
                    .addComponent(lblSSN)
                    .addComponent(lblMaritalStatus))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDrivingLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDrivingLicenseState, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddressLine1)
                    .addComponent(lblAddressLine2)
                    .addComponent(lblCity)
                    .addComponent(lblState)
                    .addComponent(lblZip)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(lblFaxNumber)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblEmergencyContactNumber)
                    .addComponent(lblOccupation))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelelphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmergencyContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(454, 454, 454))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddressLine1, txtAddressLine2, txtCity, txtDateOfBirth, txtDrivingLicenseNumber, txtDrivingLicenseState, txtEmail, txtEmergencyContactNumber, txtFaxNumber, txtFirstname, txtGender, txtLastname, txtMaritalStatus, txtNationality, txtOccupation, txtPhone, txtSSN, txtState, txtTelelphoneNumber, txtZip});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddressLine1, lblAddressLine2, lblCity, lblDateOfBirth, lblDrivingLicenseNo, lblDrivingLicenseState, lblEmail, lblEmergencyContactNumber, lblFaxNumber, lblFirstname, lblGender, lblLastname, lblMaritalStatus, lblNationality, lblOccupation, lblPhone, lblSSN, lblState, lblTelephoneNumber, lblZip});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstname)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastname)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDrivingLicenseNo)
                            .addComponent(txtDrivingLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDrivingLicenseState)
                            .addComponent(txtDrivingLicenseState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSN)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNationality)
                            .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaritalStatus)
                            .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddressLine1)
                            .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddressLine2)
                            .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZip)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelephoneNumber)
                            .addComponent(txtTelelphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFaxNumber)
                            .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOccupation)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDateOfBirth)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmergencyContactNumber)
                            .addComponent(txtEmergencyContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstname.getText();
        String lastName = txtLastname.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String driversLicenseNumber = txtDrivingLicenseNumber.getText();
        String driversLicenseState = txtDrivingLicenseState.getText();
        String ssn = txtSSN.getText();
        String gender = txtGender.getText();
        String nationality = txtNationality.getText();
        String maritalStatus = txtMaritalStatus.getText();
        String addressLine1 = txtAddressLine1.getText();
        String addressLine2 = txtAddressLine2.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String zip = txtZip.getText();
        String telephoneNumber = txtTelelphoneNumber.getText();
        String faxNumber = txtFaxNumber.getText();
        String occupation = txtOccupation.getText();
        String dateOfBirth = txtDateOfBirth.getText();
        String emergencyContactNumber = txtEmergencyContactNumber.getText();
        
        product.setFirstname(firstName);
        product.setLastname(lastName);
        product.setEmail(email);
        product.setPhone(phone);
        product.setDrivingLicenseNo(driversLicenseNumber);
        product.setDrivingLicenseState(driversLicenseState);
        product.setSSN(ssn);
        product.setGender(gender);
        product.setNationality(nationality);
        product.setMaritalStatus(maritalStatus);
        product.setAddressLine1(addressLine1);
        product.setAddressLine2(addressLine2);
        product.setCity(city);
        product.setState(state);
        product.setZip(zip);
        product.setTelephoneNumber(telephoneNumber);
        product.setFaxNumber(faxNumber);
        product.setOccupation(occupation);
        product.setDateOfBirth(dateOfBirth);
        product.setEmergencyContactNumber(emergencyContactNumber);
        
        JOptionPane.showMessageDialog(this, "Product Saved!!", "Success", JOptionPane.PLAIN_MESSAGE);
        
        txtFirstname.setText("");
        txtLastname.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtDrivingLicenseNumber.setText("");
        txtDrivingLicenseState.setText("");
        txtSSN.setText("");
        txtGender.setText("");
        txtNationality.setText("");
        txtMaritalStatus.setText("");
        txtAddressLine1.setText("");
        txtAddressLine2.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtTelelphoneNumber.setText("");
        txtFaxNumber.setText("");
        txtOccupation.setText("");
        txtDateOfBirth.setText("");
        txtEmergencyContactNumber.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDrivingLicenseNo;
    private javax.swing.JLabel lblDrivingLicenseState;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmergencyContactNumber;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDrivingLicenseNumber;
    private javax.swing.JTextField txtDrivingLicenseState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmergencyContactNumber;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelelphoneNumber;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
