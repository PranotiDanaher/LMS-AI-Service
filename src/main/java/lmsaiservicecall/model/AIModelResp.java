package lmsaiservicecall.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AIModelResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5570808944965635355L;
	private CommonMessage CommonMessage;//NOSONAR
	private ModelRes ModelRes;//NOSONAR
	/**
	 * @return the commonMessage
	 */
	public CommonMessage getCommonMessage() {
		return CommonMessage;
	}
	/**
	 * @param commonMessage the commonMessage to set
	 */
	public void setCommonMessage(CommonMessage commonMessage) {
		CommonMessage = commonMessage;
	}
	/**
	 * @return the denoiserResponse
	 */
	public ModelRes getModelRes() {
		return ModelRes;
	}
	/**
	 * @param denoiserResponse the denoiserResponse to set
	 */
	public void setModelRes(ModelRes modelRes) {
		ModelRes = modelRes;
	}
	
	@Override
	public String toString() {
		return "DenoiserResp [CommonMessage=" + CommonMessage.toString() + ", ModelRes=" + ModelRes.toString() + "]";
	}
	
	

}
