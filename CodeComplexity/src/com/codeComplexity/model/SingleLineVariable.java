package com.codeComplexity.model;

public class SingleLineVariable {
	private int lineNumber;
	private String statement;
	private int cv; //complexity
	private int wvs; //weight due to scope (Global: 2, Local: 1)
	private int wpdtv; //weight of primitive data types: 1
	private int npdtv; //no of primitive data types
	private int wcdtv; //weight of composite data types: 2
	private int ncdtv; //no of composite data types
	public SingleLineVariable() {
		this.wpdtv = 1;
		this.wcdtv = 2;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public int getWvs() {
		return wvs;
	}
	public void setWvs(int wvs) {
		this.wvs = wvs;
	}
	public int getWpdtv() {
		return wpdtv;
	}
	public void setWpdtv(int wpdtv) {
		this.wpdtv = wpdtv;
	}
	public int getNpdtv() {
		return npdtv;
	}
	public void setNpdtv(int npdtv) {
		this.npdtv = npdtv;
	}
	public int getWcdtv() {
		return wcdtv;
	}
	public void setWcdtv(int wcdtv) {
		this.wcdtv = wcdtv;
	}
	public int getNcdtv() {
		return ncdtv;
	}
	public void setNcdtv(int ncdtv) {
		this.ncdtv = ncdtv;
	}
	public void calculateCV() {
		this.cv = this.wvs * ((this.wpdtv * this.npdtv) + (this.wcdtv * this.ncdtv));
	}
	@Override
	public String toString() {
		return "SingleLineVariable [lineNumber=" + lineNumber + ", statement=" + statement + ", cv=" + cv + ", wvs="
				+ wvs + ", wpdtv=" + wpdtv + ", npdtv=" + npdtv + ", wcdtv=" + wcdtv + ", ncdtv=" + ncdtv + "]";
	}
}
