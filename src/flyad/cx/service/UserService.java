package flyad.cx.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import flyad.cx.controller.UserController;
import flyad.cx.entity.Score;
import flyad.cx.entity.User;
import flyad.cx.service.innr.ScoreServiceInnr;
import flyad.cx.service.innr.UserServiceInnr;
import flyad.cx.vo.ResultInfo;

@Service
public class UserService {
	
	private UserServiceInnr userServiceInnr;
	
	private ScoreServiceInnr scoreServiceInnr;
	
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
	
	private static SimpleDateFormat simpleDateFormatFull = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	
	private static Logger logger = Logger.getLogger(UserController.class);

	public ResultInfo regist(User user){
		Date createDate = new Date();
		Score score = new Score(simpleDateFormat.format(createDate));
		scoreServiceInnr.addScore(score);
		user.setScoreId(score.getId());
		user.setScore(score);
		user.setCreateDate(simpleDateFormatFull.format(createDate));
		if(userServiceInnr.addUser(user)){
			return new ResultInfo("1", "addUser SUCCESS!", user);
		}else{
			return new ResultInfo("0", "addUser FAILED!", user);
		}
	}

	@Resource
	public void setUserServiceInnr(UserServiceInnr userServiceInnr) {
		this.userServiceInnr = userServiceInnr;
	}

	@Resource
	public void setScoreServiceInnr(ScoreServiceInnr scoreServiceInnr) {
		this.scoreServiceInnr = scoreServiceInnr;
	}
	
	
}
