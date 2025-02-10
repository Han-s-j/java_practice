package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {
	public static void main(String[] args) {
		// 1.Date 클래스 (1970년 1월 1일 자정 이후 시간을 밀리초 단위로 표현)
		Date dateToday = new Date();
		System.out.println(dateToday); // korean standard time
		// 원하는 문자열 format 형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분ss초");
		System.out.println(sdf.format(dateToday));
		// 년월일 형태로만
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyy-MM-dd");
		System.out.println(sdf2.format(dateToday));
		// 뉴욕 시간
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf3.setTimeZone(timeZone);
		System.out.println(sdf3.format(dateToday));

		// String to date (ex. 사용자 입력이 String)
		String str = "2025/01/21 09-10-00";
		// 이런 형태로 입력하겠다 (입력된 형태와 같은 형태로 해야 함)
		sdf = new SimpleDateFormat("yyyy/MM/dd HH-mm-ss");
		try {
			Date startDt = sdf.parse(str);
			System.out.println(startDt);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Calendar 클래스 (year, month, day 같은 필드를 제공) 날짜 계산에 유용함.
		Calendar calToday = Calendar.getInstance(); // 싱글톤
		// 파란색 글자 : 뽑아서 상수를 만듦 (편하게 쓰려고)
		System.out.println(calToday.getTime());
		System.out.println(calToday.get(Calendar.DATE));
		System.out.println(calToday.get(Calendar.MONTH) + 1);
		System.out.println(calToday.get(Calendar.YEAR));
		System.out.println(calToday.get(Calendar.HOUR_OF_DAY));
		// 1일 뒤
		calToday.add(Calendar.DATE, 1);
		System.out.println(sdf.format(calToday.getTime()));
		// 3일 뒤
		calToday.add(Calendar.DATE, 3);
		System.out.println(sdf.format(calToday.getTime()));
		// 5개월 뒤
		calToday.add(Calendar.MONTH, 5);
		System.out.println(sdf.format(calToday.getTime()));

		Calendar calendars = Calendar.getInstance();
		int year = 2025;
		int month = 2;
		calendars.set(year, month - 1, 1); // 해당 월의 1일 날짜
		System.out.println(sdf.format(calendars.getTime()));
		int startDay = calendars.get(Calendar.DAY_OF_MONTH);
		System.out.println(startDay);
		// 해당 월의 마지막 일자 얻기
		int lastDay = calendars.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		// 요일 1:일요일, 2:월요일 ~~~ 7: 토요일
		int dayOfWeek = calendars.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		System.out.println(year + "년" + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		// 42인 이유: 최대 6주까지 생성되기 때문에
		for (int i = 1; i <= 42; i++) {
			if (i < dayOfWeek) {
				System.out.print("\t");
			} else {
				System.out.printf("%d\t", current);
				current++;
				if(current>lastDay) {
					break;
				}
			}
			if (i % 7 == 0) {
				//한줄쓰고 개행
				System.out.println();
			}
		}
		workingCalendar(2025, 3);
	}
		
//input : int year, int month
//output : void
//내용 : 해당 년월(달력출력)	workingCalendar(2025, 10)
	public static void workingCalendar(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1); // 해당 월의 1일 날짜
		// 해당 월의 마지막 일자 얻기
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 요일 1:일요일, 2:월요일 ~~~ 7: 토요일
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("\n\n");
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("Mon\tTue\tWen\tThu\tFri");
		int current = 1;
		for (int i = 1; i <= 42; i++) {
			if (i < dayOfWeek) {
				if(i != 1) {
				System.out.print("\t");
				}
			} else {
				// 1또는 7빼고 출력
				if(!(i%7==1 || i%7==0)) {
					System.out.printf("%2d\t", current);
				}
				current++;
				if (current > lastDay) {
					break;
				}
			}
			if (i % 7 == 0) {
				//한줄쓰고 개행
				System.out.println();
			}
		}
	}
}
