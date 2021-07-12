package com.mss.app.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.aspectj.weaver.tools.cache.AsynchronousFileCacheBacking.RemoveCommand;

public class Demo {

	public static void main(String[] args) {
		new Demo().removeAValue("remove");
	}

	public ArrayList<String> removeAValue(String value) {
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList("One", "Two", "Three", "Four", "Five"));
		al.remove(value);

		return al;
	}
}
