package com.aamb.chnqjzl.mod.enums;

import com.aamb.chnqjzl.util.EnumManager;

/**
 * 比较条件
 * 
 * @author 51xiaodou
 * 
 */
public enum Scope {

	/**
	 * 大于
	 * 
	 * @author 51xiaodou
	 * 
	 */
	GT {
		@Override
		public <T extends Comparable<T>> boolean compare(T t1, T t2) {
			return t1.compareTo(t2) > 0;
		}
	},
	/**
	 * 大于等于
	 * 
	 * @author 51xiaodou
	 * 
	 */
	GE {
		@Override
		public <T extends Comparable<T>> boolean compare(T t1, T t2) {
			return t1.compareTo(t2) >= 0;
		}
	},
	/**
	 * 等于
	 * 
	 * @author 51xiaodou
	 * 
	 */
	EQ {
		@Override
		public <T extends Comparable<T>> boolean compare(T t1, T t2) {
			return t1.compareTo(t2) == 0;
		}
	},
	/**
	 * 小于等于
	 * 
	 * @author 51xiaodou
	 * 
	 */
	LE {
		@Override
		public <T extends Comparable<T>> boolean compare(T t1, T t2) {
			return t1.compareTo(t2) <= 0;
		}
	},
	/**
	 * 小于
	 * 
	 * @author 51xiaodou
	 * 
	 */
	LT {
		@Override
		public <T extends Comparable<T>> boolean compare(T t1, T t2) {
			return t1.compareTo(t2) < 0;
		}
	};
	public abstract <T extends Comparable<T>> boolean compare(T t1, T t2);

	Scope() {
		EnumManager.regist(this);
	}

}
