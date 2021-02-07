package com.aman.beans;

import java.util.Arrays;

public class ShoeFactory {
	
	private float[] sizes;
	
	
	//It is Optional So Setter Injection
	public void setSizes(float[] sizes) {
		this.sizes = sizes;
	}

	@Override
	public String toString() {
		return "ShoeFactory [sizes=" + Arrays.toString(sizes) + "]";
	}
	
	

}
