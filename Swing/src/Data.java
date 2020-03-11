import javax.swing.*;

public class Data extends JFrame {
    JLabel ljudul,lnama,lnim,ljk,lagama,lalamat;
    JTextField nama,nim,alamat;
    JRadioButton rbPria,rbWanita;
    String[] namaAgama = {"Islam","Kristen","Katholik","Hindu","Buddha"};
    JComboBox cmbAgama;
    JButton submit;

    public void DataDiri(){
        ljudul = new JLabel("DATA DIRI MAHASISWA");
        lnama = new JLabel("Nama ");
        lnim = new JLabel("NIM ");
        ljk = new JLabel("Jenis Kelamin ");
        lagama = new JLabel("Agama ");
        lalamat = new JLabel("Alamat ");
        submit = new JButton("OK");

        nama = new JTextField();
        nim = new JTextField();
        alamat = new JTextField();
        rbPria = new JRadioButton("L");
        rbWanita = new JRadioButton("P");

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);


        cmbAgama = new JComboBox(namaAgama);


        setLayout(null);
        add(ljudul);
        add(lnama);
        add(lnim);
        add(ljk);
        add(lagama);
        add(lalamat);
        add(nama);
        add(nim);
        add(alamat);
        add(rbPria);
        add(rbWanita);
        add(cmbAgama);
        add(submit);

        ljudul.setBounds(200,50,170,20);
        lnama.setBounds(100,70,130,30);
        lnim.setBounds(100,110,130,30);
        ljk.setBounds(100,150,120,30);
        lagama.setBounds(100,190,120,30);
        lalamat.setBounds(100,230,120,30);

        nama.setBounds(250,80,110,20);
        nim.setBounds(250,120,110,20);
        rbPria.setBounds(270,160,50,20);
        rbWanita.setBounds(330,160,50,20);
        cmbAgama.setBounds(250,200,110,20);
        alamat.setBounds(250,230,200,70);
        submit.setBounds(370,310,80,20);
        setSize(600,400);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}