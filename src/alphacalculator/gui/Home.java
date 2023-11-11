package alphacalculator.gui;

/**
 * @author Wanga Knajala
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        jTextField_calculation.setText("0");
    }
    boolean additionInProgress;
    double storedNumber;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_textField = new javax.swing.JPanel();
        jTextField_calculation = new javax.swing.JTextField();
        jPanel_buttons = new javax.swing.JPanel();
        jButton_leftBracket = new javax.swing.JButton();
        jButton_rightBracket = new javax.swing.JButton();
        jButton_del = new javax.swing.JButton();
        jButton_divide = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_multiply = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_minus = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_1 = new javax.swing.JButton();
        jButton_plus = new javax.swing.JButton();
        jButton_point = new javax.swing.JButton();
        jButton_0 = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jButton_equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator");
        setPreferredSize(new java.awt.Dimension(315, 400));
        setResizable(false);

        jPanel_textField.setLayout(new java.awt.GridLayout(1, 0));

        jTextField_calculation.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField_calculation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel_textField.add(jTextField_calculation);

        jButton_leftBracket.setText("(");
        jButton_leftBracket.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_leftBracket.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_leftBracket.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_rightBracket.setText(")");
        jButton_rightBracket.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_rightBracket.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_rightBracket.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_del.setText("Del");
        jButton_del.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_del.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_del.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_divide.setText("/");
        jButton_divide.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_divide.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_divide.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_7.setText("7");
        jButton_7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_8.setText("8");
        jButton_8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });

        jButton_9.setText("9");
        jButton_9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_multiply.setText("x");
        jButton_multiply.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_multiply.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_multiply.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_4.setText("4");
        jButton_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setText("5");
        jButton_5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setText("6");
        jButton_6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_minus.setText("-");
        jButton_minus.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_minus.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_minus.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_3.setText("3");
        jButton_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_2.setText("2");
        jButton_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_1.setText("1");
        jButton_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_plus.setText("+");
        jButton_plus.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_plus.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_plus.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_plusActionPerformed(evt);
            }
        });

        jButton_point.setText(".");
        jButton_point.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_point.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_point.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_0.setText("0");
        jButton_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_0ActionPerformed(evt);
            }
        });

        jButton_clear.setText("CE");
        jButton_clear.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_clear.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_clear.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton_equals.setText("=");
        jButton_equals.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_equals.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_equals.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_buttonsLayout = new javax.swing.GroupLayout(jPanel_buttons);
        jPanel_buttons.setLayout(jPanel_buttonsLayout);
        jPanel_buttonsLayout.setHorizontalGroup(
            jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                        .addComponent(jButton_leftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_rightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_del, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                        .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                        .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                        .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_point, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_buttonsLayout.setVerticalGroup(
            jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_leftBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_rightBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_point, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_textField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // when user clicks the number zero
    private void jButton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_0ActionPerformed
        // if the value started at zero
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number zero
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(0));
    }//GEN-LAST:event_jButton_0ActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        // if the value started at zero
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(1));
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(2));
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(3));
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(4));
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(5));
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(6));
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(7));
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(8));
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        // if the value started at one
        if(jTextField_calculation.getText().equals("0")){
            // empty textfield 
            jTextField_calculation.setText("");
        }
        // append the number one
        jTextField_calculation.setText(jTextField_calculation.getText() + Integer.toString(9));
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_plusActionPerformed
        // Get the current text from the text field
        String currentText = jTextField_calculation.getText();

        // Check if the text is not empty
        if (!currentText.isEmpty()) {
            // Convert the text to a double (assuming it's a number)
            double currentNumber = Double.parseDouble(currentText);

            // Store the current number in a variable or data structure
            // For simplicity, let's assume you have a class variable
            // You may want to use a more sophisticated approach based on your design
            storedNumber = currentNumber;

            // Clear the text field for the next input
            jTextField_calculation.setText("");

            // Update a flag or variable to indicate that an addition operation is in progress
            additionInProgress = true;
        }
    }//GEN-LAST:event_jButton_plusActionPerformed

    private void jButton_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_equalsActionPerformed
        // Get the current text from the text field
        String currentText = jTextField_calculation.getText();

        // Check if the text is not empty
        if (!currentText.isEmpty()) {
            // Convert the text to a double
            double currentNumber = Double.parseDouble(currentText);

            // Check if an addition operation is in progress
            if (additionInProgress) {
                // Perform the addition and update the text field
                double result = storedNumber + currentNumber;
                jTextField_calculation.setText(Double.toString(result));

                // Reset the flag and stored number
                additionInProgress = false;
                storedNumber = 0; // Reset to the default value
            }
        }
    }//GEN-LAST:event_jButton_equalsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_0;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_del;
    private javax.swing.JButton jButton_divide;
    private javax.swing.JButton jButton_equals;
    private javax.swing.JButton jButton_leftBracket;
    private javax.swing.JButton jButton_minus;
    private javax.swing.JButton jButton_multiply;
    private javax.swing.JButton jButton_plus;
    private javax.swing.JButton jButton_point;
    private javax.swing.JButton jButton_rightBracket;
    private javax.swing.JPanel jPanel_buttons;
    private javax.swing.JPanel jPanel_textField;
    private javax.swing.JTextField jTextField_calculation;
    // End of variables declaration//GEN-END:variables
}
