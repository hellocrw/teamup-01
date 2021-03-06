package crw.bishe.teamup01.service.impl;

import crw.bishe.teamup01.service.StudentInfoServe;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class StudentInfoServiceImpl implements StudentInfoServe {
    @Override
    public void doLogin(String username, String password) {
        log.info("StudentInfoService doLogin...");
    }
}
