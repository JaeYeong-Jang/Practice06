package com.javaex.ex03;

public class Shape {
	
	//fields
	protected String fillColor;
	protected String lineColor;
	
	//constructors
	public Shape() {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	
	}
	
	// method g/s
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//method
	
	
}

