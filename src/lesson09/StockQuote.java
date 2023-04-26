package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class StockQuote {
  
  static void printStockQuote(String symbol) {
	  String csvString;
	  URL url = null;
	  URLConnection urlConn = null;
	  InputStreamReader inStream = null;
	  BufferedReader buff = null;
	String quotes = "https://query1.finance.yahoo.com/v7/finance/download/" +symbol+
			"?period1=1682380800&period2=1682467200&interval=1d&events=history&includeAdjustedClose=true";
	try {
		url = new URL(quotes);
		urlConn = url.openConnection();
		inStream = new InputStreamReader(urlConn.getInputStream());
		buff = new BufferedReader(inStream);
		//get the quote as a csv string
		csvString = buff.readLine();
		//parse the csv string
		StringTokenizer tokenizer = new 
				StringTokenizer(csvString, ",");
		/**
		String ticker = tokenizer.nextToken();
		String price =  tokenizer.nextToken();
		String tradeDate = tokenizer.nextToken();
		String tradeTime = tokenizer.nextToken();
		*/
		String tradeDate = tokenizer.nextToken();
		String tradeOpen = tokenizer.nextToken();
		String tradeHigh = tokenizer.nextToken();
		String tradeLow =  tokenizer.nextToken();
		String tradeClose = tokenizer.nextToken();
		String tradeAdjClose = tokenizer.nextToken();
		String tradeVolume = tokenizer.nextToken();
		//if (tokenizer.nextToken()!=null) {System.out.println("next:" + tokenizer.nextToken());}
		System.out.println("Symbol: " + symbol + 
			" Price: " + tradeAdjClose + " Date: " + tradeDate);
		csvString = buff.readLine();
		//parse the csv string
		tokenizer = new 
				StringTokenizer(csvString, ",");
		tradeDate = tokenizer.nextToken();
		tradeOpen = tokenizer.nextToken();
		tradeHigh = tokenizer.nextToken();
		tradeLow =  tokenizer.nextToken();
		tradeClose = tokenizer.nextToken();
		tradeAdjClose = tokenizer.nextToken();
		tradeVolume = tokenizer.nextToken();
		System.out.println("Symbol: " + symbol + 
			" Price: " + tradeAdjClose + " Date: " + tradeDate);
	} catch(MalformedURLException e) {
		System.out.println("Please check the spelling of the URL: " +
	      e.toString());
	} catch(IOException e1) {
		System.out.println("Can't read online:" + e1.toString());
	}
  }
  StockQuote(){
	 System.out.println("StockQuote");
	 printStockQuote("AAPL");
     
  }
  public static void main(String args[]) {
	  if (args.length == 0) {
		  System.out.println("Sample usage: java StockQuote AAPL");
		  System.exit(0);
	  }
	  printStockQuote(args[0]);
  }
}
