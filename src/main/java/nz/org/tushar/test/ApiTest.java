package nz.org.tushar.test;

import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import nz.org.tushar.test.model.CarbonCredit;
import nz.org.tushar.test.model.Promotions;

/**
 * Class - This is a class for all three acceptance criteria, execute test through main method and contains method 
 * to read API 
 * @author Tushar Soley
 * @since 22/02/2018
 *
 */
public class ApiTest {
	public static void main(String[] args) {
		String url = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
		// String url
		// ="https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json?catalogue=false";
		ApiTest mainApp = new ApiTest();
		// model class CarbonCredit
		CarbonCredit cc = (CarbonCredit) mainApp.executeApiGeneric(url, CarbonCredit.class);

		if (cc != null) {
			System.out.println("Testing started....");
			mainApp.testName(cc);
			mainApp.testCanReList(cc);
			mainApp.testPromotions(cc);
			System.out.println("Testing Completed");
		} else {
			System.out.println("Null response received from API call. Unable to carry out tests.");
		}

	}

	// Test Case: Verify Name = Carbon credits
	private void testName(CarbonCredit ccObj) {
		System.out.println("First Test - Testing for Name = Carbon credits");
		String ccName = ccObj.getName();
		if (ccName != null) {
			if (ccName.equals("Carbon credits")) {
				System.out.println("Name = Carbon credits test PASSED.");
			} else {
				System.out.println("Name = Carbon credits test FAILED!");
			}
		} else {
			System.out.println("Name = Carbon credits test FAILED! Null name found.");
		}
	}

	// Test case: verify canReList = true
	private void testCanReList(CarbonCredit ccObj) {
		System.out.println("Second Test - Testing for CanReList = true");
		boolean ccCanReList = ccObj.isCanReList();
		if (!ccCanReList) {
			System.out.println("CanReList = true test FAILED.");
		} else {
			System.out.println("CanReList = true test PASSED.");
		}

	}

	// Test Case: The Promotions element with Name = "Gallery" has a Description
	// that contains the text "2x larger image"
	private void testPromotions(CarbonCredit ccObj) {
		System.out.println("Third Test - Testing for Promotions contains - " + "\"2x larger image\"");
		List<Promotions> listPromotions = ccObj.getPromotions();
		if (listPromotions != null) {
			boolean foundFirstPromotion = false;
			boolean foundGallery = false;
			for (Promotions promo : listPromotions) {
				if (promo.getName().equalsIgnoreCase("Gallery")) {
					foundGallery = true;
					if (promo.getDescription().contains("2x larger image")) {
						foundFirstPromotion = true;
					}
				}
			}
			if (foundFirstPromotion) {
				System.out.println("Promotions test PASSED.");
			} else {
				if (foundGallery) {
					System.out.println("Promotions test FAILED.");
				} else {
					System.out.println("Promotions test FAILED. Gallery not found");
				}
			}
		} else {
			System.out.println("Promotions test FAILED! No promotions found.");
		}
	}

	/*
	 * Method executeApiGeneric This is a generic method to call the REST API
	 * and return the API JSON response converted into a corresponding java
	 * object specified by the calling method.
	 * 
	 * @param apiUrl Rest API URL to invoke
	 * 
	 * @param classType The type of class to create the java object
	 * 
	 * @return Object
	 */
	public <T> Object executeApiGeneric(String apiUrl, Class<T> classType) {
		Object oo = null;
		try {
			// Define the response object
			CloseableHttpResponse response;
			String httpResponseStr;
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(apiUrl);
			response = httpclient.execute(httpget);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				httpResponseStr = EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8"));
				// API response
				Gson gsonObj = new Gson();
				oo = gsonObj.fromJson(httpResponseStr, classType);
			} else {
				System.out.println("API response status " + response.getStatusLine().getStatusCode()
						+ " receieved. Unable to process response.");
			}

		} catch (Exception e) {
			System.out.println("Exception occurred while invoking the API:[" + apiUrl + "]. " + e.getMessage());
		}
		return oo;
	}
}
