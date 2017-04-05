package kr.or.dgit.book_project;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.service.PublisherInfoService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PublisherServiceTest {
	private static PublisherInfoService publisherInfoService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		publisherInfoService = new PublisherInfoService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		publisherInfoService = null;
	}

	@Before
	public void setUp() {
		System.out.println("setUp()");
	}

	@After
	public void tearDown() {
		System.out.println("tearDown()");
	}

	///////////////////////////////

	/*@Test
	public void atestselectCountAll() {
		int res = publisherInfoService.selectCountAll();
		JOptionPane.showMessageDialog(null, "출판사개수: " + res);
		Assert.assertNotNull(res);
	}

	@Test
	public void btestinsertPubliherShort() { // 출판사코드 셋팅
		PublisherInfo pi = new PublisherInfo();
		int cnt = publisherInfoService.selectCountAll();
		String pCode = String.format("P%03d", cnt+1);
		pi.setpCode(pCode);
		pi.setPublisher("출판사추가" + cnt+1);
		int res = publisherInfoService.insertPubliherShort(pi);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void ctestselectByAll() {  // 추후 도서등록화면에서 출판사 콤보박스에 넣을 정보
		List<PublisherInfo> list = new ArrayList<>();
		list = publisherInfoService.selectByAll();
		Assert.assertNotNull(list);
	}*/

}
