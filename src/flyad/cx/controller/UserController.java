package flyad.cx.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import flyad.cx.entity.User;
import flyad.cx.service.UserService;
import flyad.cx.util.MyJson;
import flyad.cx.vo.ResultInfo;
/**
 * 
 * @author chengxiang
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

	private UserService userService;
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	/**
	 * 用户参加活动
	 * @param yebId		余额宝用户唯一标识
	 * @param yebName	余额宝用户昵称
	 * @return
	 */
	@RequestMapping("/regist")
	public @ResponseBody String addUser(
			@RequestParam(value="yebId",defaultValue="default")String yebId,
			@RequestParam(value="yebName",defaultValue="default")String yebName
			){
		logger.info("ENTER:[user/add] PARAMETERS:{yebId:"+yebId+",yebName:"+yebName+"}");
		ResultInfo resultInfo = new ResultInfo();
		User user = new User();
		user.setYebId(yebId);
		user.setYebName(yebName);
		resultInfo = userService.regist(user);
		String resultStr = MyJson.toJson(resultInfo);
		logger.info("ENTER:[user/add] PARAMETERS"+resultStr);
		return resultStr;
	}
	
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



}
