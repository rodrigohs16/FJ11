package br.com.caelum.contas;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

	public static void main(String[] args) {
		
		Map<String,String> dic = new HashMap<>();
		dic.put("bola","ball");
		dic.put("mesa","table");
		dic.put("lapis","pencil");
		System.out.println(dic.get("mesa"));
	}

}
