package httpURLconnection;

import java.io.*;
import java.net.*;

public class httpURLconn  {
	
	public static void main(String[] args) throws Exception
	{
		String site = "https://www.churchofjesuschrist.org";
		BufferedReader br = null;
		String text = null;
		StringBuffer response = null;
		
		try {
			URL url = new URL(site);
			HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
			
			urlCon.setRequestMethod("GET");
			urlCon.connect();
			

			br = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
			

			response = new StringBuffer();
			
			while ((text = br.readLine()) != null) {
				response.append(text + "\n");
			}
			

			
			br.close();
			
			} catch (Exception e) {
				
			e.printStackTrace();
			throw e;
			}
		
			finally {
				
				if(br !=null) {
					try {
						br.close();
					}
					catch (IOException ioe)
					{
						ioe.printStackTrace();
					}
					
					System.out.println(response);
				}

			
		}}}