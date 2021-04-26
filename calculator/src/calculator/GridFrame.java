package calculator;

import java.awt.*;
import javax.swing.*;

public class GridFrame extends JFrame {
	JPanel p = new JPanel(new GridLayout(4, 4, 3, 3));
	JTextArea t = new JTextArea(); // �����ı���
	String str[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

	public GridFrame(String s) {
		super(s); // Ϊ�������Ƹ�ֵ
		setLayout(new BorderLayout()); //���崰�岼��Ϊ�߽粼��
		JButton btn[]; //������ť����
		btn = new JButton[str.length]; //������ť����
		for (int i = 0; i < str.length; i++) {
			btn[i] = new JButton(str[i]);
			p.add(btn[i]);
		}
		getContentPane().add(t, BorderLayout.NORTH);
		getContentPane().add(p, BorderLayout.SOUTH);
		setVisible(true);
		setSize(350, 200); // �趨���ڳߴ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //�ô��������ʾ
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridFrame gl = new GridFrame("һ���򵥵ļ�����");
	}
}