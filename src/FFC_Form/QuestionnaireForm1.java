/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuestionnaireForm1.java
 *
 * Created on 20-Feb-2012, 18:46:47
 */

package FFC_Form;

/**
 *
 * @author PeeT
 */
public class QuestionnaireForm1 extends javax.swing.JFrame {

    /** Creates new form QuestionnaireForm1 */
    public QuestionnaireForm1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("คำนำหน้าชื่อ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 57, 20);

        jLabel2.setText("ชื่อ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 14, 20);

        jLabel3.setText("นามสกุล");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 40, 20);

        jLabel4.setText("เบอร์โทรศัพท์");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 63, 20);

        jLabel5.setText("หน่วยงาน");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 190, 42, 20);

        jLabel6.setText("รหัส PCU Code");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 220, 70, 20);

        jLabel7.setText("ตำบล");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 250, 26, 20);

        jLabel8.setText("อำเภอ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 280, 30, 20);

        jLabel9.setText("ัจังหวัด");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 310, 30, 20);

        jLabel10.setText("อีเมล์");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 340, 25, 20);

        jLabel11.setText("ยืนยันอีเมล์");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 370, 51, 20);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(30, 733, 0, 0);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(150, 90, 114, 20);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(150, 120, 114, 20);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(150, 150, 114, 20);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(150, 180, 114, 20);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(150, 210, 114, 20);
        getContentPane().add(jTextField16);
        jTextField16.setBounds(150, 250, 114, 20);
        getContentPane().add(jTextField17);
        jTextField17.setBounds(150, 280, 114, 20);
        getContentPane().add(jTextField18);
        jTextField18.setBounds(150, 370, 114, 20);
        getContentPane().add(jTextField19);
        jTextField19.setBounds(150, 340, 114, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "== เลือกจังหวัด ==", "กรุงเทพมหานคร ", "กระบี่ ", "กาญจนบุรี ", "กาฬสินธุ์ ", "กำแพงเพชร ", "ขอนแก่น ", "จันทบุรี ", "ฉะเชิงเทรา ", "ชลบุรี ", "ชัยนาท ", "ชัยภูมิ ", "ชุมพร ", "เชียงราย ", "เชียงใหม่ ", "ตรัง ", "ตราด ", "ตาก ", "นครนายก ", "นครปฐม ", "นครพนม ", "นครราชสีมา ", "นครศรีธรรมราช ", "นครสวรรค์ ", "นนทบุรี ", "นราธิวาส ", "น่าน ", "บึงกาฬ ", "บุรีรัมย์ ", "ปทุมธานี ", "ประจวบคีรีขันธ์ ", "ปราจีนบุรี ", "ปัตตานี ", "พระนครศรีอยุธยา ", "พังงา ", "พัทลุง ", "พิจิตร ", "พิษณุโลก ", "เพชรบุรี ", "เพชรบูรณ์ ", "แพร่ ", "พะเยา ", "ภูเก็ต ", "มหาสารคาม ", "มุกดาหาร ", "แม่ฮ่องสอน ", "ยะลา ", "ยโสธร ", "ร้อยเอ็ด ", "ระนอง ", "ระยอง ", "ราชบุรี ", "ลพบุรี ", "ลำปาง ", "ลำพูน ", "เลย ", "ศรีสะเกษ ", "สกลนคร ", "สงขลา ", "สตูล ", "สมุทรปราการ ", "สมุทรสงคราม ", "สมุทรสาคร ", "สระแก้ว ", "สระบุรี ", "สิงห์บุรี ", "สุโขทัย ", "สุพรรณบุรี ", "สุราษฎร์ธานี ", "สุรินทร์ ", "หนองคาย ", "หนองบัวลำภู ", "อ่างทอง ", "อุดรธานี ", "อุทัยธานี ", "อุตรดิตถ์ ", "อุบลราชธานี ", "อำนาจเจริญ" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(150, 310, 118, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "== เลือกคำนำหน้าชื่อ ==", "นาย", "นางสาว", "นาง" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(150, 60, 145, 20);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel35.setText("แบบสอบถาม");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(140, 20, 83, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionnaireForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    // End of variables declaration//GEN-END:variables

}
