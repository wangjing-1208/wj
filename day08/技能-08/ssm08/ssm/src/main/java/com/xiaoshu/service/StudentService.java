package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.SchoolMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.School;
import com.xiaoshu.entity.SchoolVo;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentExample;
import com.xiaoshu.entity.StudentExample.Criteria;
import com.xiaoshu.entity.User;
@Service
public class StudentService {

	@Autowired
	UserMapper userMapper;

	

	// 新增
	public void addStudent(Student s) throws Exception {
		studentMapper.insert(s);
	};

	// 修改
	public void updateStudent(Student s) throws Exception {
		studentMapper.updateByPrimaryKeySelective(s);
	};

	// 删除
	public void deleteStudent(Integer id) throws Exception {
		studentMapper.deleteByPrimaryKey(id);
	};


	// 通过用户名判断是否存在，（新增时不能重名）
	public Student existUserWithUserName(String userName) throws Exception {
//		UserExample example = new UserExample();
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
		criteria.andStnameEqualTo(userName);
		List<Student> userList = studentMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};


	@Autowired
	private StudentMapper studentMapper;

	public PageInfo<SchoolVo> findStudentPage(SchoolVo schoolVo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
	
		List<SchoolVo> userList = studentMapper.findPage(schoolVo);
		PageInfo<SchoolVo> pageInfo = new PageInfo<SchoolVo>(userList);
		return pageInfo;
	}

	@Autowired
	private SchoolMapper schoolMapper;
	public List<School> findALLid() {
		// TODO Auto-generated method stub
		return schoolMapper.selectAll();
	}


}
