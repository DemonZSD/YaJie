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
						OR();
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
						OR();
						WHERE(" umobile LIKE CONCAT ('%',#{user.umobile},'%') ");//CONCAT 连接字符串
					}
				}
			}
		}.toString();
		
		return sql;
	}
	
	public String updateUser(final User user){
		String sql = new SQL(){
			{
				UPDATE(USERTABLE);
				if(user.getUsername()!=null && !("").equals(user.getUsername())){
					SET("username = #{username}");
				}
				if(user.getUmobile()!=null && !("").equals(user.getUmobile())){
					SET("umobile = #{umobile}");
				}
				if(user.getUmobileBak()!=null && !("").equals(user.getUmobileBak())){
					SET("umobileBak = #{umobileBak}");
				}
				if(user.getCompanyId()!=null && !("").equals(user.getCompanyId())){
					SET(" companyId = #{companyId}");
				}
				if(user.getUtelphone()!=null && !("").equals(user.getUtelphone())){
					SET(" utelphone = #{utelphone}");
				}
				if(user.getUcompanyAddr()!=null && !("").equals(user.getUcompanyAddr())){
					SET(" ucompanyAddr = #{ucompanyAddr}");
				}
				if(user.getCompanyName()!=null && !("").equals(user.getCompanyName())){
					SET(" companyName = #{companyName}");
				}
				if(user.getUhomeAddr()!=null && !("").equals(user.getUhomeAddr())){
					SET(" uhomeAddr = #{uhomeAddr}");
				}
				
				WHERE(" uid = #{uid}");
			}
			
		}.toString();
		
		return sql;
	}
	
	public String insertUser(final User user){
		String sql = new SQL(){
			{
				INSERT_INTO (USERTABLE);
				if(user.getUid()!=null && !("").equals(user.getUid())){
					VALUES("uid ","#{uid}");
				}
				if(user.getUsername()!=null && !("").equals(user.getUsername())){
					VALUES("username ","#{username}");
				}
				if(user.getUmobile()!=null && !("").equals(user.getUmobile())){
					VALUES("umobile "," #{umobile}");
				}
				if(user.getUmobileBak()!=null && !("").equals(user.getUmobileBak())){
					VALUES("umobileBak "," #{umobileBak}");
				}
				if(user.getCompanyId()!=null && !("").equals(user.getCompanyId())){
					VALUES(" companyId "," #{companyId}");
				}
				if(user.getUtelphone()!=null && !("").equals(user.getUtelphone())){
					VALUES(" utelphone "," #{utelphone}");
				}
				if(user.getUcompanyAddr()!=null && !("").equals(user.getUcompanyAddr())){
					VALUES(" ucompanyAddr "," #{ucompanyAddr}");
				}
				if(user.getCompanyName()!=null && !("").equals(user.getCompanyName())){
					VALUES(" companyName "," #{companyName}");
				}
				if(user.getAddDate()!=null && !("").equals(user.getAddDate())){
					VALUES(" addDate "," #{addDate}");
				}
				if(user.getUhomeAddr()!=null && !("").equals(user.getUhomeAddr())){
					VALUES(" uhomeAddr "," #{uhomeAddr}");
				}
			}
			
		}.toString();
		
		return sql;
	}
}
