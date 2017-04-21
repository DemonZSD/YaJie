package com.cn.yajie.dao.provider;

import java.util.Map;
import static com.cn.yajie.util.common.JieYaConstants.USERTABLE;
import org.apache.ibatis.jdbc.SQL;

import com.cn.yajie.pojo.User;

public class UserDynaSqlProvider {
	
	/**
	 * 根据查询条件 模糊查询 所有用户列表
	 * @param params
	 * @return
	 */
	public String selectWithParam(final Map<String,Object> params){
		String sql = new SQL(){
			{
			
				SELECT("*");
				FROM(USERTABLE);
				if(params.get("user")!=null){
					User user = (User)params.get("user");
					//根据用户名 模糊查询
					if(user.getUsername()!=null && !("").equals(user.getUsername())){
						WHERE("  username LIKE CONCAT ('%',#{user.username},'%') ");
					}
					
					//根据手机号模糊查询
					if(user.getUmobile()!=null && !("").equals(user.getUmobile())){
						WHERE(" umobile LIKE CONCAT ('%',#{user.umobile},'%') ");//CONCAT 连接字符串
					}
				}
			}
		}.toString();
		
		if(params.get("pageModel") != null){
			sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize} ";
		}
		return sql;
	}
	
	
	public String countWithParams(final Map<String, Object> params){
		String sql = new SQL(){
			{
			
				SELECT("count(*)");
				FROM(USERTABLE);
				if(params.get("user")!=null){
					User user = (User)params.get("user");
					//根据用户名 模糊查询
					if(user.getUsername()!=null && !("").equals(user.getUsername())){
						WHERE("  username LIKE CONCAT ('%',#{user.username},'%') ");
					}
					
					//根据手机号模糊查询
					if(user.getUmobile()!=null && !("").equals(user.getUmobile())){
						WHERE(" umobile LIKE CONCAT ('%',#{user.umobile},'%') ");//CONCAT 连接字符串
					}
				}
			}
		}.toString();
		
		return sql;
	}
}
