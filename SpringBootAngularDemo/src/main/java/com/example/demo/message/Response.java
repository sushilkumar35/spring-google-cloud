/**
 * 
 */
package com.example.demo.message;

/**
 * @author EX_SKumar
 *
 */
public class Response {
	/**
	 * @param status
	 * @param data
	 */
	private String status;
	private Object data;
		
	/**
	 * 
	 */
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Response(String status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
}
