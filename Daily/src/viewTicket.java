
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayj
 */
public class viewTicket extends javax.swing.JPanel {
database db = new database();
phonecallTicket ticket;
    /**
     * Creates new form viewTicket
     */
    public viewTicket() {
        initComponents();
        changeWindow();
       
        
        jTextArea1.setText(db.displayAllTickets());
       ticket = db.getTicket();
        setInfo(db.getTicket());    
    }
    
    public void setInfo(phonecallTicket dticket){
   
         this.ticket = dticket;
    textID.setText(Integer.toString(ticket.id));
    textWho.setText(ticket.who);
    textTag.setText(ticket.tag);
    textDate.setText(ticket.date);
    textPhone.setText(ticket.phone);
    textProblem.setText(ticket.problem);
    textNotes.setText(ticket.notes);
   
    }
    //http//www.homeandlearn.co.uk/java/database_scrolling_buttons.html
    
    public void changeWindow(){
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelContainer = new javax.swing.JPanel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        panelINFO = new javax.swing.JPanel();
        labelNotes = new javax.swing.JLabel();
        labelProblem = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelCompTag = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelWho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textID = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textDate = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textTag = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        textPhone = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        textProblem = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        textNotes = new javax.swing.JTextPane();
        labelID = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textWho = new javax.swing.JTextPane();
        btnRow = new javax.swing.JButton();
        textRow = new javax.swing.JTextField();
        btnByName = new javax.swing.JButton();
        btnByID = new javax.swing.JButton();

        jLabel1.setText("View Tickets");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        labelNotes.setText("Notes");

        labelProblem.setText("Problem");

        labelTime.setText("Date/Time");

        labelCompTag.setText("Comp Tag #");

        labelPhone.setText("Phone #");

        labelWho.setText("Who");

        jScrollPane2.setViewportView(textID);

        jScrollPane3.setViewportView(textDate);

        jScrollPane4.setViewportView(textTag);

        jScrollPane5.setViewportView(textPhone);

        jScrollPane6.setViewportView(textProblem);

        jScrollPane7.setViewportView(textNotes);

        labelID.setText("ID");

        jScrollPane8.setViewportView(textWho);

        btnRow.setText("ROW");
        btnRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRowActionPerformed(evt);
            }
        });

        textRow.setText("10");

        javax.swing.GroupLayout panelINFOLayout = new javax.swing.GroupLayout(panelINFO);
        panelINFO.setLayout(panelINFOLayout);
        panelINFOLayout.setHorizontalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelINFOLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(labelProblem))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCompTag)
                                    .addComponent(labelTime)))
                            .addComponent(labelPhone)
                            .addComponent(labelWho)
                            .addComponent(labelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane8)))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(labelNotes))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnRow)
                        .addGap(49, 49, 49)
                        .addComponent(textRow, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelINFOLayout.setVerticalGroup(
            panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelINFOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelINFOLayout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelWho)
                        .addGap(1, 1, 1))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone))
                .addGap(11, 11, 11)
                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(panelINFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRow)
                                    .addComponent(textRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelINFOLayout.createSequentialGroup()
                                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(panelINFOLayout.createSequentialGroup()
                        .addComponent(labelCompTag, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnByName.setText("By Name");
        btnByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByNameActionPerformed(evt);
            }
        });

        btnByID.setText("By ID");
        btnByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnByIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelINFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(btnByID)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious)
                        .addGap(31, 31, 31)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnByName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                .addComponent(panelINFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnByID)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnByName))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByIDActionPerformed
        jTextArea1.setText(db.displayAllTickets());
    }//GEN-LAST:event_btnByIDActionPerformed

    private void btnByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnByNameActionPerformed
        jTextArea1.setText(db.displayNameTickets());
    }//GEN-LAST:event_btnByNameActionPerformed

    private void btnRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRowActionPerformed
        String s = textRow.getText();
        int num = Integer.parseInt(s);
        if(num > db.total() || num < 1)
        {  System.out.println("invalid row");
            JOptionPane.showMessageDialog(null,
                "Invalid row. Must be between 1 and " + db.total());
        }
        else setInfo(db.getRow(num));
    }//GEN-LAST:event_btnRowActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        setInfo(db.nextTicket(ticket));
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        setInfo(db.previousTicket(ticket));
    }//GEN-LAST:event_btnPreviousActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByID;
    private javax.swing.JButton btnByName;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCompTag;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelProblem;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelWho;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelINFO;
    private javax.swing.JTextPane textDate;
    private javax.swing.JTextPane textID;
    private javax.swing.JTextPane textNotes;
    private javax.swing.JTextPane textPhone;
    private javax.swing.JTextPane textProblem;
    private javax.swing.JTextField textRow;
    private javax.swing.JTextPane textTag;
    private javax.swing.JTextPane textWho;
    // End of variables declaration//GEN-END:variables
}
