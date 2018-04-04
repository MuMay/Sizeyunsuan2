
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SimpleFrame 
{
	
}
class SimpleFrame0 extends JFrame
{
	private static final int DEFAULT_WIDTH=600;
	private static final int DEFAULT_HEIGHT=600;
	private static JLabel l1 = new JLabel();
	private static long timetime;
	
	
	public  SimpleFrame0()
	{
		//ShowTime tt = new ShowTime();;
		int[] snum = new int[100];
		ArrayList<String> num = new ArrayList<String>();
		final JTextField rater1 = new JTextField();
		final JTextField rater2 = new JTextField();
		final JTextField rater3 = new JTextField();
		final JTextField rater4 = new JTextField();
		final JTextField rater5 = new JTextField();
		final JTextField rater6 = new JTextField();
		final JTextField rater7 = new JTextField();
		final JTextField rater8 = new JTextField();
		final JTextField rater9 = new JTextField();
		final JTextField rater10 = new JTextField();
		final JTextField rater11 = new JTextField();
		final JTextField rater12 = new JTextField();
		final JTextField rater13 = new JTextField();
		final JTextField rater14 = new JTextField();
		final JTextField rater15 = new JTextField();
		final JTextField rater16 = new JTextField();
		final JTextField rater17 = new JTextField();
		final JTextField rater18 = new JTextField();
		final JTextField rater19 = new JTextField();
		final JTextField rater20 = new JTextField();
		
		
		final JTextField answer1 = new JTextField();
		final JTextField answer2 = new JTextField();
		final JTextField answer3 = new JTextField();
		final JTextField answer4 = new JTextField();
		final JTextField answer5 = new JTextField();
		final JTextField answer6 = new JTextField();
		final JTextField answer7 = new JTextField();
		final JTextField answer8 = new JTextField();
		final JTextField answer9 = new JTextField();
		final JTextField answer10 = new JTextField();
		final JTextField answer11 = new JTextField();
		final JTextField answer12 = new JTextField();
		final JTextField answer13 = new JTextField();
		final JTextField answer14 = new JTextField();
		final JTextField answer15 = new JTextField();
		final JTextField answer16 = new JTextField();
		final JTextField answer17 = new JTextField();
		final JTextField answer18 = new JTextField();
		final JTextField answer19 = new JTextField();
		final JTextField answer20 = new JTextField();
		
		JPanel northPanel1 = new JPanel();
		northPanel1.setBackground(Color.WHITE);
		northPanel1.setFont(new Font("�����п�",Font.BOLD,25));
		northPanel1.setLayout(new GridLayout(1,3));
		
		//northPanel1.setForeground(Color.BLUE);
		add(northPanel1,BorderLayout.NORTH);
		northPanel1.add(new JLabel("����ʽ:",SwingConstants.CENTER));
		northPanel1.add(new JLabel("�������:",SwingConstants.CENTER));
		northPanel1.add(new JLabel("�жϽ��:",SwingConstants.CENTER));
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLACK);
		//northPanel.setBackground(java.awt.Color.CYAN);
		northPanel.setLayout(new GridLayout(20,1));
		
		
		northPanel.add(rater1);
		northPanel.add(answer1);
		northPanel.add(rater2);
		northPanel.add(answer2);
		northPanel.add(rater3);
		northPanel.add(answer3);
		northPanel.add(rater4);
		northPanel.add(answer4);
		northPanel.add(rater5);
		northPanel.add(answer5);
		northPanel.add(rater6);
		northPanel.add(answer6);
		northPanel.add(rater7);
		northPanel.add(answer7);
		northPanel.add(rater8);
		northPanel.add(answer8);
		northPanel.add(rater9);
		northPanel.add(answer9);
		northPanel.add(rater10);
		northPanel.add(answer10);
		northPanel.add(rater11);
		northPanel.add(answer11);
		northPanel.add(rater12);
		northPanel.add(answer12);
		northPanel.add(rater13);
		northPanel.add(answer13);
		northPanel.add(rater14);
		northPanel.add(answer14);
		northPanel.add(rater15);
		northPanel.add(answer15);
		northPanel.add(rater16);
		northPanel.add(answer16);
		northPanel.add(rater17);
		northPanel.add(answer17);
		northPanel.add(rater18);
		northPanel.add(answer18);
		northPanel.add(rater19);
		northPanel.add(answer19);
		northPanel.add(rater20);
		northPanel.add(answer20);
		add(northPanel,BorderLayout.CENTER);
		
