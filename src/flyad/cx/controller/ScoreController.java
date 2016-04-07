package flyad.cx.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import flyad.cx.entity.User;
import flyad.cx.service.UserService;
import flyad.cx.vo.ResultInfo;
/**
 * 
 * @author chengxiang
 *
 */
@Controller
@RequestMapping(value = "/score")
public class ScoreController {

	private static Logger logger = Logger.getLogger(ScoreController.class);
	
	public void add(){
		
	}


}
