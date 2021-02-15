package lmsaiservicecall.model;

import java.io.Serializable;

public class ModelReq implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2065417391286706519L;
	private String RequestId;//NOSONAR
	private String RequestType;//NOSONAR
	private String ImageName;//NOSONAR
	private String ImageType;//NOSONAR
	private String UploadSignedURL;//NOSONAR
	private String DownloadSignedURL;//NOSONAR
	/**
	 * @return the denoiseRequestId
	 */
	public String getRequestId() {
		return RequestId;
	}
	/**
	 * @param denoiseRequestId the denoiseRequestId to set
	 */
	public void setRequestId(String denoiseRequestId) {
		RequestId = denoiseRequestId;
	}
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return ImageName;
	}
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		ImageName = imageName;
	}
	/**
	 * @return the imageType
	 */
	public String getImageType() {
		return ImageType;
	}
	/**
	 * @param imageType the imageType to set
	 */
	public void setImageType(String imageType) {
		ImageType = imageType;
	}
	/**
	 * @return the uploadSignedURL
	 */
	public String getUploadSignedURL() {
		return UploadSignedURL;
	}
	/**
	 * @param uploadSignedURL the uploadSignedURL to set
	 */
	public void setUploadSignedURL(String uploadSignedURL) {
		UploadSignedURL = uploadSignedURL;
	}
	/**
	 * @return the downloadSignedURL
	 */
	public String getDownloadSignedURL() {
		return DownloadSignedURL;
	}
	/**
	 * @param downloadSignedURL the downloadSignedURL to set
	 */
	public void setDownloadSignedURL(String downloadSignedURL) {
		DownloadSignedURL = downloadSignedURL;
	}
	public String getRequestType() {
		return RequestType;
	}
	public void setRequestType(String requestType) {
		RequestType = requestType;
	}
	@Override
	public String toString() {
		return "ModelReq [RequestId=" + RequestId + ", RequestType=" + RequestType + ", ImageName=" + ImageName
				+ ", ImageType=" + ImageType + ", UploadSignedURL=" + UploadSignedURL + ", DownloadSignedURL="
				+ DownloadSignedURL + "]";
	}

}
