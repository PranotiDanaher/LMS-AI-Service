package lmsaiservicecall.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AIModelRequestTest {

	@Test
	public void test() throws Exception {
		ModelReq ModelReq= new ModelReq();
		ModelReq.setDownloadSignedURL("http//sdjahsk");
		ModelReq.setUploadSignedURL("http//sdjahsk");
		ModelReq.setRequestId("reqid");
		ModelReq.setImageName("abc.tiff");
		ModelReq.setImageType("tiff");
		ModelReq.setRequestType("denoise");
		assertNotNull(ModelReq.getDownloadSignedURL());
		assertNotNull(ModelReq.getImageName());
		assertNotNull(ModelReq.getImageType());
		assertNotNull(ModelReq.getRequestId());
		assertNotNull(ModelReq.getRequestType());
		assertNotNull(ModelReq.getUploadSignedURL());

		ModelRes ModelRes=new ModelRes();
		ModelRes.setAttributes("{attributes:1}");
		ModelRes.setImageName("abc.tiff");
		ModelRes.setImageType("tiff");
		ModelRes.setMetadata("{metadata:1}");
		ModelRes.setRequestId("reqid");
		ModelRes.setRequestType("denoise");
		ModelRes.setStatus(1);
		assertNotNull(ModelRes.getAttributes());
		assertNotNull(ModelRes.getImageName());
		assertNotNull(ModelRes.getMetadata());
		assertNotNull(ModelRes.getRequestId());
		assertNotNull(ModelRes.getRequestType());
		assertNotNull(ModelRes.getStatus());
		assertNotNull(ModelRes.getImageType());


		CommonMessage CommonMessage=new CommonMessage();
		CommonMessage.setErrorCode("400");
		CommonMessage.setErrorMessage("error");
		CommonMessage.setTimeStamp("timestamp");
		CommonMessage.setTrackingID("trackingid");
		assertNotNull(CommonMessage.getErrorCode());
		assertNotNull(CommonMessage.getErrorMessage());
		assertNotNull(CommonMessage.getTimeStamp());
		assertNotNull(CommonMessage.getTrackingID());

		AIModelRequest AIModelRequest=new AIModelRequest();
		AIModelRequest.setModelReq(ModelReq);
		assertNotNull(AIModelRequest.getModelReq());

		AIModelResp AIModelResp=new AIModelResp();
		AIModelResp.setCommonMessage(CommonMessage);
		AIModelResp.setModelRes(ModelRes);
		assertNotNull(AIModelResp.getCommonMessage());
		assertNotNull(AIModelResp.getModelRes());
	}
}
