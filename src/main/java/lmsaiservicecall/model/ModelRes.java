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
public class ModelRes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4796242726118733266L;
	private String RequestId;//NOSONAR
	private String Metadata;//NOSONAR
	private String RequestType;//NOSONAR
	private String ImageName;//NOSONAR
	private String ImageType;//NOSONAR
	private int Status;//NOSONAR
	private String Attributes;//NOSONAR


	public String getMetadata() {
		return Metadata;
	}

	public void setMetadata(String metadata) {
		Metadata = metadata;
	}

	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	public String getAttributes() {
		return Attributes;
	}

	public void setAttributes(String attributes) {
		Attributes = attributes;
	}

	public String getRequestId() {
		return RequestId;
	}

	public String getImageName() {
		return ImageName;
	}

	public String getImageType() {
		return ImageType;
	}

	public int getStatus() {
		return Status;
	}

	public void setRequestId(String RequestId) {//NOSONAR
		this.RequestId = RequestId;
	}

	public void setImageName(String ImageName) {//NOSONAR
		this.ImageName = ImageName;
	}

	public void setImageType(String ImageType) {//NOSONAR
		this.ImageType = ImageType;
	}

	public void setStatus(int Status) {//NOSONAR
		this.Status = Status;
	}

	

	
}
