package Academy.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Academy.demo.entity.Academic;
import Academy.demo.repository.AcademicRepository;

@Service
public class AcademicService {
	
	@Autowired
	private AcademicRepository academicRepository;

	public void saveAcademic(Academic academic) {
		academic.setCreatedDate(getTodayDateAsString());
		academicRepository.save(academic);
	
	}
	public Optional<Academic> getAcademic(Long id) { 
		return academicRepository.findById(id);
	
	}
	private String getTodayDateAsString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

}
