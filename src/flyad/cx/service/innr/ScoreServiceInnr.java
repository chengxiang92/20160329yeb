package flyad.cx.service.innr;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import flyad.cx.controller.UserController;
import flyad.cx.entity.Score;
import flyad.cx.mapper.ScoreMapper;
import flyad.cx.vo.ResultInfo;

@Service
public class ScoreServiceInnr {
	
	private ScoreMapper scoreMapper;
	
	private static Logger logger = Logger.getLogger(UserController.class);

	public Boolean addScore(Score score){
		try{
			scoreMapper.addScore(score);
			return true;
		}catch(Exception e){
			logger.error("FAILED:[addScore] EXCEPTION:"+e.toString());
			return false;
		}
	}

	@Resource
	public void setScoreMapper(ScoreMapper scoreMapper) {
		this.scoreMapper = scoreMapper;
	}
	
}
