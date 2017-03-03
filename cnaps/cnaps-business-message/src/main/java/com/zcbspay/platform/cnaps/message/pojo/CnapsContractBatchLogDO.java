package com.zcbspay.platform.cnaps.message.pojo;
// default package
// Generated 2017-3-3 11:03:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCnapsContractBatchLog generated by hbm2java
 */
@Entity
@Table(name = "T_CNAPS_CONTRACT_BATCH_LOG")
public class CnapsContractBatchLogDO implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8106062332664705764L;
	private long tid;
	private String msgid;
	private String operationtype;
	private String contractagreementtype;
	private int numberofagreement;
	private String comprocessstatus;
	private String comprocesscode;
	private String compartyidentification;
	private String compartyprocesscode;
	private String comrejectinformation;
	private String comprocessdate;
	private String comnettinground;
	private String comdate;
	private String notes;
	private String remarks;

	public CnapsContractBatchLogDO() {
	}

	public CnapsContractBatchLogDO(long tid, String msgid, String operationtype,
			String contractagreementtype, int numberofagreement) {
		this.tid = tid;
		this.msgid = msgid;
		this.operationtype = operationtype;
		this.contractagreementtype = contractagreementtype;
		this.numberofagreement = numberofagreement;
	}

	public CnapsContractBatchLogDO(long tid, String msgid, String operationtype,
			String contractagreementtype, int numberofagreement,
			String comprocessstatus, String comprocesscode,
			String compartyidentification, String compartyprocesscode,
			String comrejectinformation, String comprocessdate,
			String comnettinground, String comdate, String notes, String remarks) {
		this.tid = tid;
		this.msgid = msgid;
		this.operationtype = operationtype;
		this.contractagreementtype = contractagreementtype;
		this.numberofagreement = numberofagreement;
		this.comprocessstatus = comprocessstatus;
		this.comprocesscode = comprocesscode;
		this.compartyidentification = compartyidentification;
		this.compartyprocesscode = compartyprocesscode;
		this.comrejectinformation = comrejectinformation;
		this.comprocessdate = comprocessdate;
		this.comnettinground = comnettinground;
		this.comdate = comdate;
		this.notes = notes;
		this.remarks = remarks;
	}

	@Id
	@Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	@Column(name = "MSGID", nullable = false, length = 35)
	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	@Column(name = "OPERATIONTYPE", nullable = false, length = 4)
	public String getOperationtype() {
		return this.operationtype;
	}

	public void setOperationtype(String operationtype) {
		this.operationtype = operationtype;
	}

	@Column(name = "CONTRACTAGREEMENTTYPE", nullable = false, length = 4)
	public String getContractagreementtype() {
		return this.contractagreementtype;
	}

	public void setContractagreementtype(String contractagreementtype) {
		this.contractagreementtype = contractagreementtype;
	}

	@Column(name = "NUMBEROFAGREEMENT", nullable = false, precision = 8, scale = 0)
	public int getNumberofagreement() {
		return this.numberofagreement;
	}

	public void setNumberofagreement(int numberofagreement) {
		this.numberofagreement = numberofagreement;
	}

	@Column(name = "COMPROCESSSTATUS", length = 4)
	public String getComprocessstatus() {
		return this.comprocessstatus;
	}

	public void setComprocessstatus(String comprocessstatus) {
		this.comprocessstatus = comprocessstatus;
	}

	@Column(name = "COMPROCESSCODE", length = 8)
	public String getComprocesscode() {
		return this.comprocesscode;
	}

	public void setComprocesscode(String comprocesscode) {
		this.comprocesscode = comprocesscode;
	}

	@Column(name = "COMPARTYIDENTIFICATION", length = 14)
	public String getCompartyidentification() {
		return this.compartyidentification;
	}

	public void setCompartyidentification(String compartyidentification) {
		this.compartyidentification = compartyidentification;
	}

	@Column(name = "COMPARTYPROCESSCODE", length = 4)
	public String getCompartyprocesscode() {
		return this.compartyprocesscode;
	}

	public void setCompartyprocesscode(String compartyprocesscode) {
		this.compartyprocesscode = compartyprocesscode;
	}

	@Column(name = "COMREJECTINFORMATION", length = 210)
	public String getComrejectinformation() {
		return this.comrejectinformation;
	}

	public void setComrejectinformation(String comrejectinformation) {
		this.comrejectinformation = comrejectinformation;
	}

	@Column(name = "COMPROCESSDATE", length = 14)
	public String getComprocessdate() {
		return this.comprocessdate;
	}

	public void setComprocessdate(String comprocessdate) {
		this.comprocessdate = comprocessdate;
	}

	@Column(name = "COMNETTINGROUND", length = 2)
	public String getComnettinground() {
		return this.comnettinground;
	}

	public void setComnettinground(String comnettinground) {
		this.comnettinground = comnettinground;
	}

	@Column(name = "COMDATE", length = 14)
	public String getComdate() {
		return this.comdate;
	}

	public void setComdate(String comdate) {
		this.comdate = comdate;
	}

	@Column(name = "NOTES", length = 256)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 256)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
