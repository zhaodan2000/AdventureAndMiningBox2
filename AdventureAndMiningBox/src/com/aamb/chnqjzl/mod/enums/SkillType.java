package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.engine.IPlayer;
import com.aamb.chnqjzl.util.EnumManager;

/**
 * 技能类型
 * 
 * @author 51xiaodou
 */
public enum SkillType {
	/**
	 * 高伤
	 */
	HighDamage {
		@Override
		public Integer getDamage(IPlayer self, IPlayer enemy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean touchSkill() {
			return true;
		}
	},
	/**
	 * 暴击
	 */
	Critical {
		@Override
		public Integer getDamage(IPlayer self, IPlayer enemy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean touchSkill() {
			return true;
		}
	},
	/**
	 * 恢复
	 */
	Recovery {
		@Override
		public Integer getDamage(IPlayer self, IPlayer enemy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean touchSkill() {
			return true;
		}
	},
	/**
	 * 纯粹
	 */
	Pure {
		@Override
		public Integer getDamage(IPlayer self, IPlayer enemy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean touchSkill() {
			return true;
		}
	},
	/**
	 * 属性
	 */
	Attribute {
		@Override
		public Integer getDamage(IPlayer self, IPlayer enemy) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean touchSkill() {
			return false;
		}
	};
	SkillType() {
		EnumManager.regist(this);
	}

	public abstract boolean touchSkill();

	public abstract Integer getDamage(IPlayer self, IPlayer enemy);
}