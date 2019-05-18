package fi.haagahelia.exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.exercise.domain.Student;

@Controller
public class StudentController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String greeting(Model model)
	{
		Student student1 = new Student("Meo", "Hoang");
		Student student2 = new Student("Meo", "Luoi");
		Student student3 = new Student("Meo", "Hu");
		Student[] students = {student1, student2, student3};
		model.addAttribute("students", students);
		return "student";
	}
}
