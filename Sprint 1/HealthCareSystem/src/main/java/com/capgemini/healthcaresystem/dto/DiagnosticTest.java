package com.capgemini.healthcaresystem.dto;

public class DiagnosticTest {
	private String testId;
	private String testName;

	public String getTestId() {
		return testId;
	}

	public String getTestName() {
		return testName;
	}

	public DiagnosticTest(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
}
