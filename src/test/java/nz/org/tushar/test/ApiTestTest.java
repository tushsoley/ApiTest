/**
 * 
 */
package nz.org.tushar.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import nz.org.tushar.test.model.CarbonCredit;
import nz.org.tushar.test.model.Promotions;

/**
 * @author tusharso
 *
 */
public class ApiTestTest {

	CarbonCredit cc = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String url = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
		ApiTest testObj = new ApiTest();
		cc = (CarbonCredit) testObj.executeApiGeneric(url , CarbonCredit.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cc = null;
	}

	@Test
	public void nameTest() {
		assertNotNull(cc);
		// Pass case
		assertEquals("Carbon credits",cc.getName());
		//Fail case
		//assertNotEquals("Carbon credit",cc.getName());
	}
	@Test
	public void canReListTest() {
		assertNotNull(cc);
		// Pass case
		assertTrue(cc.isCanReList());
	}
	@Test
	public void promotionGalleryDescriptionTest(){
		assertNotNull(cc);
		List<Promotions> listPromotions = cc.getPromotions();
		for (Promotions promo: listPromotions) {
			if (promo.getName().equalsIgnoreCase("Gallery")) {
				assertTrue(promo.getDescription().contains("2x larger image"));
			}
		}		
	}
}
