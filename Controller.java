package Sem2.Homework;

import java.util.logging.Logger;

public class Controller {
	public static void getGroup(){
		String pathFile1 = "Sem2/Homework/group001.txt";
		String pathFile2 = "Sem2/Homework/group002.txt";
		Logger logger = Logger.getAnonymousLogger();
		logger.info(LearningGroupService.readGroup(pathFile1).toString());
		logger.info(LearningGroupService.readGroup(pathFile2).toString());
	}
}
