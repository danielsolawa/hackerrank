package com.danielsolawa.solutions;

import java.util.*;




public class PriorityQueueChallenge {
	  private final static Scanner scan = new Scanner(System.in);
	  private final static Priorities priorities = new Priorities();
	    
	    public static void main(String[] args) {
	        int totalEvents = Integer.parseInt(scan.nextLine());    
	        List<String> events = new ArrayList<>();
	        
	        while (totalEvents-- != 0) {
	            String event = scan.nextLine();
	            events.add(event);
	        }
	        
	        List<Student> students = priorities.getStudents(events);
	        
	        if (students.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Student st: students) {
	                System.out.println(st.getName());
	            }
	        }
	    }
}






class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
        
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    
	@Override
	public int compareTo(Student o2) {
		int cgpaResult = Double.compare(o2.getCgpa(), cgpa);
		
		if(cgpaResult != 0)
			return cgpaResult;
		
		int nameResult = name.compareTo(o2.getName());
		
		if(nameResult != 0)
			return nameResult;
		
		return Integer.compare(o2.getId(), id);

	}
    
	/*
	 * getters & setters
	 */
    public int getId(){
        return id;
        
    }
    
    public String getName(){
        return name;
    }
    
    public double getCgpa(){
        return cgpa;
    }
    
    @Override
	public String toString() {
		return name;
	}



}



class Priorities implements Comparator<Student>{
	   List<Student> getStudents(List<String> events){
	        Queue<Student> qu = new PriorityQueue<>();
	        for(String s : events) {
	        	if(s.contains("ENTER")) {
	        		String[] arr = s.replaceAll("ENTER", "").trim().split("\\s+");
	        		Student st = new Student(Integer.parseInt(arr[2]), arr[0], Double.parseDouble(arr[1]));
	        		qu.add(st);
	        	}else
	        		qu.poll();
	        }
	        List<Student> list = new ArrayList<>(qu);
	        list.sort(this);
	        return list;
	    }

	@Override
	public int compare(Student o1, Student o2) {
		int cgpaResult = Double.compare(o2.getCgpa(), o1.getCgpa());
		
		if(cgpaResult != 0)
			return cgpaResult;
		
		int nameResult = o1.getName().compareTo(o2.getName());
		
		if(nameResult != 0)
			return nameResult;
		
		return Integer.compare(o2.getId(), o1.getId());
	}


}