package com.mapDemo.HashmapDemo;

import java.util.Objects;

public class Supplier {
	    private int supid;
	    private String sname;
	    private long mobileNo;
		public Supplier() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Supplier(int supid, String sname, long mobileNo) {
			super();
			this.supid = supid;
			this.sname = sname;
			this.mobileNo = mobileNo;
		}
		public int getSupid() {
			return supid;
		}
		public void setSupid(int supid) {
			this.supid = supid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(mobileNo, sname, supid);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Supplier other = (Supplier) obj;
			return mobileNo == other.mobileNo && Objects.equals(sname, other.sname) && supid == other.supid;
		}
		@Override
		public String toString() {
			return "Supplier [supid=" + supid + ", sname=" + sname + ", mobileNo=" + mobileNo + "]";
		}
	    
	    
	    
		
	}

