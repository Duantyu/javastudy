package exercises;
import java.util.Scanner;
import java.lang.Math;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;


public class DateCalculate {
	public static void main(String args[]) throws NumberFormatException, IOException, ParseException {
			int days = 0,year1,month1,day1,year2=0,month2=0,day2=0,year3=0,month3=0,day3=0,i=0,j=0,count=0,sum=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("�������ڵ���ݣ�");
			year1=scan.nextInt();  //�������
			System.out.println("�������ڵ��·ݣ�");
			month1=scan.nextInt();  //�����·�
			System.out.println("��������ڵ��պţ�");
			day1=scan.nextInt();   //�����պ�
		    if(month1==2) {  //�ж�����
		    	if((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0 || (year1 % 3200 == 0 && year1 % 1728000 ==0) ) {
		    		days = 29;
			}
		    	else
		    		days = 28;
		    }
		    else
		    	switch(month1) {
		    		case 4: 
		    		case 6:
		    		case 9:
		    		case 11: days = 30; break;
		    		default: days = 31;
		    	}
		    System.out.println(days);
		    if(2020<=year1) {
		    	for(i=2020;i<year1;i++) {
		    		if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0 || (i % 3200 == 0 && i % 1728000 ==0)) {
		    			count+=1;                  //�ж����ʼ�����������е�����
		    		}
		    	}
		    	sum=count+365*(year1-2020);  //������ݲ�������
		    	System.out.println(sum);
		    	if(month1 <= 9) {
		    		switch(9 - month1) {  //�����·ݲ�������
		    		case 0: days=0;break;
		    		case 1: days=31;break;
		    		case 2: days=62;break;
		    		case 3: days=92;break;
		    		case 4: days=123;break;
		    		case 5: days=153;break;
		    		case 6: days=184;break;
		    		case 7: days=212;break;
		    		case 8: days=243;break;		    			
		    		}
		    		sum = sum - days;
		    		System.out.println(sum);
		    		if(day1 <= 28) {
		    			sum = sum - (28-day1);  //����������������		    			
		    		}
		    		System.out.println(sum);
		    		if(day1 > 28) {
		    			sum = sum + (day1 - 28);		    		 	
		    		}
		    		System.out.println(sum);
		    		}
		    	if(month1 > 9) {
		    		switch(month1 - 9) {
		    		case 1: days=30;break;
		    		case 2: days=61;break;
		    		case 3: days=91;break;
		    		}
		    		sum = sum + days;
		    		System.out.println(sum);
			    	if(day1 <= 28) {
			    		sum = sum - (28-day1 );  //����������������			    		
			    	}
			    	System.out.println(sum);
			    	if(day1 > 28) {
			    		sum = sum + day1 - 28;
			    	}
			    	System.out.println(sum);
		    	}
		    	}

		    if(2020>year1) {
		    	for(j=2020;j>year1;j--) {
		    		if((j % 4 == 0 && j % 100 != 0) || j % 400 == 0 || (j % 3200 == 0 && j % 1728000 ==0)) {
		    			count+=1;                  //�ж����ʼ�����������е�����
		    		}
		    	}
		    		sum=count+365*(2020-year1);  //������ݲ�������
		    		System.out.println(sum);
			    	if(month1 <= 9) {
			    		switch(9 - month1) {  //�����·ݲ�������
			    		case 0: days=0;break;
			    		case 1: days=31;break;
			    		case 2: days=62;break;
			    		case 3: days=92;break;
			    		case 4: days=123;break;
			    		case 5: days=153;break;
			    		case 6: days=184;break;
			    		case 7: days=212;break;
			    		case 8: days=243;break;		    			
			    		}
			    	sum = sum + days;
			    	System.out.println(sum);
			    	if(day1 <= 28) {
			    		sum = sum + (28-day1);  //����������������
			    	}
		    		System.out.println(sum);
			    	if(day1 >28) {
			    		sum = sum - (day1 - 28 );
			    	}
			    	System.out.println(sum);
			    	}
			    	
			    	if(month1 > 9) {
			    		switch(month1 - 9) {
			    		case 1: days=30;
			    		case 2: days=61;
			    		case 3: days=91;
			    		}
			    		sum = sum - days;
			    		System.out.println(sum);
				    	if(day1 <= 28) {
				    		sum = sum - (28-day1);  //����������������			    		
				    	}
				    	System.out.println(sum);
				    	if(day1 > 28) { 
				    		sum = sum + (day1 - 28);				    	
				    	}
				    	System.out.println(sum);
			    	}
		    	}
		    
		    switch(sum%7) {
		    case 0: System.out.println("������");break;
		    case 1: System.out.println("����һ");break;
		    case 2: System.out.println("���ڶ�");break;
		    case 3: System.out.println("������");break;
		    case 4: System.out.println("������");break;
		    case 5: System.out.println("������");break;
		    case 6: System.out.println("������");break;
		    }
		    //����ת�������ڸ�ʽ
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));  //������һ������ʵ��
		    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));  //�����ڶ�������ʵ��
		   //��ʽת��
		    System.out.println("�����һ�����ڵ���ݣ�");
		    year2 = Integer.parseInt(br1.readLine());
		    System.out.println("�����һ�����ڵ��·ݣ�");
		    month2 = Integer.parseInt(br1.readLine());
		    System.out.println("�����һ�����ڵ��պţ�");
		    day2 = Integer.parseInt(br1.readLine());
		    String s1 = year2+"-"+month2+"-"+day2; 
		    
		    System.out.println("����ڶ������ڵ���ݣ�");
		    year3 = Integer.parseInt(br2.readLine());
		    System.out.println("����ڶ������ڵ��·ݣ�");
		    month3 = Integer.parseInt(br2.readLine());
		    System.out.println("����ڶ������ڵ��պţ�");
		    day3 = Integer.parseInt(br2.readLine());
		    String s2 = year3+"-"+month3+"-"+day3;
		    //��ʼʱ��
		    Date startDate = sdf.parse(s1);
		    //����ʱ��
		    Date endDate = sdf.parse(s2);	    
		  //�õ��������� betweenDate
			long betweenDate = Math.abs((endDate.getTime() - startDate.getTime())/(60*60*24*1000));			
			//��ӡ����̨��������
			System.out.println(betweenDate);  
	}	
}
