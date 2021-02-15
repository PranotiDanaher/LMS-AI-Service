package lmsaiservicecall.model;

import java.io.Serializable;

public class AIModelRequest implements Serializable{

	private static final long serialVersionUID = 3421902801718894197L;

	private ModelReq ModelReq;//NOSONAR

	public ModelReq getModelReq() { return ModelReq; }

	public void setModelReq(ModelReq ModelReq) { this.ModelReq = ModelReq; }//NOSONAR


}
