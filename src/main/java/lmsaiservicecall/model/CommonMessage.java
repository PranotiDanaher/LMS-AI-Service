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
public class CommonMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String TimeStamp;//NOSONAR
	private String TrackingID;//NOSONAR
	private String ErrorCode;//NOSONAR
	private String ErrorMessage;//NOSONAR


	public String getTimeStamp() {
		return TimeStamp;
	}

	public String getTrackingID() {
		return TrackingID;
	}

	public String getErrorCode() {
		return ErrorCode;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}


	public void setTimeStamp(String TimeStamp) {//NOSONAR
		this.TimeStamp = TimeStamp;
	}

	public void setTrackingID(String TrackingID) {//NOSONAR
		this.TrackingID = TrackingID;
	}

	public void setErrorCode(String ErrorCode) {//NOSONAR
		this.ErrorCode = ErrorCode;
	}

	public void setErrorMessage(String ErrorMessage) {//NOSONAR
		this.ErrorMessage = ErrorMessage;
	}

	@Override
	public String toString() {
		return "CommonMessage [TimeStamp=" + TimeStamp + ", TrackingID=" + TrackingID + ", ErrorCode=" + ErrorCode
				+ ", ErrorMessage=" + ErrorMessage + "]";
	}

	
}
