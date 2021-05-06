package com.example;

import java.lang.management.ManagementFactory;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class Main {
	public static void main(String[] args) throws Exception {
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName mbeanName = new ObjectName("com.example:type=Hello");
		Hello mbean = new Hello();
		mbs.registerMBean(mbean, mbeanName);
		
		ObjectName mxbeanName = new ObjectName("com.example:type=QueueSampler");
		Queue<String> queue = new ArrayBlockingQueue<String>(10);
		queue.add("Request-1");
		queue.add("Request-2");
		queue.add("Request-3");
		
		QueueSampler mxbean = new QueueSampler(queue);
		mbs.registerMBean(mxbean, mxbeanName);
		System.out.println("Waiting for incoming requests...");
		Thread.sleep(Long.MAX_VALUE);
	}
}
