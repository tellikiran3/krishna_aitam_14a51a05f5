import java.util.Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.ArrayList;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		 
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
			throw new IllegalArgumentException();
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		 if(student==null)
			throw new IllegalArgumentException();
		if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
	
		 
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
	if(student==null)
			throw new IllegalArgumentException();
	
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	if(student==null)
			throw new IllegalArgumentException();
	

	
	
	}
	

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
			 if(student==null)
			throw new IllegalArgumentException();
		if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
	
	}

	@Override
	public void remove(int index) {
			if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
	
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>=students.length-1)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		Date lessDate=new Date (date.getTime()-86400000);
		List<Student> list= new ArrayList<>();
		for (int i=0;i<students.length;i++) {
			if(students[i].getBirthDate().equals(date) || students[i].getBirthDate().equals(lessDate)) {
				list.add(students[i]);
			}
		}
		int size=list.size();
		Student[] students=new Student[size];
		for(int i=0;i<size;i++)
			students[i]=list.get(i);
		
		return students;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		List<Student> list=new ArrayList<>();
		for(int i=0,size=students.length;i<size;i++) {
			if(students[i].getBirthDate().equals(firstDate)
			|| students[i].getBirthDate().equals(lastDate)) {
				list.add(students[i]);
			}
			else if(students[i].getBirthDate().after(firstDate)
				&& students[i].getBirthDate().before(lastDate)) {
					list.add(students[i]);
				}
		}
		// Add your implementation here
		int size=list.size();
		Student[] students=new Student[size];
		for(int i=0;i<size;i++)
			students[i]=list.get(i);
		
		return students;
	
		
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		LocalDateTime localDateTime=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		localDateTime=localDateTime.plusDays(days);
		Date daysAfterDate=Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		List<Student> list=new ArrayList<>();
		for(int i=0,size=students.length;i<size;i++) {
			if(students[i].getBirthDate().equals(date)) {
				list.add(students[i]);
			}else if(students[i].getBirthDate().after(date) && students[i].getBirthDate().before(daysAfterDate)) {
				list.add(students[i]);
			}
		}
		int size=list.size();
		Student[] students=new Student[size];
		for(int i=0;i<size;i++)
			students[i]=list.get(i);
		
		return students;
	
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		// Add your implementation here
		return null;
	}
}