		final JTextArea textArea = new JTextArea(20,13);
		textArea.setBackground(Color.GREEN);
		textArea.setFont(new Font("",Font.PLAIN,17));
		add(textArea,BorderLayout.WEST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.CYAN);
		add(southPanel,BorderLayout.SOUTH);
		JButton insertButton = new JButton("�ύ");
		insertButton.setFont(new Font("�����п�", Font.BOLD, 20));
		insertButton.setForeground(Color.BLUE);
		insertButton.setBackground(Color.cyan);
		southPanel.add(insertButton);
		JButton sortButton = new JButton("���");
		sortButton.setFont(new Font("�����п�", Font.BOLD, 20));
		sortButton.setForeground(Color.BLUE);
		sortButton.setBackground(Color.cyan);
		southPanel.add(sortButton);
		southPanel.add(l1);
		l1.setFont(new Font("",1,18));
		
		
		int i=0;
        Random r= new Random();
        String[] operate=new String[]{"+","-","*","/"};
        String[] operate1=new String[]{"+","-","*"};
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        ArrayList<String> Expression=new ArrayList<String>();
        ArrayList<String> Expressions=new ArrayList<String>();
        
        for(i=0;i<20;i++)
        {
        	int a=(int)(Math.random()*100);
            int b=(int)(Math.random()*100);
            int c=(int)(Math.random()*100);
            int d=(int)(Math.random()*100);
            String cz=operate[r.nextInt(4)];
            String cz1=operate1[r.nextInt(3)];
            String cz2=operate1[r.nextInt(3)];
	        String as=new String();
	        int s= (int)(Math.random()*3);
	        
	        if(cz.equals("/"))
	        	b=div(a,b);
	      
	        	if(s==0)
	        	{
	        		
			        as=String.valueOf(a)+String.valueOf(cz)+String.valueOf(b);
			       	Expression.add(as);
			        textArea.append("    "+as+"=\n");
			        
			      
			 	}
	        	if(s==1)
	        	{
			       	as=String.valueOf(a)+String.valueOf(cz)+String.valueOf(b)+String.valueOf(cz1)+String.valueOf(c);
			       	Expression.add(as);
			       	textArea.append("    "+as+"=\n");
			       	
	        	}
	        	if(s==2)
	        	{
	        	   	as=String.valueOf(a)+String.valueOf(cz)+String.valueOf(b)+String.valueOf(cz1)+String.valueOf(c)+String.valueOf(cz2)+String.valueOf(d);
			       	Expression.add(as);
			       	textArea.append("    "+as+"=\n");
			       
	        	}
	        	
	        	 
	     
	       
        }
       
    
        for(String w:Expression)
        {
        	
        		String answer = new String();
				 try {
					answer=""+se.eval(w);
					Expressions.add(answer);
				} catch (ScriptException e) {
					e.printStackTrace();
				}		
        }
        shishi3 shishi33=new shishi3();
		shishi33.start();
     
        //ȷ�ϰ�ť����
        insertButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int sum=0;
				ArrayList<String> answers=new ArrayList<String>();
				String text1 =String.valueOf(rater1.getText());
				answers.add(text1);
				String text2 = String.valueOf(rater2.getText());
				answers.add(text2);
				String text3 = String.valueOf(rater3.getText());
				answers.add(text3);
				String text4 = String.valueOf(rater4.getText());
				answers.add(text4);
				String text5 = String.valueOf(rater5.getText());
				answers.add(text5);
				String text6 = String.valueOf(rater6.getText());
				answers.add(text6);
				String text7 = String.valueOf(rater7.getText());
				answers.add(text7);
				String text8 = String.valueOf(rater8.getText());
				answers.add(text8);
				String text9 = String.valueOf(rater9.getText());
				answers.add(text9);
				String text10 = String.valueOf(rater10.getText());
				answers.add(text10);
				String text11 =String.valueOf(rater11.getText());
				answers.add(text11);
				String text12 = String.valueOf(rater12.getText());
				answers.add(text12);
				String text13 = String.valueOf(rater13.getText());
				answers.add(text13);
				String text14 = String.valueOf(rater14.getText());
				answers.add(text14);
				String text15 = String.valueOf(rater15.getText());
				answers.add(text15);
				String text16 = String.valueOf(rater16.getText());
				answers.add(text16);
				String text17 = String.valueOf(rater17.getText());
				answers.add(text17);
				String text18 = String.valueOf(rater18.getText());
				answers.add(text18);
				String text19 = String.valueOf(rater19.getText());
				answers.add(text19);
				String text20 = String.valueOf(rater20.getText());
				answers.add(text20);
				
				if( Expressions.get(0).equals(answers.get(0)) )
					{answer1.setText("��ȷ "); sum++;}
				else
					answer1.setText("����");
				
