package ch11_java_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class ApiJson {
	
	public static void main(String[] args) throws Exception {
		// upbit rest api 코인 종목 리스트를 제공함 get 방식에 json 데이터 형태로
		// json(Javascript Object Notation)
		// 데이터를 저장하고 교환하는데 사용되는 경량 데이터 형식 속성-값 쌍으로 이루어져 있음.
		String coinInfoUrl = "https://api.upbit.com/v1/market/all";
		
		URL url = new URL(coinInfoUrl);
		//HttpsURLConnection을 통해 해당 url 정보 불러오기
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 요청 방식설정
		conn.setRequestMethod("GET");
		conn.setReadTimeout(5000); //5초까지 기다림
		int resCode = conn.getResponseCode(); // 응답에 따른 요청 코드 리턴(200정상)
		if(resCode ==200) {
			System.out.println(resCode);
			//실시간 스트리밍 데이터를 읽어오기 (우리한테 조금씩 던져줌)
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			// 내용이 없을 때 까지 담기
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// 읽어들인 데이터의 형태는 하나의 문자열임
			System.out.println(response);
			// json 데이터 형태로 읽어서 객체화 하기
			JSONParser parser = new JSONParser();	//문자를 객체로 parse
			JSONArray jsonArr = (JSONArray) parser.parse(response.toString());
			for(Object object: jsonArr) {
				JSONObject obj = (JSONObject) object;
				System.out.println("market:" + obj.get("market"));
				System.out.println("kor:" + obj.get("korean_name"));
			}
		}
	}
}
