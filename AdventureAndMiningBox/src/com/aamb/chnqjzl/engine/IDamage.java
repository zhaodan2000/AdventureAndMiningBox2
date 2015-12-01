package com.aamb.chnqjzl.engine;

/**
 * 伤害计算抽象类
 * 
 * @author 51xiaodou
 * 
 */
public interface IDamage {

	/**
	 * 计算对玩家2造成的伤害值
	 * 
	 * @param player2
	 * @return
	 */
	public Integer getDamage(IPlayer player2);

}