				if( Expressions.get(1).equals(answers.get(1)) )
					{answer2.setText("��ȷ "); sum++;}
				else
					answer2.setText("����");
				
				if( Expressions.get(2).equals(answers.get(2)) )
					{answer3.setText("��ȷ "); sum++;}
				else
					answer3.setText("����");
				
				if( Expressions.get(3).equals(answers.get(3)) )
					{answer4.setText("��ȷ "); sum++;}
				else
					answer4.setText("����"); 
				
				if( Expressions.get(4).equals(answers.get(4)) )
					{answer5.setText("��ȷ "); sum++;}
				else
					answer5.setText("����");
				
				if( Expressions.get(5).equals(answers.get(5)) )
					{answer6.setText("��ȷ "); sum++;}
				else
					answer6.setText("����");
				
				if( Expressions.get(6).equals(answers.get(6)) )
					{answer7.setText("��ȷ "); sum++;}
				else
					answer7.setText("����");
				
				if( Expressions.get(7).equals(answers.get(7)) )
					{answer8.setText("��ȷ "); sum++;}
				else
					answer8.setText("����");
				
				if( Expressions.get(8).equals(answers.get(8)) )
					{answer9.setText("��ȷ "); sum++;}
				else
					answer9.setText("����");
				
				if( Expressions.get(9).equals(answers.get(9)) )
					{answer10.setText("��ȷ "); sum++;}
				else
					answer10.setText("����");
				
				if( Expressions.get(10).equals(answers.get(10)) )
					{answer11.setText("��ȷ "); sum++;}
				else
					answer11.setText("����");
				
				if( Expressions.get(11).equals(answers.get(11)) )
					{answer12.setText("��ȷ "); sum++;}
				else
					answer12.setText("����");
				
				if( Expressions.get(12).equals(answers.get(12)) )
					{answer13.setText("��ȷ "); sum++;}
				else
					answer13.setText("����");
				
				if( Expressions.get(13).equals(answers.get(13)) )
					{answer14.setText("��ȷ "); sum++;}
				else
					answer14.setText("����");
				
				if( Expressions.get(14).equals(answers.get(14)) )
					{answer15.setText("��ȷ "); sum++;}
				else
					answer15.setText("����");
				
				if( Expressions.get(15).equals(answers.get(15)) )
					{answer16.setText("��ȷ "); sum++;}
				else
					answer16.setText("����");
				
				if( Expressions.get(16).equals(answers.get(16)) )
					{answer17.setText("��ȷ "); sum++;}
				else
					answer17.setText("����");
				
				if( Expressions.get(17).equals(answers.get(17)) )
					{answer18.setText("��ȷ "); sum++;}
				else
					answer18.setText("����");
				
				if( Expressions.get(18).equals(answers.get(18)) )
					{answer19.setText("��ȷ "); sum++;}
				else
					answer19.setText("����");
				
				if( Expressions.get(19).equals(answers.get(19)) )
					{answer20.setText("��ȷ "); sum++;}
				else
					answer20.setText("����");
				
				
				num.add(sum*5+"");
				try {
				   	File f = new File("result.txt"); 
					FileWriter fw = new FileWriter(f,true);
					PrintWriter pw = new PrintWriter(fw);
				    for(String con:num)
					 {
					      pw.println(con);               
			         }
							
					fw.close();
							
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			}
			
		});
        
        
	  
        
        sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				Sort frame = new Sort(num);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
					
				
				
			}
		});
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("��������ϵͳ");
		setLocation(500,100);
		
	}
	
	
	 private static int div(int x,int y)
		{
			if(x%y!=0)
			{
				y=(int)(Math.random()*100)+1;
				return div(x,y);
			}
			else{
				return y; 
			}
		}
	 
	 class shishi3 extends Thread {
		    private long noww = 0l;
		    private long start = System.currentTimeMillis();// ��������ʱ��ĺ���ֵ
		    private long time;
		    public void run() {
		    	int i=0;
		        while (true) {

		            noww = System.currentTimeMillis();// ��ȡһ��֮��ĺ���ֵ
		            time = noww - start;// ����ʱ������ĵ������
		            timetime=time;
		            String ssss=String.format("��ʱ�� %02d:%02d:%02d\n",
		                    time / (1000 * 60 * 60) % 60/* ʱ */, 
		                    time / (1000 * 60)% 60/* �� */, 
		                    (time / 1000 % 60)/* �� */);// ��ʽ���ַ������
		       
			            l1.setText(ssss);
			            i++;
			            try {
			                Thread.sleep(1000);
			            } catch (InterruptedException e) {
			                e.printStackTrace();
			            }
		            
		        }
		    }
		}
		
		
		
}
