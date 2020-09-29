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
			System.out.println("输入日期的年份：");
			year1=scan.nextInt();  //输入年份
			System.out.println("输入日期的月份：");
			month1=scan.nextInt();  //输入月份
			System.out.println("输入第日期的日号：");
			day1=scan.nextInt();   //输入日号
		    if(month1==2) {  //判断闰年
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
		    			count+=1;                  //判断与初始日期相差年份中的闰年
		    		}
		    	}
		    	sum=count+365*(year1-2020);  //计算年份差距的天数
		    	System.out.println(sum);
		    	if(month1 <= 9) {
		    		switch(9 - month1) {  //计算月份差距的天数
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
		    			sum = sum - (28-day1);  //计算天数差距的天数		    			
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
			    		sum = sum - (28-day1 );  //计算天数差距的天数			    		
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
		    			count+=1;                  //判断与初始日期相差年份中的闰年
		    		}
		    	}
		    		sum=count+365*(2020-year1);  //计算年份差距的天数
		    		System.out.println(sum);
			    	if(month1 <= 9) {
			    		switch(9 - month1) {  //计算月份差距的天数
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
			    		sum = sum + (28-day1);  //计算天数差距的天数
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
				    		sum = sum - (28-day1);  //计算天数差距的天数			    		
				    	}
				    	System.out.println(sum);
				    	if(day1 > 28) { 
				    		sum = sum + (day1 - 28);				    	
				    	}
				    	System.out.println(sum);
			    	}
		    	}
		    
		    switch(sum%7) {
		    case 0: System.out.println("星期日");break;
		    case 1: System.out.println("星期一");break;
		    case 2: System.out.println("星期二");break;
		    case 3: System.out.println("星期三");break;
		    case 4: System.out.println("星期四");break;
		    case 5: System.out.println("星期五");break;
		    case 6: System.out.println("星期六");break;
		    }
		    //设置转换的日期格式
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));  //创建第一个日期实例
		    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));  //创建第二个日期实例
		   //格式转换
		    System.out.println("输入第一个日期的年份：");
		    year2 = Integer.parseInt(br1.readLine());
		    System.out.println("输入第一个日期的月份：");
		    month2 = Integer.parseInt(br1.readLine());
		    System.out.println("输入第一个日期的日号：");
		    day2 = Integer.parseInt(br1.readLine());
		    String s1 = year2+"-"+month2+"-"+day2; 
		    
		    System.out.println("输入第二个日期的年份：");
		    year3 = Integer.parseInt(br2.readLine());
		    System.out.println("输入第二个日期的月份：");
		    month3 = Integer.parseInt(br2.readLine());
		    System.out.println("输入第二个日期的日号：");
		    day3 = Integer.parseInt(br2.readLine());
		    String s2 = year3+"-"+month3+"-"+day3;
		    //开始时间
		    Date startDate = sdf.parse(s1);
		    //结束时间
		    Date endDate = sdf.parse(s2);	    
		  //得到相差的天数 betweenDate
			long betweenDate = Math.abs((endDate.getTime() - startDate.getTime())/(60*60*24*1000));			
			//打印控制台相差的天数
			System.out.println(betweenDate);  
	}	
}
