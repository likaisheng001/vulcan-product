package com.vulcan.product.core.effectiveJava;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MutablePeriod {
	
	public final Period period;
	
	public final Date start;
	public final Date end;
	public MutablePeriod() {
		try{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			out.writeObject(new Period(new Date(), new Date()));
			
			byte[] ref = {0x71, 0, 0x7e, 0, 5};
			bos.write(ref);
			ref[4] = 4;
			bos.write(ref);
			
			ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
			period = (Period) in.readObject();
			start = (Date)in.readObject();
			end = (Date)in.readObject();
		}catch(Exception e){
			throw new AssertionError(e);
		}
	}
	
	public static void main(String[] args) {
		MutablePeriod mp = new MutablePeriod();
		Period p = mp.period;
		Date pEnd = mp.end;
		pEnd.setYear(78);
		System.out.println(p);
		
		pEnd.setYear(69);
		System.out.println(p);
	}
}
