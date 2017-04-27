package com.aurea.antipatterns.primitiveobsession;

public class BaseCase {
	
	class InnerDTO {
		
		class ChildDTO {
			private int A;
			public int getA() {
				return a;
			}
			public void setA(int a) {
				this.a = a;
			}
		}
		
		private int a;
		private int b;
		private long c;
		private int[] d;
		private int e;
		private int f;
		private float g;
		private int h;
		private int i;
		private int[] j;
		private int k;
		private int l;
		private int m;
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getE() {
			return e;
		}
		public void setE(int e) {
			this.e = e;
		}
		public int getF() {
			return f;
		}
		public void setF(int f) {
			this.f = f;
		}
		public float getG() {
			return g;
		}
		public void setG(float g) {
			this.g = g;
		}
		public int getH() {
			return h;
		}
		public void setH(int h) {
			this.h = h;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public int[] getJ() {
			return j;
		}
		public void setJ(int[] j) {
			this.j = j;
		}
		public int getK() {
			return k;
		}
		public void setK(int k) {
			this.k = k;
		}
		public int getL() {
			return l;
		}
		public void setL(int l) {
			this.l = l;
		}
		public int getM() {
			return m;
		}
		public void setM(int m) {
			this.m = m;
		}
		public long getC() {
			return c;
		}
		public void setC(long c) {
			this.c = c;
		}
		public int[] getD() {
			return d;
		}
		public void setD(int[] d) {
			this.d = d;
		}
	}
	
	
	private int a;
	private int b;
	private long c;
	private int[] d;
	private int e;
	private int f;
	private float g;
	private int h;
	private int i;
	private int[] j;
	private int k;
	private int l;
	private int m;
	private int unused;
	
	private static final int CONST_VALUE = 1;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public float getG() {
		return g;
	}
	public void setG(float g) {
		this.g = g;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int[] getJ() {
		return j;
	}
	public void setJ(int[] j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public long getC() {
		return c;
	}
	public void setC(long c) {
		this.c = c;
	}
	public int[] getD() {
		return d;
	}
	public void setD(int[] d) {
		this.d = d;
	}
	
	public void doSomething(){
		a = b + e + CONST_VALUE;
	}
	
}
