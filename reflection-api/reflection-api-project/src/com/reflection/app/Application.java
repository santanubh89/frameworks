package com.reflection.app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

import com.reflection.app.util.CommonUtils;
import com.reflection.app.vo.Employee;

@SuppressWarnings("unused")
public class Application {
	
	private static String defaultString = "DefaultValue";
	private static int defaultInt = 30;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		instantiateClassMethod();
		analyzeClassConstructors();
		analyzeClassVariables();
		getSetObjectValuesUsingVariables();
		analyzeClassMethods();
		invokeClassMethods();
		analyzeClassAnnotations();
		callStaticMethod();
		callPrivateMethod();
	}

	private static void instantiateClassMethod() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Employee employee1 = Employee.class.newInstance();
		employee1.setEmployeeId("Emp1").setEmployeeName("Fname1 Lname1").setAge(30).setDesignation("Senior Developer").setAddress(new ArrayList<String>());
		System.out.println("Employee: " + employee1);
		Employee employee2 = (Employee) Class.forName("com.reflection.app.vo.Employee").newInstance();
		System.out.println("Employee: " + employee2);
	}

	private static void analyzeClassConstructors() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		Class<Employee> clazz = Employee.class;
		Object object = null;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			if (constructor.getParameterCount() > 0) {
				object = constructor.newInstance("Emp3", "Fname3 Lname3", 35, "Solution Architect", null);
			}
		}
		System.out.println(object);
	}
	
	private static void analyzeClassVariables() throws IllegalArgumentException, IllegalAccessException {
		Class<Employee> clazz = Employee.class;
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Field: "+field.getName()+" "+field.getType());
		}
	}
	
	private static void getSetObjectValuesUsingVariables() throws IllegalArgumentException, IllegalAccessException {
		Employee employee = new Employee();
		Class<? extends Employee> clazz = employee.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getType().equals(String.class)) {
				field.set(employee, defaultString);
			}
			if (field.getType().equals(int.class)) {
				field.setInt(employee, defaultInt);
			}
		}
		System.out.println("Employee: "+employee);
		for (Field field : fields) {
			System.out.println("Field: "+field.getName()+" :: Value: "+field.get(employee));
		}
	}
	
	private static void analyzeClassMethods() throws IllegalArgumentException, IllegalAccessException {
		Class<Employee> clazz = Employee.class;
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Method: "+method.getName()+" "+method.getReturnType());
		}
	}
	
	private static void invokeClassMethods() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Employee employee = new Employee();
		Class<? extends Employee> clazz = employee.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("set")) {
				Parameter[] parameters = method.getParameters();
				for (Parameter parameter : parameters) {
					if (parameter.getType().equals(String.class)) {
						method.invoke(employee, defaultString);
					}
					if (parameter.getType().equals(int.class)) {
						method.invoke(employee, defaultInt);
					}
				}
			}
		}
		System.out.println("Employee: "+employee);
	}
	
	private static void analyzeClassAnnotations() throws IllegalArgumentException, IllegalAccessException {
		Class<Employee> clazz = Employee.class;
		XmlRootElement xmlRoot = clazz.getAnnotation(XmlRootElement.class);
		System.out.println("XML Root Element: "+xmlRoot.name()+" "+xmlRoot.namespace());
		WebService webService = clazz.getAnnotation(WebService.class);
		System.out.println("Web Service: "+webService.portName()+" "+webService.serviceName());
	}
	
	private static void callStaticMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<CommonUtils> clazz = CommonUtils.class;
		Method getCurrentDay = clazz.getMethod("getCurrentDay");
		System.out.println(getCurrentDay.invoke(null));
		
		Method calculateSum = clazz.getMethod("calculateSum", int.class, Integer.class);
		System.out.println(calculateSum.invoke(null, 5, new Integer(10)));
	}
	
	private static void callPrivateMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<CommonUtils> clazz = CommonUtils.class;
		Method print = clazz.getDeclaredMethod("print", String.class);
		print.setAccessible(true);
		print.invoke(null, "This is a reflection test class!");
	}

}