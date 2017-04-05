package kr.or.dgit.book_project;

import java.util.List;
import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.book_project.dto.PublisherInfo;
import kr.or.dgit.book_project.service.PublisherInfoService;


public class PublisherInfoServiceTest {

	private static PublisherInfoService publisherInfoService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		publisherInfoService = new PublisherInfoService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		publisherInfoService = null;
	}

	/*@Test 
	public void aTestselectPublisherInfoByAll(){
	
		RowBounds rowBounds = new RowBounds(0, 10);
		List<PublisherInfo> lists = publisherInfoService.selectPublisherInfoByAll(rowBounds);
		Assert.assertNotNull(lists);
	}
	@Test 
	public void aTestselectPublisherInfo(){
		PublisherInfo pi = new PublisherInfo();
		pi.setpCode("P001");
		PublisherInfo publisherinfo = publisherInfoService.selectPublisherInfo(pi);
		Assert.assertNotNull(publisherinfo);
	}
	@Test
	public void aTestinsertAllPublisherInfo(){	
		PublisherInfo pi = new PublisherInfo("P024", "이상미디어", "학수고대", "010-1234-5678", 12345, "대구광역시 남구 대명동");
		int res = PublisherInfoService.insertAllPublisherInfo(pi);
		Assert.assertEquals(1, res);
	}
	@Test
	public void aTestupdateSetPublisherInfo(){
		PublisherInfo pi = new PublisherInfo();
		pi.setpCode("P020");
		pi.setPublisher("어디를");
		pi.setpName("가느냐");
		pi.setpTel("010-1234-9876");
		pi.setpZipCode(12345);
		pi.setpAddress("태양계 지구별 경상북도 구미시");
		int res = PublisherInfoService.updateSetPublisherInfo(pi);
		Assert.assertEquals(1, res);
		
	}*/

}
