package MemberProject;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class LoginForm extends JFrame {
    private JLabel lbId;
    private JLabel lbPw;
    private JPanel JPanel;
    private JTextField tfId;
    private JTextField tfPw;
    private JButton btnLogin;
    private JButton btnJoin;
    private JButton btnAdmin;

    public LoginForm()
    {
        LoginView();
        setDisplay();
        showFrame();
    }

    // 로그인 창
    public void LoginView()
    {
        Dimension labelSize = new Dimension(80,30); // jlabel 사이즈
        int textFiled = 20; // textfiled 사이즈
        Dimension btnSize = new Dimension(100,25); // jbutton 사이즈
        lbId = new JLabel("ID");
        lbId.setPreferredSize(labelSize); // 사이즈 지정
        lbPw = new JLabel("PW");
        lbPw.setPreferredSize(labelSize); // 사이즈 지정

        tfId = new JTextField(textFiled);
        tfPw = new JTextField(textFiled);

        btnLogin = new JButton("로그인");
        btnLogin.setPreferredSize(btnSize);
        btnJoin = new JButton("회원가입");
        btnJoin.setPreferredSize(btnSize);
        btnAdmin = new JButton("관리자");
        btnAdmin.setPreferredSize(btnSize);
    }

    public void setDisplay() {
        // FlowLayout 왼쪽 정렬
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);

        // pnlNorth(pnlId, pnlPw)
        JPanel pnlFiled = new JPanel(new GridLayout(0, 1));

        JPanel pnlId = new JPanel(flowLeft);
        pnlId.add(lbId);
        pnlId.add(tfId);

        JPanel pnlPw = new JPanel(flowLeft);
        pnlPw.add(lbPw);
        pnlPw.add(tfPw);

        pnlFiled.add(pnlId);
        pnlFiled.add(pnlPw);

        JPanel pnlbtn = new JPanel();
        pnlbtn.add(btnLogin);
        pnlbtn.add(btnJoin);
        pnlbtn.add(btnAdmin);

        pnlFiled.setBorder(new EmptyBorder(0, 20, 0, 20));
        pnlbtn.setBorder(new EmptyBorder(0, 0, 10, 0));

        add(pnlFiled, BorderLayout.NORTH);
        add(pnlbtn, BorderLayout.SOUTH);

    }

    public void showFrame() {
        setTitle("로그인");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new LoginForm();
    }
}
