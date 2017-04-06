package kr.or.dgit.book_project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.book_project.dto.PaymentIO;
import kr.or.dgit.book_project.service.PaymentIOService;

public class PaymentIOServieTest {
	private static PaymentIOService paymentIOServie;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		paymentIOServie = PaymentIOService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		paymentIOServie = null;
	}

	/*@Test
	public void TESTselectAllPaymentIOInfo() {

		Map<String, Object> param = new HashMap<>();
		param.put("mCode", "C005");

		List<PaymentIO> newList = paymentIOServie.selectAllPaymentIOInfo(param);
		Assert.assertNotNull(newList);

	}*/
}
