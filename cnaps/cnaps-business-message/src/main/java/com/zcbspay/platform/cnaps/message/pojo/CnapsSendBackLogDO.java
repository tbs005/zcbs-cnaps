package com.zcbspay.platform.cnaps.message.pojo;
// default package
// Generated 2017-3-3 11:03:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCnapsSendBackLog generated by hbm2java
 */
@Entity
@Table(name = "T_CNAPS_SEND_BACK_LOG")
public class CnapsSendBackLogDO implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6684929554653938183L;
	private long tid;
	private String msgid;
	private String orgnlmsgid;
	private String orgnlmsgnmid;
	private String orgninstructingindirectparty;
	private String addtlinf;
	private String orgnltxid;
	private String orgnlinstructingdirectparty;
	private String orgnlinstructingparty;
	private String orgnlinstructeddirectparty;
	private String orgnlinstructedparty;
	private String proprietary;
	private String comprocessstatus;
	private String comprocesscode;
	private String compartyidentification;
	private String compartyprocesscode;
	private String comrejectinformation;
	private String comprocessdate;
	private String comnettinground;
	private String comdate;
	private String reOrgnlmsgid;
	private String reOrgnlmsgnmid;
	private String reAddtlinf1;
	private String reAddtlinf2;
	private String reAddtlinf3;
	private String notes;
	private String remarks;

	public CnapsSendBackLogDO() {
	}

	public CnapsSendBackLogDO(long tid) {
		this.tid = tid;
	}

	public CnapsSendBackLogDO(long tid, String msgid, String orgnlmsgid,
			String orgnlmsgnmid, String orgninstructingindirectparty,
			String addtlinf, String orgnltxid,
			String orgnlinstructingdirectparty, String orgnlinstructingparty,
			String orgnlinstructeddirectparty, String orgnlinstructedparty,
			String proprietary, String comprocessstatus, String comprocesscode,
			String compartyidentification, String compartyprocesscode,
			String comrejectinformation, String comprocessdate,
			String comnettinground, String comdate, String reOrgnlmsgid,
			String reOrgnlmsgnmid, String reAddtlinf1, String reAddtlinf2,
			String reAddtlinf3, String notes, String remarks) {
		this.tid = tid;
		this.msgid = msgid;
		this.orgnlmsgid = orgnlmsgid;
		this.orgnlmsgnmid = orgnlmsgnmid;
		this.orgninstructingindirectparty = orgninstructingindirectparty;
		this.addtlinf = addtlinf;
		this.orgnltxid = orgnltxid;
		this.orgnlinstructingdirectparty = orgnlinstructingdirectparty;
		this.orgnlinstructingparty = orgnlinstructingparty;
		this.orgnlinstructeddirectparty = orgnlinstructeddirectparty;
		this.orgnlinstructedparty = orgnlinstructedparty;
		this.proprietary = proprietary;
		this.comprocessstatus = comprocessstatus;
		this.comprocesscode = comprocesscode;
		this.compartyidentification = compartyidentification;
		this.compartyprocesscode = compartyprocesscode;
		this.comrejectinformation = comrejectinformation;
		this.comprocessdate = comprocessdate;
		this.comnettinground = comnettinground;
		this.comdate = comdate;
		this.reOrgnlmsgid = reOrgnlmsgid;
		this.reOrgnlmsgnmid = reOrgnlmsgnmid;
		this.reAddtlinf1 = reAddtlinf1;
		this.reAddtlinf2 = reAddtlinf2;
		this.reAddtlinf3 = reAddtlinf3;
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

	@Column(name = "MSGID", length = 35)
	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	@Column(name = "ORGNLMSGID", length = 35)
	public String getOrgnlmsgid() {
		return this.orgnlmsgid;
	}

	public void setOrgnlmsgid(String orgnlmsgid) {
		this.orgnlmsgid = orgnlmsgid;
	}

	@Column(name = "ORGNLMSGNMID", length = 35)
	public String getOrgnlmsgnmid() {
		return this.orgnlmsgnmid;
	}

	public void setOrgnlmsgnmid(String orgnlmsgnmid) {
		this.orgnlmsgnmid = orgnlmsgnmid;
	}

	@Column(name = "ORGNINSTRUCTINGINDIRECTPARTY", length = 14)
	public String getOrgninstructingindirectparty() {
		return this.orgninstructingindirectparty;
	}

	public void setOrgninstructingindirectparty(
			String orgninstructingindirectparty) {
		this.orgninstructingindirectparty = orgninstructingindirectparty;
	}

	@Column(name = "ADDTLINF", length = 2)
	public String getAddtlinf() {
		return this.addtlinf;
	}

	public void setAddtlinf(String addtlinf) {
		this.addtlinf = addtlinf;
	}

	@Column(name = "ORGNLTXID", length = 2)
	public String getOrgnltxid() {
		return this.orgnltxid;
	}

	public void setOrgnltxid(String orgnltxid) {
		this.orgnltxid = orgnltxid;
	}

	@Column(name = "ORGNLINSTRUCTINGDIRECTPARTY", length = 14)
	public String getOrgnlinstructingdirectparty() {
		return this.orgnlinstructingdirectparty;
	}

	public void setOrgnlinstructingdirectparty(
			String orgnlinstructingdirectparty) {
		this.orgnlinstructingdirectparty = orgnlinstructingdirectparty;
	}

	@Column(name = "ORGNLINSTRUCTINGPARTY", length = 14)
	public String getOrgnlinstructingparty() {
		return this.orgnlinstructingparty;
	}

	public void setOrgnlinstructingparty(String orgnlinstructingparty) {
		this.orgnlinstructingparty = orgnlinstructingparty;
	}

	@Column(name = "ORGNLINSTRUCTEDDIRECTPARTY", length = 14)
	public String getOrgnlinstructeddirectparty() {
		return this.orgnlinstructeddirectparty;
	}

	public void setOrgnlinstructeddirectparty(String orgnlinstructeddirectparty) {
		this.orgnlinstructeddirectparty = orgnlinstructeddirectparty;
	}

	@Column(name = "ORGNLINSTRUCTEDPARTY", length = 14)
	public String getOrgnlinstructedparty() {
		return this.orgnlinstructedparty;
	}

	public void setOrgnlinstructedparty(String orgnlinstructedparty) {
		this.orgnlinstructedparty = orgnlinstructedparty;
	}

	@Column(name = "PROPRIETARY", length = 4)
	public String getProprietary() {
		return this.proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
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

	@Column(name = "RE_ORGNLMSGID", length = 35)
	public String getReOrgnlmsgid() {
		return this.reOrgnlmsgid;
	}

	public void setReOrgnlmsgid(String reOrgnlmsgid) {
		this.reOrgnlmsgid = reOrgnlmsgid;
	}

	@Column(name = "RE_ORGNLMSGNMID", length = 14)
	public String getReOrgnlmsgnmid() {
		return this.reOrgnlmsgnmid;
	}

	public void setReOrgnlmsgnmid(String reOrgnlmsgnmid) {
		this.reOrgnlmsgnmid = reOrgnlmsgnmid;
	}

	@Column(name = "RE_ADDTLINF1", length = 4)
	public String getReAddtlinf1() {
		return this.reAddtlinf1;
	}

	public void setReAddtlinf1(String reAddtlinf1) {
		this.reAddtlinf1 = reAddtlinf1;
	}

	@Column(name = "RE_ADDTLINF2", length = 4)
	public String getReAddtlinf2() {
		return this.reAddtlinf2;
	}

	public void setReAddtlinf2(String reAddtlinf2) {
		this.reAddtlinf2 = reAddtlinf2;
	}

	@Column(name = "RE_ADDTLINF3", length = 200)
	public String getReAddtlinf3() {
		return this.reAddtlinf3;
	}

	public void setReAddtlinf3(String reAddtlinf3) {
		this.reAddtlinf3 = reAddtlinf3;
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
