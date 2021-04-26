package calculator;

import java.awt.*;
import javax.swing.*;

public class GridFrame extends JFrame {
	JPanel p = new JPanel(new GridLayout(4, 4, 3, 3));
	JTextArea t = new JTextArea(); // 定义文本框
	String str[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };

	public GridFrame(String s) {
		super(s); // 为窗体名称赋值
		setLayout(new BorderLayout()); //定义窗体布局为边界布局
		JButton btn[]; //声明按钮数组
		btn = new JButton[str.length]; //创建按钮数组
		for (int i = 0; i < str.length; i++) {
			btn[i] = new JButton(str[i]);
			p.add(btn[i]);
		}
		getContentPane().add(t, BorderLayout.NORTH);
		getContentPane().add(p, BorderLayout.SOUTH);
		setVisible(true);
		setSize(350, 200); // 设定窗口尺寸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //让窗体居中显示
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridFrame gl = new GridFrame("一个简单的计算器");
	}
}