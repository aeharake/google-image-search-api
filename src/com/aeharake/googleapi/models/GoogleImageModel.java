package com.aeharake.googleapi.models;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleImageModel {

	@SerializedName("cb")
	@Expose
	private Integer cb;
	@SerializedName("cl")
	@Expose
	private Integer cl;
	@SerializedName("cr")
	@Expose
	private Integer cr;
	@SerializedName("ct")
	@Expose
	private Integer ct;
	@SerializedName("dhl")
	@Expose
	private Integer dhl;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("isu")
	@Expose
	private String isu;
	@SerializedName("itg")
	@Expose
	private Integer itg;
	@SerializedName("ity")
	@Expose
	private String ity;
	@SerializedName("oh")
	@Expose
	private Integer oh;
	@SerializedName("ou")
	@Expose
	private String ou;
	@SerializedName("ow")
	@Expose
	private Integer ow;
	@SerializedName("pt")
	@Expose
	private String pt;
	@SerializedName("rh")
	@Expose
	private String rh;
	@SerializedName("rid")
	@Expose
	private String rid;
	@SerializedName("rt")
	@Expose
	private Integer rt;
	@SerializedName("ru")
	@Expose
	private String ru;
	@SerializedName("s")
	@Expose
	private String s;
	@SerializedName("st")
	@Expose
	private String st;
	@SerializedName("th")
	@Expose
	private Integer th;
	@SerializedName("tu")
	@Expose
	private String tu;
	@SerializedName("tw")
	@Expose
	private Integer tw;

	public Integer getCb() {
		return cb;
	}

	public void setCb(Integer cb) {
		this.cb = cb;
	}

	public Integer getCl() {
		return cl;
	}

	public void setCl(Integer cl) {
		this.cl = cl;
	}

	public Integer getCr() {
		return cr;
	}

	public void setCr(Integer cr) {
		this.cr = cr;
	}

	public Integer getCt() {
		return ct;
	}

	public void setCt(Integer ct) {
		this.ct = ct;
	}

	public Integer getDhl() {
		return dhl;
	}

	public void setDhl(Integer dhl) {
		this.dhl = dhl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsu() {
		return isu;
	}

	public void setIsu(String isu) {
		this.isu = isu;
	}

	public Integer getItg() {
		return itg;
	}

	public void setItg(Integer itg) {
		this.itg = itg;
	}

	public String getIty() {
		return ity;
	}

	public void setIty(String ity) {
		this.ity = ity;
	}

	public Integer getOh() {
		return oh;
	}

	public void setOh(Integer oh) {
		this.oh = oh;
	}

	public String getOu() {
		return ou;
	}

	public void setOu(String ou) {
		this.ou = ou;
	}

	public Integer getOw() {
		return ow;
	}

	public void setOw(Integer ow) {
		this.ow = ow;
	}

	public String getPt() {
		return pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public Integer getRt() {
		return rt;
	}

	public void setRt(Integer rt) {
		this.rt = rt;
	}

	public String getRu() {
		return ru;
	}

	public void setRu(String ru) {
		this.ru = ru;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public Integer getTh() {
		return th;
	}

	public void setTh(Integer th) {
		this.th = th;
	}

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public Integer getTw() {
		return tw;
	}

	public void setTw(Integer tw) {
		this.tw = tw;
	}

}
