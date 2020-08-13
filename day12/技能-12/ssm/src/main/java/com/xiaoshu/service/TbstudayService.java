package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.TbmajordayMapper;
import com.xiaoshu.dao.TbstudayMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Tbmajorday;
import com.xiaoshu.entity.Tbstuday;
import com.xiaoshu.entity.TbstudayVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class TbstudayService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	private TbstudayMapper tbstudayMapper;

	// 新增
	public void addUser(Tbstuday user) throws Exception {
		tbstudayMapper.insert(user);
	};

	// 修改
	public void updateUser(Tbstuday user) throws Exception {
		tbstudayMapper.updateByPrimaryKeySelective(user);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		tbstudayMapper.deleteByPrimaryKey(id);
	};

	// 登录
	public User loginUser(User user) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPasswordEqualTo(user.getPassword()).andUsernameEqualTo(user.getUsername());
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};

	

	public PageInfo<TbstudayVo> findTbstudayPage(TbstudayVo tbstudayVo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<TbstudayVo> userList = tbstudayMapper.findAllTbstuday(tbstudayVo);
		PageInfo<TbstudayVo> pageInfo = new PageInfo<TbstudayVo>(userList);
		return pageInfo;
	}

	@Autowired
	private TbmajordayMapper tbmajordayMapper;
	
	public List<Tbmajorday> findAllTbmajorday() {
		// TODO Auto-generated method stub
		return tbmajordayMapper.selectAll();
	}

	public List<TbstudayVo> finPage(TbstudayVo tbstudayVo) {
		// TODO Auto-generated method stub
		return tbstudayMapper.findAllTbstuday(tbstudayVo);
	}
}
