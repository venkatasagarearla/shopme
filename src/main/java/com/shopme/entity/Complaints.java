package com.shopme.entity;

public class Complaints {
	private int complaintId;
	private int orderId;
	private String buyerName;
	private String registerComplaint;
	private  String buyerEmail;
	private boolean complaintStatus;
	
	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Complaints(int complaintId, int orderId, String buyerName, String registerComplaint, String buyerEmail,
			boolean complaintStatus) {
		super();
		this.complaintId = complaintId;
		this.orderId = orderId;
		this.buyerName = buyerName;
		this.registerComplaint = registerComplaint;
		this.buyerEmail = buyerEmail;
		this.complaintStatus = complaintStatus;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getRegisterComplaint() {
		return registerComplaint;
	}
	public void setRegisterComplaint(String registerComplaint) {
		this.registerComplaint = registerComplaint;
	}
	public boolean isComplaintStatus() {
		return complaintStatus;
	}
	public void setComplaintStatus(boolean complaintStatus) {
		this.complaintStatus = complaintStatus;
	}
	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", orderId=" + orderId + ", buyerName=" + buyerName
				+ ", registerComplaint=" + registerComplaint + ", complaintStatus=" + complaintStatus + "]";
	}

}
