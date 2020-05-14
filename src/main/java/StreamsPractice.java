import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import com.oneToManyBidirectionalmapping.Student;

public class StreamsPractice {
	
	public static void main(String[] args) {
		
		
		
		Student student1 = new Student("Shridha", "Jalihal", "ComputerScience");
		Student student2 = new Student("Shreya", "Jalihal", "Electronics");
		List<Student> liststudents=new ArrayList();
		liststudents.add(student1);
		liststudents.add(student2);
		Optional<Student> student=liststudents.stream()
		.filter(s->s.getFirstName().equals("Shridha")).findFirst();
		System.out.println(student.get());
		
		IntStream intstr= IntStream.of(1,34,5,11,35);
		long sum=intstr.filter(s->s>9).sum();
		System.out.println(sum);
		
	}

}
