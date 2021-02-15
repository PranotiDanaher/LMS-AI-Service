package lmsaiservicecall.service;

import java.util.concurrent.TimeUnit;

import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lmsaiservicecall.model.AIModelRequest;
import lmsaiservicecall.model.AIModelResp;
import lmsaiservicecall.util.AIModelConstants;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AIModel {

	private AIModel() {}
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(AIModel.class);

	private static final OkHttpClient httpClient = new OkHttpClient().newBuilder().readTimeout(5, TimeUnit.MINUTES).connectTimeout(5, TimeUnit.MINUTES).build();
	private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

	public static AIModelResp callAIModelAPI(AIModelRequest dnsRequest) throws Exception {//NOSONAR

		final String json = gson.toJson(dnsRequest, AIModelRequest.class);
		LOGGER.info("AI API Request:-"+json);		//NOSONAR
		final RequestBody body = RequestBody.create(
				MediaType.parse(AIModelConstants.JSON),
				json
				);
		final Request request = new Request.Builder()
				.url(System.getenv(AIModelConstants.AI_API_ENDPOINT))   	//NOSONAR
				.post(body)
				.build();

		final Response response = httpClient.newCall(request).execute();
		LOGGER.info("AIModel.callAIModelAPI:-"+response.peekBody(2048).string());		//NOSONAR
		if (!response.isSuccessful()) {
			if(response.body().string().contains("timeout")) {
				LOGGER.info("AI Model process is done but Lambda didn't got response from "+response);		//NOSONAR
				return null;
			}else {
				throw new Exception("Error occurred in Service during AI API Call:-"+response);//NOSONAR
			}
		}
		return gson.fromJson(response.peekBody(2048).string(), AIModelResp.class);
	}

}
