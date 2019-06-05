//传年月日，构造日期类
//加减天数。推算日期
//可以返回字符串，String的方法  2019-05-20
//年：1900，2100
//如果给定两个日期，算差多少天
//设计属性,年月日
public class Date{
	private int year;
	private int month;
	private int day;
	
	//构造方法
	public Date(int year,int month,int day){//至少做基本的参数检查
		if(year<1900||year>2100){
			//最好的做法是抛异常
			System.out.println("年不合法："+year);
			return ;
		}
		if(month<1||month>12){
			System.out.println("月不合法："+month);
			return ;
		}
		if(day<1||day>getDayOfMonth(year,month)){
			System.out.println("日不合法："+day);
			return ;
		}
		this.year=year;
		this.month=month;
		this.day=day;

	}
	private Date(Date other){
		this(other.year,other.month,other.day);
	}
		//支持的方法
		public void add(int days){
			//days 必须是正数
			if(days<0){
				System.out.println("days 不合法:"+days);
				return ;
			}
			day+=days;
			while(day>getDayOfMonth(year,month)){
				day-=getDayOfMonth(year,month);
				month++;
				if(month>12){
					month=1;
					year++;
				}
			}
		}
		
		public void sub(int days){
			if(days<0){
				System.out.println("days不合法"+days);
				return ;
			}
			day-=days;
			while(day<1){
				month--;
				if(month<1){
					month=12;
					year--;
				}
				day+=getDayOfMonth(year,month);
			}
		}
		
		public String toString(){
			return String.format("%04d-%02d-%02d",year,month,day);
		}
		//返回d1和d2相差的天数，d1>d2
		public static int differ(Date d1,Date d2){
			if(!isGreatThan(d1,d2)){
				System.out.println("必须d1>d2");
				return -1;
			}
			int days=0;
			Date tmp=new Date(d1);
			while(isGreatThan(tmp,d2)){
				tmp.sub(1);
				days++;
			}
			return days;
		}
		//内部使用的方法 private
		private static final int[] DAY_OF_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};
		private static int getDayOfMonth(int year,int month){
			int days= DAY_OF_MONTH[month-1];
			if(month==2&&isLeapYear(year)){
				days=29;
			}
			return days;
		}
		
		private static boolean isLeapYear(int year){
			if(year%4==0&&year%100!=0||year%400==0){
				
				return true;
			}
			return false;
		}
		private static boolean  isGreatThan(Date d1,Date d2){
			if(d1.year>d2.year){
				return true;
			}
			if((d1.year==d2.year)&&d1.month>d2.month){
				return true;
			}
			if((d1.year==d2.year)&&(d1.month==d2.month)&&d1.day>d2.day){
				return true;
			}
			else{
				return false;
			}
		}
		
		public static void main(String[] args){
			Date date=new Date(2019,5,21);
			System.out.println(date.toString());
			date.add(9);
			System.out.println(date.toString());
			date.sub(30);
			System.out.println(date.toString());
			
			Date today=new Date(2019,5,21);
			Date intern=new Date(2019,12,1);
			System.out.println("距离找实习还有"+Date.differ(intern,today)+"天");
		}
}